package GuiDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectInterface {

	private JFrame frame;
	private JTextField userNametextField;
	private JTextField sextextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectInterface window = new SelectInterface();
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
	public SelectInterface() {
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
		
		frame.setLocationRelativeTo(null);
		
		JLabel userNamelabel = new JLabel("\u6309\u7528\u6237\u540D\u67E5\u8BE2\uFF1A");
		userNamelabel.setBounds(32, 40, 102, 15);
		frame.getContentPane().add(userNamelabel);
		
		userNametextField = new JTextField();
		userNametextField.setBounds(144, 40, 91, 21);
		frame.getContentPane().add(userNametextField);
		userNametextField.setColumns(10);
		
		JLabel sexlabel = new JLabel("\u6309\u6027\u522B\u67E5\u8BE2\uFF1A");
		sexlabel.setBounds(32, 92, 102, 15);
		frame.getContentPane().add(sexlabel);
		
		sextextField = new JTextField();
		sextextField.setBounds(144, 89, 91, 21);
		frame.getContentPane().add(sextextField);
		sextextField.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userNametext = userNametextField.getText();
				String sextext = sextextField.getText();
				System.out.println(userNametext+","+sextext);
				JDBCUtils jdbcUtil = new JDBCUtils();
				Connection connection = jdbcUtil.getConnection();
				String sql = "SELECT * FROM t_user01 WHERE userName LIKE 'userNametext' OR sex='sextext'";
				try {
					PreparedStatement prepareStatement = connection.prepareStatement(sql);
					ResultSet resultSet = prepareStatement.executeQuery();
					while(resultSet.next()){
						String usermess = resultSet.getString("userName");
						String sexmess = resultSet.getString("sex");
						int birthDaymess = resultSet.getInt("birthDay");
						String hobbymess = resultSet.getString("hobby");
						System.out.println(usermess+","+sexmess+","+birthDaymess+","+hobbymess);
					}
					prepareStatement.close();
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(63, 163, 115, 49);
		frame.getContentPane().add(button);
	}
}
