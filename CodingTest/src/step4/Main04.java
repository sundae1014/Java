package step4;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] arr = new int[9];
		int maxIndex = -1;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]>max) {
				max = arr[i];
				maxIndex = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex);
		sc.close();
	}
}