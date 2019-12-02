/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처
 *
 */
package step3_191124_191201;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처 소수구하기
 * 
 */
public class a1929 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 26.
	 * @사용처 에라토스테네스의 체 알고리즘 사용!
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[] decimalFiled = new int[m+1];
		
		/*
		 * 초기화(1~m)
		 * */
		for(int i = 0; i < m+1; i++)
			decimalFiled[i] = i;
		
		//소수 구분
		decimalCheck(decimalFiled);
//		SieveOfEratosthenes(decimalFiled);
		
		/*
		 * 0또는 1일경우 제외
		 * */
		for(; n <= m; n++)
			if(decimalFiled[n] != 0 && decimalFiled[n] != 1) System.out.println(decimalFiled[n]);
		
		scanner.close();
	}
	
	//처음 설계 함수
	public static void decimalCheck(int[] decimalFiled){
		for(int i = 2; i < decimalFiled.length; i++){
			for(int j = 2*i; j < decimalFiled.length; j += i)
				decimalFiled[j] = 0;
		}
	}
	
	//두번째 설계 함수
	public static void SieveOfEratosthenes(int[] decimalFiled){
		for(int i = 2; i < decimalFiled.length; i++){
			for(int j = i*i; j < decimalFiled.length; j += i) // i아래의 숫자들은 다 계산된값이기에 i*i로 개선, 값의 크기에 따라 int형이아닌 double형을 선언
				decimalFiled[j] = 0;
		}
	}

}
