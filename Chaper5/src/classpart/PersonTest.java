package classpart;

public class PersonTest {
	public static void main(String[] args) {
		Person person1= new Person("남우림", 15);
//		person1.name="남우림";
//		person1.age=10;
		person1.address="시흥시";
		person1.sex="남";
		
		Person person2=new Person();
		person2.name="임영진";
		person2.age=25;
		person2.address="거제시";
		person2.sex="남";
		
		System.out.println(person1);
		System.out.println(person2);
		
		person1.display();
		person2.display();
		
	}
}
