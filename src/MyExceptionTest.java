import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
	Scanner scan = new Scanner(System.in);
	public MyExceptionTest() {
		// TODO Auto-generated constructor stub
	}
	public void star() {
		//1~100사이의 임의 수를 입력받아 그 수 까지 합을 구하여 출력하는 프로그램
		
		try {
			System.out.println("정수(1~100)=>");
			int max = scan.nextInt();// 5 105
			
			//1~100사이가 아니면 예외 발생
			if(max<1 || max>100) {
				//강제로 예외를 발생시킴-->catch문으로 이동
				throw new MyException("임의로 예외메시지를 지정할 수 있다.");
			}
			//합
			System.out.println("합은-->"+total(max));
			
			
			
		}catch(InputMismatchException ime) {
			System.out.println("숫자를 입력하지 않았습니다");
		}catch(MyException me) {
			//1~100사이가 아닐때
			System.out.println(me.getMessage());
		}
	}
	public int total(int max) {
		int s=0;
		for(int i=0; i<=max; i++) {
			s +=i;			
		}
		return s;
	}
	public static void main(String[] args) {
		MyExceptionTest mt = new MyExceptionTest();
		mt.star();
	}
	
}
