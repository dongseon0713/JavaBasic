package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;


public class UserDAO {
	
	public int insert(String uid, String upass, String uname) throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = ConnectionPool.get();
			String sql = "INSERT INTO user(id,ps,name) VALUES(?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, upass);
			stmt.setString(3, uname);
			
			int count = stmt.executeUpdate();
			return(count);
		}finally {
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
	}
	public int delete(String uid) throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = ConnectionPool.get();
			String sql = "DELETE FROM user WHERE id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setNString(1, uid);
			
			int count = stmt.executeUpdate();
			return(count);
		}finally {
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
	}
	public int login(String uid, String upass) throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		
			conn = ConnectionPool.get();
			String sql = "SELECT * FROM user WHERE id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setNString(1, uid);
			
			rs = stmt.executeQuery();
			if(!rs.next()) {
				return 1;
			}
			if( !upass.equals(rs.getString("ps"))) {
				return 2;
			}
				return 0;
		}
	}

