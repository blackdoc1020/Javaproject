package classpart;

public class PersonTest {
	public static void main(String[] args) {
		Person person1= new Person("���츲", 15);
//		person1.name="���츲";
//		person1.age=10;
		person1.address="�����";
		person1.sex="��";
		
		Person person2=new Person();
		person2.name="�ӿ���";
		person2.age=25;
		person2.address="������";
		person2.sex="��";
		
		System.out.println(person1);
		System.out.println(person2);
		
		person1.display();
		person2.display();
		
	}
}
