package p201105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class BullsAndCowsClient{
	public static void main(String[] args) {
		int port = 8012;
		String ip = "172.30.1.59";
		Socket client = null;
		ServerMessageReader in = null;
		ServerMessageWriter out = null;
		BufferedReader br = null;
		
		try {
			client = new Socket(ip, port);
			in = new ServerMessageReader(client);
			out = new ServerMessageWriter(client);
			out.setDaemon(true);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			System.out.println("client ip  : " + client.getLocalAddress());
			System.out.println("client port: " + client.getLocalPort());
			System.out.println("server ip  : " + client.getInetAddress());
			System.out.println("server port: " + client.getPort());
			
			out.start();
			out.join();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ServerMessageReader extends Thread {
	
	Socket client;
	BufferedReader in;
	
	ServerMessageReader(Socket client) {
		this.client = client;
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String serverMessage;
		try {
			while ((serverMessage = in.readLine()) != null) {
				if (serverMessage.equals("Game Over")) {
					System.out.println("Game Over...");
					interrupt();
					break;
				}
				if (serverMessage.equals("Game Clear")) {
					System.out.println("Game Clear!");
					break;
				}
				System.out.println(serverMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ServerMessageWriter extends Thread {
	
	Socket client;
	BufferedReader stdin;
	PrintWriter out;
	ServerMessageReader in;
	
	ServerMessageWriter(Socket client) {
		this.client = client;
		try {
			stdin = new BufferedReader(
					new InputStreamReader(System.in));
			out = new PrintWriter(client.getOutputStream());
			in = new ServerMessageReader(client);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String input;
		in.start();
		try {
//			System.out.print("input: ");
//			while ((input = stdin.readLine()) != null) {
			while (in.isAlive()) {
				System.out.print("input: ");
				out.println(input = stdin.readLine());
				out.flush();
				try {
					sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
