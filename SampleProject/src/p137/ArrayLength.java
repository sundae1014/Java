package p137;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(arr.length + "개의 정수를 입력하세요. >> ");
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		System.out.print("평균은 " + (double)sum/arr.length);
		sc.close();
	}
}
