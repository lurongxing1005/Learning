package GuiDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JframeDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("课堂练习");
		frame.setBounds(100, 100, 500, 500);
		
//		设置布局
		frame.setLayout(new FlowLayout());
		
		//添加员工按钮
		JButton button = new JButton("点我按钮");
		button.setBounds(0, 0, 100, 20);
		//添加事件
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//点击的事件
				//System.out.println("点我,干嘛?");
				JOptionPane.showMessageDialog(null, "点我,干嘛?");
				
			}
		});
		frame.add(button);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
