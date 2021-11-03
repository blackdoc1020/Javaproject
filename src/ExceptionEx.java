

import java.util.Scanner;

/*
  콘솔에서 두개의 정수를 입력받아 두수의 함을 출력하라.
  
  실행
  첫번째 정수=____
  두번째 정수=____
  ___ + ___ = ___
 */

public class ExceptionEx {
	int num1;
	int num2;
	int total;
	
	Scanner scanner = new Scanner(System.in);
	
	public ExceptionEx() {
		Calc();
	}
	
	public void Calc() {
		System.out.print("첫번째 정수 = ");
		num1 = scanner.nextInt();
		System.out.print("두번째 정수 = ");
		num2 = scanner.nextInt();
		total = num1+num2;
		display();
	}
	
	public void display() {
		System.out.print("결과 = ");
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		new ExceptionEx();
		}


}
