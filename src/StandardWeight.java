

import java.util.Scanner;

public class StandardWeight {
//	int age, weight, height, gender;
//	double standardWeight;
//	double Index;
//	String bodyType;
	public StandardWeight() {
		// TODO Auto-generated constructor stub
	}	
	
	public void setOutInfo() {
		int age = getData("����");
		int gender = getData("����");
		int height = getData("Ű");
		int weight = getData("����ü��");
		double standardWeight = setStandard(age, gender, height, weight);
		double Index = setWeightIndex(weight,standardWeight);
		String bodyType = setBodyType(Index);
		resultOutput(standardWeight,Index,bodyType);
	}
	
	//�����Է�
	public int getData(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"=");
		return scan.nextInt();
	}
	//ǥ��ü��
	public double setStandard(int age, int gender, int height,int weight) {
		//double standardWeight;
		double standardWeight = (height-100)*0.90;
		if(gender==1 && age>=36) {
			standardWeight = (height-100)*0.95;
		}else if(gender==2 && age<36) {
			standardWeight = (height-100)*0.85;
		}
		return standardWeight;
	}
	//ǥ��ü������
	public double setWeightIndex(int weight, double standardWeight){
		double Index=(weight/standardWeight)*100;
		return Index;
	}
	//ü��
	public String setBodyType(double Index) {
		String bodyType = "";
		if(Index<=85) {
			bodyType = "������";
		}else if(Index<=95) {
			bodyType = "���ݸ�����";
		}else if(Index<=115) {
			bodyType = "ǥ����";
		}else if(Index<=125) {
			bodyType = "���� ����";
		}else if(Index>125) {
			bodyType = "����";
		}
		return bodyType;
	}
	//���
	public void resultOutput(double standardWeight, double Index, String bodyType) {
		System.out.println("ǥ��ü�� = "+standardWeight);
		System.out.println("����� ǥ��ü�������� "+Index+"���� "+bodyType+"�Դϴ�");
	}
	

	
	public static void main(String[] args) {
		new StandardWeight().setOutInfo();
	}
}