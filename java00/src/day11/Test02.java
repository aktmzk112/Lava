package day11;

public class Test02 {

	public static void main(String[] args) {
//		int no1 = getRandom(); static 맴버 안에서는 static멤버와 메모리에 올려진것만 사용 가능하다
		
		//꼭사용 하겠다면 
		//1. 그 함수를 멤버로 자기는 클래스의 객체를 만들어준다
		//	객체 = 참조변수 + 인스턴스 
		Test02 t1 = new Test02();
		int no = t1.getRandom();
		
		//static 멤버 호출 
		int no2 = getTen();
	}
	
	public int getRandom() {
		int result = (int) (Math.random() * 7+1);
		return result;
	}
	
	public static int getTen() {
		return 10;
	}

}
