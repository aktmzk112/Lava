package day11;
/*
 * 	����� �����ȣ, ����̸�, ����޿�, �μ���ȣ ,����ȣ, �Ի���, Ŀ�̼��� 
 * 	������ Ŭ������ �ۼ��ϼ���
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
		System.out.println("�Է��� �����ȣ�� : " + empno +"�� �Դϴ�");
		System.out.println("�Է��� ����̸��� : " + ename +"��� �Դϴ�");
		System.out.println("�޿��� : " + sel +"�� �Դϴ�");
		System.out.println("�μ� ��ȣ�� : "+deptno+"�� �μ� �Դϴ�");
		System.out.println("����ȣ�� : " + mgr + "�� �Դϴ�");
		System.out.println("�Ի����� : " + hiredate + "�Դϴ�");
		System.out.println("���ʽ��� : " + comm + "�� �Դϴ�");
		
	}
	
}
