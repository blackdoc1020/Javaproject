import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
	Scanner scan = new Scanner(System.in);
	public MyExceptionTest() {
		// TODO Auto-generated constructor stub
	}
	public void star() {
		//1~100������ ���� ���� �Է¹޾� �� �� ���� ���� ���Ͽ� ����ϴ� ���α׷�
		
		try {
			System.out.println("����(1~100)=>");
			int max = scan.nextInt();// 5 105
			
			//1~100���̰� �ƴϸ� ���� �߻�
			if(max<1 || max>100) {
				//������ ���ܸ� �߻���Ŵ-->catch������ �̵�
				throw new MyException("���Ƿ� ���ܸ޽����� ������ �� �ִ�.");
			}
			//��
			System.out.println("����-->"+total(max));
			
			
			
		}catch(InputMismatchException ime) {
			System.out.println("���ڸ� �Է����� �ʾҽ��ϴ�");
		}catch(MyException me) {
			//1~100���̰� �ƴҶ�
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
