package File01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileWork02 {
	public static void showFile(File file1,File file2) throws Exception{
		if (file1.isFile()) {
			String str = file1.getAbsolutePath()+","+
		file1.getName()+",��С:"+file1.length()+",����޸�ʱ��:"+
					new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss").format(new Date(file1.lastModified()));
			FileWriter fw = new FileWriter(file2);
			fw.write(str);
			fw.flush();
			fw.close();
			System.out.println(file1.getAbsolutePath()+","+
		file1.getName()+",��С:"+file1.length()+",����޸�ʱ��:"+
					new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss").format(new Date(file1.lastModified())));
			
			
			
		} else {
			File[] listFiles = file1.listFiles();
			for (File file : listFiles) {
				showFile(file, file2);
			}
			
		}
		
		

	}

	public static void main(String[] args) throws Exception {
        File file1 = new File("E:/��������/Coding/Day12_IO/src/com/etc");
		File file2 = new File("E:/��������/��Ƶ/test.txt");
		
		showFile(file1, file2);
	}
}