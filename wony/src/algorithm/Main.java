package algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[][] mapXY = new int[scanner.nextInt()][scanner.nextInt()];
		
		for(int i = 0; i < mapXY.length; i++){
			for(int j = 0; j< mapXY[0].length; j++){
				mapXY[i][j] = scanner.nextInt();
			}
		}
		
		int testCount = scanner.nextInt();
		
		int startX, startY, endX, endY;
		
		for(int i = 0; i < testCount; i++){
			startX = scanner.nextInt();
			startY = scanner.nextInt();
			endX = scanner.nextInt();
			endY = scanner.nextInt();
			System.out.println(mapXYSUM(mapXY, startX, startY, endX, endY));
		}
	}
	
	public static int mapXYSUM(int[][] mapXY, int startX, int startY, int endX, int endY){
		int sum = 0;
		
		for(int i = startX; i<=endX; i++){
			for(int j = startY; j<=endY; j++){
				sum += mapXY[i-1][j-1];
			}
		}
		return sum;
	}

}
