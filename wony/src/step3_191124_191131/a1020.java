/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처
 *
 */
package step3_191124_191131;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처 디지털 카운터
 * 
 */
public class a1020 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 26.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	static Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String count = scanner.nextLine();
		
		hashMap.put(1, 2);
		hashMap.put(2, 5);
		hashMap.put(3, 5);
		hashMap.put(4, 4);
		hashMap.put(5, 5);
		hashMap.put(6, 6);
		hashMap.put(7, 3);
		hashMap.put(8, 7);
		hashMap.put(9, 5);
		hashMap.put(0, 6);
		
		int firstNum = sumSet(count);
		
		int countNum = Integer.parseInt(count);
	}
	
	public static int sumSet(String count){
		
		int sum = 0;
		
		String[] countNumSet = count.split("");
		
		for(int i = 0; i < countNumSet.length; i++){
			sum += hashMap.get(Integer.parseInt(countNumSet[i]));
		}
		
		return sum;
	}
}
