package employee;




public class Test {
	public static void main(String[] args) {
		//main 浠ｇ爜瓒婂皯瓒婂ソ
		Employee e1 = new Employee(1, "Boss", "jack", '鐢�, 10);
		Employee e2 = new Employee(2, "绉樹功", "tom", '鐢�, 100000000d);
		
		
		EmployeeDao dao = new EmployeeDao();
		//娣诲姞
		dao.addEmployee(e1);
		dao.addEmployee(e2);
		
		dao.showAllEmployee();
		
		System.out.println("----------------");
		//淇敼
		Employee e3 = new Employee(2, "绉樹功", "rose", '濂�, 10000d);
		dao.updateEmployee(e3);
		
		dao.showAllEmployee();
		
	}

}
