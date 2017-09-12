package com.etc._ObjectAppleDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
	
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("H:/Coding/task.txt"));
			ArrayList list = (ArrayList)ois.readObject();
			Iterator it = list.iterator();
			while(it.hasNext()){
				Apple a = (Apple)it.next();
				System.out.println(a);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}}
