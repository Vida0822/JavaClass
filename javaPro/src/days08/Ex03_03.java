package days08;

import java.util.Scanner;

/**
 * @author dlsgu
 * @date 2023. 2. 6. 오후 3:21:12
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		int x, y;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 두 정수 x, y 입력 ? ");
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		// 두 정수의 합을 처리해서 출력
		// int z = x + y;
		int z = sum(x, y);
		
		// 함수 선언한 후에 함수 호출
		
		System.out.printf("%d+%d=%d\n", x, y, z);

	}//main
	
	// 함수 선언
	// 1. 기능: 두 정수의 합을 구해서 반환하는 함수
	// 2. 매개변수: 두 정수 int, int
	// 3. 리턴값: 합 / 리턴자료형: int
	public static int sum(int x, int y) {
		// int result = x+y;
		// return result;
		return x+y; // 리턴문에 수식을 사용할 수 있다
	}

}//class
