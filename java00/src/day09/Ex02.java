package day09;

/*
String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";

1. str 문장을 두 문장으로 분리해서 배열에 넣으세요.
   String[] str1 = new String['.' 갯수만큼...];
2. 단어수만큼의 크기를 가지는 배열을 만들고
   배열에 단어를 입력하세요.
*/
public class Ex02 {
	

	public static void main(String[] args) {
		String str= "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
		
		
		int cnt=0;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c == '.') {
				cnt++;
			}
		}
		
		String[] str1= new String[cnt];
		
		String a = str.substring(0,str.indexOf('.'));
		String b = str.substring(str.indexOf(str.indexOf('.'))+1);
		
		str1[0] =a;
		str1[1] =b;
		
//		System.out.println(str1[0]+str1[1]);
		
		int cnt2=0;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c == ' ') {
				cnt2++;
			}
		}
//		System.out.println(cnt2);
		String[] str2= new String[cnt2+1];
		
		String tmp ="";
		
		tmp=str;
		int idx=0;
		
		for(int i=0; i<cnt2; i++) {
			idx = tmp.indexOf(' ');
			
			str2[i] = tmp.substring(0,idx);
			
			tmp = tmp.substring(idx+1);
			
		}
			str2[cnt2]=tmp;
			
			for(int i=0; i<str2.length; i++) {
				System.out.println(str2[i]);
			
			}
	
		}
		
	
	}

