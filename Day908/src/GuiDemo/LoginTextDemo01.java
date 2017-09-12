package GuiDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginTextDemo01 {

	private JFrame frame;
	private JTextField userNameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTextDemo01 window = new LoginTextDemo01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginTextDemo01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);               //窗口不能拉伸
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		frame.setLocationRelativeTo(null);             //居中
		
		
		JLabel userNamelabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		userNamelabel.setBounds(35, 54, 54, 15);
		frame.getContentPane().add(userNamelabel);
		
		JLabel passwordlabel = new JLabel("\u5BC6\u7801\uFF1A");
		passwordlabel.setBounds(35, 95, 54, 15);
		frame.getContentPane().add(passwordlabel);
		
		userNameField = new JTextField();
		userNameField.setBounds(99, 51, 173, 21);
		frame.getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(99, 92, 173, 21);
		frame.getContentPane().add(passwordField);
		
		JButton LoginButton = new JButton("\u767B\u5165");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = userNameField.getText();
				char[] pw = passwordField.getPassword();
				String passWord = String.valueOf(pw);
				System.out.println(userName+"----"+passWord);
				
				if(StringUtil.hasLength(userName) &&StringUtil.hasLength(passWord)){
					JDBCUtils jdbcUtil = new JDBCUtils();
					Connection connection = jdbcUtil.getConnection();
					String sql = "SELECT userName,passWord FROM t_user01";
					
					try {
						PreparedStatement prepareStatement = connection.prepareStatement(sql);
						ResultSet resultSet = prepareStatement.executeQuery();
						while(resultSet.next()){
						String userstring = resultSet.getString("userName");
						String passstring = resultSet.getString("passWord");
						System.out.println(userstring+passstring);
						}
						
						prepareStatement.close();
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					if((userName.equals("admin") && passWord.equals("123456"))){
						JOptionPane.showMessageDialog(null, "登入成功");
						
						MainFrame window = new MainFrame(userName);
						window.frame.setVisible(true);
						
						frame.setVisible(false);
					}else{
						JOptionPane.showMessageDialog(null, "输入用户名或密码有误");
					}
				}else{
					JOptionPane.showMessageDialog(null, "输入不能为空");
				}
			}
		});
		LoginButton.setBounds(99, 152, 100, 45);
		frame.getContentPane().add(LoginButton);
		
		JButton registerButton = new JButton("\u6CE8\u518C");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register window = new register();
				window.frame.setVisible(true);
			}
		});
		registerButton.setBounds(220, 152, 100, 45);
		frame.getContentPane().add(registerButton);
	}
}
