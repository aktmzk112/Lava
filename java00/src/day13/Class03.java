package day13;

public class Class03 extends Test01 {
	private int banjirm;
	
	@Override
	public double calcArea(int... a) {
		banjirm = a[0];
		return banjirm * banjirm * 3.14;
	}

}
