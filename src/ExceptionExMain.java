

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExMain {
	Scanner scan = new Scanner(System.in);
	public ExceptionExMain() {

	}
	//단을 입력받아 구구단을 출력하는 메소드
	public void gugudan() {
		while(true) {
			try {
			System.out.print("단=");
			String danStr = scan.nextLine();//입력한문자를 enter를 포함하여 문자열로 input 한다.
			//int dan = scan.nextInt(); //예외처리를 해야하는 코드
			int dan = Integer.parseInt(danStr);//문자열을 숫자로 형변화3
			
			
			for(int i=1; i<10; i++) {
				int result = dan* i;
				System.out.println(dan+ "*"+i+"="+result );
			}
			}catch(InputMismatchException ime) {
				System.out.println("단은 숫자(정수)만 입력하세요.");
			}catch(NumberFormatException nfe) {
				System.out.println("단을 잘못 입력하였습니다.");
				
			}
		}
	}
	
	public static void main(String[] args) {
//		System.out.println("아이디="+ args[0]);
//		System.out.println("비밀번호="+ args[0]);
		//아이디와 비밀번호 일치할 경우 서비스를 제공하겠다.
		try {
		if(args[0].equals("ggm") && args[1].equals("1234")) {
			ExceptionExMain eem =new ExceptionExMain();
			eem.gugudan();
		}else {
			System.out.println("아이디와 비밀번호를 잘못 입력하였습니다.");
		}
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("아이디/비밀번호를 확인후 다시 실행하세요");
		}
	}

}
