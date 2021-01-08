package file;//caogao!!!!!

import java.awt.Color;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import game.LrrationalNumber;
import major.Menu;
import window.Event;

public class Take {

	  static int  n = 101;  //N数组
	  static int[] arr = new int [n]; //工具数组
	public static void main(String[] args) {//没什么用的主函数
	}
	public static int de() {
		return arr.length;
	}
	//这个还是需要的，在外调用即可
	public static void qu() throws IOException {//更新date主存储数组
		File f1=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\date.txt");//指定要操作的文件
        FileWriter out1 = new FileWriter(f1); //文件写入流
        File f2=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\date0.txt");//指定要操作的文件
        FileWriter out2 = new FileWriter(f2); //文件写入流
        //int k=arr.length; 

        //保持最多只有100个数据

    	//分数不为0，写入文本,分数为0，无事发生
    		for(int i=0;i<99;i++) {
    			int w=arr[i];
    				out1.write(w+"\r\n");
    				out2.write(w+"\t");
   
    			}
    		out1.close();//关闭
    		out2.close();//关闭
	}
	public static void shu(int x,int i) {
		arr[i]=x;
	}
	
//这个需要，在内更新
        public static void du() throws NumberFormatException, IOException {//读取辅助存储文件
    		File f=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\date0.txt");//指定要操作的文件
            BufferedReader in = new BufferedReader(new FileReader(f));  //
            String line;  //一行数据
            //逐行读取，并将每个数组放入到数组中
            while((line = in.readLine()) != null){
            String[] temp = line.split("\t"); //用\t分割
            for(int j=0;j<temp.length;j++){
            	if(temp[j]==null) break;
            	shu(Integer.parseInt(temp[j]),j);
            	}
            }
            in.close();//关闭
        	int s; //给辅助存储文件排序的工具变量
        	//int k=arr.length;  
        	//if(k>100) {//保持最多只有100个数据
        	//	k=100;
        	//}
        		arr[100]=LrrationalNumber.defen();//得到分数，与原有数据进行排序
        		for(int i=0;i<99;i++) {
            		for(int j=0;j<100;j++) {
            			if(arr[j]<arr[j+1]) {
            				s=arr[j];
            				arr[j]=arr[j+1];
            				arr[j+1]=s;
            				}
            			}
        			}
        		
        }
        
        public static void dayin(int i) {
        	File a=null;
        if(i==1) {
        	a = new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\date.txt");
        }
        if(i==2) {
        	a = new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\rule.txt");
        }
        if(i==3) {
        	a = new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\thanks.txt");
        }
	    FileReader fr = null;
		try {
			fr = new FileReader(a);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    BufferedReader br = new BufferedReader(fr);

	    Vector<String> lines = new Vector<String>();

	    String line;
	    try {
			while ((line = br.readLine()) != null) {
			  lines.add(line);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    JOptionPane.showMessageDialog(null, new JScrollPane(new JList(lines)));
	    if(i==1) return ;
	    try {
			fr.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}				
        }
}
