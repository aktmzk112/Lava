package day02;

public class Test02 {
	/*
	 * 	모든 클래스는 생성자 함수를 가지고 있다.
	 * 	생성자 함수는 해당 클래스가 객체가 될때 
	 * 	맴버가 가져야할 초기값을 셋팅해주는 역할을 한다.
	 * 
	 * 	클래스에서는 맴버가 변수와 함수가 있는데  
	 *  맴버변수는 변수중 기본형변수들은 자동으로 초기화가 이루어진다.
	 *  
	 * 		int => 0
	 * 		char => ' '
	 * 		boolean ==> false
	 * 		float ==> 0.0f
	 * 		double	==> 0.0
	 */
	
	int  no;
	public static void main(String[] args) {
//		int num = no +1;
		Test02 t2 = new Test02();
		t2.abc();
		System.out.println("Test02.no" + t2.no);
		
	}

	
	public void abc() {
		System.out.println("**********************");
	}
}
