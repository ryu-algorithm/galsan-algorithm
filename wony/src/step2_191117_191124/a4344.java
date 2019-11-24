/**
 * @작성자 wony
 * @작성일 2019. 11. 17.
 * @사용처
 * @Todo
 */

package step2_191117_191124;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 17.
 * @사용처 재희 - 평균은 넘겠지
 * @Todo
 */

public class a4344 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 17.
	 * @사용처
	 * @param args
	 * @Todo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		int[] score;
		
		double sum, avg;
		
		double count;
		
		
		for(int i = 0; i < testCount; i++) {
			sum = 0;
			avg = 0;
			count = 0;
			score = new int[scanner.nextInt()];
			for(int j = 0; j < score.length; j++) {
				score[j] = scanner.nextInt();
				sum += score[j];
			}
			
			avg += sum/score.length; 
			
			for(int j = 0; j < score.length; j++) {
				if(Double.valueOf(score[j]) > avg)
					count++;
			}
			
			System.out.println(String.format("%.3f%%", count*100/score.length));
		}
		
		scanner.close();
		
	}

}
