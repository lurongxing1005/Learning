package UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class serverUDP {
	public static void main(String[] args) {

		try {
			System.out.println("������׼������");
			// 1.�����׽���
			DatagramSocket ds = new DatagramSocket(6666);

			// 2.�������ݰ�
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);

			// 3.�������ݰ�
			ds.receive(dp);

			// 4.�������ݰ�
			String mess = new String(buf, 0, dp.getLength());
			System.out.println("�ͻ���˵:" + mess);
			
			
			String str = "��Լ��";
			byte[] by = str.getBytes();
			InetAddress ia = InetAddress.getByName("localhost");
			 DatagramSocket dst = new DatagramSocket();
			 DatagramPacket dpt = new DatagramPacket(by, by.length, ia, 6666);

			// 2�����׽���
			dst.send(dpt);

			// 5.�ر���Դ
			dst.close();
			

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
