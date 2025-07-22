package step4;

import java.util.Scanner;

public class Main09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] basket = new int[N+1];
		
		for(int a=1; a<=N; a++) {
			basket[a] = a;
		}
		
		for(int b=0; b<M; b++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			while(i<j) {
				int temp = basket[i];
				basket[i] = basket[j];
				basket[j] = temp;
				i++;
				j--;
			}
		}
		
		for(int c=1; c<=N; c++) {
			System.out.print(basket[c] + " ");
		}
		sc.close();
	}
}
