package game;
//注释施工完成////////////////////////////////////
import java.io.IOException;

import file.Deposit;

public class LrrationalNumber {//无理数游戏算法之类的东西
	static int[][] arr={{100,100,100,100,100,100,100,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,0,0,0,0,0,0,100},{100,100,100,100,100,100,100,100}};
	static int[][] a={{0,0,0,0},{0,0,0,0}};
	static int fenshu=0;//无理数游戏得分,具体见规则
	static int s1,s2,s3,s4;//点击（x,y）触发后,上s1下s2左s3右s4得到4个数字
	static int s1x,s2x,s3x,s4x,s1y,s2y,s3y,s4y;//上s1下s2左s3右s4在数组arr中的x,y
	static int s;//上s1下s2左s3右s4中的众数
	public static void main(String[] args) {
	}
	
	public static int suiji(int m) {//m=8 随机生成8个1和2
		//m=-1 随机生成3到4个1,2,3,4,5
		//m=34 读取存档
		//return -1;//没空格了游戏结束了
		//return 1;//大家就当无事发生
		
		if(m==8) {//随机生成8个1和2
				fenshu=0;//新的游戏,分数初始为0
				for(int i=1;i<7;i++) {//初始化arr[][],arr[1][1]到arr[6][6],全部归零
					for(int j=1;j<7;j++) {
					arr[i][j]=0;
					}
				}		
			int x,y;//工具变量 (x,y)
			for(int z=1;z<=8;){//生成8个随机数
				x=(int)(Math.random()*6+1);//生成随机数1,2,3,4,5,6
				y=(int)(Math.random()*6+1);//生成随机数1,2,3,4,5,6
				if(arr[x][y]==0)
				{
					//随机数生成的位置arr[x][y]为0,,生成有效
					arr[x][y]=(int)(Math.random()*2+1);//生成随机数1,2
					z++;//生成有效循环次数减一,继续循环
				}
			}
		}
		else if(m==-1) {//读档
			try {
				Deposit.du();//读取存储在text文件中的数据
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int jisu=0;//工具变量,记录空格数
			for(int i=1;i<7;i++) {
				for(int j=1;j<7;j++) {
					if(arr[i][j]==0) {
						jisu++;
					}
				}
			}
			if(jisu>28)//存档有问题,不过一般不会有问题,总之有问题就初始化
				suiji(8);//调用自己
			
		}
		
		else if(m==34){//随机生成3到4个1,2,3,4,5
			int x,y,z;//记录arr中的(x,y),z为随机数3或4
			z=(int)(Math.random()*2+3);//生成随机数3,4
			for(int i=1;i<=z;){
				if(kong()==0) return -1;//没空格了游戏结束了
				x=(int)(Math.random()*6+1);//生成随机数1,2,3,4,5,6
				y=(int)(Math.random()*6+1);//生成随机数1,2,3,4,5,6
				if(arr[x][y]==0) {//生成的位置有效
					arr[x][y]=(int)(Math.random()*5+1);//生成随机数1,2,3,4,5
					i++;
				}
			}
		}
		
		return 1;//大家就当无事发生
		
	}

	
	
	public static void xunzhao(int x,int y)//寻找arr[x][y],(x,y)上s1下s2左s3右s4的4个数（常和上个函数连锁使用）
	{
	    int i;//计数工具变量
	    s1y=s2y=y;//上s1y下s2y和(x,y)的y相同
	    s3x=s4x=x;//上s3x下s4x和(x,y)的x相同
	    i=1;
	    while(x-i>0)//上s1
	    {
	    	if(arr[x-i][y]!=0) {//不为0,,找到
	    		break;
	    	}
	    	if(arr[x-i][y]==0) {//往上找数,为0,,继续
	    		i++;
	    	}
	    }
	    if(arr[x-i][y]==100) s1=0;//一直往上到边界还没找到s1
	    else{//找到符合要求的s1
	        s1=arr[x-i][y];//把符合要求的s1数据记录
	        s1x=x-i;
	        }

	    i=1;
	    while(arr[x+i][y]==0)//下s2
	    {
	        i++;//往下找数,为0,,继续
	    }
	    if(arr[x+i][y]==100) s2=0;//一直往下到边界还没找到s2
	    else{//找到符合要求的s2
	        s2=arr[x+i][y];//把符合要求的s2数据记录
	        s2x=x+i;
	        }

	    i=1;
	    while(y-i>0)//左s3
	    {
	    	if(arr[x][y-i]!=0) {//不为0,,找到
	    		break;
	    	}
	    	if(arr[x][y-i]==0) {//往左找数,为0,,继续
	    		i++;
	    	}
	    }
	    if(arr[x][y-i]==100) s3=0;//一直往上到边界还没找到s3
	    else{//找到符合要求的s3
	        s3=arr[x][y-i];//把符合要求的s3数据记录
	        s3y=y-i;
	        }

	    i=1;
	    while(arr[x][y+i]==0)//右s4
	    {
	            i++;//往右找数,为0,,继续
	    }
	    if(arr[x][y+i]==100) s4=0;//一直往右到边界还没找到s4
	    else{//找到符合要求的s4
	        s4=arr[x][y+i];//把符合要求的s4数据记录
	        s4y=y+i;
	        }
	    //将上s1下s2左s3右s4,,存入a[2][4],辅助数组中
	    a[0][0]=s1;
	    a[0][1]=s2;
	    a[0][2]=s3;
	    a[0][3]=s4;
	    a[1][0]=a[1][1]=a[1][2]=a[1][3]=0;//出现次数归0
	}

	public static void zhongshu(int s1,int s2,int s3,int s4)//求s1下s2左s3右s4 4个数中的众数（也是常和上个函数连锁使用）
	{
	    int max=1;//保存众数的工具变量
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++)
	        if(a[0][i]==a[0][j]&&a[0][i]!=0)
	        {
	            a[1][i]++;//在a[0]4个数的出现次数记录在其对应的a[1]
	        }
	    }
	    for(int i=0;i<4;i++){//求a[1]4个数字最大值
	            if(a[1][i]>max&&a[0][i]!=0){
	            max=a[1][i];
	            s=a[0][i];
	        }
	        }
	   
