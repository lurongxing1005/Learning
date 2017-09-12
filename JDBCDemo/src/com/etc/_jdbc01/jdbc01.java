package com.etc._jdbc01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.JDBCUtils;
import Utils.Student;

public class jdbc01 {
	public static void main(String[] args) throws Exception {
		JDBCUtils util = new JDBCUtils();
		util.getConnection();
//		String sql = "INSERT t_student(name,sex) VALUES (?,?)";
//		ArrayList<Object> params = new ArrayList<Object>();
//		params.add("rose");
//		params.add("nv");
//
//		boolean isOk = util.updateByPreparedStatement(sql, params);
//		if (isOk) {
//			System.out.println("插入成功");
//		} else {
//			System.out.println("插入失败");
//		}
		
		
		
//		String sql = "SELECT * FROM t_student WHERE id = ?";
//		ArrayList<Object> params = new ArrayList<Object>();
//		params.add(2);
//		Student student = util.findSimpleRefResult(sql, params, Student.class);
//		System.out.println(student);
		
		
		
		String sql = "SELECT * FROM t_student";
		
		List<Student> list = util.findMoreRefResult(sql, null, Student.class);
		System.out.println(list);

	}
}
