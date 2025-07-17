package test4.sub5re;

public class Student {
	
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	public void entollSubject(Subject a) {
		subjects[subjectCount] = a;
		a.addStudent(this);
		scores[subjectCount++] = 0;
		System.out.println(name+" - "+a.getSubName()+" 과목 신청완료");
	}
	
	public void setScore(Subject a, int score) {
		scores[subjectCount] = score;
		System.out.println(name+" - "+a.getSubName()+" 점수 입력완료");
	}
	
	public void printStudentInfo() {
		System.out.println("학생명 : "+this.name);
		System.out.println("아이디 : "+this.studentId);
		System.out.println("성적");
		for(int i=0; i<subjectCount; i++) {
			System.out.println(" - "+subjects[i]+":"+scores[i]);
		}
	}
	
	public String getName() {
		return name;
	}
}
