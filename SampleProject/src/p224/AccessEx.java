package p224;

class Sample{
	public int a;
	private int b;
	int c; // default
	protected int d;
}

class Sub extends Sample{
	
	public void method() {
		this.d = 10;
	}
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sp = new Sample();
		sp.a = 10;
		// sp.b = 10;
		sp.c = 10;
	}
}
