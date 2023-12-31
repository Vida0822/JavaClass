package days20;

import java.io.FileReader;

/**
 * @author dlsgu
 * @date 2023. 2. 22. 오후 4:26:45
 * @subject java.util 패키지 + 클래스
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		String fileName = "days20\\Ex01.java";
		
		fileName = String.format("%s\\src\\%s", System.getProperty("user.dir"), fileName);
		
		System.out.println(fileName);
		// 1. 읽어와서 출력 - 한 라인 X, 한 문자 단위
		//			ㄴ 배열 0~9 예제 -> days13.Ex02.java 활용
		// 2. 알파벳 대소문자 구분하지않고 A=20, B=13 알파벳 갯수 파악해서 출력
		// 3. 막대그래프
		//	A(20) : ####################
		//	B(13) : #############
		int [] counts = new int[26];
		// 'A' 65	counts[0]
		char one = '\u0000';
		int code = 0;
		try (FileReader fr = new FileReader(fileName)){
			while ((code = fr.read()) != -1) {
				one = (char)code;
				// System.out.println(one);
				one = Character.toUpperCase(one);
				if (Character.isUpperCase(one)) {
					int index = one - 'A';
					counts[index]++;
				}
			}
			// 막대그래프
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("%c(%02d) : %s\n", i+'A', counts[i], "#".repeat(counts[i]));
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}//main

}//class
