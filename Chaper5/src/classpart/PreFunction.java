package classpart;

public class PreFunction {
	 public static void main(String[] args) {
		int num1 = 10;
		int num2 = 200;
		int mul = multiply(num1,num2);
		int sub = subtract(num1,num2);
		
		System.out.println("더하기 결과 값 = "+mul);	
		System.out.println("빼기 결과 값 = "+sub);
	}
	 
	 public static int multiply(int n1, int n2) {
		 int mul;
		 mul = n1 * n2;
		 return mul;
	 }
	 
	 public static int subtract(int s1, int s2) {
		 int sub = s1 - s2;
		 return sub;		
	 }
}
