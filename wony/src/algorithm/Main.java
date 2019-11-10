package algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] memResult = new int[n+1];
		
		memResult[0] = 0;
		memResult[1] = 0;
		
		for(int i = 2; i<=n; i++) {
			memResult[i] = memResult[i-1] + 1; 
			if(i % 3 ==0 && memResult[i] > memResult[i/3] + 1)
				memResult[i] = memResult[i/3] + 1;
			if(i % 2 ==0 && memResult[i] > memResult[i/2] + 1)
				memResult[i] = memResult[i/2] + 1;
		}
		
		System.out.println(memResult[n]);
		
	}

}
