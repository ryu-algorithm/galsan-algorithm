/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처
 *
 */
package step3_191124_191131;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처 디지털 카운터
 * 
 */
public class a1020_dp {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 26.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String count = scanner.nextLine();
		
		int[] lineNum = new int[]{6,2,5,5,4,5,6,3,7,5}; 
		
		int[] dpMem = new int[7*count.length()+1];
		
		scanner.close();
		
	}
	
}
