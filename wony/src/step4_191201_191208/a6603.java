/**
 * @작성자 wony
 * @작성일 2019. 12. 2.
 * @사용처
 *
 */
package step4_191201_191208;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 12. 2.
 * @사용처 원희 - 로또
 * 
 */
public class a6603 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 2.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] rottoArray;
		while(true){
			int testCount = scanner.nextInt();
			if(testCount == 0) break;
			rottoArray = new int[testCount];
			for(int i = 0; i < testCount; i++)
				rottoArray[i] = scanner.nextInt();
		}
		scanner.close();
	}
	
	public static void Combination(int[] array, int n, int r){
		
		if(r == 0 & n == r){
			 
		}
		
		Combination(array, n-1, r-1);
		Combination(array, n-1, r);
		
	}

}
