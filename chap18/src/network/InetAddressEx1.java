/*
 * InetAddress class
 *   - IP 주소 저장하는 클래스
 *   - 객체 생성 위한 static method
 *     InetAddress   getByName(String) : String - 도메인 명
 *        => 
 *     InetAddress[] getAllByName(String) : String - 도메인 명
 *     InetAddress   getByAddress(byte[]) : byte[] - ip주소
 *     InetAddress   getLocalHost()
 */
package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println("getByName method");
		InetAddress ip = InetAddress.getByName("www.goodee.co.kr");
		System.out.println("host name: " + ip.getHostName());
		System.out.println("host address: " + ip.getHostAddress());
		
		System.out.print("IP 주소: ");
		byte[] ipAddr = ip.getAddress(); // IPv4 : 32bit => byte[4]
		/*
		 * IPv6의 경우 128bit => 32bit * 4
		 */
		for (byte b : ipAddr) {
			System.out.print(((b < 0) ? 256 + b : b) + ".");
		}
		System.out.println("\n");
		
		System.out.println("getAllByName method");
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
		for (InetAddress a : ips) {
			System.out.println("IP 주소: " + a);
		}
		System.out.println("\n");
		
		System.out.println("getByAddress method");
		InetAddress ip2 = InetAddress.getByAddress(ipAddr);
		System.out.println(ip2);
		System.out.println("\n");
		
		System.out.println("getLocalHost method");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터: " + local);
	}
}
