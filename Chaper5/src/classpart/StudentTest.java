package classpart;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLim= new Student(100, "�̼���");
		studentLim.address="����� �������� ���ǵ���";
		
		Student studentKim= new Student();
		studentKim.studentName="������";
		studentKim.studentID=101;
		studentKim.address="�̱� ��ȣ��";
		
		studentLim.showStudentInfor();
		studentKim.showStudentInfor();		
		System.out.println(studentKim);
		System.out.println(studentLim);
		
	}
}
