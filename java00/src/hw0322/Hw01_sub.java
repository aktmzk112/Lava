package hw0322;


public class Hw01_sub {
	int[][] num1;
	
	public void setNum() {
		num1 = new int[5][2];
		
		
		//등수랑 점수 생성
		for(int i=0; i<num1.length; i++) {
			
				num1[i][0] = i+1;
			for(int j=0; j<num1[i].length; j++) {
				
				num1[i][1] = (int) (Math.random() * (100-10+1)+10);
			
			}
			
		}
		
		//점수 정렬
		for(int i=0; i<num1.length-1; i++) {
			for(int j=i+1; j<num1.length; j++) {
				if(num1[i][1] < num1[j][1]) {
					int tmp = 0;
					tmp = num1[i][1];
					num1[i][1] = num1[j][1];
					num1[j][1] = tmp;
				}
			}
		}
	}
		public void numPrint() {
			for(int i=0; i<num1.length; i++) {
				System.out.println(num1[i][0] +"등은 " + num1[i][1] + "점 입니다");
			}
		}
		
		
	}
	

