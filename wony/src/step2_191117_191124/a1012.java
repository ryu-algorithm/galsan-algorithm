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
 * @사용처 유기농 배추
 * 
 */
public class a1012 {

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

		int x, y, n;

		int count;

		for (int i = 0; i < testCount; i++) {
			count = 0;
			x = scanner.nextInt();
			y = scanner.nextInt();
			n = scanner.nextInt();

			int[][] filed = new int[x][y];

			for (int j = 0; j < x; j++) {
				for (int k = 0; k < y; k++) {
					filed[j][k] = 0;
				}
			}

			for (int j = 0; j < n; j++) {
				filed[scanner.nextInt()][scanner.nextInt()] = 1;
			}

			for (int j = 0; j < x; j++) {
				for (int k = 0; k < y; k++) {
					if (filed[j][k] == 1) {
						count++;
						filedZero(filed, j, k);
					}
				}
			}
			System.out.println(count);
		}
		scanner.close();
	}
	
	public static void filedZero(int[][] filed, int j, int k) {
		if (j - 1 >= 0)
			if (filed[j - 1][k] == 1) {
				filed[j - 1][k] = 0;
				filedZero(filed, j-1, k);
			}
		if (k - 1 >= 0)
			if (filed[j][k - 1] == 1) {
				filed[j][k - 1] = 0;
				filedZero(filed, j, k-1);
			}
		if (j + 1 < filed.length)
			if (filed[j + 1][k] == 1) {
				filed[j + 1][k] = 0;
				filedZero(filed, j+1, k);
			}
		if (k + 1 < filed[0].length)
			if (filed[j][k + 1] == 1) {
				filed[j][k + 1] = 0;
				filedZero(filed, j, k+1);
			}
	}

}
