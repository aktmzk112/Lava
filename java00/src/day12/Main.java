package day12;

public class Main {

	public Main() {
		Figure[] f1 = new Figure[10]; // 10개의 배열 생성

		for (int i = 0; i < f1.length; i++) {
			int cnt = (int) (Math.random() * 3 + 1);
			int no1 = (int) (Math.random() * 41 + 10);
			int no2 = (int) (Math.random() * 41 + 10);
			if (cnt == 1) { // 1일 경우 삼각 클래스 담기
				f1[i] = new Samgak();
				f1[i].setArea(no1, no2);
				f1[i].toPrint();
			} else if (cnt == 2) {// 2일 경우 사각 클래스 담기
				f1[i] = new Nemo();
				f1[i].setArea(no2, no1);
				f1[i].toPrint();
			} else { // 3일 경우 원 클래스 담기
				f1[i] = new Won();
				f1[i].setArea(no2);
				f1[i].toPrint();
			}
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
