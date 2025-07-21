package step4;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] X = new int[31];
		
		for(int i=0; i<28; i++) {
			int a = sc.nextInt();
			X[a] = 1;
		}
		
		for(int i=1; i<=30; i++) {
			if(X[i] == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
