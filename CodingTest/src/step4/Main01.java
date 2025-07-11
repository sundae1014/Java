package step4;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}	
		int V = sc.nextInt();
			
		int num = 0;
		for(int i=0; i<N; i++) {
			if(arr[i] == V) {
				num++;
			}
		}
		System.out.println(num);
		sc.close();
	}
}