

import java.util.Scanner;

/*
  �ֿܼ��� �ΰ��� ������ �Է¹޾� �μ��� ���� ����϶�.
  
  ����
  ù��° ����=____
  �ι�° ����=____
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
		System.out.print("ù��° ���� = ");
		num1 = scanner.nextInt();
		System.out.print("�ι�° ���� = ");
		num2 = scanner.nextInt();
		total = num1+num2;
		display();
	}
	
	public void display() {
		System.out.print("��� = ");
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		new ExceptionEx();
		}


}
