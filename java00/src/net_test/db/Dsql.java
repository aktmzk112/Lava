package net_test.db;

public class Dsql {

	public final int S_SQL = 1001;
	public final int R_SQL = 1002;
	
	
	public Dsql() {}

	public String getSQL(int code) {
		
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case S_SQL: 
			buff.append("INSERT INTO ");
			buff.append(" jjokji( ");
			buff.append("	tno , jname , jarea , jcode ) ");
			buff.append("VALUES ");
			buff.append(" ( ");
			buff.append(" 	(SELECT NVL(MAX(tno)+1, 1) FROM jjokji), ");
			buff.append(" ? , ? , 'S' ");
			buff.append(" ) ");
			break;
		case R_SQL:
			buff.append("INSERT INTO ");
			buff.append(" jjokji( ");
			buff.append("	tno , jname , jarea , jcode ) ");
			buff.append("VALUES ");
			buff.append(" ( ");
			buff.append(" 	(SELECT NVL(MAX(tno)+1, 1) FROM jjokji), ");
			buff.append(" ? , ? , 'R' ");
			buff.append(" ) ");
			break;
		}

		
		
		return buff.toString();
	}
}
