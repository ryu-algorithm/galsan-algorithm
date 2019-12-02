package algorithm;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();
		HashMap<Integer, Integer> hashMap = new LinkedHashMap<Integer, Integer>();
		int key,value;
		for(int i = 0; i < testCount; i++){
			value = scanner.nextInt();
			key = scanner.nextInt();
			hashMap.put(key, value);
		}
		scanner.close();
		
		List<Integer> keylist = new ArrayList<Integer>(hashMap.keySet());
		keylist.sort(null);
		
		boolean success = true; // 일을 맞칠수 있는지 체크
		int count = -1; // 0시부터 시작
		int sum; // 시간의 합
		
		while(success){
			count++;
			sum = count;
			for(int i : keylist){
				sum += hashMap.get(i);
				if(sum > i) { // 시간안에 일을 못끝낼 시
					success = false;
					count--;
					break;
				}
			}
		}
		
		if(count == -1) System.out.println(-1);
		else System.out.println(count);
	}
}
