package sub8;

/*
 * 	날짜 : 2025/07/16
 * 	이름 : 정순권
 * 	내용 : 인터페이스 실습하기
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 역할1 - 통일된 표준클래스 설계 
		RemoteLG lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundDown();
		lg.powerOff();
		
		RemoteSamsung sm = new RemoteSamsung();
		sm.powerOn();
		sm.chDown();
		sm.soundUp();
		sm.powerOff();
		
		
		// 인터페이스 역할2 - 결합도 완화(유연성)
		
		
		
		// 인터페이스 역할3 - 다중 상속 효과 
		
		
		
	}
}
