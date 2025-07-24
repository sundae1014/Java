package test7.sub2;

public class Clothes extends Product{
	protected String size;

	public Clothes(String prodId, String prodName, int price, int quntity, String size) {
		super(prodId, prodName, price, quntity);
		this.size = size;
	}
	
	@Override
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("사이즈 : " + size);
	}
}
