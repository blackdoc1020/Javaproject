package classpart;

public class Person {
	String name;
	int age;
	String address;
	String sex;
	
	public Person() { //default ������
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println();
	System.out.println("�̸� : "+name+", ���� : "+age+", �ּ� : "+ address+", ���� :"+sex);
	}	
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {//�ܺο��� �ʵ� ���� �����Ҽ� �ִ� �޼ҵ�
		this.name = name;
	}
	
	/*
	public static void main(String[] args) {
		Person person = new Person();
		person.name="�ӿ���";
		person.age=25;
		person.address="SiHeung";
		person.sex="��";
		
		person.display();	
	}
	*/
}


