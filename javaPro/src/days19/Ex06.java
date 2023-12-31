package days19;

/**
 * @author dlsgu
 * @date 2023. 2. 21. 오후 2:22:34
 * @subject ***[클래스 객체]를 얻는 방법 getClass(), Card.class, Class.forName() ***
 * @content	class != [Class]
 * 			어떤 객체의 클래스 정보를 저장하고 있는 객체
 */
public class Ex06 {

	public static void main(String[] args) {
		Card c1 = new Card();
		// System.out.println(c1.toString()); // days19.Card@5aaa6d82 -> SPADE : 1
		// System.out.println(c1);
		
		// [객체로부터 Class 객체를 얻어오는 방법 3가지]
		/*
		// 1) getClass() 메서드
		Card c = new Card("HEART", 3);
		
		Class cls = c.getClass();
		System.out.println(cls.getName()); // days19.Card	패키지명.클래스명 -> fullName(풀네임)
		System.out.println(cls.toString()); // class days19.Card
		*/
		
		/*
		// 2) 모든 클래스명.class 스태틱필드가 제공된다
		Class cls = Card.class;
		// 얻어온 Class 객체 cls로부터 인스턴스를 생성할 수 있다
		// 							   new Card(); X
		// Object -> Card 다운캐스팅 (클래스간의 형변환)
		try {
			Card c = (Card)cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		// 3) Class 클래스의 스태틱 메서드 forName()
		String className = "days19.Card";
		try {
			Class cls = Class.forName(className); // JDBC에서 사용
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
		
	}//main

}//class

final class Card {
	String kind; // 카드 종류
	int num; // 카드 번호
	// 디폴트 생성자
	Card() {
		this("SPADE", 1);
	}
	// 생성자
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	// Object.toString() 재정의하겠다	패키지명
	@Override
	public String toString() {

		return String.format("%s : %d", this.kind, this.num);
	}
	
}