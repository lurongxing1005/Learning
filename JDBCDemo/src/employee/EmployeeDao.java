package employee;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import Utils.JDBCUtils;



/**
 * 鎿嶄綔鍛樺伐鐨勭被
 * @author Administrator
 *
 */
public class EmployeeDao {
	private JDBCUtils util = new JDBCUtils();
	public EmployeeDao(){
		util.getConnection();
	}
	//1.添加
	public void addEmployee(Employee employee) throws Exception{
		if(employee == null){
			System.out.println("employee涓嶈兘涓虹┖");
			return;
		}
		if(queryEmployee(employee.getEno())!=null){
			System.out.println("员工存在，不能添加");
		}else{
			String sql = "INSERT t_employee (ejob,ename,esex,eSalary) VALUES (?,？，？，？)";
			ArrayList<Object> params = new ArrayList<Object>();
			params.add(employee.getEjob());
			params.add(employee.getEname());
			params.add(employee.getEsex());
			params.add(employee.geteSalary());
			boolean isOk = util.updateByPreparedStatement(sql, params);
			if(isOk){
				System.out.println("添加成功");
			}else{
				System.out.println("添加失败");
			}
		}
		
	}
	
//	//2.删除
	public boolean deleteEmployee(int eno) throws Exception{
		if(queryEmployee(eno)==null){
			System.out.println("员工不存在");
			return false;
		}else{
			String sql = "DELETE FROM t_employee WHERE eno = ?";
			ArrayList<Object> params = new ArrayList<Object>();
			params.add(eno);
			
			boolean isOk = util.updateByPreparedStatement(sql, params);
			return isOk;
		}
		
}
//	
//	//3.修改
	public void updateEmployee(Employee employee) throws Exception {
		if (queryEmployee(employee.getEno()) == null) {
			System.out.println("员工存在，不能添加");
		} else {
			String sql = "UPDATE t_employee SET ejob=?,ename=?,esex=?,eSalary=? WHERE eno = ?";
			ArrayList<Object> params = new ArrayList<Object>();
			params.add(employee.getEjob());
			params.add(employee.getEname());
			params.add(employee.getEsex());
			params.add(employee.geteSalary());
			params.add(employee.getEno());
			boolean isOk = util.updateByPreparedStatement(sql, params);
			if (isOk) {
				System.out.println("修改成功");
			} else {
				System.out.println("修改失败");
			}
		}

	}
	
	
	//4.查询单个
	public Employee queryEmployee(int eno) throws Exception{
		String sql = "SELECT * FROM t_employee WHERE eno = ?";
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(eno);
		Employee employee = util.findSimpleRefResult(sql, params, Employee.class);
		util.releaseConn();
		
		return employee;
	}

}
