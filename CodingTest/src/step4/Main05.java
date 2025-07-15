package step4;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] bs = new int[N];
		int M = sc.nextInt();
		
		for(int a=0; a<M*3; a++) {
			bs[a] = sc.nextInt();
			
		}
		
		System.out.println(bs[5]);
		sc.close();
	}
}