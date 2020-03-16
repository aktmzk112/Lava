package day04;

/*
 * 	두 사람이 등산을 하는데 
 *  한 사람은 이제 등산을 시작하고 
 *  한 사람은 정상에서 내려오기 시작했다.
 *  
 *  산의 높이가 7564m 라 가정하고 
 *  두사람이 만나는 시간은 몇분 몇초 후인지와 높이를 출력해주는 프로그램 작성
 */
public class Hw04 {

	
		public static void main(String[] args) {
			
			int tHeight = 7564; 
			
			for(int i = 0; ; i++) {
				//각 초당 올라가는 사람의 높이
				double h1 = 0.54*i;
				
				// 내려가는 사람의 높이
				double h2 =  tHeight - 1.07 * i;
				
				if(h1 > h2) {
					System.out.println("올라가는 사람의 높이 : " + h1);
					System.out.println("내려가는 사람의 높이 : " + h2);
					System.out.println("만난직후 시간 : " + (i/60) +" 분, "+(i%60)+ " 초");
					break;
				}
			}
			
		}
}
