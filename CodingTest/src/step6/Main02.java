package step6;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] wp = {1, 1, 2, 2, 2, 8};
		int[] count = new int[6];
		
		for(int a=0; a<6; a++) {
			count[a] = sc.nextInt();
		}
		
		for(int b=0; b<6; b++) {
			int result = (wp[b] - count[b]);
			System.out.print(result + " ");
			
		}
		sc.close();
	}
}
