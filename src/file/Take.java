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

	  static int  n = 101;  //N����
	  static int[] arr = new int [n]; //��������
	public static void main(String[] args) {//ûʲô�õ�������
	}
	public static int de() {
		return arr.length;
	}
	//���������Ҫ�ģ�������ü���
	public static void qu() throws IOException {//����date���洢����
		File f1=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\date.txt");//ָ��Ҫ�������ļ�
        FileWriter out1 = new FileWriter(f1); //�ļ�д����
        File f2=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\date0.txt");//ָ��Ҫ�������ļ�
        FileWriter out2 = new FileWriter(f2); //�ļ�д����
        //int k=arr.length; 

        //�������ֻ��100������

    	//������Ϊ0��д���ı�,����Ϊ0�����·���
    		for(int i=0;i<99;i++) {
    			int w=arr[i];
    				out1.write(w+"\r\n");
    				out2.write(w+"\t");
   
    			}
    		out1.close();//�ر�
    		out2.close();//�ر�
	}
	public static void shu(int x,int i) {
		arr[i]=x;
	}
	
//�����Ҫ�����ڸ���
        public static void du() throws NumberFormatException, IOException {//��ȡ�����洢�ļ�
    		File f=new File("c:"+File.separator+"Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\date0.txt");//ָ��Ҫ�������ļ�
            BufferedReader in = new BufferedReader(new FileReader(f));  //
            String line;  //һ������
            //���ж�ȡ������ÿ��������뵽������
            while((line = in.readLine()) != null){
            String[] temp = line.split("\t"); //��\t�ָ�
            for(int j=0;j<temp.length;j++){
            	if(temp[j]==null) break;
            	shu(Integer.parseInt(temp[j]),j);
            	}
            }
            in.close();//�ر�
        	int s; //�������洢�ļ�����Ĺ��߱���
        	//int k=arr.length;  
        	//if(k>100) {//�������ֻ��100������
        	//	k=100;
        	//}
        		arr[100]=LrrationalNumber.defen();//�õ���������ԭ�����ݽ�������
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
