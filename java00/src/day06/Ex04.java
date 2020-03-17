package day06;
/*
 * 문제 4]
	
	반지름 5개를 기억할 배열을 만들고 
	각각의 반지름을 가진 원의 넒이를 계산해서 저장할 배열을 만들고 
	각원의 둘레를 계산해서 저장할 배열도 만들어서 
	결과를 출럭하는 작정하세요 
	
	단 출력형태는 
	
		예] 
			반지름 : 10 , 원의 둘레 62.8, 원의 넒이 : 314	
	
	의 형태로 출력되게 하세요...
 */
public class Ex04 {

	public static void main(String[] args) {
		int[] ban = new int[5];
		float[] res1 = new float[5];
		float[] res2 = new float[5];
		
		for(int i=0; i<5; i++) {
			ban[i] = (int) (Math.random() * (30-2+1)+2); 
			res2[i] = (float) (ban[i] * ban[i] * 3.14);
			res1[i] = (float) (2*ban[i]*3.14);
			System.out.println("반지름은 : " + ban[i] + " 넓이는 : " + res2[i] + " 둘레는 : "  + res1[i]);
		}
		

	}

}
