package step4;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] X = new int[28];
		
		for(int i=0; i<28; i++) {
			X[i] = sc.nextInt();
			
		}
		System.out.println(X[1]);
		sc.close();
	}
}
