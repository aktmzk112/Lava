package day14;

public class Test01 {
	int age;
	String name;
	
	public Test01() {}
	public Test01(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() { //Override <== Object 소속의 함수를 오버라이딩함
		return name + " 님의 나이는 " + age + " 입니다.";
	}
}
