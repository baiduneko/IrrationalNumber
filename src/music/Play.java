package music;
import java.io.File;
import java.io.IOException;
import java.net.URL;
 
 
public class Play {
	
	//�򿪱��ز�������������Ƶ ��Ƶ 
    public static  void openExe(String file) {  
    	
        try 
        { 
        	Runtime.getRuntime().exec("\"C:/Program Files/Windows Media Player/wmplayer.exe\""+file);  
        	
        } catch (Exception e)
        {  
            System.out.println("Error!");  
        }  
    }
    public static void main(String[] args){
    }
    public static void bgm(int i) {//���ݲ�����ͬ���Ų�ͬ�ı�������,��ȡ1��2��3��4��5��6
    	if(i==1) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\OtherSideBlue.wav");
    	if(i==2) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\AdventureForBlack.wav");
    	if(i==3) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\WhiteWithYou.wav");
    	if(i==4) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\GoldenHours.wav");
    	if(i==5) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\Sea,You&Me.wav");
    	if(i==6) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\LastingMoment.wav");
    }
 
}