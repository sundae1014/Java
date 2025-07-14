package step4;

import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int[] arr = new int[10];
		int count = 0;
		
		for(int i =0; i<10; i++) {
			int num = sc.nextInt();
			arr[i] = num%42;		
		}
		
		for(int i=0; i<10; i++) {
			boolean a = false;
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					a = true;
					break;
				}
			}
			if(!a) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}