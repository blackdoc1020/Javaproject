
public class ExceptionMethod {

	public ExceptionMethod() {
		// TODO Auto-generated constructor stub
	}
	
	public void method1() throws ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException{
		int n = 100, n2=10;
		int result = n/n2;
		System.out.println(n+"/"+n2+"="+result);
		method2();
	}
	public void method2() throws ArrayIndexOutOfBoundsException,NumberFormatException{
		int[] data  =new int[] {50,60,70};
		System.out.println("data-->"+ data[data.length-1]);
		method3();
	}
	public void method3() throws NumberFormatException {
		String str = "kor";
		int strInt = Integer.parseInt(str);
		System.out.println("str�� 10��� ->"+ (strInt*10));
	}
	
	public static void main(String[] args) {
		
		try {
		ExceptionMethod em = new ExceptionMethod();
		em.method1();
	
		}catch(ArithmeticException e) {
			System.out.println("Message -->"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("�迭�� ÷�ڰ��� �߸��Ǿ����ϴ�. --->"+ ae.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("���ڴ� ���ڷ� ������ �� �����ϴ�.");
		}
	}
}
