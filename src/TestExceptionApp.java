import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptionApp {
	Scanner scan = new Scanner(System.in);
	
	public TestExceptionApp() {
		// TODO Auto-generated constructor stub
	}
	
	//사다리 게임
	
	
	public String gameTool(int choice) {
		String msg="";
		if(choice==1) {
			msg ="떡볶이";
		}
		else if(choice ==2) {
			msg ="자장면";
		}
		else if(choice ==3) {
			msg ="치킨";
		}
		else if(choice ==4) {
			msg ="라면";
		}
		else if(choice ==5) {
			msg ="피자";
		}
		return msg;
	}
	
	public void Game() {
		//1~5번을 임의로 선택하여 야식을 정하는 프로그램
		while(true) {
		try {
			System.out.println("============================================");
			System.out.println("오늘 야식은 추천해드립니다.(1번~5번)");
			
			String choiceStr = scan.nextLine();
			int choice = Integer.parseInt(choiceStr);

			//int choice= scan.nextInt();
			
			if(choice<1 || choice>5) {
				throw new TestException("1부터 5번 까지 선택하시요");
			}
			//결과
			
			System.out.println("오늘의 야식은 "+gameTool(choice)+"입니다!!!");
			System.out.println("============================================");

		}catch(NumberFormatException nfc) {
			System.out.println("숫자를 입력하세요");
		}catch(TestException te) {
			System.out.println(te.getMessage());
		}
	}
	}
		



	public static void main(String[] args) {
		TestExceptionApp tea = new TestExceptionApp();
		tea.Game();
	}
	

}
