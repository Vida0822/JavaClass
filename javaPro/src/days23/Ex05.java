package days23;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author dlsgu
 * @date 2023. 2. 27. 오전 10:39:02
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// LocalDate
		// LocalTime
		/*
		LocalDateTime dt = LocalDateTime.now(); // of()
		System.out.println(dt); // 2023-02-27T10:39:42.327999400
		// 절삭
		// dt = dt.truncatedTo(ChronoUnit.MINUTES); // 2023-02-27T10:43
		// dt = dt.truncatedTo(ChronoUnit.HOURS); // 2023-02-27T10:00
		dt = dt.truncatedTo(ChronoUnit.DAYS); // 2023-02-27T00:00
		System.out.println(dt);
		*/
		
		// LocalDate와 LocalTime을 합쳐서 LocalDateTime 객체를 만들 수 있다
		LocalDate d = LocalDate.now(); // 날짜만
		LocalTime t = LocalTime.now(); // 시간만
		
		// 1. of(date, time)
		// LocalDateTime dt = LocalDateTime.of(d, t);
		
		// 2. atTime(t)
		// LocalDateTime dt = d.atTime(t);
		
		// 3. atDate(d)
		// LocalDateTime dt = t.atDate(d);
		
		// 4.
		// LocalDateTime dt = d.atStartOfDay(); // 00:00:00.000

	}//main

}//class
