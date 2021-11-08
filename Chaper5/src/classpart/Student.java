package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//default 생성자
	// 다른생성자가 하나도 없을 때 생성
	//생성자의 목적은 해야될 
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
