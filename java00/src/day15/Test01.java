package day15;

public class Test01 {
	
	public Test01() {
		Member hw = new Member();

		setMember(hw);
		
		System.out.println(hw);
	
	}
	
	//Member �� �����͸� ä���ִ� �Լ�
	public void setMember(Member m) {
		m.setMno(1242);
		m.setName("������");
		m.setId("whw");
		m.setMail("whw@increpas.com");
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
