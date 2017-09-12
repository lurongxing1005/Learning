package GuiDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class register {

	public JFrame frame;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JTextField otherHobbyField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
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
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel userNameLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		userNameLabel.setBounds(41, 10, 54, 15);
		frame.getContentPane().add(userNameLabel);
		
		JLabel passWordLabel = new JLabel("\u5BC6\u7801\uFF1A");
		passWordLabel.setBounds(41, 42, 54, 15);
		frame.getContentPane().add(passWordLabel);
		
		JLabel passwordlabel_1 = new JLabel("\u8BF7\u518D\u8F93\u4E00\u6B21\u5BC6\u7801\uFF1A");
		passwordlabel_1.setBounds(41, 70, 96, 15);
		frame.getContentPane().add(passwordlabel_1);
		
		JLabel sexlabel = new JLabel("\u6027\u522B\uFF1A");
		sexlabel.setBounds(41, 99, 54, 15);
		frame.getContentPane().add(sexlabel);
		
		JLabel birthDaylabel = new JLabel("\u751F\u65E5\uFF1A");
		birthDaylabel.setBounds(41, 134, 54, 15);
		frame.getContentPane().add(birthDaylabel);
		
		JLabel hobbylabel = new JLabel("\u7231\u597D\uFF1A");
		hobbylabel.setBounds(41, 159, 54, 15);
		frame.getContentPane().add(hobbylabel);
		
		userNameField = new JTextField();
		userNameField.setBounds(139, 7, 201, 21);
		frame.getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 39, 201, 21);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(139, 68, 201, 21);
		frame.getContentPane().add(passwordField_1);
		
		JRadioButton manradioButton = new JRadioButton("\u7537");
		manradioButton.setBounds(133, 95, 64, 23);
		frame.getContentPane().add(manradioButton);
		
		
		JRadioButton womenradioButton = new JRadioButton("\u5973");
		womenradioButton.setBounds(199, 95, 64, 23);
		frame.getContentPane().add(womenradioButton);
		
		final JComboBox yearcomboBox = new JComboBox();
		yearcomboBox.setBounds(98, 131, 78, 21);
		frame.getContentPane().add(yearcomboBox);
		yearcomboBox.addItem(1993);
		yearcomboBox.addItem(1994);
		yearcomboBox.addItem(1995);
		yearcomboBox.addItem(1996);
		yearcomboBox.addItem(1997);
		
		
		final JComboBox monthcomboBox = new JComboBox();
		monthcomboBox.setBounds(199, 131, 78, 21);
		frame.getContentPane().add(monthcomboBox);
		monthcomboBox.addItem(01);
		monthcomboBox.addItem(02);
		monthcomboBox.addItem(03);
		monthcomboBox.addItem(04);
		monthcomboBox.addItem(05);
		monthcomboBox.addItem(06);
		monthcomboBox.addItem(07);
		monthcomboBox.addItem(8);
		monthcomboBox.addItem(9);
		monthcomboBox.addItem(10);
		monthcomboBox.addItem(11);
		monthcomboBox.addItem(12);
		
		
		
		final JComboBox daycomboBox = new JComboBox();
		daycomboBox.setBounds(303, 131, 72, 21);
		frame.getContentPane().add(daycomboBox);
		daycomboBox.addItem(1);
		daycomboBox.addItem(2);
		daycomboBox.addItem(3);
		daycomboBox.addItem(4);
		daycomboBox.addItem(5);
		daycomboBox.addItem(6);
		daycomboBox.addItem(7);
		daycomboBox.addItem(8);
		daycomboBox.addItem(9);
		daycomboBox.addItem(10);
		daycomboBox.addItem(11);
		daycomboBox.addItem(12);
		
		
		
		
		JCheckBox ballcheckBox = new JCheckBox("打球");
		ballcheckBox.setBounds(93, 155, 54, 23);
		frame.getContentPane().add(ballcheckBox);
		
		
		JCheckBox singcheckBox = new JCheckBox("唱歌");
		singcheckBox.setBounds(186, 155, 103, 23);
		frame.getContentPane().add(singcheckBox);
		
		JCheckBox runcheckBox = new JCheckBox("跑步");
		runcheckBox.setBounds(93, 180, 72, 23);
		frame.getContentPane().add(runcheckBox);
		
		JCheckBox dancecheckBox = new JCheckBox("跳舞");
		dancecheckBox.setBounds(186, 180, 49, 23);
		frame.getContentPane().add(dancecheckBox);
		
		JLabel otherHobbylabel = new JLabel("其他");
		otherHobbylabel.setBounds(252, 184, 54, 15);
		frame.getContentPane().add(otherHobbylabel);
		
		otherHobbyField = new JTextField();
		otherHobbyField.setBounds(288, 184, 66, 21);
		frame.getContentPane().add(otherHobbyField);
		otherHobbyField.setColumns(10);
		
		JButton registerbutton = new JButton("\u6CE8\u518C");
		registerbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = userNameField.getText();
				char[] pw = passwordField.getPassword();
				String passWord = String.valueOf(pw);
				char[] pw1 = passwordField_1.getPassword();
				String passWord1 = String.valueOf(pw1);
//				String ballcheckBox = ballcheckBox.getText();
//				String singcheckBox = singcheckBox.getText();
//				String runcheckBox = runcheckBox.getText();
//				String dancecheckBox = dancecheckBox.getText();
//				String otherHobbyField = otherHobbyField.getText();
				String year = yearcomboBox.getSelectedItem().toString();
				String month = monthcomboBox.getSelectedItem().toString();
				String day = daycomboBox.getSelectedItem().toString();
				
				
				
				
				
				if(passWord.equals(passWord1)){
					JDBCUtils jdbcUtils = new JDBCUtils();
					Connection connection = jdbcUtils.getConnection();
					String sql = "INSERT t_user01(userName,passWord,sex,birthDay,hobby) VALUES (?,?,?,?,?)";
					try {
						PreparedStatement prepareStatement = connection.prepareStatement(sql);
						prepareStatement.setObject(1, userName);
						prepareStatement.setObject(2, passWord);
						prepareStatement.setObject(3, "男");
						prepareStatement.setObject(4, year+month+day);
						prepareStatement.setObject(5, null);
						
						int executeUpdate = prepareStatement.executeUpdate();
						JOptionPane.showMessageDialog(null, "注册成功");
						prepareStatement.close();
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}else{
					JOptionPane.showMessageDialog(null, "两次密码不一致");
				}
			}
		});
		
		
		registerbutton.setBounds(157, 227, 106, 35);
		frame.getContentPane().add(registerbutton);
	}
}
