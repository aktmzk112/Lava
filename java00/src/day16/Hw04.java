package day16;

import java.util.*;
public class Hw04 {

	public Hw04() {
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
	
//		cal.set(2005, 7, 31);  
		cal.getTime();
		cal2.getTime();
		cal3.getTime();
		
		cal2.set(2005,1,31);
		cal3.set(2024,1,31);
//		cal.roll(cal.DAY_OF_MONTH,3); //roll은 최대일자가 지나가면 다시 1일부터 시작한다 월에 지장은 없다
		cal.add(cal.DAY_OF_MONTH, 3); //add도 일자와 월을 바꿔보자~!!!
		System.out.print(cal.get(cal.DAY_OF_MONTH)); //add로 증감했는데 변화는 요일
		System.out.println();
		System.out.println(cal.get(cal.YEAR)); //년도를꺼내는 명령
		System.out.println(cal.get(cal.MONTH)+1); // 월을 꺼내는 명령 +1을 해줘야함
		System.out.println(cal.getActualMaximum(cal.DAY_OF_MONTH)); // 해당월 마지막 일자.
		System.out.println("--------------------------------------");
		System.out.println(cal.before(cal2)); //현재시간보다 과거의 시간이므로 false 반환
		System.out.println(cal.before(cal3)); //현재시간보다 미래의 시간이므로 true 를 반환
		System.out.println("--------------------------------------");
		System.out.println(cal.after(cal2)); //현재시간 보다 과거의 시간이므로 true를 반환
		System.out.println(cal.after(cal3)); //현재시간 보다 미래의 시간이므로 false를 반환
	
	}



	public static void main(String[] args) {
		new Hw04();
	}

}
