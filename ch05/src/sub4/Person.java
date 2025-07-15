package sub4;

public class Person {
	
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("Person is working");
	}
	
	public void introduce() {
		System.out.println("제 이름은 ["+name+"]이고 나이는 ["+age+"]세 입니다.");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
