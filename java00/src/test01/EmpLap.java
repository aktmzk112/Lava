package test01;

import java.util.*;


class EmpInfo1{
	int empno;
	String name;
	String hiredate;
	String dept;
	EmpInfo1[] ar = new EmpInfo1[100];
	
	public EmpInfo1() {
		
	}
	
	public EmpInfo1(int no, String name, String hiredate ,String dept) {
		empno = no;
		this.name =name;
		this.hiredate = hiredate;
		this.dept = dept;
		
	}
	
	public void showEmp(int no1) {
		
		for(int i=0; i<ar.length; i++) {
		
			if(ar[i].empno == no1) {
				System.out.println(ar[i].empno);
				System.out.println(ar[i].name);
				System.out.println(ar[i].hiredate);
				System.out.println(ar[i].dept);
				
			}
			
		}
	}
	
}




public class EmpLap {
		static Scanner sc = new Scanner(System.in);
		int no =0;
		
	
	 void menu() {
		 System.out.println("1. 사원정보 입력");
		 System.out.println("2. 사원정보 출력");
		 System.out.print("번호 입력 : ");
		 
	 }
	 void setEmp(){
		
		 
		EmpInfo1 info = new EmpInfo1();
		
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();

		System.out.print("입사일 : ");
		String date = sc.nextLine();
		
		System.out.print("부서번호 : ");
		String dept = sc.nextLine();
		
		EmpInfo1 em	= new EmpInfo1(num, name, date, dept);
		info.ar[no++] = em;
		
		info.showEmp(1001);
		
	}
	

	public static void main(String[] args) {
		EmpLap emp = new EmpLap();
		EmpInfo1 in = new EmpInfo1();
		
		int code = 0;
		
		while(true) {
			emp.menu();
			code = sc.nextInt();
			sc.nextLine();
			
		 switch (code) {
		case 1:
			emp.setEmp();			
			break;
		case 2:
			in.showEmp(1001);
			break;
		default:
			break;
		}
			
		}
		
		
	}

}
