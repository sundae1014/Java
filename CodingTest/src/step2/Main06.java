package step2;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		int tm = m + t;
		int nh = h + (tm/60);
		tm = tm - (tm / 60) * 60;
		
					
		if(nh >= 24) {
			nh = nh - 24;
		}
		
		System.out.println(nh + " " + tm);
		sc.close();
	}
}
