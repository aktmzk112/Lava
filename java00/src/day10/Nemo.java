package day10;

/**
 *  이 클래스는 사각형의 가로와 세로 그리고 넓이를 기억할 클래스
 * @author 유태희
 * @since 2020.03.20
 * @version v.1.0
 * @see 
 * */
public class Nemo {
	//이클래스는 가로와 세로 그리고 넓이를 기억하고 있어여 되는 클래스 이다.
	//따라서 데이터를 기억한 변수르 만들어 준다.
	
	//가로 
	int width;
	//세로
	int height;
	//넓이
	int area;
	
	//그런데 가로와 세로를 입력하면 
	//각변수에 데이터를 기억시키고 넓이도 계산해서 기억시켜주는 기능이 필요
	//따라서 그 기능을 담당한 함수 제작
	public void setVal(int garo, int sero) {
		// 가로와 세로를 기억시키자
		width = garo;
		height = sero;
				
				
		// 넓이는 계산 해서 기억
		area = garo * sero;
	
	}
	
	//출력 함수 
	public void toPrint() {
		System.out.printf("가로 : %3d,\n세로 : %3d, \n넓이: %4d\n%10s\n",width,height,area,"--------");
	}
	
}
