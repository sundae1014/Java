package step3;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tm = sc.nextInt();

		for(int i = 0; i<tm; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A + B);
		}
		sc.close();
	}
}
