import java.util.Scanner;

public class Exception02 {
	Scanner s = new Scanner(System.in);
	public Exception02() {
		// TODO Auto-generated constructor stub
	}
	public void testStart() {
		try {

			System.out.println("수1=");
			int n1 = Integer.parseInt(s.nextLine());// Numbeer
			System.out.println("수2=");
			int n2 = Integer.parseInt(s.nextLine());
			
			System.out.println(n1+"+"+n2+"="+(n1+n2));
			System.out.println(n1+"/"+n2+"="+n1/n2);
			
			String names[] = {"홍길동","김길동","박길동"};
			for(int i=0; i<names.length; i++) { //0, 1, 2, 3
				System.out.println("names["+i+"]="+ names[i]);//
			}
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요...");

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//옝외가 발생하든 안하든 무조건 실행되는 곳이다.
			System.out.println("finally 영역이 실행됨.");
		}
	}
	public static void main(String[] args) {
		Exception02 ee = new Exception02();
		ee.testStart();
	}
}
