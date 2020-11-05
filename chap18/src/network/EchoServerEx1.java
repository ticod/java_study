/*
 * EchoServer 구현
 * 클라이언트에서 받은 데이터를 그대로 클라이언트로 전송
 */
package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerEx1 {
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(5000);
			while (true) {
				System.out.println("클라이언트 접속 대기중...");
				Socket client = server.accept();
				ServerThread serverThread = new ServerThread(client);
				serverThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (server != null) server.close();
			} catch (IOException e) {}
		}
	}
	
	static class ServerThread extends Thread {
		private Socket client;
		PrintWriter out;
		BufferedReader br;
		
		ServerThread(Socket client) {
			this.client = client;
			System.out.println("client ip  : " + client.getInetAddress());
			System.out.println("client port: " + client.getPort());
			try {
				out = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
				br  = new BufferedReader(new InputStreamReader(client.getInputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			String input;
			try {
				while ((input = br.readLine()) != null) {
					out.println(input);
					out.flush();
					System.out.println("client data: " + input);
				}
				br.close();
				out.close();
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
