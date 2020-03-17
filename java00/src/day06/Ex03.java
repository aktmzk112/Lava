package day06;
/*
 * 	int[] coin = {10000,5000,1000,500,100,50,10,1};
	이라는 배열을 준비하고 
	79456원을 준비된 화폐단위로 계산할때 각각 화폐단위가 몇개씩 필요한지 
	갯수를 저장할 배열을 만들고 
	출력하는 프로그램 작성
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = {10000,5000,1000,500,100,50,10,1};
		int[] cnt = new int[8];
		int no = 79456;
		
		for(int i =0; i<coin.length; i++) {
			cnt[i] = no/coin[i];
			no %= coin[i];
		}
		
		for(int i=0; i<coin.length; i++) {
			System.out.println(coin[i] + "원 : " + cnt[i]);
		}
		
		
	
	}

}
