package GuiDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutDemo {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setTitle("LayOut");
	frame.setBounds(100, 100, 300, 300);
	
	frame.setLayout(new BorderLayout());
	JPanel southPanel = new JPanel();
	southPanel.setBackground(Color.BLUE);                //设置颜色
	southPanel.setPreferredSize(new Dimension(60, 60));        //设置大小
	frame.add(southPanel, BorderLayout.SOUTH);
	JPanel weatPanel = new JPanel();
	weatPanel.setBackground(Color.CYAN); 
	frame.add(weatPanel, BorderLayout.WEST);
	JPanel centerPanel = new JPanel();
	centerPanel.setBackground(Color.GRAY); 
	frame.add(centerPanel, BorderLayout.CENTER);
	
	centerPanel.setLayout(new BorderLayout());
	JPanel northPanel2 = new JPanel();
	northPanel2.setBackground(Color.GREEN);
	frame.add(northPanel2, BorderLayout.NORTH);
	JPanel centerPanel2 = new JPanel();
	centerPanel2.setBackground(Color.ORANGE);
	frame.add(centerPanel2, BorderLayout.CENTER);
	
	centerPanel2.setLayout(new GridLayout(3, 2, 20, 40));
	for (int i = 0; i < 6; i++) {
		centerPanel2.add(new JButton("我是按钮"+i));
	}
	
	
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
