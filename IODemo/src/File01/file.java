package File01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file {
	public static void main(String[] args) {
		File file = new File("E:/��������/��Ƶ/9.01/test.txt");
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("������ô������ȥ����");
			fw.flush();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ok");
		
		
//		try {
//			FileReader fr = new FileReader(file);
//			FileInputStream fis = new FileInputStream(file);
//			
//			char[] cbuf = new char[fis.available()];
//			fr.read(cbuf);
//			//String str = new String(cbuf);
//			System.out.println(cbuf);
//			
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
	}
}
