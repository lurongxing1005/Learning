package com.etc._UserDao;

import java.util.ArrayList;
import java.util.List;

import com.etc._GuiText.JDBCUtils;

import entity.User;

public class UserDao {
	private JDBCUtils jdbc = new JDBCUtils();
	public UserDao(){
		jdbc.getConnection();
	}
	
	//插入数据
	public boolean addUser(User user) throws Exception{
		
		String sql = "INSERT INTO t_user01 (id,username,password,sex,birthday,hobby)" +
				" VALUES(null,?,?,?,?,?)";
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(user.getUsername());
		params.add(user.getPassword());
		params.add(user.getSex());
		params.add(user.getBirthday());
		params.add(user.getHobby());
		boolean flag = jdbc.updateByPreparedStatement(sql, params);
		jdbc.releaseConn();
		return flag;
	}
	//查询多条
	public User showUser(String userName,String passWord) throws Exception{
		String sql = "SELECT * FROM t_user01 WHERE userName = ? AND passWord=?";
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(userName);
		params.add(passWord);
		User user = jdbc.findSimpleRefResult(sql, params, User.class);
		System.out.println(user);
		jdbc.releaseConn();
		return user;
	}
}
