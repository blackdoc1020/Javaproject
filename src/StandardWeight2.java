

import java.util.Scanner;

public class StandardWeight2 {
	int age, height, gender, weight;
	double standardWeight;
	double index;//지수
	String bodyType;
	
	public StandardWeight2() {
		// TODO Auto-generated constructor stub
	}	
	//정보입력
	public int getData(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.println(msg + "=");
		return scan.nextInt();
	}
	//표준체중
	public void setStandard() {
		standardWeight = (height-100)*0.90; //남 :35이하, 여:36이상
		if(gender==1 && age>=36) {
			standardWeight = (height-100)*0.95;
		}else if(gender==2 && age<36) {
			standardWeight = (height-100)*0.85;
		
		}
	}
	//표준체중 지수
	public void setWeightIndex() {
		index = (weight/standardWeight)*100;
	}
	//체형
	public void setBodyType() {
		if(index<=85) {
			bodyType = "마른형";
		}else if(index<=95) {
			bodyType = "조금 마른형";		
		}else if(index<=115) {
			bodyType = "표준형";		
		}else if(index<=125) {
			bodyType = "조금 비만형";		
		}else {
			bodyType = "비만형";
		}
	}
	//출력
	public void resultOutput() {
		System.out.println("표준체중="+ standardWeight);
		System.out.println("당신은 표준체중지수 "+ index +"으로 "+bodyType+"입니다." );
		
	}
	
	public void startInfo() {
		age = getData("나이");//나이
		gender = getData("성별(1:남성, 2:여성");//성별
		height = getData("키");
		weight = getData("현재체중");//현재 몸무게
		setStandard();//표준체중 구하기
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
