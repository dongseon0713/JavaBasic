package javaStudy;

import com.eightcruz.study.Machine;

public class CarExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2();
		if( car instanceof Machine) {
			System.out.println("Car가 Machine을 상속 받았습니다.");
		}else {
			System.out.println("Car가 Machine을 상속 받지 않았습니다.");
		}
	}

}
