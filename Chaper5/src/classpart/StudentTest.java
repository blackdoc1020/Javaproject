package classpart;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLim= new Student(100, "이순신");
		studentLim.address="서울시 영등포구 여의도동";
		
		Student studentKim= new Student();
		studentKim.studentName="김유신";
		studentKim.studentID=101;
		studentKim.address="미국 산호세";
		
		studentLim.showStudentInfor();
		studentKim.showStudentInfor();		
		System.out.println(studentKim);
		System.out.println(studentLim);
		
	}
}
