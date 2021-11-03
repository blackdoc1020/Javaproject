

import java.util.Scanner;

public class StandardWeight2 {
	int age, height, gender, weight;
	double standardWeight;
	double index;//����
	String bodyType;
	
	public StandardWeight2() {
		// TODO Auto-generated constructor stub
	}	
	//�����Է�
	public int getData(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.println(msg + "=");
		return scan.nextInt();
	}
	//ǥ��ü��
	public void setStandard() {
		standardWeight = (height-100)*0.90; //�� :35����, ��:36�̻�
		if(gender==1 && age>=36) {
			standardWeight = (height-100)*0.95;
		}else if(gender==2 && age<36) {
			standardWeight = (height-100)*0.85;
		
		}
	}
	//ǥ��ü�� ����
	public void setWeightIndex() {
		index = (weight/standardWeight)*100;
	}
	//ü��
	public void setBodyType() {
		if(index<=85) {
			bodyType = "������";
		}else if(index<=95) {
			bodyType = "���� ������";		
		}else if(index<=115) {
			bodyType = "ǥ����";		
		}else if(index<=125) {
			bodyType = "���� ����";		
		}else {
			bodyType = "����";
		}
	}
	//���
	public void resultOutput() {
		System.out.println("ǥ��ü��="+ standardWeight);
		System.out.println("����� ǥ��ü������ "+ index +"���� "+bodyType+"�Դϴ�." );
		
	}
	
	public void startInfo() {
		age = getData("����");//����
		gender = getData("����(1:����, 2:����");//����
		height = getData("Ű");
		weight = getData("����ü��");//���� ������
		setStandard();//ǥ��ü�� ���ϱ�
		setWeightIndex();
		setBodyType();
		resultOutput();
	}
	
	public static void main(String[] args) {
		new StandardWeight2().startInfo(); 
		new StandardWeight2().resultOutput(); 
//		 StandardWeight2 standard = new StandardWeight2();
//		 standard.startInfo();
//		 standard.resultOutput();
	}
}
