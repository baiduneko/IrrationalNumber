package music;
import java.io.File;
import java.io.IOException;
import java.net.URL;
 
 
public class Play {
	
	//打开本地播放器并播放视频 音频 
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
    public static void bgm(int i) {//根据参数不同播放不同的背景音乐,可取1，2，3，4，5，6
    	if(i==1) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\OtherSideBlue.wav");
    	if(i==2) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\AdventureForBlack.wav");
    	if(i==3) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\WhiteWithYou.wav");
    	if(i==4) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\GoldenHours.wav");
    	if(i==5) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\Sea,You&Me.wav");
    	if(i==6) Play.openExe("C:\\Users\\master\\eclipse-workspace\\IrrationalNumber\\sprb\\LastingMoment.wav");
    }
 
}