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
		int[] dataArray;
		
		while(true){
			int testCount = scanner.nextInt();
			if(testCount == 0) break; // 0일경우 out
			
			dataArray = new int[testCount];
			rottoArray = new int[6]; // r개의 개수만큼 배열 선언
			for(int i = 0; i < testCount; i++)
				dataArray[i] = scanner.nextInt();
			Combination(dataArray, rottoArray, 0, 0, testCount, 6);
			System.out.println();
		}
		
		scanner.close();
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 3.
	 * @사용처 조합 재귀
	 * @Todo
	 * @param dataArray : 입력받은 n개의 배열
	 * @param rottoArray : 저장할 r개의 배열
	 * @param dataIndex : n개의 배열 중 입력할 index 위치
	 * @param rottoIndex : r개의 배열중 저장할 index 위치
	 * @param n
	 * @param r
	 * 
	 */
	public static void Combination(int[] dataArray, int[] rottoArray, int dataIndex, int rottoIndex, int n , int r){
		
		if(r == 0)printArray(rottoArray);
		else if( r == n){
			/*
			 * r과 n이 같을경우 현재의 인덱스에서 r의 개수만큼 데이터 입력
			 * */
			for(int i = 0; i < r; i++) rottoArray[rottoIndex++] = dataArray[dataIndex++]; 
			printArray(rottoArray);
		}
		else{
			rottoArray[rottoIndex] = dataArray[dataIndex]; //우선 현재의 index위치의 데이터 입력
			Combination(dataArray, rottoArray, dataIndex + 1, rottoIndex + 1, n - 1, r - 1); // n-1 C r-1
			Combination(dataArray, rottoArray, dataIndex + 1, rottoIndex, n - 1, r);// n-1 C r
		}
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 3.
	 * @사용처 배열 출력
	 * @Todo
	 * @param array
	 * 
	 */
	public static void printArray(int[] array){
		for(int data : array)
			System.out.print(data + " ");
		System.out.println();
	}

}
