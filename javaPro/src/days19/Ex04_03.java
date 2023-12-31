package days19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dlsgu
 * @date 2023. 2. 21. 오전 11:29:28
 * @subject try~with~resources문
 * @content 자동 자원 반환문
 */
public class Ex04_03 {

	public static void main(String[] args) {
		String fileName = "C:\\Windows\\setupact.log";
		
		try(FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
			String line;
			int lineNumber = 1;
			while ((line = br.readLine()) != null) {
				System.out.printf("%d : %s\n", lineNumber++, line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
