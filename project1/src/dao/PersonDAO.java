package dao;
//프로젝트명 : project1
//패키지 : dao
//자바파일명 : PersonDAO

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class PersonDAO {
	public int login(String uid, String ups) throws NamingException,SQLException{
		
		Connection conn = null;		//DB연결
		PreparedStatement stmt = null;//SQL구문
		ResultSet rs = null;		//SQL결과값
		
		conn = ConnectionPool.get();	// DB정보를 불러옴
		
		String sql = "SELECT id,ps FROM tbperson WHERE id = ? "; 
		// SELECT id,ps FROM tbperson WHERE id = ? 라는 문자열을 String 객체 sql에 저장
		stmt = conn.prepareStatement(sql);	
		// DB에 sql 구문을 입력
		stmt.setNString(1, uid);
		// DB에 uid 저장
		rs = stmt.executeQuery();	//명령어를 처리하고 결과값을 가져옴
		
		if(!rs.next()) return 1; //아이디가 존재하지 않는 경우 1을 리턴
		if(!ups.contentEquals(rs.getString("ps"))) return 2;//비밀번호가 불일치 할 경우 2를 리턴
		return 0;//아이디와 비밀번호가 둘다 맞을경우 0을 리턴
	}
	
	public boolean exist(String uid) throws NamingException,SQLException{
		Connection conn = null;         // DB연결
		PreparedStatement stmt = null;  // SQL구문
		ResultSet rs = null;            // SQL결과
		
		conn = ConnectionPool.get();	// DB정보를 불러옴
		
		String sql = "SELECT id FROM tbperson WHERE id = ?";
		//SELECT id FROM user WHERE id = ? 라는 문자열을 String 객체 sql에 저장
		
		stmt = conn.prepareStatement(sql);
		// DB에 sql 구문을 입력
		stmt.setNString(1, uid); 	// DB에 uid 저장
		
		rs = stmt.executeQuery();	////명령어를 처리하고 결과값을 가져와서 rs에 저장
		
		return rs.next();	//	rs를 리턴
	}
	
	public boolean insert(String uid, String ups, String una, String uem) throws
	NamingException,SQLException{
		
		Connection conn = null;		//DB연결
		PreparedStatement stmt = null;//SQL구문
		
		conn = ConnectionPool.get();	// DB정보를 불러옴
		
		String sql = "INSERT INTO tbperson(id,ps,name,email) VALUES(?,?,?,?)";
		//"INSERT INTO user(id,ps,name,email) VALUES(?,?,?,?)" 라는 문자열을 String 객체 sql에 저장
		stmt = conn.prepareStatement(sql);
		// DB에 sql 구문을 입력
		stmt.setNString(1, uid); 	// DB에 uid 저장
		stmt.setNString(2, ups);	// DB에 ups 저장
		stmt.setNString(3, una);	// DB에 una 저장
		stmt.setNString(4, uem);	// DB에 uem 저장
		
		int result = stmt.executeUpdate(); //명령어를 처리하고 결과값을 가져와서 int형 변수 result에 저장
		
		return result == 1; // 결과를 성공했을때는 숫자 1 실패하면 숫자0
	}
	
	public boolean delete(String uid)
			throws NamingException, SQLException {
	Connection conn = null;         // DB연결
	PreparedStatement stmt = null;  // SQL구문
	
	conn = ConnectionPool.get();	// DB정보를 불러옴
	
	String sql = "DELETE FROM tbperson WHERE id = ?";
	//DELETE FROM tbperson WHERE id = ? 라는 문자열을 String 객체 sql에 저장
	stmt = conn.prepareStatement(sql);	// DB에 sql 구문을 입력
		stmt.setNString(1, uid);	// DB에 uid 저장
		
	int result = stmt.executeUpdate();	//명령어를 처리하고 결과값을 가져와서 int형 변수 result에 저장
	
	return result == 1;	// 결과를 성공했을때는 숫자 1 실패하면 숫자0
}
}

