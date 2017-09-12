package UDPDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class clientUDP {
	public static void main(String[] args) {
		// 1.确定要发送什么, "下班,约吗?"
		try {
			String str = "下班,约吗";
			byte[] buf = str.getBytes();
			InetAddress ia = InetAddress.getByName("localhost");
			DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, 6666);

			// 2创建套接字
			DatagramSocket ds = new DatagramSocket();

			ds.send(dp);
			// 1.创建套接字
			DatagramSocket dst = new DatagramSocket();

			// 2.创建数据包
			byte[] by = new byte[1024];
			DatagramPacket dpt = new DatagramPacket(by, by.length);

			// 3.接收数据包
			dst.receive(dpt);

			// 4.解析数据包
			String mess = new String(by, 0, dpt.getLength());
			System.out.println("服务端说:" + mess);

			dst.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
