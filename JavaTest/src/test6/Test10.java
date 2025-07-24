package test6;

interface Shape{
	public double calcArea();
}

class Circle implements Shape{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle implements Shape{
	private double wigth;
	private double heigth;
	
	public Rectangle(double wigth, double heigth) {
		this.wigth = wigth;
		this.heigth = heigth;
	}

	@Override
	public double calcArea() {
		return wigth * heigth;
	}
}

public class Test10 {
	public static void main(String[] args) {
		
		Circle circle = new Circle(5.0);
		System.out.print("원 넓이 : ");
		System.out.println(circle.calcArea());
		
		
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		System.out.print("직사각형 넓이 : ");
		System.out.println(rectangle.calcArea());
	}
}
