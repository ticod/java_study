package exam;

import java.util.Scanner;

import java.util.List;

public class Hangman {
	String answer;
	char[] printAnswer;
	Scanner scan = new Scanner(System.in);
	
	public void initialize(String answer) {
		this.answer = new String(answer.toLowerCase());
		this.printAnswer = new String(this.answer.replaceAll("[a-zA-Z]", "?")).toCharArray();
		System.out.println("Lets play a round of hangman.");
	}
	
	public void playGame() {
		int winPoint = 0;
		int wrongPoint = 0;
		System.out.println("We are playing hangman\n");
		while(true) {
			System.out.println("The disguised word is <" + new String(printAnswer) + ">");
			System.out.println("Guess a letter");
			char userAnswer = scan.next().toLowerCase().charAt(0);
			if (answer.indexOf(userAnswer) >= 0) {
				winPoint++;
				for (int i = 0; i < answer.length(); i++) {
					if (answer.charAt(i) == userAnswer) {
						printAnswer[i] = userAnswer;
					}
				}
			} else {
				wrongPoint++;
			}
			System.out.println("Guesses made "+winPoint+" with "+wrongPoint+" wrong.");
			if (new String(printAnswer).equals(answer)) {
				System.out.println("Congratulations. you found the secret word <" + answer + ">");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Hangman game = new Hangman();
		game.initialize("Happiness");
		game.playGame();
		System.out.println();
		
		game.initialize("I'll be back.");
		game.playGame();
	}
}
