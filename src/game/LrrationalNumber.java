package game;
//ע��ʩ�����////////////////////////////////////
import java.io.IOException;

import file.Deposit;

public class LrrationalNumber {//��������Ϸ�㷨֮��Ķ���
	static int[][] arr={{100,100,100,100,100,100,100,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,100,100,100,100,100,100,100}};
	static int[][] a={{0,0,0,0},{0,0,0,0}};
	static int fenshu=0;//��������Ϸ�÷�,���������
	static int s1,s2,s3,s4;//�����x,y��������,��s1��s2��s3��s4�õ�4������
	static int s1x,s2x,s3x,s4x,s1y,s2y,s3y,s4y;//��s1��s2��s3��s4������arr�е�x,y
	static int s;//��s1��s2��s3��s4�е�����
	public static void main(String[] args) {
	}
	
	public static int suiji(int m) {//m=8 �������8��1��2
		//m=-1 �������3��4��1,2,3,4,5
		//m=34 ��ȡ�浵
		//return -1;//û�ո�����Ϸ������
		//return 1;//��Ҿ͵����·���
		
		if(m==8) {//�������8��1��2
				fenshu=0;//�µ���Ϸ,������ʼΪ0
				for(int i=1;i<7;i++) {//��ʼ��arr[][],arr[1][1]��arr[6][6],ȫ������
					for(int j=1;j<7;j++) {
					arr[i][j]=0;
					}
				}		
			int x,y;//���߱��� (x,y)
			for(int z=1;z<=8;){//����8�������
				x=(int)(Math.random()*6+1);//���������1,2,3,4,5,6
				y=(int)(Math.random()*6+1);//���������1,2,3,4,5,6
				if(arr[x][y]==0)
				{
					//��������ɵ�λ��arr[x][y]Ϊ0,,������Ч
					arr[x][y]=(int)(Math.random()*2+1);//���������1,2
					z++;//������Чѭ��������һ,����ѭ��
				}
			}
		}
		else if(m==-1) {//����
			try {
				Deposit.du();//��ȡ�洢��text�ļ��е�����
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int jisu=0;//���߱���,��¼�ո���
			for(int i=1;i<7;i++) {
				for(int j=1;j<7;j++) {
					if(arr[i][j]==0) {
						jisu++;
					}
				}
			}
			if(jisu>28)//�浵������,����һ�㲻��������,��֮������ͳ�ʼ��
				suiji(8);//�����Լ�
			
		}
		
		else if(m==34){//�������3��4��1,2,3,4,5
			int x,y,z;//��¼arr�е�(x,y),zΪ�����3��4
			z=(int)(Math.random()*2+3);//���������3,4
			for(int i=1;i<=z;){
				if(kong()==0) return -1;//û�ո�����Ϸ������
				x=(int)(Math.random()*6+1);//���������1,2,3,4,5,6
				y=(int)(Math.random()*6+1);//���������1,2,3,4,5,6
				if(arr[x][y]==0) {//���ɵ�λ����Ч
					arr[x][y]=(int)(Math.random()*5+1);//���������1,2,3,4,5
					i++;
				}
			}
		}
		
		return 1;//��Ҿ͵����·���
		
	}

	
	
	public static void xunzhao(int x,int y)//Ѱ��arr[x][y],(x,y)��s1��s2��s3��s4��4�����������ϸ���������ʹ�ã�
	{
	    int i;//�������߱���
	    s1y=s2y=y;//��s1y��s2y��(x,y)��y��ͬ
	    s3x=s4x=x;//��s3x��s4x��(x,y)��x��ͬ
	    i=1;
	    while(x-i>0)//��s1
	    {
	    	if(arr[x-i][y]!=0) {//��Ϊ0,,�ҵ�
	    		break;
	    	}
	    	if(arr[x-i][y]==0) {//��������,Ϊ0,,����
	    		i++;
	    	}
	    }
	    if(arr[x-i][y]==100) s1=0;//һֱ���ϵ��߽绹û�ҵ�s1
	    else{//�ҵ�����Ҫ���s1
	        s1=arr[x-i][y];//�ѷ���Ҫ���s1���ݼ�¼
	        s1x=x-i;
	        }

	    i=1;
	    while(arr[x+i][y]==0)//��s2
	    {
	        i++;//��������,Ϊ0,,����
	    }
	    if(arr[x+i][y]==100) s2=0;//һֱ���µ��߽绹û�ҵ�s2
	    else{//�ҵ�����Ҫ���s2
	        s2=arr[x+i][y];//�ѷ���Ҫ���s2���ݼ�¼
	        s2x=x+i;
	        }

	    i=1;
	    while(y-i>0)//��s3
	    {
	    	if(arr[x][y-i]!=0) {//��Ϊ0,,�ҵ�
	    		break;
	    	}
	    	if(arr[x][y-i]==0) {//��������,Ϊ0,,����
	    		i++;
	    	}
	    }
	    if(arr[x][y-i]==100) s3=0;//һֱ���ϵ��߽绹û�ҵ�s3
	    else{//�ҵ�����Ҫ���s3
	        s3=arr[x][y-i];//�ѷ���Ҫ���s3���ݼ�¼
	        s3y=y-i;
	        }

	    i=1;
	    while(arr[x][y+i]==0)//��s4
	    {
	            i++;//��������,Ϊ0,,����
	    }
	    if(arr[x][y+i]==100) s4=0;//һֱ���ҵ��߽绹û�ҵ�s4
	    else{//�ҵ�����Ҫ���s4
	        s4=arr[x][y+i];//�ѷ���Ҫ���s4���ݼ�¼
	        s4y=y+i;
	        }
	    //����s1��s2��s3��s4,,����a[2][4],����������
	    a[0][0]=s1;
	    a[0][1]=s2;
	    a[0][2]=s3;
	    a[0][3]=s4;
	    a[1][0]=a[1][1]=a[1][2]=a[1][3]=0;//���ִ�����0
	}

	public static void zhongshu(int s1,int s2,int s3,int s4)//��s1��s2��s3��s4 4�����е�������Ҳ�ǳ����ϸ���������ʹ�ã�
	{
	    int max=1;//���������Ĺ��߱���
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++)
	        if(a[0][i]==a[0][j]&&a[0][i]!=0)
	        {
	            a[1][i]++;//��a[0]4�����ĳ��ִ�����¼�����Ӧ��a[1]
	        }
	    }
	    for(int i=0;i<4;i++){//��a[1]4���������ֵ
	            if(a[1][i]>max&&a[0][i]!=0){
	            max=a[1][i];
	            s=a[0][i];
	        }
	        }
	   
