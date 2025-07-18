package p308;

public class InterfaceEx {
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.printLogo();
		p.sendCall();
		p.play();
		System.out.println("3과 5를 더하면 " + p.calculate(3, 5));
		p.schedule();
	}
}
