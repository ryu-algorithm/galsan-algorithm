/**
 * @작성자 wony
 * @작성일 2019. 12. 3.
 * @사용처
 *
 */
package step4_191201_191208;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 12. 3.
 * @사용처 상권 - 제곱수 찾기
 * 
 */
public class a1025 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 3.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[][] filed = new int[n][m];
		scanner.nextLine();
		String[] dataArray;
		for(int i = 0; i < n; i++){
			dataArray = scanner.nextLine().split("");
			for(int j = 0; j < m; j++)
				filed[i][j] = Integer.parseInt(dataArray[j]);
		}
		scanner.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < n; k++) {
					for(int l = 0; l < m; l++) {
						if( i + k < n) {
						}
					}
				}
			}
		}
		
		System.out.println(FindSequenceNum(filed));
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 3.z
	 * @사용처 제곱수 인지 확인
	 * @Todo
	 * @param num
	 * @return
	 * 
	 */
	public static boolean SqrCheck(int num){
		return num == Math.pow((int)Math.sqrt(num),2);
	}
	
	public static int FindSequenceNum(int[][] array){
		int num = -1;
		
		return num;
	}

}
