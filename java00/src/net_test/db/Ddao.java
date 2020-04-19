package net_test.db;

import java.sql.*;

import DB.*;
import net_test.db.*;

public class Ddao {
	ORCLJDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet set;
	Dsql dsql;

	public Ddao() {
		db = new ORCLJDBC();
		con = db.getCon();
		dsql = new Dsql();
	}

	public void sSql(Dvo dvo) {
		int cnt=0;
		pstmt = db.getPSTNT(dsql.getSQL(dsql.S_SQL));
		try {
			pstmt.setString(1, dvo.getName());
			pstmt.setString(2, dvo.getArea());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void rSql(Dvo dvo) {
		String pssql = dsql.getSQL(dsql.R_SQL);
		pstmt = db.getPSTNT(pssql);

		try {
			pstmt.setString(1, dvo.getName());
			pstmt.setString(2, dvo.getArea());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
