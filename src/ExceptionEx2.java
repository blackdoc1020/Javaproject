import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {
	// 멤버 영역
	Scanner scan = new Scanner(System.in);

	// 생성자 메소드
	public ExceptionEx2() {
		// scan = new Scanner(System.in);
//	numberProcess();
	}

	// 메소드 생성
	void numberProcess() {
		
		/*
		 * try ~catch 문을 이용한 예외처리 
		 *  	:예외가 발생한 코드와 예외발생 가능성이 없는 코드를 try문에 표기한다.
		 */
		
		
		
		try {
		// 1.데이터 준비하기
		System.out.print("첫번째 정수 = ");
		int first = scan.nextInt();	//////InputMismatchException
		System.out.print("두번째 정수 = ");
		int second = scan.nextInt();//////InputMismatchException
		
		// 2.계산하기
		int hap = first + second;

		String str = "처리결과";
		// 3.출력 8+10 = 18
		// %d : decimal(정수일때) %f : float( 실수) %s : String (문자열) %c : char(문자)
		System.out.printf("%5d+ %5d= %10d\n", first, second, hap);
		System.out.printf("%s-->  %6.1f+ %6.1f= %6.1f\n", str,(double) first, (double) second, (double) hap);
		
		
		//입력받은 두 수를 나누어  몫을 출력하라
		// 어떤수를 0으로 나눌수 없다. -> ArithmethicException
		int div =  first / second ;
		System.out.println(first + "/"+second + "= "+div);
		} catch (InputMismatchException ime) {
			
			//예외 발생시에만 실행
			// 만약에 예외가 발생하면 처리할 실행문을 표기하는 곳
			System.out.println("InputMissmatchException이 발생하였습니다.");
			System.out.println("데이터를 잘못 입력하셨습니다.");
			
			//현재 발생한 예외의 정보를 확인할 수 있다.
			//ime.printStackTrace();
			System.out.println(ime.getMessage());
		}	catch(ArithmeticException ae) {
			System.out.println("0으로 어떤수를 나눌 수  없습니다.");
			//현재 발생한 예외의 정보를 확인할 수 있다.
			//ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		System.out.println("try 문을 벗어남."); //? 이게 뭐지
	}

	public static void main(String[] args) {
		ExceptionEx2 ex =new ExceptionEx2();
		//ex.numberProcess();
		ex.numberProcess();
	}

}

