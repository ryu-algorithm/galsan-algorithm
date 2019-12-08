package algorithm;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 81;
		
		long fac = 1;
		for(int i = 2; i <= num; i++) {
			fac *= i;
			System.out.println(fac);
		}
		
		System.out.println(fac);
	}	
}
