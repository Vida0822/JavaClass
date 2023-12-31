package days18;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author dlsgu
 * @date 2023. 2. 20. 오후 4:41:06
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {

		int a = 0, b = 0;
		
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		
		try {
			System.out.print("> a, b 두 정수 입력 ? ");
			a = scanner.nextInt();
			b = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("입력 실수 예외 발생");
			System.exit(-1); // 프로그램 종료 == return;
		}
		
		// 오류 : 컴파일 X, 실행 O(에러 X, 예외 O), 논리적 X
		// JVM의 예외처리기에 의해서 ArithmeticException 객체가 생성되어졌고 예외처리 X -> 출력, 비정상 종료
		// ArithmeticException: / by zero
		/*
		아래 코딩을 예외처리라고 하지 않는다
		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다");
			return; // main 메서드를 빠져나간다는 의미는 프로그램을 종료한다는 의미
		}
		*/
		try {
			double c = a/b;
			System.out.printf("%d/%d=%.2f\n", a, b, c);
		} catch (ArithmeticException e) {
			System.out.println("산술적 예외 발생 + 처리");
		}
		
		System.out.println("= 정상적 종료 =");
		
	}//main

}//class
