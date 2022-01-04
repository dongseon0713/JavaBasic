package dao;
//프로젝트명 : project1
//패키지 : dao
//자바파일명 : VisitDAO

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class VisitDAO {
	public boolean insert(String uid, String ume) throws NamingException, SQLException {

		Connection conn = null; // DB연결
		PreparedStatement stmt = null; // SQL구문

		conn = ConnectionPool.get();	// DB정보를 불러옴

		String sql = "INSERT INTO tbvisit(id,memo) VALUES(?,?)";
		//INSERT INTO memo(id,memo) VALUES(?,?) 라는 문자열을 String 객체 sql에 저장
		stmt = conn.prepareStatement(sql);
		stmt.setNString(1, uid);	// DB에 uid 저장
		stmt.setNString(2, ume);	// DB에 ume 저장

		int result = stmt.executeUpdate();	//명령어를 처리하고 결과값을 가져와서 int형 변수 result에 저장

		return result == 1;	// 결과를 성공했을때는 숫자 1 실패하면 숫자0
	}
}
