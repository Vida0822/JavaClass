package days16;

import days15.Save;

/**
 * @author dlsgu
 * @date 2023. 2. 16. 오전 11:23:37
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) { // 프로그램 시작~
		
		// Save 클래스의 클래스 변수 rate는 메모리에 로딩되어져 있다
		// [클래스 변수 사용 방법 - 클래스명.클래스변수]
		// System.out.println(Save.rate);
		// The field Save.rate is not visible
		// 메모리 로딩과 메모리 접근은 다른 문제이다
		
		System.out.println(Save.getRate());
		Save.setRate(0.08);
		System.out.println(Save.getRate());
		
		// 멤버 사용 방법 - 객체명.필드명, 객체명.메서드명
		
		/*
		 * 1. static 키워드 설명
		 * 2. 저축관련 Save 클래스 선언
		 * 	필드 : private 예금주, 예금액, 이자율
		 * 	getter / setter 선언
		 * 	생성자 : 2
		 * 	메서드 : 예금정보 출력메서드
		 * 3. days15.Ex06.java
		 * */
		
		Save [] ps = {
				 new Save("김예지", 10000, 0.05),
				 new Save("이혜진", 4000, 0.05),
				 new Save("박민종", 16000, 0.05),
				 new Save("이태규", 65000, 0.05),
		         new Save("탁인혁", 1000, 0.05)
		};
		
		// Save.setRate(0.01);
		// 객체명으로도 접근 가능
		ps[1].setRate(0.09);
		
		for (int i = 0; i < ps.length; i++) {
			ps[i].dispSave();
		}
		
		// 정적 메서드 == static 메서드
		// 프로그램이 시작되면 클래스가 로딩되면서 static 메서드도 자동으로 메모리(Method Area)에 로딩된다
		// public static double getRate() {}
		// public static void setRate() {}
		// 질문) 어떤 경우에 static 메서드로 선언합니까?
		//	1) private static double rate처럼 private로 선언된 클래스 변수를 사용하기 위해서
		//	2) 인스턴스를 사용하지 않아도 호출(사용) 가능한 메서드이기 때문에
		//	   자주 사용되는 메서드는 static 메서드로 선언한다 (객체 생성 X)
		
		// 수학과 관련된 메서드를 구현한 클래스 : Math 클래스
		// 모든 메서드가 static 메서드이기 때문에 객체를 생성할 필요없이
		// 클래스명으로 바로 사용 가능하다
		//				   클래스명.static메서드()
		System.out.println(Math.random());
		System.out.println(Math.PI);
		System.out.println(Math.abs(-100));
		System.out.println(Math.max(3, 5));
		System.out.println(Math.min(3, 5));
		System.out.println(Math.pow(2, 3));
		
	}//main

}//class
