package days12;

import java.util.Arrays;

/**
 * @author dlsgu
 * @date 2023. 2. 10. 오전 11:03:52
 * @subject
 * @content 1) 배열 단점: 배열크기 자동 증가/감소
 * 			2) 배열 단점: 추가, 삭제, 삽입 [시험문제2]
 * 			3) 배열 단점:
 * 
 * 			-> 컬렉션 클래스: ArrayList 등등
 */
public class Ex03 {

	public static void main(String[] args) {
		
		int [] m = {3,5,2,4,1};
		// [추가]
		// append() 맨 뒤의 요소로 추가할 때
		// 배열의 크기를 체크해서 추가
		
		// [삭제] 2 index인 2를 삭제
		/*
		m[2] = m[3];
		m[3] = m[4];
		m[4] = 0;
		*/
		/*
		for (int i = 3; i < m.length; i++) {
			m[i-1] = m[i];
		}
		m[m.length-1] = 0;
		*/
		
		// [삽입]
		// 배열크기 증가 체크
		int [] temp = new int[m.length + 3];
		System.arraycopy(m, 0, temp, 0, m.length);
		m = temp;
		// 2 인덱스 위치에 100 삽입
		for (int i = 4; i >= 2; i--) {
			m[i+1] = m[i];
		}
		m[2] = 100;
		System.out.println(Arrays.toString(m));
		
		// [수정]
		m[2] = 10;
		
	}//main

}//class
