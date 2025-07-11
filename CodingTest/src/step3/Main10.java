package step3;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int star = 0;
		
		for(int i=1; i<=N; i++) {
			star++;
			for(int j=1; j<=star; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			// System.out.print("\n");
		}
		sc.close();
	}
}
