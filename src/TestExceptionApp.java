import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptionApp {
	Scanner scan = new Scanner(System.in);
	
	public TestExceptionApp() {
		// TODO Auto-generated constructor stub
	}
	
	//��ٸ� ����
	
	
	public String gameTool(int choice) {
		String msg="";
		if(choice==1) {
			msg ="������";
		}
		else if(choice ==2) {
			msg ="�����";
		}
		else if(choice ==3) {
			msg ="ġŲ";
		}
		else if(choice ==4) {
			msg ="���";
		}
		else if(choice ==5) {
			msg ="����";
		}
		return msg;
	}
	
	public void Game() {
		//1~5���� ���Ƿ� �����Ͽ� �߽��� ���ϴ� ���α׷�
		while(true) {
		try {
			System.out.println("============================================");
			System.out.println("���� �߽��� ��õ�ص帳�ϴ�.(1��~5��)");
			
			String choiceStr = scan.nextLine();
			int choice = Integer.parseInt(choiceStr);

			//int choice= scan.nextInt();
			
			if(choice<1 || choice>5) {
				throw new TestException("1���� 5�� ���� �����Ͻÿ�");
			}
			//���
			
			System.out.println("������ �߽��� "+gameTool(choice)+"�Դϴ�!!!");
			System.out.println("============================================");

		}catch(NumberFormatException nfc) {
			System.out.println("���ڸ� �Է��ϼ���");
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
