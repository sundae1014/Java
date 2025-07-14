package sub1;

/**
 * 	날짜 : 2025/07/14
 * 	이름 : 정순권	
 * 	내용 : 자바 객체지향 프로그래밍 클래스 실습
 *
 *	스택(Stack)
 *	- 자바의 일반변수, 참조변수, 지역변수가 push 되어 저장되는 메모리
 *	- 해당 메서드 영역 및 프로그램이 종료되면 pop 되어 메모리에서 제거
 *	- 객체(참조변수)는 스택에서 Heap 메모리 공간의 객체 인스턴스 참조(주소값 저장)
 *
 *	힙(Heap)
 *	- 자바의 객체가 생성되는 메모리 공간
 *	- 스택처럼 순서대로 쌓이지 않고 랜덤으로 메모리 공간에 생성
 *	- 참조변수가 제거되서 더이상 참조 되지 않으면 Garbage Collector로 해제됨
 */
public class ClassTest {
	public static void main(String[] args) {
		
		// 객체 생성 (인스턴스화)
		Car sonata = new Car();
		// Car = 참조타입 / sonata = 객체(Object)
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 상호작용(기능 활용)
		sonata.speedUp(80);
		sonata.speedDown(10);
		sonata.show();
		
		// 객체 생성, 초기화, 상호작용
		Car avante = null; // 선언(declare)할 때는 일반적으로 null로 초기화
		
		avante = new Car(); // 생성
		
		avante.name = "아반떼"; // 초기화(initialize) : 변수에 최초로 값을 대입
		avante.color = "검정색";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
	}
}
