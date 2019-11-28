package algorithm;

import java.util.*;

public class Main {

	static int[] lineNum = new int[]{6,2,5,5,4,5,6,3,7,5}; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String count = scanner.nextLine();
		int firstNum = sumSet(count);
		int second = 0;
		
		String countNext = numSet(count);
		while(true){
			second++;
			if(firstNum == sumSet(countNext)){
				System.out.println(second);
				break;
			}
			countNext = numSet(countNext);
		}
		
		scanner.close();
		
	}
	public static int sumSet(String count){
		
		int sum = 0;
		
		String[] countNumSet = count.split("");
		
		for(int i = 0; i < countNumSet.length; i++){
			sum += lineNum[Integer.parseInt(countNumSet[i])];
		}
		
		return sum;
	}
	public static String numSet(String count){
		
		long countNum = Long.valueOf(count);
		int countlen = count.length();
		countNum++;
		String countNext = String.valueOf(countNum);
		long countNextlen = countNext.length();
		
		if(countlen >= countNextlen){
			for(int i = 0; i < countlen - countNextlen; i++)
				countNext = "0" + countNext;
		}else
			countNext = String.format("%0"+countlen+"d", 0);
		
		return countNext;
	}
}
