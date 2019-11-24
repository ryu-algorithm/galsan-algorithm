/**
 * @작성자 wony
 * @작성일 2019. 11. 8.
 * @사용처
 * @Todo
 */

package step1_191110_191117;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 8.
 * @사용처 병옥 - 팩토리얼
 * @Todo
 */

public class a10872 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 8.
	 * @사용처
	 * @param args
	 * @Todo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int fac = scanner.nextInt();
		
		int result = 1;
		for(int i = 1; i <= fac; i++) {
			result *= i;
		}
		
		System.out.println(result);
	
	}

}
