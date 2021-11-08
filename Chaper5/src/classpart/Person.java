package classpart;

public class Person {
	String name;
	int age;
	String address;
	String sex;
	
	public Person() { //default 생성자
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println();
	System.out.println("이름 : "+name+", 나이 : "+age+", 주소 : "+ address+", 성별 :"+sex);
	}	
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {//외부에서 필드 값을 변경할수 있는 메소드
		this.name = name;
	}
	
	/*
	public static void main(String[] args) {
		Person person = new Person();
		person.name="임영진";
		person.age=25;
		person.address="SiHeung";
		person.sex="남";
		
		person.display();	
	}
	*/
}


