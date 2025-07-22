package p421;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		
		List<String> a = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String s = sc.next();
			a.add(s);
		}
		
		
		sc.close();
	}
}
