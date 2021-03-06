package day13;

/*
 	
 */
import java.util.*;
public class Exec01 {
	/*
	 	quiz ] 
	 		배열의 단점 ] 
	 			1. 한가지 타입의 데이터만 입력할수 있다.
	 			2. 배열의 길이를 수정할수 없다.
	 			
	 	따라서 이런 단점을 보안하고자 만들어진 클래스가 
	 	ArraysList 이다.
	 	
	 	지금부터는 배열을 모두 잊고 
	 	ArrayList를 사용하면 된다.
	 	
	 	ArrayList  사용 방법
	 		ArrayList list = new ArrayList(); // ArrayList 객체 생성
	 		
	 		list.add(date); 로 데이터를 체우고
	 		
	 		list.get(index); 로 인덱스를 사용해서 꺼내면 된다.
	 		
	 		index는 입력해주는 순서대로 자동으로 붙여지게 된다.
	 		
	 */
	public Exec01() {
		ArrayList list = new ArrayList();
		
		list.add(new Class01());
		list.add(new Class02());
		list.add(new Class03());
		
		ArrayList list2 = new ArrayList();
		list2.add(new int[]{10,5});
		list2.add(new int[] {5,20});
		list2.add(new int[] {15});
		for(int i=0; i< list.size(); i++) { 
			//Collection 에서는 length 대신 size()를 사용하여 길이를 가져온다.
			Test01 t = (Test01) list.get(i);
			int[] arr = (int []) list2.get(i);
//			System.out.println(t.calcArea((int[])list2.get(i)));
			System.out.println(t.calcArea(arr));
		}
		System.out.println("######################");
		abc();
	}
	// 부연설명
	public void abc() { 
		Test01 t = new Class01();
		// ==>	Class01 클래스는 Test01 클래스를 상속을 받아 만든 클래스이므로
		//		Class01 내부에 Test01의 맴버는 모두 포함되어있고
		//		따라서 멤버가 있으면 해당 클래스로 볼 수 있으므로 
		//		Test01클래스로 볼 수 있다.
		Test01 t2 = new Class02();
		Test01 t3 = new Class03();
		
		ArrayList list2 = new ArrayList();
		list2.add(new int[]{10,5});
		list2.add(new int[] {5,20});
		list2.add(new int[] {15});
		
		
		//면적 출럭하기
		/*
		 * System.out.println(t.calcArea((int[]) list2.get(0)));
		 * System.out.println(t2.calcArea((int[]) list2.get(1)));
		 * System.out.println(t3.calcArea((int[]) list2.get(2) ));
		 */
		
		ArrayList list = new ArrayList();
		
		list.add(t);
		list.add(t2);
		list.add(t3);
		
		//그런데 ArrayList는 데이터를 입력하면 입력된 데이터를 Object 타입으로
		//자동 형변환 하여 기억하므로
		//우리가 Test01타입으로 입력을 했더라도 
		//Object 타입으로 자동 형변환이 되서 저장이 된다.
		//따라서 꺼내서 사용할때에는 해당 타입에 맞는 형태로 강제 형변환을 시켜서 사용해야 한다.

		//따라서 원칙은 아래형태처럼 사용해야 되지만
		Class01 c1 = (Class01)list.get(0);
		Class02 c2 = (Class02)list.get(1);
		Class03 c3 = (Class03)list.get(2);
		
		// ==> Test01 타입에 변수에 기억해도 될 것이다
		
		Test01 tt1 = (Class01)list.get(0);
		Test01 tt2 = (Class02)list.get(1);
		Test01 tt3 = (Class03)list.get(2);
		//그런데~ 이것을 반복문 처럼 반복해서 사용해야 하는 경우라면 
		//위의 방식은 적합하지가 않다.
		//따라서 반복분으로 처리를 하려면 공통타입으로 꺼낸 데이터를 강제 형변환 시켜야 한다.
		
	}
	public static void main(String[] args) {
		new Exec01();
	}

}
