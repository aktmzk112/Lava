package exam;

public class EmpDAO {
	public Chamgo esql;
	public EmpDAO() {
		esql = new Chamgo();
		// ��� ȸ���� ������ ��ȸ�� ���Ǹ�� �������� 
		
		String sql = esql.getSQL(esql.SEL_ALL);
		System.out.println("sql : " + sql);
		
	
	}

	public static void main(String[] args) {
		new EmpDAO();
	}

}
