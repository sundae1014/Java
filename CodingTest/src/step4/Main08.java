package step4;

import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int[] a = new int[10];
		int total = 10;
		
		for(int i =0; i<10; i++) {
			int[] arr = new int[10];
			arr[i] = sc.nextInt();
			
			for(int j=i; j<10; j++) {
				arr[i] = arr[i]%42;
				// arr[i] = a[i];
			}
			
			if(arr[i] == a[i]) {
				total--;
			}
			//else {
			//	total++;
			//}
		}
		System.out.println(total);
		sc.close();
	}
}