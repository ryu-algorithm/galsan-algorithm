package algorithm;

import java.util.Scanner;

public class Main {

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
			
//			System.out.println(String.format("%.3f%%", count*100/score.length));
			System.out.format("%.3f%%\n", count*100/score.length);
		}
		
		scanner.close();
		
	}

}
