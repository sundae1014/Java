package test7.sub1;

public class Patient {
	protected String name;	// 환자 이름
	protected String id;	// 환자 아이디
	protected int 	 age;	// 환자 나이
	protected String diagnosis; // 진단명
	
	public Patient(String name, String id, int age, String diagnosis) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		 return String.format("Patient [name=%s, id=%s, age=%d, diagnosis=%s]", 
                name, id, age, diagnosis);
	}		
}
