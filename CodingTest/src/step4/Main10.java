package step4;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<=N; i++) {
			 arr[i] = sc.nextInt();
			 
			 if(arr[i] > max) {
				 arr[i] = max;
			 }
			 if(arr[i] < max) {
				 arr[i] = arr[i]/max*100;
			 }
		}
		
		
	}
}
