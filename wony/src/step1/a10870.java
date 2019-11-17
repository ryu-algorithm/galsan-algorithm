/**
 * @작성자 wony
 * @작성일 2019. 11. 8.
 * @사용처
 * @Todo
 */

package step1;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 8.
 * @사용처 피보나치 - 5
 * @Todo
 */

public class a10870 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 8.
	 * @사용처
	 * @param args
	 * @Todo
	 */
	static int[] fiboMem = new int[20];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int fibo = scanner.nextInt();
		
		fiboMem[0] = 0;
		fiboMem[1] = 1;
		fiboMem[2] = 1;
		
		fibonacci(fibo);
		
		System.out.println(fiboMem[fibo-1]);
	}
	
	public static void fibonacci(int n) {
		for(int i =3; i < n; i++) {
			fiboMem[i] = fiboMem[i-1] + fiboMem[i-2];
		}
	}

}
