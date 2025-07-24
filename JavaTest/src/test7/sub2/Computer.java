package test7.sub2;

public class Computer extends Product{
	protected String manufactor;

	public Computer(String prodId, String prodName, int price, int quntity, String manufactor) {
		super(prodId, prodName, price, quntity);
		this.manufactor = manufactor;
	}
	
	@Override
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("제조사 : " + manufactor);
	}
}
