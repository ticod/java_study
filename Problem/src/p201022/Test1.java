/*
1. 타자 연습 게임 프로그램 구현하기
 String[] data =  { "태연","유리","윤아","효연","수영","서현","티파니","써니","제시카" };
  List<String> words = new ArrayList<String>();
 3초에 한번씩 words에 data 중 임의의 이름을 추가하기.  => 스레드(DataAddThread)로 작성.
 화면에 입력된 이름과, 
 words에 저장된 이름이 같은 경우 words에서 입력된 이름을 삭제한다.
 words에 모든 데이터가 삭제 되면 프로그램을 종료한다. 
 */
package p201022;

import java.util.*;

class TypingGameDatabase extends Thread {

	private List<String> words;

	static TypingGameDatabase database = new TypingGameDatabase();

	private TypingGameDatabase() {
		words = new ArrayList<>();
	}

	public static TypingGameDatabase getInstance() {
		return database;
	}

	public List<String> getWords() {
		return words;
	}

	public boolean isClear() {
		return words.isEmpty();
	}

	synchronized public void addWord(String word) {
		words.add(word);
	}

	synchronized public void removeWord(String word) {
		words.remove(word);
	}
}

class TypingGameSystem extends Thread {

	private final String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };

	TypingGameDatabase database = TypingGameDatabase.getInstance();
	int level, term;
	Thread[] thread;

	TypingGameSystem(int level) {
		this.level = level;
		term = 3000 - (500 * level);
		thread = new TypingGameSystem[level];
		database.addWord(data[(int) (Math.random() * data.length)]);
	}
	
	TypingGameSystem(int term, boolean b) {
		this.term = term;
	}
	
	public void startGame() {
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new TypingGameSystem(term, true);
			thread[i].start();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep(term);
			} catch (InterruptedException e) {
			}
			database.addWord(data[(int) (Math.random() * data.length)]);
		}
	}
}

class TypingGamePlayer extends Thread {

	TypingGameDatabase database = TypingGameDatabase.getInstance();
	Scanner scan = new Scanner(System.in);
	
	TypingGamePlayer() {}

	@Override
	public void run() {
		while (!database.isClear()) {
			System.out.println(database.getWords());
			System.out.print(">>");
			String input = scan.nextLine();
			database.removeWord(input);
		}
	}
}

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);

		System.out.print("레벨 입력(1~5): ");
		int level = scan.nextInt();
		
		TypingGameSystem game = new TypingGameSystem(level);
		TypingGamePlayer player = new TypingGamePlayer();
		
		game.startGame(); 
		player.start();
		player.join();
		
		System.out.println("프로그램 종료");
		scan.close();
	}
}
