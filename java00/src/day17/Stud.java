package day17;

public class Stud implements Comparable {

	private String name;
	private int ban;
	private int no;
	private int kor, eng, math, physics, cod, total;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		 this.total = kor+eng+math+physics+cod;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public int compareTo(Object o) {
		Stud s1 = (Stud) o;
		
		int result = this.getTotal() - s1.getTotal(); 
		return -result;
	}
	
	
}
