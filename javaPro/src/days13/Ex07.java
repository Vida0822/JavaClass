package days13;

import java.util.Random;
import java.util.Scanner;

/**
 * @author dlsgu
 * @date 2023. 2. 13. 오후 3:33:18
 * @subject 다차원 배열 예제
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// days09.Ex03_04.java 로또게임
		Scanner scanner = new Scanner(System.in);
		
		int [][] lottos;
		
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();
		
		lottos = new int[gameNumber][6];
		
		fillLotto( lottos );
		dispLotto( lottos );
		
	}//main
	
	private static void fillLotto(int[][] lottos) {
		// 다차원 배열은 배열의 배열이다
		for (int i = 0; i < lottos.length; i++) {  // 게임 횟수 행 만큼 로또번호를 반복
	         
	         
	         int index = 0 , n;
	         Random rnd = new Random();   
	         while( index <= 5 ) {
	            n  = rnd.nextInt(45)+1;
	            if( !isDuplicateLotto(  lottos, index, n , i  ) ) {
	               lottos[i][index++] = n;
	            } // if
	         } // while  
	         
	         
	      } // i
		
	}

	private static boolean isDuplicateLotto(int[][] lottos, int index, int n, int row) {

		for (int i = 0; i < index; i++) {
			if( lottos[row][i] == n) {
				return true;  // 중복 된다.
			}
		} // for
		return false; // 중복 X
	}

	// 2차원 배열을 매개변수로 사용하는 예제
	private static void dispLotto(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d 게임]\t\t", i+1);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.printf("[%d]", lottos[i][j]);
			}
			System.out.println();
		}
		
	}

	public static void fillLottoOne(int[] lotto) {
		int index = 0 , n;
		Random rnd = new Random(); 
		// [0]
		lotto[index++] = rnd.nextInt(45)+1; // 1

		//       [][][x][][]
		while( index <= 5 ) {
			n  = rnd.nextInt(45)+1;
			if( !isDuplicateLottoOne(  lotto, index, n  ) ) {
				lotto[index++] = n;
			} // if
		} // while 
	} // fillLotto
	
	public static boolean isDuplicateLottoOne(int[] lotto, int index, int n) {
		for (int i = 0; i < index; i++) {
			if( lotto[i] == n) {
				return true;  // 중복 된다.
			}
		} // for
		return false; // 중복 X
	}

	public static void dispLottoOne(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		}
		System.out.println(); // 개행
	}

}//class
