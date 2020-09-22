/*5. str 문자열에 각각의 알파벳의 갯수를 출력하시오

public class Test5 {

   public static void main(String[] args) {

      String str = "the unemployment rates for african americans hispanic-americans, and asian americans";

   }

}

​

[결과]

a:13개

c:5개

d:1개

e:7개

f:2개

h:2개

i:7개

l:1개

m:5개

n:9개

o:2개

p:2개

r:6개

s:6개

t:3개

u:1개

y:1개*/

package p200922;

public class Pr5 {
	public static void main(String[] args) {
		String str = "the unemployment rates for african americans hispanic-americans, and asian americans";
		int[] alpha = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z')
				alpha[ch - 'a']++;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] != 0)
				System.out.printf("%c:%d개\n", i+'a', alpha[i]);
		}
	}
}
