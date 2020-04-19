package MyProj.DAO;


/**
 * �� Ŭ������ ȸ���� ���õ� �����ͺ��̽� ó�� �۾��� �ϱ����� Ŭ�����̴�.
 * @author ������
 * @since 2020.04.03
 * @version v.1.0
 */
import DB.*;
import java.sql.*;
import java.util.*;
import MyProj.VO.*;
import MyProj.sql.*;

public class MemberDAO {
	//�� Ŭ������ �����ͺ��̽� ó������ ���� Ŭ���� �̹Ƿ� �⺻������ 
	// �����ͺ��̽� ����̹��ε��� ���� �۾��� ��ü�� �Ǵ� ���� �̷�����°��� ���ϴ�
	ORCLJDBC db ;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MemberSQL mSQL;
	public MemberDAO() {
		// �����ͺ��̽� ����̹� �ε� 
		db = new ORCLJDBC();
		con = db.getCon();
		//MemberSQL �ʱ�ȭ
		mSQL = new MemberSQL();
	}

	// ȸ������ �����ͺ��̽� ó�� ���� �Լ�
	public int addMember(MemberVo vo) {
		int cnt =0; //��ȯ�� ���� �����  
		// �� �۾��� VO�� ��� ������ ������ ���Ǹ�ɿ� ä���� ������ �ȴ�.
		// ���� PreparedStatement�� �ʿ��ϴ�

		// ���� �ʿ��� ���� ��� ��������
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		
		// PreparedStatement ��������
		pstmt = db.getPSTNT(sql);
		
		//���� ���� ��ɿ� �ʿ��� ������ ä���
		try {
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPwd());
			pstmt.setString(4, vo.getMail());
			pstmt.setString(5, vo.getGen());
			pstmt.setString(6, vo.getTel());
			pstmt.setInt(7, vo.getAno());
			
			//w���� ��� �ϼ� ������ ��� ��ȯ ����
			cnt = pstmt.executeUpdate();		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		
		return cnt;
	}
}
