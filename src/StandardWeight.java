

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
		int age = getData("나이");
		int gender = getData("성별");
		int height = getData("키");
		int weight = getData("현재체중");
		double standardWeight = setStandard(age, gender, height, weight);
		double Index = setWeightIndex(weight,standardWeight);
		String bodyType = setBodyType(Index);
		resultOutput(standardWeight,Index,bodyType);
	}
	
	//정보입력
	public int getData(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"=");
		return scan.nextInt();
	}
	//표준체중
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
	//표준체중지수
	public double setWeightIndex(int weight, double standardWeight){
		double Index=(weight/standardWeight)*100;
		return Index;
	}
	//체형
	public String setBodyType(double Index) {
		String bodyType = "";
		if(Index<=85) {
			bodyType = "마른형";
		}else if(Index<=95) {
			bodyType = "조금마른형";
		}else if(Index<=115) {
			bodyType = "표준형";
		}else if(Index<=125) {
			bodyType = "조금 비만형";
		}else if(Index>125) {
			bodyType = "비만형";
		}
		return bodyType;
	}
	//출력
	public void resultOutput(double standardWeight, double Index, String bodyType) {
		System.out.println("표준체중 = "+standardWeight);
		System.out.println("당신은 표준체중지수는 "+Index+"으로 "+bodyType+"입니다");
	}
	

	
	public static void main(String[] args) {
		new StandardWeight().setOutInfo();
	}
}