package test5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
	public static void main(String[] args) {
		
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto(){
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		
		for(;;) {
			int num = (int) Math.ceil((Math.random()*45)+1);
			lottoSet.add(num);
			
			if(lottoSet.size() == 5) {
				break;
			}
		}
		
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
