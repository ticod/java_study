/*
 * 간단한 웹서버 구현 2 - 이미지 파일
 *   1. 파일을 읽을 때 InputStream으로 읽기
 *   2. 클라이언트에 데이터 전송시 OutputStream으로 출력
 */
package network;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerEx2 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8001);
		while (true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept();
			HttpThread t = new HttpThread(client);
			t.start();
		}
	}
	
	static class HttpThread extends Thread {
		
		private Socket client;
		BufferedReader br;
		PrintStream ps;
		
		HttpThread(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				ps = new PrintStream(client.getOutputStream());
				
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("server ip: " + client.getLocalAddress());
			System.out.println("server port: " + client.getLocalPort());
			System.out.println("client ip: " + client.getInetAddress());
			System.out.println("client port: " + client.getPort());
		}
		
		@Override
		public void run() {
			BufferedInputStream fbr = null;
			try {
				String line = br.readLine();
				System.out.println("HTTP Header: " + line);
				int start = line.indexOf("/") + 1;
				int end = line.lastIndexOf("HTTP") - 1;
				String filename = line.substring(start, end);
				if (filename.equals("")) {
					filename = "index.html";
				}
				
				fbr = new BufferedInputStream(new FileInputStream(filename));
				
				ps.print("HTTP/1.0 200 OK\r\nContent-Type:text/html\r\n\r\n");
				byte[] buf = new byte[fbr.available()];
				int len = 0;
				while ((len = fbr.read(buf)) != -1) {
					ps.write(buf, 0, len);
					ps.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fbr != null) fbr.close();
					if (br != null) br.close();
					if (ps != null) ps.close();
					if (client != null) client.close();
				} catch (IOException e) {}
			} 
		}
	}
}
