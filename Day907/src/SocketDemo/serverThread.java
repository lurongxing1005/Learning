package SocketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class serverThread extends Thread {
	private Socket client;

	public serverThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		try {
			InputStream inputStream = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(inputStream);

			Object object = ois.readObject();
			System.out.println(object);

			OutputStream outputStream = client.getOutputStream();
			PrintWriter pw = new PrintWriter(outputStream);
			String str = "µÇÂ¼³É¹¦";
			pw.write(str);
			pw.flush();

			ois.close();
			inputStream.close();
			pw.close();
			outputStream.close();
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
