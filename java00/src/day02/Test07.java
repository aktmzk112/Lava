package day02;

public class Test07 {
/*
  	콘솔창에 출력하는 기능을 가진 함수 
  		1.println(내용) - 내용을 출력해준 다음 자동으로 줄바꿈 해주는 함수
  		2.print(내용)	- 내용을 출력하고 줄바꿈을 하지 않는다
  		3.printf(형식,내용,내용,....)	- 내용을 형식에 맞게 출력해주는 함수
	
 
 
 */
	
	
	public Test07() {
		System.out.println("#####################");
		System.out.println("#####################");
		
		System.out.print("#####################\n");
		System.out.print("#####################\t");
		
		System.out.println("###########\t##########");
		System.out.println("\t#####################");
		System.out.println("-------------------------------------------------------");
		System.out.printf("------%5d------", 10 ); //10을 5자리로 만든다
		System.out.printf("*****%.2f*****%n",3.141592); // 소숫점이라 2자리만 표기 한다 
	
		System.out.printf("%5s", "홍길동");
	}
	public static void main(String[] args) {
		new Test07();

	}

}
