

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExMain {
	Scanner scan = new Scanner(System.in);
	public ExceptionExMain() {

	}
	//���� �Է¹޾� �������� ����ϴ� �޼ҵ�
	public void gugudan() {
		while(true) {
			try {
			System.out.print("��=");
			String danStr = scan.nextLine();//�Է��ѹ��ڸ� enter�� �����Ͽ� ���ڿ��� input �Ѵ�.
			//int dan = scan.nextInt(); //����ó���� �ؾ��ϴ� �ڵ�
			int dan = Integer.parseInt(danStr);//���ڿ��� ���ڷ� ����ȭ3
			
			
			for(int i=1; i<10; i++) {
				int result = dan* i;
				System.out.println(dan+ "*"+i+"="+result );
			}
			}catch(InputMismatchException ime) {
				System.out.println("���� ����(����)�� �Է��ϼ���.");
			}catch(NumberFormatException nfe) {
				System.out.println("���� �߸� �Է��Ͽ����ϴ�.");
				
			}
		}
	}
	
	public static void main(String[] args) {
//		System.out.println("���̵�="+ args[0]);
//		System.out.println("��й�ȣ="+ args[0]);
		//���̵�� ��й�ȣ ��ġ�� ��� ���񽺸� �����ϰڴ�.
		try {
		if(args[0].equals("ggm") && args[1].equals("1234")) {
			ExceptionExMain eem =new ExceptionExMain();
			eem.gugudan();
		}else {
			System.out.println("���̵�� ��й�ȣ�� �߸� �Է��Ͽ����ϴ�.");
		}
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("���̵�/��й�ȣ�� Ȯ���� �ٽ� �����ϼ���");
		}
	}

}
