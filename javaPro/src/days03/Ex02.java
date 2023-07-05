package days03;

/**
 * @author dlsgu
 * @date 
 * @subject 음수 표현 방법 [시험문제]
 * @content 1. 부호와 절대치
 *                2. 1의 보수법
 *                3. 2의 보수법 -> 음수표현
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		// 'A' -> 문자코드표 -> 65 -> 0100 0001
		// -10[음수]/양수            ->
		/*
		 * 1) 절대치 |-10|
		 * 		X [1]000 1010 -> -10 음수
		 * 		X [0]000 1010 -> 10 양수
		 * 
		 * 2) 1의 보수법
		 * 		0000 1010 [10] -> 1111 0101 [-10]
		 * 
		 * 3) 2의 보수법 == 1의 보수법 + 1
		 * 		0000 1010 -> 1111 0101 + 1 -> 1111 0110
		 * 
		*/
		
		// [문제] -36
		// 0010 0100 -> 1101 1011 -> 1101 1100

	}//main

}//class