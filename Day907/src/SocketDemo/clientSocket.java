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
		// 1. �����ͻ���Socket��ָ��������λ�úͶ˿�
		Socket socket = new Socket("127.0.0.1", 1024); // 127.0.0.1 localhost
		// 2. �������� ------- ������� ����Ϣ �û���:root,����:123456
		OutputStream outputStream = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(outputStream);
		// 3. ��ӷ��͵���Ϣ
		System.out.println("���ǿͻ���,׼������Ϣ");
		User user = new User("root", "123");
		oos.writeObject(user);

		socket.shutdownOutput();// ���������

		// -------�ͻ��˽��շ���˷���������Ϣ
		InputStream inputStream = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(
				inputStream));
		String mess = null;
		while ((mess = br.readLine()) != null) {
			System.out.println("���ǿͻ���,����������Ϣ��:" + mess);
		}

		// 4. ʹ��close()�ر�����Socket http JavaWeb javaEE
		oos.close();
		outputStream.close();
		br.close();
		inputStream.close();
		socket.close();

	}

}
