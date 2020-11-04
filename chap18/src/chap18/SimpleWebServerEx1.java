/*
 * 간단한 웹서버 구현
 */
package chap18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerEx1 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8000); // 8000 포트 열고 대기
		/*
		 * => OS로부터 8000번 포트를 할당받는다.
		 *    = binding
		 */
		
		 // client 접속 대기
		while (true) {
			System.out.println("클라이언트 접속 대기");
			/*
			 * Socket : 클라이언트가 생성한 소켓을 서버가 accept함
			 */
			Socket client = server.accept();
			// thread로 Socket 전달
			HttpThread t = new HttpThread(client);
			// thread 실행
			t.start();
		}
	}
	
	static class HttpThread extends Thread {
		
		private Socket client;
		BufferedReader br;
		PrintWriter pw;
		
		HttpThread(Socket client) {
			// 전달받은 client를 저장
			this.client = client;
			
			try {
				// client로부터 데이터를 읽을 스트림 생성
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				// client로 데이터를 전송할 스트림 생성
				pw = new PrintWriter(client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
			// server, client 정보 출력
			System.out.println("server ip: " + client.getLocalAddress());
			System.out.println("server port: " + client.getLocalPort());
			System.out.println("client ip: " + client.getInetAddress());
			System.out.println("client port: " + client.getPort());
		}
		
		@Override
		public void run() {
			BufferedReader fbr = null;
			try {
				// 클라이언트로부터 데이터 읽기
				// => 브라우저가 전송하는 데이터
				// GET / HTTP/1.1
				// GET /index.html HTTP/1.1
				String line = br.readLine();
				System.out.println("HTTP Header: " + line);
				int start = line.indexOf("/") + 1;
				int end = line.lastIndexOf("HTTP") - 1;
				String filename = line.substring(start, end);
				
				if (filename.equals("")) {
					filename = "index.html";
				}
				// fbr로 file을 읽어서 브라우저로 내보냄
				// => socket의 output 스트림을 통하여 내보냄
				fbr = new BufferedReader(new FileReader(filename));
				String fline = null;
				while ((fline = fbr.readLine()) != null) {
					pw.println(fline);
					pw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fbr != null) fbr.close();
					if (br != null) br.close();
					if (pw != null) pw.close();
					if (client != null) client.close();
				} catch (IOException e) {}
			} 
		}
	}
}