	    if(max==1) {//4个数字中没有出现众数，无效
	    	s=0;//众数归零
	    }
	        
	    if(max>1) {//4个数字中出现众数，有效
	    	fenshu=fenshu+max*s;//增加得分
	    }
	}
	public static int panduan() {//判断是否找到众数（还是常和上个函数连锁使用）
		//return 0;//点击无效
		//return 1;//点击有效
		
		if(s==0){//没有众数
			return 0;//点击无效
		}
		else{//有众数
			return 1;//游戏继续
		}
	}
	
	public static int kong(){//统计剩余空格（0）的数量
		//return 0;//游戏无法继续
		//return sum;//游戏可以继续，返回空格的数量

		int sum=0;//计数变量,空格的数量
		int k=0;//计数变量,上下左右有众数的空格的数量
		for(int i=1;i<7;i++){
	        for(int j=1;j<7;j++) {
	        if(arr[i][j]==0) sum++;//有（0）空格，加一
	        }
	    }
		for(int i=1;i<7;i++){//寻找所有为0的数上下左右的众数
	        for(int j=1;j<7;j++) {
	        if(arr[i][j]==0) {
	        	xunzhao(i,j);//寻找arr[i][j],(i,j)上s1下s2左s3右s4的4个数
	        	zhongshu(s1,s2,s3,s4);//求s1下s2左s3右s4 4个数中的众数
	        	if(panduan()==1) k++;//判断是否找到众数，返回1找到
	        	}
	        
	        
	        }
		}
		//k=0,,剩余空格上下左右全没众数的情况,游戏无法继续
		if(k<1) return 0;//游戏结束
		else return sum;//游戏可以继续，返回空格的数量
	}
	
	public static void gengxingshuju(int x,int y) {//(x,y) 更新二维数组 arr[1][1]到arr[6][6]
		arr[x][y]=s+1;//0改为众数加1
		if(s1==s) arr[s1x][s1y]=0;//4个数中和众数相等的全部归0
		if(s2==s) arr[s2x][s2y]=0;
		if(s3==s) arr[s3x][s3y]=0;
		if(s4==s) arr[s4x][s4y]=0;	
	}
	
	
	public static int run(int x,int y) {//(x,y) 运行无理数的主要函数
		//(x,y)点击处
		//return -1;//游戏结束
		//return 0;//点击无效
		//return 3;//无事发生

		if(arr[x][y]!=0) {//点击处不为0
			if(kong()==0) {//统计剩余空格的数量
				return -1;//游戏结束
			}
				return 0;//点击无效
		}
		if(arr[x][y]==0){
		xunzhao(x,y);//寻找arr[x][y],(x,y)上s1下s2左s3右s4的4个数
		zhongshu(s1,s2,s3,s4);//求s1下s2左s3右s4 4个数中的众数
		
		if(panduan()==0){//点击处为0,,无众数
			//panduan()==0,,return 0;//点击无效//return 1;//游戏继续
			
			return 0;//点击无效
		}
			
		if(panduan()==1){//点击处为0,,且有众数
			gengxingshuju(x,y);//(x,y) 更新二维数组 arr[1][1]到arr[6][6]
			if(suiji(34)==-1) {
				//suiji(34),,随机生成3到4个1,2,3,4,5 return -1;//没空格了游戏结束了
				
				return -1;//游戏结束
			}
			if(kong()==0) {
				//kong(){//统计剩余空格的数量 //return 0;//游戏无法继续

				return -1;//游戏结束
			}
			else return 1;//游戏继续
			}
		}
		return 3;//无事发生
	}
	public static int name(int m) {//arr[][] 第m个数字是多少
		//return arr[x][y];//返回数组中的数
		
		int x=0;//工具变量，记录arr[x][y]的x,y
		int y=0;
		//把m转化为x,y,第m个数字在数组中的位置
		if(m>=1&&m<=5) {//1，2，3，4，5
			x=1;
			y=m%6;
		}
		if(m>=7&&m<=11) {//7，8，9，10，11
			x=2;
			y=m%6;
		}
		if(m>=13&&m<=17) {//13，14，15，16，17
			x=3;
			y=m%6;
		}
		if(m>=19&&m<=23) {//19，20，21，22，23
			x=4;
			y=m%6;
		}
		if(m>=25&&m<=30) {//25，26，27，28，29
			x=5;
			y=m%6;
		}
		if(m>=31&&m<=36) {//31，32，33，34，35
			x=6;
			y=m%6;
		}
		if(m%6==0) {//6，12，18，24，36
			x=m/6;;
			y=6;
		}
		return arr[x][y];//返回数组中的数
	}
public static void chuanshu(int m,int i) {//存档中第i个数字是m
	int x=0;
	int y=0;
	//工具变量，记录arr[x][y]的x,y
	//把i转化为x,y,第i个数字在数组中的位置
	if(i>=1&&i<=5) {//1，2，3，4，5
		x=1;
		y=i%6;
		}
	else if(i>=7&&i<=11) {//7，8，9，10，11
		x=2;
		y=i%6;
		}
	else if(i>=13&&i<=17) {//13，14，15，16，17
		x=3;
		y=i%6;
		}
	else if(i>=19&&i<=23) {//19，20，21，22，23
		x=4;
		y=i%6;
		}
	else if(i>=25&&i<=30) {//25，26，27，28，29
		x=5;
		y=i%6;
		}
	else if(i>=31&&i<=36) {//31，32，33，34，35
		x=6;
		y=i%6;
		}
	else if(i%6==0) {//6，12，18，24，36
		x=i/6;;
		y=6;
		}
	arr[x][y]=m;//把m的值赋给数组
}
	public static int defen() {//得到分数
		return fenshu;
	}
	public static void redefen(int f) {//读取存档中的分数f
		fenshu=f;//得到存档中的分数
	}
}
