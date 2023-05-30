package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Login;


public class LoginDAO extends DAO{
	public Login search(String id, String pass)
		throws Exception{
		Login login=null;
		
		Connection con=getConnection();
		
		PreparedStatement st;
		st=con.prepareStatement(
				"select * from login where id=? and pass=?");
		st.setString(1, id);
		st.setString(2, pass);
		ResultSet rs=st.executeQuery();
		
		while(rs.next()) {
			login=new Login();
			login.setId(rs.getString("id"));
			login.setName(rs.getString("name"));
			login.setPass(rs.getString("pass"));
		}
		st.close();
		con.close();
		return login;
		
		
	}

}





