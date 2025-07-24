package test7.sub2;

public class Product {
	protected String prodId;	// 상품 아이디
	protected String prodName;	// 상품 이름
	protected int	 price;		// 상품 가격
	protected int	 quntity;	// 재고 수량
	
	public Product(String prodId, String prodName, int price, int quntity) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quntity = quntity;
	}
	
	public void printProductInfo() {
		System.out.println("상품코드 : "+prodId);
		System.out.println("상품이름 : "+prodName);
		System.out.println("상품가격 : "+price);
		System.out.println("재고수량 : "+quntity);
	}
}
