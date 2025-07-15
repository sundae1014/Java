package sub4;

/*
 * 	날짜 : 2025/07/15
 * 	이름 : 정순권
 * 	내용 : 상속(Inheritance) 실습하기
 */
public class InheritTest {
	public static void main(String[] args) {
		
		// Car 상속 실습
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
		
		
	}
}
