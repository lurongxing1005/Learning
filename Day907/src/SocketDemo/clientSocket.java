package SocketDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientSocket {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		// 1. 建立客户端Socket，指定服务器位置和端口
		Socket socket = new Socket("127.0.0.1", 1024); // 127.0.0.1 localhost
		// 2. 获得输出流 ------- 给服务端 发信息 用户名:root,密码:123456
		OutputStream outputStream = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(outputStream);
		// 3. 添加发送的信息
		System.out.println("我是客户端,准备发信息");
		User user = new User("root", "123");
		oos.writeObject(user);

		socket.shutdownOutput();// 禁用输出流

		// -------客户端接收服务端发过来的信息
		InputStream inputStream = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(
				inputStream));
		String mess = null;
		while ((mess = br.readLine()) != null) {
			System.out.println("我是客户端,服务器的信息是:" + mess);
		}

		// 4. 使用close()关闭流和Socket http JavaWeb javaEE
		oos.close();
		outputStream.close();
		br.close();
		inputStream.close();
		socket.close();

	}

}
