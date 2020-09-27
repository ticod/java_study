/*
국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를  입력받은 후, 총점, 평균을 구하고 이들 모두에 대한 
막대그래프를 아래 조건에 맞게 그릴 수 있는 프로그램을 작성하시오.
단 평균은 소숫점이하는 버리고 정수로 처리 합니다.

[결과]
국어 영어 수학 물리 화학 사회 컴퓨터 점수를(1 - 100) 입력하세요
88 77 99 44 55 66 100

총합 :529
평균 :75
최대 :100
최소 :44

100                           *   *        
 90           *               *   *        
 80   *       *               *   *        
 70   *   *   *               *   *       *
 60   *   *   *           *   *   *       *
 50   *   *   *       *   *   *   *       *
 40   *   *   *   *   *   *   *   *   *   *
 30   *   *   *   *   *   *   *   *   *   *
 20   *   *   *   *   *   *   *   *   *   *
 10   *   *   *   *   *   *   *   *   *   *
       국어  영어  수학  물리  화학  사회 컴퓨터  최대  최소  평균
*/

package p200925;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final String[] subject = { "국어", "영어", "수학", "물리", "화학", "사회", "컴퓨터", "최대", "최소", "평균" };
		int[] score = new int[10];
		char[][] scoreBoard = new char[10][10];
		int scoreSum = 0;
		
		final int MAX_INDEX = 7;
		final int MIN_INDEX = MAX_INDEX + 1;
		final int AVG_INDEX = MIN_INDEX + 1;

		final int MIN_SCORE = 1;
		final int MAX_SCORE = 100;
		final int SUBJECT_COUNT = 7;

		score[MAX_INDEX] = MIN_SCORE;
		score[MIN_INDEX] = MAX_SCORE;
		score[AVG_INDEX] = 0;

		System.out.println("국어 영어 수학 물리 화학 사회 컴퓨터 점수를(1 - 100) 입력하세요");
		for (int i = 0; i < SUBJECT_COUNT; i++) {
			score[i] = scan.nextInt();
			score[MAX_INDEX] = (score[i] > score[MAX_INDEX]) ? score[i] : score[MAX_INDEX];
			score[MIN_INDEX] = (score[i] < score[MIN_INDEX]) ? score[i] : score[MIN_INDEX];
			scoreSum += score[i];
		}
		
		score[AVG_INDEX] = scoreSum/SUBJECT_COUNT;
		
		System.out.println();
		System.out.println("총합: " + scoreSum);
		System.out.println("평균: " + score[AVG_INDEX]);
		System.out.println("최대: " + score[MAX_INDEX]);
		System.out.println("최소: " + score[MIN_INDEX]);
		System.out.println();

		for (int i = 0; i < score.length; i++) {
			int cnt = score[i] / 10;
			for (int j = scoreBoard.length - 1; j >= scoreBoard.length - cnt; j--) {
				scoreBoard[j][i] = '*';
			}
		}

		for (int i = 0; i < scoreBoard.length; i++) {
			System.out.printf("%d\t", 100 - (10 * i));
			for (int j = 0; j < scoreBoard[i].length; j++) {
				System.out.printf("%c\t", scoreBoard[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < subject.length; i++) {
			System.out.printf("\t%s", subject[i]);
		}
	}
}
