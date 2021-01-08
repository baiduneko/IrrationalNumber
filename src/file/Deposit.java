package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import game.LrrationalNumber;

public class Deposit {

	static int N = 38;
	static int[] arr = new int[N]; //创建一个长度为36的一维的数组
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	}
	public static void xie() throws IOException {//将二维数组转换为一维数组保存
		String path="c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\text.txt";
        
        File f=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\text.txt");//指定要操作的文件
        FileWriter out = new FileWriter(f); //文件写入流
        //将数组中的数据写入到文件中。每行各数据之间TAB间隔
		for(int i=1;i<N-1;i++) {
			out.write(LrrationalNumber.name(i)+"\t");
			//System.out.println("\t"+wulishu.name(i));//测试
		}
		out.write(LrrationalNumber.defen()+"\t");
		out.close();//关闭
	}
	public static void du() throws NumberFormatException, IOException {
		String path="c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\text.txt";
        
        File f=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\text.txt");//指定要操作的文件

        BufferedReader in = new BufferedReader(new FileReader(f));  //
        String line;  //一行数据
        //逐行读取，并将每个数组放入到数组中
        while((line = in.readLine()) != null){
        String[] temp = line.split("\t"); //用\t分割
        for(int j=0;j<temp.length-1;j++){
        	LrrationalNumber.chuanshu(Integer.parseInt(temp[j]),j+1);
        	}
        LrrationalNumber.redefen(Integer.parseInt(temp[temp.length-1]));
        }
        in.close();
        }
}

