package day10;

public class Solv3 {

	public static void main(String[] args) {
		String[] name = {
				"�ڱ�ȣ","�ڱ���","��Ȧ��","��ҿ�","������"
		};
		Stud[] ban = new Stud[5];
		
		for(int i=0; i<ban.length; i++) {
			ban[i] = new Stud(name[i]);
			
		}
		//����Ѵ� 
		//��µ� �ݺ��ؼ� ����Ѵ� (�ݺ�)
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	}
	
	
}
