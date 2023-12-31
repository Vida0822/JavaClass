package days19;

/**
 * @author dlsgu
 * @date 2023. 2. 21. 오전 9:31:32
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// try~catch문 (처리 과정)
		// 다중 catch문 중 하나 처리하면 그 밑에 다른 catch문은 처리하지 않는다
		System.out.println("1. 코딩");
		System.out.println("2. 코딩");
		try {
			System.out.println("3. 코딩");
			System.out.println(100/10);
			// System.out.println(100/0);
			System.out.println("4. 코딩");
		} catch (ArithmeticException | NullPointerException e) { // 멀티 catch문 / 다중 catch문
			// TODO: handle exception
		} catch (Exception e) { // ArithmeticException 예외 발생, 업캐스팅
			System.out.println("5. 코딩");
		} finally {
			// 필수 블럭 X
			// 예외 발생 여부에 상관없이 항상 처리하는 블럭 : finally {}
			System.out.println("finally{}");
			// 이 블럭은 왜 사용합니까?
			// 예) 파일 OPEN -> 읽기, 쓰기 -> 반드시 CLOSE
			//	   DB 	OPEN -> CRUD 	   -> 반드시 CLOSE
		}
		System.out.println("6. 코딩");
		System.out.println("정상적으로 종료");
		
	}//main

}//class
