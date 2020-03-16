package test01;



public class EmpInfo {
	int empno;
	String name;
	String hiredate;
	String dept;
	EmpInfo[] ar = new EmpInfo[100];
	
	public EmpInfo() {
		
	}
	
	public EmpInfo(int no, String name, String hiredate ,String dept) {
		empno = no;
		this.name =name;
		this.hiredate = hiredate;
		this.dept = dept;
		
	}


	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHiredate() {
		return hiredate;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
