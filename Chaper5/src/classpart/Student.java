package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//default ������
	// �ٸ������ڰ� �ϳ��� ���� �� ����
	//�������� ������ �ؾߵ� 
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	} 
	
	public void showStudentInfor() {
		System.out.println(studentName+"," + address);
	}
	
	public String getStudentName() {
		return studentName;		
	}
	
	public void  setStudentName(String name) {
		studentName = name;
	}
	
}
