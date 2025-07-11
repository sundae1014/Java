package step3;

import java.util.Scanner;

public class Main09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		for(int i =1; i<=N; i++) {
			count++;
			for(int j=1; j<=count; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
