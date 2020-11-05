/*
 * Echo client
 *   키보드에서 입력받은 데이터를 소켓을 통해 서버로 전송한다.
 *   서버의 데이터를 화면에 출력
 */
package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientEx1 {
	public static void main(String[] args) {
		int port = 5000;
		String ip = "192.168.4.27";
		Socket client = null;
		PrintWriter out = null;
		BufferedReader br = null;
		try {
			String input;
			BufferedReader stdin = new BufferedReader(
					new InputStreamReader(System.in));
			client = new Socket(ip, port);
			br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream());
			
			System.out.println("client ip  : " + client.getLocalAddress());
			System.out.println("client port: " + client.getLocalPort());
			System.out.println("server ip  : " + client.getInetAddress());
			System.out.println("server port: " + client.getPort());
			
			System.out.println("\n메세지 입력 (종료:bye)");
			while ((input = stdin.readLine()) != null) {
				if (input.equals("bye")) {
					break;
				}
				out.println(input);
				out.flush();
				System.out.println("server echo: " + br.readLine());
				System.out.println("메세지 입력 (종료:bye)");
			}
			
			out.close();
			br.close();
			stdin.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
