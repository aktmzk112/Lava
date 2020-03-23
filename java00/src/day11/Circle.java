package day11;

/*
 * 문제1] 
 * 		이클래스는 원의 정보를 저장할 클래스이다. 
 * 		이 클래스가 객체가 될 때 반지름을 입력받아서 원의 대한 정보가
 * 	 	입력이 되게 클래스 정의 하세요 
 * 		
 * 		반지름이 입력이 안될 경우는 10으로 입력되게 하세요 this() 사용
 */
public class Circle {
	int won;

	
	public Circle(){
		this(10);
	}
	
	public Circle(int won) {
		this.won = won;
	}
	
	public double won1() {
		return 2*won*3.14;
	}
	
	public double won2() {
		return won*=3.14;
	}
	
	public void toPrint() {
		System.out.println("원의 반지름 : " + won);
		System.out.println("원의 둘레 : " + won1());
		System.out.println("원의 넓이 : " + won2());
		
		
	}
}
