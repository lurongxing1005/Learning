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
		frame.setTitle("������ϰ");
		frame.setBounds(100, 100, 500, 500);
		
//		���ò���
		frame.setLayout(new FlowLayout());
		
		//����Ա����ť
		JButton button = new JButton("���Ұ�ť");
		button.setBounds(0, 0, 100, 20);
		//�����¼�
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//������¼�
				//System.out.println("����,����?");
				JOptionPane.showMessageDialog(null, "����,����?");
				
			}
		});
		frame.add(button);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}