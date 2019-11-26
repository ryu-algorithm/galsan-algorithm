/**
 * @작성자 wony
 * @작성일 2019. 11. 18.
 * @사용처
 *
 */
package step2_191117_191124;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 18.
 * @사용처 벡터 매칭
 * 
 */
public class a1007 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 18.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		int N;
		
		int[][] vector;
		
		for(int i = 0; i < testCount; i++){
			N = scanner.nextInt();
			vector = new int[N][2];
			for(int j = 0; j < N; j++){
				vector[j][0] = scanner.nextInt();
				vector[j][1] = scanner.nextInt();
			}
		}
		scanner.close();
	}

}
 