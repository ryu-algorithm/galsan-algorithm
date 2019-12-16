/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처
 *
 */
package step3_191124_191201;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처 디지털 카운터
 * 
 */
public class a1020 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 26.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	static int[] lineNum = new int[]{6,2,5,5,4,5,6,3,7,5}; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String count = scanner.nextLine();
		int firstNum = sumSet(count.split(""));
		int second = 0;
		
		String countNext = numSet(count);
		
		while(true){
			second++;
			if(firstNum == sumSet(countNext.split(""))){
				System.out.println(second);
				break;
			}
			countNext = numSet(countNext);
		}
		
		scanner.close();
		
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 27.
	 * @사용처 선분 개수 구하는 함수
	 * @Todo
	 * @param count
	 * @return
	 * 
	 */
	public static int sumSet(String[] countNumSet){
		
		int sum = 0;
		
		for(int i = 0; i < countNumSet.length; i++){
			sum += lineNum[Integer.parseInt(countNumSet[i])];
		}
		
		return sum;
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 27.
	 * @사용처 다음숫자(String) 구하는 함수
	 * @Todo
	 * @param count
	 * @return
	 * 
	 */
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
