package day04;

/*
 	while ���
 		
 		for��ɹ� ó�� �ݺ� �����Ҽ� �ִ� ��ɹ�
 		for ��ɹ����� �������� �ݺ��� �� Ƚ���� �����ϴ� ī���� ������ 
 		�׸��� �����ĵ� ����
 		��ɳ��ο� ���°��� ������....
 		
 		����]
 			
 			(1)
 			while(���ǽ� - (2)){
 				- (3)
 			
 			}
 				- (4)
 				
 		����]
 			1 -> 2 -> 3 -> 2 -> 3 ->..... ���ǻ�� true �� ��쿡�� 
 				-> (4) 
 		
 		

 */
public class Test05 {
	
	public static void main(String[] args) {
		int dan = 2;
		
		while(dan < 9) {
			int gop = 1 ;
			System.out.println("-----------------------------");
			while(gop < 10) {
				System.out.println(dan + " x " + gop + " = " + (dan * gop));
				gop++;
			}			
			dan++;
		}
		System.out.println("-----------------------------");
		
	}
}
