/**
 * @작성자 wony
 * @작성일 2019. 11. 17.
 * @사용처
 * @Todo
 */

package step2_191117_191124;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 17.
 * @사용처 원희 - 2차원 배열의 합
 * @Todo
 */

public class a2167_DP {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 17.
	 * @사용처 DP 사용
	 * @param args
	 * @Todo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[][] mapXY = new int[scanner.nextInt()][scanner.nextInt()];
		
		for(int i = 0; i < mapXY.length; i++){
			for(int j = 0; j< mapXY[0].length; j++){
				mapXY[i][j] += scanner.nextInt();
			}
		}
		
		int testCount = scanner.nextInt();
		
		int startX, startY, endX, endY;
		
		for(int i = 0; i < testCount; i++){
			startX = scanner.nextInt();
			startY = scanner.nextInt();
			endX = scanner.nextInt();
			endY = scanner.nextInt();
		}
	}
}
