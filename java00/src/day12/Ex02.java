package day12;

/*
 * ���� 2]
	
	�л��� �̸�, java, db, html, js, css, ����, ���
	�� ������ Ŭ������ �����
	5�л��� �����͸� �Է��ؼ� ����ϼ���.
	��, ������ ����ȭ��Ű����.
	
	
 */
public class Ex02 {
	private String name;
	private int java, db, html, js, css, sum;
	private double avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int getJs() {
		return js;
	}

	public void setJs(int js) {
		this.js = js;
	}

	public int getCss() {
		return css;
	}

	public void setCss(int css) {
		this.css = css;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void setSum() {
		this.sum = java + db + html + js + css;
	}
	
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = sum/5;
	}
	
	public void toPrint() {
		System.out.println("�̸� : " + name);
		System.out.println("java : " + java);
		System.out.println("db : " + db);
		System.out.println("html : " + html);
		System.out.println("js: " + js);
		System.out.println("css : " + css);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("--------------------------------------------");
		
	}
}
