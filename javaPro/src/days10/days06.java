package days10;

/**
 * @author dlsgu
 * @date 2023. 2. 8. - 오후 3:54:50
 * @subject 주민등록번호 검증
 * @content 
 *
 */
public class days06 {

	public static void main(String[] args) {
		String rrn = "830412-1700001";
		/*
	      [ 주민등록번호 검증 규칙 ]
	      ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
	      ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod(나머지%) 11}
	      즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
		 */

		// 올바른 주민등록번호
		// 잘못된 주민등록번호
		int ㄱ = Integer.parseInt(rrn.substring(0, 1));
		int ㄴ = Integer.parseInt(rrn.substring(1, 2));
		int ㄷ = Integer.parseInt(rrn.substring(2, 3));
		int ㄹ = Integer.parseInt(rrn.substring(3, 4));
		int ㅁ = Integer.parseInt(rrn.substring(4, 5));
		int ㅂ = Integer.parseInt(rrn.substring(5, 6));
		//													(6, 7)  -
		int ㅅ = Integer.parseInt(rrn.substring(7, 8));
		int ㅇ = Integer.parseInt(rrn.substring(8, 9));
		int ㅈ = Integer.parseInt(rrn.substring(9, 10));
		int ㅊ = Integer.parseInt(rrn.substring(10, 11));
		int ㅋ = Integer.parseInt(rrn.substring(11, 12));
		int ㅌ = Integer.parseInt(rrn.substring(12, 13));

        int checksum = 11-((2 *ㄱ+3 *ㄴ+4 *ㄷ+5 *ㄹ+6 *ㅁ+7 *ㅂ+8 *ㅅ+9 *ㅇ+2 *ㅈ+3 *ㅊ+4 *ㅋ+5 *ㅌ) % 11);
        
        if ( checksum == 11 ) {
         checksum = 1;
      }else if( checksum == 10) {
         checksum = 0;
      }
        
        int ㅍ =   Integer.parseInt(  rrn.substring(12, 13) );
        if ( ㅍ == checksum) {
         System.out.println("올바른 주민등록번호.");
      } else {
         System.out.println("잘못된 주민등록번호.");
      }


		/*
		int sum = 0, mul = 0, lastRrn;

		for (int i = 0; i <= 12; i++) {
			if (i <= 5) {
				mul = Integer.parseInt(rrn.substring(i,i+1)) * (i+2);
				if (i==5) i++;
			} else if(i<= 8) mul = Integer.parseInt(rrn.substring(i,i+1)) * (i+1);
			else if(i<=12) mul = Integer.parseInt(rrn.substring(i,i+1)) * (i-7);
			sum += mul;
		}

		lastRrn = 11 - sum % 11;
		if (lastRrn >= 10) lastRrn = lastRrn - 10;

		System.out.println(lastRrn);
		 */

	}//main

}//class
