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
	static int[] arr = new int[N]; //����һ������Ϊ36��һά������
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	}
	public static void xie() throws IOException {//����ά����ת��Ϊһά���鱣��
		String path="c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\text.txt";
        
        File f=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\text.txt");//ָ��Ҫ�������ļ�
        FileWriter out = new FileWriter(f); //�ļ�д����
        //�������е�����д�뵽�ļ��С�ÿ�и�����֮��TAB���
		for(int i=1;i<N-1;i++) {
			out.write(LrrationalNumber.name(i)+"\t");
			//System.out.println("\t"+wulishu.name(i));//����
		}
		out.write(LrrationalNumber.defen()+"\t");
		out.close();//�ر�
	}
	public static void du() throws NumberFormatException, IOException {
		String path="c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\text.txt";
        
        File f=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\text.txt");//ָ��Ҫ�������ļ�

        BufferedReader in = new BufferedReader(new FileReader(f));  //
        String line;  //һ������
        //���ж�ȡ������ÿ��������뵽������
        while((line = in.readLine()) != null){
        String[] temp = line.split("\t"); //��\t�ָ�
        for(int j=0;j<temp.length-1;j++){
        	LrrationalNumber.chuanshu(Integer.parseInt(temp[j]),j+1);
        	}
        LrrationalNumber.redefen(Integer.parseInt(temp[temp.length-1]));
        }
        in.close();
        }
}

