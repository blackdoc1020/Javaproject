import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {
	// ��� ����
	Scanner scan = new Scanner(System.in);

	// ������ �޼ҵ�
	public ExceptionEx2() {
		// scan = new Scanner(System.in);
//	numberProcess();
	}

	// �޼ҵ� ����
	void numberProcess() {
		
		/*
		 * try ~catch ���� �̿��� ����ó�� 
		 *  	:���ܰ� �߻��� �ڵ�� ���ܹ߻� ���ɼ��� ���� �ڵ带 try���� ǥ���Ѵ�.
		 */
		
		
		
		try {
		// 1.������ �غ��ϱ�
		System.out.print("ù��° ���� = ");
		int first = scan.nextInt();	//////InputMismatchException
		System.out.print("�ι�° ���� = ");
		int second = scan.nextInt();//////InputMismatchException
		
		// 2.����ϱ�
		int hap = first + second;

		String str = "ó�����";
		// 3.��� 8+10 = 18
		// %d : decimal(�����϶�) %f : float( �Ǽ�) %s : String (���ڿ�) %c : char(����)
		System.out.printf("%5d+ %5d= %10d\n", first, second, hap);
		System.out.printf("%s-->  %6.1f+ %6.1f= %6.1f\n", str,(double) first, (double) second, (double) hap);
		
		
		//�Է¹��� �� ���� ������  ���� ����϶�
		// ����� 0���� ������ ����. -> ArithmethicException
		int div =  first / second ;
		System.out.println(first + "/"+second + "= "+div);
		} catch (InputMismatchException ime) {
			
			//���� �߻��ÿ��� ����
			// ���࿡ ���ܰ� �߻��ϸ� ó���� ���๮�� ǥ���ϴ� ��
			System.out.println("InputMissmatchException�� �߻��Ͽ����ϴ�.");
			System.out.println("�����͸� �߸� �Է��ϼ̽��ϴ�.");
			
			//���� �߻��� ������ ������ Ȯ���� �� �ִ�.
			//ime.printStackTrace();
			System.out.println(ime.getMessage());
		}	catch(ArithmeticException ae) {
			System.out.println("0���� ����� ���� ��  �����ϴ�.");
			//���� �߻��� ������ ������ Ȯ���� �� �ִ�.
			//ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		System.out.println("try ���� ���."); //? �̰� ����
	}

	public static void main(String[] args) {
		ExceptionEx2 ex =new ExceptionEx2();
		//ex.numberProcess();
		ex.numberProcess();
	}

}

