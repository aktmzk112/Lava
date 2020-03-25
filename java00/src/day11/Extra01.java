package day11;
/*
 * 	사원의 사원번호, 사원이름, 사원급여, 부서번호 ,상사번호, 입사일, 커미션을 
 * 	저장할 클래스를 작성하세요
 */
public class Extra01 {
	int empno, sel , deptno , mgr , comm;
	String ename, hiredate;
	
	
	public Extra01(int empno , String ename, int sel , int deptno, int mgr , String hiredate , int comm) {
		this.empno = empno;
		this.ename = ename;
		this.sel = sel;
		this.deptno = deptno;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.comm = comm;
		
	}
	
	public void toPrint() {
		System.out.println("입력한 사원번호는 : " + empno +"번 입니다");
		System.out.println("입력한 사원이름은 : " + ename +"사원 입니다");
		System.out.println("급여는 : " + sel +"원 입니다");
		System.out.println("부서 번호는 : "+deptno+"번 부서 입니다");
		System.out.println("상사번호는 : " + mgr + "번 입니다");
		System.out.println("입사일은 : " + hiredate + "입니다");
		System.out.println("보너스는 : " + comm + "원 입니다");
		
	}
	
}
