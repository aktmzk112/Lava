package day11;


/*
 *  문제 2] 
 *  	이 클래스는 학생 한명의 이름 , 자바 오라클 , html , javascript , jsp, spring 의 점수를기억한 클래스 이다 .
 *  	이 클래가 객체가 될때 데이터를 입력 받아서 각 변수에 기억이 되게 
 *  	클래를 정의 하세요 
 *  	단!, 데이터가 입력이 안될 경우 이름은 "박광호"로 하고
 *  	성적은 랜덤하게 기억되게 하세요
 */
public class Score {
	String name;
	int java, orcl, html, javascript, jsp, spring , total;
	double avg;
	
	public Score() {
		this("박광호");
	}
	
	public Score(String name){
//		this.name = name;
//		
//		java= (int) (Math.random()*41+60);
//		orcl = (int) (Math.random()*41+60);
//		html = (int) (Math.random()*41+60);
//		javascript = (int) (Math.random()*41+60);
//		jsp = (int) (Math.random()*41+60);
//		spring = (int) (Math.random()*41+60);
		
//		this(name, (int) (Math.random()*41+60),(int) (Math.random()*41+60)
//				,(int) (Math.random()*41+60),(int) (Math.random()*41+60),
//				(int) (Math.random()*41+60),(int) (Math.random()*41+60));
		
		this(name, ran(),ran()
				,ran(), ran(),
				ran(),ran());

		
		getTotal();
		getAvg();
//		
	}
	
	public Score(String name , int java, int orcl, int html, int javascript, int jsp, int spring) {
		this.name = name;
		this.java = java;
		this.orcl = orcl;
		this.html = html;
		this.javascript = javascript;
		this.jsp = jsp;
		this.spring = spring;
		getTotal();
		getAvg();
	}
	
	
	//랜덤하게 점수 반환 

	public static int ran() {
		return (int) (Math.random()*41+60);
	}
	public void getTotal() {
		total =  java + orcl + html + javascript + jsp + spring;
	}
	
	public void getAvg() {
		
		avg =  total/ 6.;
	}
	
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %3d | %3d | %5.3f\n",name,java,orcl,html,javascript,jsp,spring,total,avg);
	}
	
}
