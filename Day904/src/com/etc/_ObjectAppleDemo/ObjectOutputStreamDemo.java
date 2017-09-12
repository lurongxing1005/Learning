package com.etc._ObjectAppleDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("H:/Coding/task.txt",true));
			Apple a1 = new Apple(1.1, "红色", 6.6);
			Apple a2 = new Apple(2.2, "绿色", 7.7);
			Apple a3 = new Apple(3.3, "黄色", 8.8);
			
			oos.writeObject(a1);
			oos.writeObject(a2);
			oos.writeObject(a3);
			oos.flush();
			oos.close();
			System.out.println("序列化完成。。。。。");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
