import java.util.Scanner;

public class Exception02 {
	Scanner s = new Scanner(System.in);
	public Exception02() {
		// TODO Auto-generated constructor stub
	}
	public void testStart() {
		try {

			System.out.println("��1=");
			int n1 = Integer.parseInt(s.nextLine());// Numbeer
			System.out.println("��2=");
			int n2 = Integer.parseInt(s.nextLine());
			
			System.out.println(n1+"+"+n2+"="+(n1+n2));
			System.out.println(n1+"/"+n2+"="+n1/n2);
			
			String names[] = {"ȫ�浿","��浿","�ڱ浿"};
			for(int i=0; i<names.length; i++) { //0, 1, 2, 3
				System.out.println("names["+i+"]="+ names[i]);//
			}
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���...");

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//���ܰ� �߻��ϵ� ���ϵ� ������ ����Ǵ� ���̴�.
			System.out.println("finally ������ �����.");
		}
	}
	public static void main(String[] args) {
		Exception02 ee = new Exception02();
		ee.testStart();
	}
}
