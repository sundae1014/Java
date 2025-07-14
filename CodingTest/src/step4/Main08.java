package step4;

import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int[] a = new int[0];
		int total = 0;
		
		for(int i =0; i<10; i++) {
			int[] arr = new int[0];
			arr[i] = sc.nextInt();
			
			for(int j=i; j<10; j++) {
				arr[i] = arr[i]%42;
				arr[i] = a[i];
				total += a[i];
			}
			
			if(arr[i] == a[i]) {
				total--;
			}			
		}
		System.out.println(total);
		sc.close();
	}
}
