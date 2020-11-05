/*
 * 숫자 야구 게임 서버
 * 
 * 
 */
package p201105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;

public class BullsAndCowsServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8012);
		int player = 0;
		ServerThread.initialize();
		ClientSocketManager manager = new ClientSocketManager(server);
		manager.setDaemon(true);
		manager.start();
		
		while (true) {			
			if (ServerThread.isGameEnd) {
				System.out.println("게임 종료");
				break;
			}
		}
	}
	
	static class ClientSocketManager extends Thread {
		
		int player;
		ServerSocket server;
		
		ClientSocketManager(ServerSocket server) {
			this.server = server;
		}
		
		@Override
		public void run() {
			while (true) {
				if (player == 0) {
					System.out.println("사용자 접속 대기중...");
				} else {
					System.out.println("현재 게임중인 사용자 수: " + player);
				}
				try {
					System.out.println(this.getName());
					Socket client = server.accept();
					ServerThread serverThread = new ServerThread(client);
					serverThread.setDaemon(true);
					serverThread.start();
					player++;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class ServerThread extends Thread {
		final static int BALL_COUNT = 4;
		static int[] answer = new int[BALL_COUNT];
		static boolean isGameEnd = false;
		Socket client;
		BufferedReader in = null;
		PrintWriter out = null;
		Thread gameOverAlert;
		
		ServerThread(Socket client) {
			this.client = client;
			try {
				in = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream());
				gameOverAlert = new Thread(()->{
					while(isGameEnd) {}
					out.println("Game Over");
					try {
						client.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("client ip  : " + client.getLocalAddress());
			System.out.println("연결 성공");
		}
		
		public static void initialize() {
			Set<Integer> temp = new HashSet<>();
			int idx = 0;
			while (temp.size() < BALL_COUNT) {
				int i = (int)(Math.random() * 9) + 1;
				if (temp.add(i)) {
					answer[idx++] = i;
				}
			}
			System.out.print("Answer: [ ");
			for (int i : answer) {
				System.out.print(i + " ");
			}
			System.out.println("]");
		}
		
		private boolean gameProcess(String input) throws Exception {
			System.out.println("input: " + input);
			int strike = 0, ball = 0;
			int[] inputToNumber = input.chars().toArray();
			for (int i = 0; i < BALL_COUNT; i++) {
				inputToNumber[i] -= '0';
				for (int j = 0; j < BALL_COUNT; j++) {
					if (inputToNumber[i] == answer[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			System.out.printf("[input: %s] strike: %d / ball %d\n", input, strike, ball);
			if (strike == BALL_COUNT) {
				out.println("4 Strike!!!");
				out.println("Game Clear");
				return true;
			} else {
				out.printf("[Your Number: %s] strike: %d / ball %d\r\n", input, strike, ball);
				return false;
			}
		}
		
		@Override
		public void run() {
			String input;
			try {
				while ((input = in.readLine()) != null) {
					if (isGameEnd) {
						System.out.println("Game Over!");
						out.flush();
						client.close();
						break;
					}
					if (input.length() != 4) {
						out.println("input number 4");
						out.flush();
						continue;
					}
					if (gameProcess(input)) {
						isGameEnd = true;
					}
					out.flush();
				}
			} catch (SocketException e) {
				System.out.println("사용자 한 명 종료");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					in.close();
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
