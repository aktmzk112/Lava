package day11;


/*
 *  ���� 2] 
 *  	�� Ŭ������ �л� �Ѹ��� �̸� , �ڹ� ����Ŭ , html , javascript , jsp, spring �� ����������� Ŭ���� �̴� .
 *  	�� Ŭ���� ��ü�� �ɶ� �����͸� �Է� �޾Ƽ� �� ������ ����� �ǰ� 
 *  	Ŭ���� ���� �ϼ��� 
 *  	��!, �����Ͱ� �Է��� �ȵ� ��� �̸��� "�ڱ�ȣ"�� �ϰ�
 *  	������ �����ϰ� ���ǰ� �ϼ���
 */
public class Score {
	String name;
	int java, orcl, html, javascript, jsp, spring , total;
	double avg;
	
	public Score() {
		this("�ڱ�ȣ");
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
	
	
	//�����ϰ� ���� ��ȯ 

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
