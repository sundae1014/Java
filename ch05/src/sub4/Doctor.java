package sub4;

public class Doctor extends Person {

	private String specialty;
	
	public Doctor(String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 의사이며 전공은 ["+this.specialty+"] 입니다.");
	}
	
	
	
}
