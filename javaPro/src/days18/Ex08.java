package days18;

/**
 * @author dlsgu
 * @date 2023. 2. 20. 오후 3:04:09
 * @subject 내부 클래스 (inner class)
 * @content	- 사용빈도 낮다
 * 
 * 			내부 클래스의 종류
 * 			1) 인스턴스 클래스 - 외부클래스의 필드 선언위치에 선언, 외부클래스의 인스턴스 멤버처럼 다루어진다
 *								역할 : 주로 외부클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적
 * 			 class 외부클래스 {
 * 				// 인스턴스 변수
 * 				//
 * 				// 초기화 블럭
 * 				{
 * 					class 내부클래스 { 3) 지역 클래스
 * 					}
 * 				}
 * 				class 내부클래스 { 1) 인스턴스 클래스
 * 				}
 * 				static class 내부클래스 { 2) 스태틱 클래스
 * 				}
 * 
 * 				// 외부클래스 메서드
 * 				void print() {
 * 					//
 * 					//
 * 					class 내부클래스 { 3) 지역 클래스
 * 					}
 * 				}
 * 			 }
 * 			2) static 클래스 - 외부클래스의 필드 선언 위치에 선언, 외부클래스의 static 멤버처럼 다루어진다
 * 			3) 지역 클래스 - 외부클래스의 메서드나 초기화 블럭 안에 선언
 * 			4) 익명 클래스 - Ex08_02.java
 */
public class Ex08 { // 외부 클래스 (outer class)
	
	// 내부 클래스 (inner class)
	// 전체적인 코딩읠 복잡성을 줄일 수 있다 (캡슐화)
	class Test {
		// 외부 클래스의 멤버를 바로 직접적으로 사용할 수 있다 - 접근성, 보안성
	}
	
	// has-a 관계
	// new Test(); 결합성이 높은 코딩 (좋지 않은 코딩)
	// t 인스턴스 변수
	// Test t = new Test(this);

	public static void main(String[] args) {
		// static 메서드 안에서 인스턴스 변수 사용 못하기 때문에 에러

	}//main

}//class

// 다른 클래스에서도 Test 클래스를 자주 사용한다면 외부 클래스로 선언하는게 낫다
// 클래스 선언
/*
class Test {
	// Test 안에서 Ex08 클래스의 멤버를 사용하고 싶다
	private Ex08 p;
	Test(Ex08 obj) {
		p = obj;
	}
	// 다른 메서드에서 p 필드를 통해서 Ex08의 멤버를 사용할 수 있다
}
*/