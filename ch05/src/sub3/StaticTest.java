package sub3;


/*
 * 	날짜 : 2025/07/14
 * 	이름 : 정순권
 * 	내용 : Static 변수 (클래스 변수), Static 메서드(클래스 메서드) 실습하기
 */

class Increment {
	private int num1 = 0;
	public static int num2 = 0; // 클래스 변수(정적변수)
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}		
}

public class StaticTest {
	public static void main(String[] args) {
		
		// 클래스변수(정적변수) 실습
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		// 전체 차량 수
		Car sonata = new Car("소타나", "흰색", 0);
		Car avante = new Car("아반떼", "검정색", 0);
		Car grandu = new Car("그렌저", "검정색", 0);
		
		sonata.show();
		avante.show();
		grandu.show();
		
		// 클래스 메서드(정적메서드)는 클래스타입으로 참조 호출
		System.out.println("전체 차량수 : " + Car.getCount());
	}
}
