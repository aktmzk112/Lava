package day12;

public class Lotze extends Car {

	int speed = 60;
	String color = "soilver";
	int used = 15;

	public void speedUp() { // 오버라이딩
		speed += 40;
	}

	public void speedUp(int s) {
		// 오버로딩
		speed += s;
	}
}
