package day14;
/*
 * 문제 2] 

	삼각형 클래스를 작성하고 
	삼각형 클래스에 밑변과 높이를 입력해서 객체를 만들도록 작성하고
	
	만약 밑변이 같으면 같은 삼각형이 되도록 
	equals 함수를 오버라이드 하고 테스트 하시오
	
	입력은 JOptionPane으로 소속의 함수로 처리 
	출력도 같은 소속의 함수로 처리 
	 
 */
public class Samgak  {
	private int no1,no2;
	private double area;
	
	public Samgak(int no1 , int no2) throws NumberFormatException{
		this.no1 = no1;
		this.no2 = no2;
		
		if(no1 < 0 || no2 < 0) {

			throw new NumberFormatException("첫번째"+no1+"두번째"+no2);
		}
		setArea();
	}
	
	public void setArea() {
		area = no1 * no2 * 0.5;
	}
	
	public double getArea() {
		
		return area;
	}
	
	public int getNo1() {
		return no1;
	}
	
	@Override
	public String toString() {
		
		return "삼각형의 밑변이 "+no1+", 높이가 "+no2+", 넓이가 " +area+"인 삼각형입니다.!";
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean bool = false;
		Samgak s1 = (Samgak) obj;
		bool = (this.no1 == s1.no1) ? (true) : (false);
		
		return bool;
	}

}
