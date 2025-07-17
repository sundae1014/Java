package test4.sub5re;

public class Main {
	public static void main(String[] args) {
		
		// 과목 생성하기
		Subject java = new Subject("자바");
		Subject database = new Subject("데이터베이스");
		
		// 학생 생성
		Student s1 = new Student("김유신", "SS001");
		Student s2 = new Student("김춘추", "SS002");
		// Student s3 = new Student("구씨", "SS003");
		// Student s4 = new Student("황씨", "SS004");
		
		// 김씨 수강신청
		s1.entollSubject(java);
		s1.entollSubject(database);
		System.out.println("-------------------------");
		// 정씨 수강신청
		s2.entollSubject(java);
		s2.entollSubject(database);
		System.out.println("-------------------------");
		
		// 김유신 성적 입력
		s1.setScore(java, 96);
		s1.setScore(database, 90);
		System.out.println("-------------------------");
		
		// 김춘추 성적 입력
		s2.setScore(java, 86);
		s2.setScore(database, 76);
		System.out.println("-------------------------");
		
		// 자바 과목 정보 출력
		java.printSubjectInfo();
		System.out.println("-------------------------");
		
		// 데이터베이스 과목 정보 출력
		database.printSubjectInfo();
		System.out.println("-------------------------");
		
		// 김유신 정보 출력
		s1.printStudentInfo();
		System.out.println("-------------------------");
	}
}
