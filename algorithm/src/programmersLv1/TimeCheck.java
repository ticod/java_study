package programmersLv1;

public class TimeCheck {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// CODE HERE
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("\n수행 시간: " + time + "(밀리초)");
	}
}
