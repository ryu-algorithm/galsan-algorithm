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
 * @사용처 1로만들기
 * @Todo
 */

public class a1463 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 8.
	 * @사용처 DP 사용(Bottom - Up)
	 * @param args
	 * @Todo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] memResult = new int[n+1];
		
		memResult[0] = 0;
		memResult[1] = 0;
		
		for(int i = 2; i<=n; i++) {
			memResult[i] = memResult[i-1] + 1;					//바로 직전의 값을 가져온다. 
			if(i % 3 ==0 && memResult[i] > memResult[i/3] + 1)  //3으로 나눌 수 있을시 나누어보고 해당 값과 직전의 값을 비교해 더적은 값으로 정한다.
				memResult[i] = memResult[i/3] + 1;
			if(i % 2 ==0 && memResult[i] > memResult[i/2] + 1)	//2로 나눌 수 있을 시 나누어보고 해당 값과 직전의 값을 비교해 더적은 값으로 정한다.
				memResult[i] = memResult[i/2] + 1;
		}
		
		System.out.println(memResult[n]);
	}

}
