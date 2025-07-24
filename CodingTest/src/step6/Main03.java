package step6;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = (2 * N) -1;
		int X = 0;
		
		for(int i=1; i<=M; i++) {
			
			if(i<=N) {
				X++;
			}else {
				X--;
			}
			
			for(int j=1; j<=N-X; j++) {
				System.out.print(" ");				
			}
			for(int j=1; j<=2*X-1 ; j++) {
				System.out.print("*");
			}							
			System.out.println();
		}
		sc.close();
	}
}
