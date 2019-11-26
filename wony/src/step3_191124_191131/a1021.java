/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처
 *
 */
package step3_191124_191131;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 26.
 * @사용처 회전하는 큐
 * 
 */
public class a1021 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 26.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	static int minCount = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int nCount = scanner.nextInt();
		int outPutCount = scanner.nextInt();
		int[] orderCount = new int[outPutCount];
		for(int i = 0; i < outPutCount; i++)
			orderCount[i] = scanner.nextInt();
		
		scanner.close();
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		for(int i = 1; i <= nCount; i++)
			deque.offer(i);
		
		for(int i = 0; i < outPutCount; i++)
			deque = rotateDeq(deque, orderCount[i]);
		
		System.out.println(minCount);
		
	}
	
	public static Deque<Integer> rotateDeq(Deque<Integer> deque, int order){
		Deque<Integer> offDeque = new ArrayDeque<Integer>();
		Deque<Integer> offlastDeque = new ArrayDeque<Integer>();
		offDeque.addAll(deque);
		offlastDeque.addAll(deque);
		
		int pollCount = 0;
		int lastpollCount = 0;
		
		while(offDeque.peek() != order){
			pollCount++;
			offDeque.offer(offDeque.poll());
		}
		offDeque.poll();
		
		while(offlastDeque.peek() != order){
			lastpollCount++;
			offlastDeque.push(offlastDeque.pollLast());
		}
		offlastDeque.poll();
		
		if(pollCount < lastpollCount){
			minCount += pollCount;
			return offDeque;
		}else{
			minCount += lastpollCount;
			return offlastDeque;
		}
	}

}
