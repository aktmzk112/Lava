package day20;

/*
 * 	회원번호를 입력하면
 * 	데이터베이스의 회원 정보를 조회해주는 프로그램 작성 해보자 
 * 
 */
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class Test02 {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public Test02() {
		dbInit();

		// 회원번호를 입력받는다.
		int no = -1;
		while (true) {
			String sno = JOptionPane.showInputDialog("회원번호 입력");
			try {
				no = Integer.parseInt(sno);
				break;
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			
		}
		//질의명령 생성
		String sql = "SELECT * FROM member WHERE mno="+no;
		String psql = "SELECT * FROM member WHERE mno= ?";
		

		try {
			/*
			// Statement를 얻어오고
			stmt = con.createStatement();
			//질의명령 실어서 보내고 
			rs = stmt.executeQuery(sql);
			*/
			
			//? 를 채워줘야하는 질의 명령을 사용할 때 사용하는 Statement 는 PreparedStatement 이다 
			pstmt = con.prepareStatement(psql);
			//prepareStatement 는 질의명령을 가지고 만들어야 하고 
			//만들어진 후에는 질의 명령을 완성해야 정상적으로 작동한다.
			
			//질의명령을 완성하자
			pstmt.setInt(1, no);
			
			//질의 명령 보내고 결과 받고
			rs = pstmt.executeQuery();
			//작업줄 한줄 내리고
			rs.next();
			
			//필요한 데이터 뽑아오고 
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("mail");
			String gen = rs.getString("gen");
			String tel = rs.getString("tel");
			int ano = rs.getInt("ano");
			char issh =  rs.getString("isshow").charAt(0);
			
			//출력
			JOptionPane.showMessageDialog(null, name + " 선생님 정보\n회원번호 : "+mno+
						"\n아이디 : " +mid + "\n비밀반호 : " +mpw + "\n메일주소 : " + mail +"\n성별 : " + gen + "\n아바타번호 : " +
						ano + "\n활동여부 : " + ((issh == 'Y') ? "활동중" : "탈퇴회원")
					);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	// 데이터베이스 드라이버 로딩하고 커넥션 얻어주는 함수
	public void dbInit() {
		try {
			// 드라이버 로딩하고
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻고
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, user, pw);
//			System.out.println("커넥션 얻어오기 성공~~~");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				stmt.close();
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
