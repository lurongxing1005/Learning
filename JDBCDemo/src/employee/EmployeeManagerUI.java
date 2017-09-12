package employee;

import java.util.Scanner;





public class EmployeeManagerUI {
	private EmployeeDao  dao = new EmployeeDao();
	
	/**
	 * 1.娣诲姞鐣岄潰
	 * @throws Exception 
	 */
    private void addMenu() throws Exception {
		while (true) {
			System.out.println("璇疯緭鍏no,ejob,ename,esex,esalary");
			Scanner sc = new Scanner(System.in);
			int eno = sc.nextInt();
			String ejob = sc.next();
			String ename = sc.next();
			String esex = sc.next();
			double esalary = sc.nextDouble();
			//		鍒涘缓瀵硅薄  鏋勯�鏂规硶
			Employee e = new Employee(eno, ejob, ename, esex.charAt(0), esalary);
			//璋冪敤dao娣诲姞瀵硅薄
			dao.addEmployee(e);
			
			System.out.println("鏄惁缁х画杈撳叆:y缁х画/闈瀥閫�嚭杈撳叆鐣岄潰");
			sc = new Scanner(System.in);
			String input = sc.next();
			if(!input.equalsIgnoreCase("y")){
				break;
			}
		}		
	}
    
    /**
     * 2.鏄剧ず鐣岄潰
     */
    private void showMenu(){
    	dao.showAllEmployee();
    }
    
    /**
     * 3.鍒犻櫎鐣岄潰
     */
    
    
    /**
     * 4.淇敼鐣岄潰
     */
    
    
    /**
     * 涓荤晫闈�
     * @throws Exception 
     */
    public void mainMenu() throws Exception{
    	while (true) {
			System.out.println("璇疯緭鍏ヤ綘鐨勯�鎷�1.娣诲姞鍛樺伐 2.鍒犻櫎鍛樺伐 "
					+ " 3.淇敼鍛樺伐 4.鏄剧ず鎵�湁鐨勫憳宸�.閫�嚭");
			Scanner input = new Scanner(System.in);
			int ret = input.nextInt();
			switch (ret) {
			case 1:
				addMenu();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				showMenu();
				break;
			case 5:
				System.out.println("绋嬪簭閫�嚭");
				System.exit(0);
				break;

			default:
				break;
			}
		}
    }

}
