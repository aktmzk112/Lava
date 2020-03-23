package day11;



public class Ex01 {
	
	
	public Ex01() {
	//원 10개 만들어 보자
		Circle[] won = new Circle[10];
		for(int i=0; i < won.length; i++) {
			if(i <5) {
			won[i] = new Circle((int) (Math.random()*16+5));
			}
			else 
			{
				 won[i] = new Circle();
			}
		}
		
		//원 출력 하기 
		for(int i=0; i<won.length; i++) {
			won[i].toPrint();
		}
		
		//성정클래스 출력
		Score[] score = new Score[3];
		score[0] = new Score();
		score[1] = new Score("우현우");
		score[2] = new Score("팽순이",100,100,100,100,95 ,80);
		
		//출력하기 
		
		for(int i=0; i<score.length; i++) {
			score[i].toPrint();
		}
	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}
}
