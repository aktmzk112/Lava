package day18;

public class Stdu implements Comparable {
	private String name;
	private int no, ban, kor, eng, math, sum;
	private double avg;
	
	public Stdu() {};
	public Stdu(String name, int no, int ban, int kor, int eng, int math) {
		this.name = name;
		this.no = no;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setSum() {
		this.sum = kor + eng + math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = getSum() / 3;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int compareTo(Object o) {
		Stdu s1 = (Stdu) o;

		int rel = this.getName().compareTo(s1.getName());
		return rel;
	}

}
