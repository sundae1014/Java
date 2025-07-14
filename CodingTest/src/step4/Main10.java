package step4;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] arr = new double[N];
		double max = 0;
		
		
		for(int i=0; i<N; i++) {
			 arr[i] = sc.nextDouble();
			 
			 if(arr[i] > max) {
				 max = arr[i];		
			 	}			 
			 }
		double total = 0;
		for(int i=0; i<N; i++) {
			arr[i] = arr[i]/max*100;
			total += arr[i];
		}
		System.out.println(total/N);
		sc.close();
	}
}