package day11;

public class Hw01 {
	
	public Hw01() {
		Dohyung[] d1 = new Dohyung[3];
		d1[0] = new Dongl(10);
		d1[1] = new Semo(10,30);
		d1[2] = new Nemo(20,30);
		
		for(int i=0; i<d1.length; i++) {
			d1[i].toPrint();
		}
	}
	public static void main(String[] args) {
		new Hw01();
	}

}
