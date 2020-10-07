/*1 .
다음의 결과가 나오도록 프로그램을 수정하기

[결과]
fullPath:c:/jdk14/work/Test.java
path:c:/jdk14/work
fileName:Test.java

public class Test1 {
     public static void main(String[] args) {
         String fullPath = "c:/jdk14/work/Test.java";
            String path="";
            String fileName = "";
            System.out.println("fullPath:" + fullPath);
            System.out.println("path:" + path);
            System.out.println("fileName:" + fileName);
     }
}

​*/
package p201007;

public class Test1 {
	public static void main(String[] args) {
		String fullPath = "c:/jdk14/work/Test.java";
		String path = "";
		String fileName = "";
		
		int index = fullPath.lastIndexOf('/');
		path = fullPath.substring(0, index);
		fileName = fullPath.substring(index + 1);
		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}
