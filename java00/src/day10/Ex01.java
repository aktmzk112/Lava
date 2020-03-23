package day10;

public class Ex01 {
	
	Semo[] semo;
	
	public void setVal() {
		semo = new Semo[10];
		
		for(int i=0; i<semo.length; i++) {
			semo[i] = new Semo();
			
			int ban = (int) (Math.random() * (29 -1 +1)+1);
			
			semo[i].setSemo(ban);
		}
	}
	public static void main(String[] args) {
		Ex01 e1 = new Ex01();
		
		
		
		for(int i=0; i<e1.semo.length; i++) {
			e1.semo[i].semoPrint();
		}
		
		
	}

}