	    if(max==1) {//4��������û�г�����������Ч
	    	s=0;//��������
	    }
	        
	    if(max>1) {//4�������г�����������Ч
	    	fenshu=fenshu+max*s;//���ӵ÷�
	    }
	}
	public static int panduan() {//�ж��Ƿ��ҵ����������ǳ����ϸ���������ʹ�ã�
		//return 0;//�����Ч
		//return 1;//�����Ч
		
		if(s==0){//û������
			return 0;//�����Ч
		}
		else{//������
			return 1;//��Ϸ����
		}
	}
	
	public static int kong(){//ͳ��ʣ��ո�0��������
		//return 0;//��Ϸ�޷�����
		//return sum;//��Ϸ���Լ��������ؿո������

		int sum=0;//��������,�ո������
		int k=0;//��������,���������������Ŀո������
		for(int i=1;i<7;i++){
	        for(int j=1;j<7;j++) {
	        if(arr[i][j]==0) sum++;//�У�0���ո񣬼�һ
	        }
	    }
		for(int i=1;i<7;i++){//Ѱ������Ϊ0�����������ҵ�����
	        for(int j=1;j<7;j++) {
	        if(arr[i][j]==0) {
	        	xunzhao(i,j);//Ѱ��arr[i][j],(i,j)��s1��s2��s3��s4��4����
	        	zhongshu(s1,s2,s3,s4);//��s1��s2��s3��s4 4�����е�����
	        	if(panduan()==1) k++;//�ж��Ƿ��ҵ�����������1�ҵ�
	        	}
	        
	        
	        }
		}
		//k=0,,ʣ��ո���������ȫû���������,��Ϸ�޷�����
		if(k<1) return 0;//��Ϸ����
		else return sum;//��Ϸ���Լ��������ؿո������
	}
	
	public static void gengxingshuju(int x,int y) {//(x,y) ���¶�ά���� arr[1][1]��arr[6][6]
		arr[x][y]=s+1;//0��Ϊ������1
		if(s1==s) arr[s1x][s1y]=0;//4�����к�������ȵ�ȫ����0
		if(s2==s) arr[s2x][s2y]=0;
		if(s3==s) arr[s3x][s3y]=0;
		if(s4==s) arr[s4x][s4y]=0;	
	}
	
	
	public static int run(int x,int y) {//(x,y) ��������������Ҫ����
		//(x,y)�����
		//return -1;//��Ϸ����
		//return 0;//�����Ч
		//return 3;//���·���

		if(arr[x][y]!=0) {//�������Ϊ0
			if(kong()==0) {//ͳ��ʣ��ո������
				return -1;//��Ϸ����
			}
				return 0;//�����Ч
		}
		if(arr[x][y]==0){
		xunzhao(x,y);//Ѱ��arr[x][y],(x,y)��s1��s2��s3��s4��4����
		zhongshu(s1,s2,s3,s4);//��s1��s2��s3��s4 4�����е�����
		
		if(panduan()==0){//�����Ϊ0,,������
			//panduan()==0,,return 0;//�����Ч//return 1;//��Ϸ����
			
			return 0;//�����Ч
		}
			
		if(panduan()==1){//�����Ϊ0,,��������
			gengxingshuju(x,y);//(x,y) ���¶�ά���� arr[1][1]��arr[6][6]
			if(suiji(34)==-1) {
				//suiji(34),,�������3��4��1,2,3,4,5 return -1;//û�ո�����Ϸ������
				
				return -1;//��Ϸ����
			}
			if(kong()==0) {
				//kong(){//ͳ��ʣ��ո������ //return 0;//��Ϸ�޷�����

				return -1;//��Ϸ����
			}
			else return 1;//��Ϸ����
			}
		}
		return 3;//���·���
	}
	public static int name(int m) {//arr[][] ��m�������Ƕ���
		//return arr[x][y];//���������е���
		
		int x=0;//���߱�������¼arr[x][y]��x,y
		int y=0;
		//��mת��Ϊx,y,��m�������������е�λ��
		if(m>=1&&m<=5) {//1��2��3��4��5
			x=1;
			y=m%6;
		}
		if(m>=7&&m<=11) {//7��8��9��10��11
			x=2;
			y=m%6;
		}
		if(m>=13&&m<=17) {//13��14��15��16��17
			x=3;
			y=m%6;
		}
		if(m>=19&&m<=23) {//19��20��21��22��23
			x=4;
			y=m%6;
		}
		if(m>=25&&m<=30) {//25��26��27��28��29
			x=5;
			y=m%6;
		}
		if(m>=31&&m<=36) {//31��32��33��34��35
			x=6;
			y=m%6;
		}
		if(m%6==0) {//6��12��18��24��36
			x=m/6;;
			y=6;
		}
		return arr[x][y];//���������е���
	}
public static void chuanshu(int m,int i) {//�浵�е�i��������m
	int x=0;
	int y=0;
	//���߱�������¼arr[x][y]��x,y
	//��iת��Ϊx,y,��i�������������е�λ��
	if(i>=1&&i<=5) {//1��2��3��4��5
		x=1;
		y=i%6;
		}
	else if(i>=7&&i<=11) {//7��8��9��10��11
		x=2;
		y=i%6;
		}
	else if(i>=13&&i<=17) {//13��14��15��16��17
		x=3;
		y=i%6;
		}
	else if(i>=19&&i<=23) {//19��20��21��22��23
		x=4;
		y=i%6;
		}
	else if(i>=25&&i<=30) {//25��26��27��28��29
		x=5;
		y=i%6;
		}
	else if(i>=31&&i<=36) {//31��32��33��34��35
		x=6;
		y=i%6;
		}
	else if(i%6==0) {//6��12��18��24��36
		x=i/6;;
		y=6;
		}
	arr[x][y]=m;//��m��ֵ��������
}
	public static int defen() {//�õ�����
		return fenshu;
	}
	public static void redefen(int f) {//��ȡ�浵�еķ���f
		fenshu=f;//�õ��浵�еķ���
	}
}
