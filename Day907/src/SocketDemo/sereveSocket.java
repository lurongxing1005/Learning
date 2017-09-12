package SocketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class sereveSocket {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		System.out.println("服务端准备好了。。。。。");
		ServerSocket server = new ServerSocket(1024);
		int count = 0;
		while (true) {
			Socket client = server.accept();
			serverThread thread = new serverThread(client);
			thread.start();
			count++;
			System.out.println("访问数量：" + count);
			InetAddress inetAddress = client.getInetAddress();
			System.out.println(inetAddress.getHostAddress());
			System.out.println(inetAddress.getHostName());
		}

	}
}
