package sub2;

/**
 * 	날짜 : 2025/07/14
 * 	이름 : 정순권	
 * 	내용 : 캡슐화 실습하기
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소타나", "흰색", 0); // 생성자 호출
		
		// 초기화 - 은닉된 속성(맴버변수)은 생성자(constructor)로 초기화
		// sonata.name = "소나타";
		// sonata.color = "흰색";
		// sonata.speed = 0;
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		// 객체 생성과 초기화
		Car avante = new Car("아반떼", "검정색", 0);
		avante.speedUp(60);
		avante.speedDown(20);
		
		// 개별 속성이 은닉되어 있기 때문에 속성 수정 불가, Setter로 수정
		// avante.color = "남색";
		avante.setColor("남색");
		
		avante.show();
		
		// Account 객체 생성과 초기화 (국민은행, 101-11-1001, 감유산, 10000)		
		Account kb = new Account("국민은행", "101-11-1001", "김유신", 10000);
		
		// 출력 30000
		kb.deposit(40000);
		kb.withdarw(20000);
		
		// 이름을 김유신 > 김유진 수정
		kb.setName("김유진");
		
		kb.show();
		
		// Account 객체생성과 초기화(우리은행, 101-21-2001, 김춘추, 30000)
		Account wr = new Account("우리은행", "101-21-2001", "김춘추", 30000);
		
		// 출력 50000
		wr.deposit(30000);
		wr.withdarw(10000);
		
		// 은행명 수정 우리은행 > 너희은행
		wr.setBank("너희은행");
		
		wr.show();
		
	}
}
