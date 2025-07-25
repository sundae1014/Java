package p362;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); // 'A'를 소문자로 변환
		
		char c1= '4', c2 = 'F';
		
		if(Character.isDigit(c1)) {
			System.out.println(c1+"는 숫자");
		}
		if(Character.isDigit(c1)) {
			System.out.println(c2+"는 영문자");
		}
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
	}
}
