package UDPDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class clientUDP {
	public static void main(String[] args) {
		// 1.ȷ��Ҫ����ʲô, "�°�,Լ��?"
		try {
			String str = "�°�,Լ��";
			byte[] buf = str.getBytes();
			InetAddress ia = InetAddress.getByName("localhost");
			DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, 6666);

			// 2�����׽���
			DatagramSocket ds = new DatagramSocket();

			ds.send(dp);
			// 1.�����׽���
			DatagramSocket dst = new DatagramSocket();

			// 2.�������ݰ�
			byte[] by = new byte[1024];
			DatagramPacket dpt = new DatagramPacket(by, by.length);

			// 3.�������ݰ�
			dst.receive(dpt);

			// 4.�������ݰ�
			String mess = new String(by, 0, dpt.getLength());
			System.out.println("�����˵:" + mess);

			dst.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
