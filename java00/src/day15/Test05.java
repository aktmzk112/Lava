package day15;
import java.util.regex.*;
import javax.swing.*;
public class Test05 {

	public Test05() {
		//전화번호를 입력받아서 입력한 번호가 맞는 형식인지 검사해보세요! 
		String val = JOptionPane.showInputDialog("전화번호를 입력하세요!");
		//1. Pattern 클래스를 이용해서 검사하고 싶은 정규식 문법을 만든다
		//		그런데 Pattern 클래스는 생성자함수를 호출할 수없도록 감추어 놓은 클래스이므로
		//		이 클래스의 객체를 만들려면 함수중 속성이 static이면서 반환값이 Pattern인 함수를 사용하면 된다.
		//		api 문서를 뒤져보닌깐 그럼 함수는 compile(String regex) 이므로 해당 함수를 사용하자 
		Pattern pattern = Pattern.compile("^0[0-9]{2}-[0-9]{3,4}-[0-9]{4}$");
		/*
		 	2. 	이 클래스에게 정규식 문법을 검사해 달라고 요청 
		 		문법을 검사하는 함수가 matcher()
		 		이 함수는 검사결과를 Matcher 라는 클래스 타입으로 반환해준다
		 		따라서 결과에 대한 모든 정보는 Matcher 클래스 에서 처리를 해야 할 것이다.
		 		
		 		결과를 알아내는 방법 
		 			
		 			matches()
		 */
		Matcher match = pattern.matcher(val);
		
		// 이제 검사 결과는 match에 저장이 되어있으니 꺼내서 사용하면 된다.
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "올바른 전화 번호 입니다");
			
		}else {
			JOptionPane.showMessageDialog(null, "Wrong Phone Number!!!");
		}
	}
	
	public static void main(String[] args) {
		new Test05();
		
	}

}
