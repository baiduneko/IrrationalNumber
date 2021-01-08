package file;

import java.io.File;
import java.io.IOException;

public class Preservation {

	public static void main(String[] args) {
		String path1="c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\text.txt";
		File f1=new File(path1);
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path2="c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\date.txt";
		File f2=new File(path2);
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path3="c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\rule.txt";
		File f3=new File(path3);
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path4="c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\thanks.txt";
		File f4=new File(path4);
		try {
			f4.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
