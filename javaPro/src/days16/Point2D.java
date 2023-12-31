package days16;

public class Point2D {	
	public int x;
	public int y;
	
	// 생성자는 상속되지 않는다
	public Point2D() {
		System.out.println("> MyPoint 디폴트 생성자 호출됨...");
	}
	public Point2D(int a) {
		this.x = a;
		this.y = a;
		System.out.println("> MyPoint 1 생성자 호출됨...");
	}	
	public Point2D(int x, int b) {
		this();
		this.x = x;
		y = b;
		System.out.println("> MyPoint 2 생성자 호출됨...");
	}

	public void dispMyPoint() {
		System.out.printf("x=%d, y=%d\n", this.x, this.y);
	}

	public Point2D offsetPoint(int i) {
		x += i;
		y += i;
		return this;
	}

	public void offsetPoint( Point2D p ) { 
		x += p.x;
		y += p.y;
	}

	public int getX() {
		return x;
	}


	public Point2D plus(Point2D p) {
		int xValue =  x + p.x;
		int yValue =  y + p.y;
		
		Point2D newp = new Point2D();
		newp.x = xValue;
		newp.y = yValue;
		
		return newp;
	}
	
	public Point2D test(Point2D p) {
		System.out.println("test() 호출됨.");
		return p;
	}

}
