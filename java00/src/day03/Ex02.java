package day03;

/*
 	문제 1] 
 		게시판에 글을 한페이지에 15개 글을 표시할수 있다.
 		게시물의 갯수를 랜덤하게 0~100 발생한후 
 		필요한 페이지 수를 계산 하여 출력해주는 프로그램을 작성
 		단, 게시물 수가 0인 경우는 1페이지가 필요한것으로 한다.
 		
 */
public class Ex02 {

	public Ex02() {
		gesi();
		
	}
	
	public void gesi() {
			int num = (int)(Math.random() * (100-0+1)) + 0;
			System.out.println(num);
			num = (num-1)/15;
		
			if(num == 0 ) {
				System.out.println("1페이지입니다");
			}else if(num ==1) {
				System.out.println("2페이지입니다.");
			}else if(num ==2) {
				System.out.println("3페이지입니다");
			}else if(num ==3) {
				System.out.println("4페이지입니다.");
			}else if(num ==4) {
				System.out.println("5페이지입니다.");
			}else if(num ==5) {
				System.out.println("6페이지입니다");
			}else {
				System.out.println("마지막페이지!!!!");
			}
			
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
