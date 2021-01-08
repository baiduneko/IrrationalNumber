package window;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

import file.Take;
import game.LrrationalNumber;
import major.Menu;
import music.Play;

public class Core{
	public static void main(String[] args) {
	
	}
	public static JToggleButton b1=null;
	public static JToggleButton b2=null;
	public static JToggleButton b3=null;
	public static JToggleButton b4=null;
	public static JToggleButton b5=null;
	public static JToggleButton b6=null;
	public static JToggleButton b7=null;
	public static JToggleButton b8=null;
	public static JToggleButton b9=null;
	public static JToggleButton b10=null;
	public static JToggleButton b11=null;
	public static JToggleButton b12=null;
	public static JToggleButton b13=null;
	public static JToggleButton b14=null;
	public static JToggleButton b15=null;
	public static JToggleButton b16=null;
	public static JToggleButton b17=null;
	public static JToggleButton b18=null;
	public static JToggleButton b19=null;
	public static JToggleButton b20=null;
	public static JToggleButton b21=null;
	public static JToggleButton b22=null;
	public static JToggleButton b23=null;
	public static JToggleButton b24=null;
	public static JToggleButton b25=null;
	public static JToggleButton b26=null;
	public static JToggleButton b27=null;
	public static JToggleButton b28=null;
	public static JToggleButton b29=null;
	public static JToggleButton b30=null;
	public static JToggleButton b31=null;
	public static JToggleButton b32=null;
	public static JToggleButton b33=null;
	public static JToggleButton b34=null;
	public static JToggleButton b35=null;
	public static JToggleButton b36=null;
	
	public static void chushihua(int s) {//s=1,初始化，s=0,关闭本界面
		//if(s==0) f.dispose();关闭本窗口
		// TODO Auto-generated method stub
		if(s==1) {
			JFrame f=Menu.f;
			f=new JFrame("无理数");	
			f.addWindowListener(new Event());
		f.setSize(600,600);
		f.setBackground(Color.WHITE);
		f.setLocation(300,50);			
		f.getContentPane().setLayout(new GridLayout(6, 6, 2, 3));
		
	
		b1=new JToggleButton(""+LrrationalNumber.name(1),true);
		f.getContentPane().add(b1);
		b2=new JToggleButton(""+LrrationalNumber.name(2),true);
		f.getContentPane().add(b2);
		b3=new JToggleButton(""+LrrationalNumber.name(3),true);
		f.getContentPane().add(b3);
		b4=new JToggleButton(""+LrrationalNumber.name(4),true);
		f.getContentPane().add(b4);
		b5=new JToggleButton(""+LrrationalNumber.name(5),true);
		f.getContentPane().add(b5);
		b6=new JToggleButton(""+LrrationalNumber.name(6),true);
		f.getContentPane().add(b6);
		b7=new JToggleButton(""+LrrationalNumber.name(7),true);
		f.getContentPane().add(b7);
		b8=new JToggleButton(""+LrrationalNumber.name(8),true);
		f.getContentPane().add(b8);
		b9=new JToggleButton(""+LrrationalNumber.name(9),true);
		f.getContentPane().add(b9);
		b10=new JToggleButton(""+LrrationalNumber.name(10),true);
		f.getContentPane().add(b10);
		b11=new JToggleButton(""+LrrationalNumber.name(11),true);
		f.getContentPane().add(b11);
		b12=new JToggleButton(""+LrrationalNumber.name(12),true);
		f.getContentPane().add(b12);
		b13=new JToggleButton(""+LrrationalNumber.name(13),true);
		f.getContentPane().add(b13);
		b14=new JToggleButton(""+LrrationalNumber.name(14),true);
		f.getContentPane().add(b14);
		b15=new JToggleButton(""+LrrationalNumber.name(15),true);
		f.getContentPane().add(b15);
		b16=new JToggleButton(""+LrrationalNumber.name(16),true);
		f.getContentPane().add(b16);
		b17=new JToggleButton(""+LrrationalNumber.name(17),true);
		f.getContentPane().add(b17);
		b18=new JToggleButton(""+LrrationalNumber.name(18),true);
		f.getContentPane().add(b18);
		b19=new JToggleButton(""+LrrationalNumber.name(19),true);
		f.getContentPane().add(b19);
		b20=new JToggleButton(""+LrrationalNumber.name(20),true);
		f.getContentPane().add(b20);
		b21=new JToggleButton(""+LrrationalNumber.name(21),true);
		f.getContentPane().add(b21);
		b22=new JToggleButton(""+LrrationalNumber.name(22),true);
		f.getContentPane().add(b22);
		b23=new JToggleButton(""+LrrationalNumber.name(23),true);
		f.getContentPane().add(b23);
		b24=new JToggleButton(""+LrrationalNumber.name(24),true);
		f.getContentPane().add(b24);
		b25=new JToggleButton(""+LrrationalNumber.name(25),true);
		f.getContentPane().add(b25);
		b26=new JToggleButton(""+LrrationalNumber.name(26),true);
		f.getContentPane().add(b26);
		b27=new JToggleButton(""+LrrationalNumber.name(27),true);
		f.getContentPane().add(b27);
		b28=new JToggleButton(""+LrrationalNumber.name(28),true);
		f.getContentPane().add(b28);
		b29=new JToggleButton(""+LrrationalNumber.name(29),true);
		f.getContentPane().add(b29);
		b30=new JToggleButton(""+LrrationalNumber.name(30),true);
		f.getContentPane().add(b30);
		b31=new JToggleButton(""+LrrationalNumber.name(31),true);
		f.getContentPane().add(b31);
		b32=new JToggleButton(""+LrrationalNumber.name(32),true);
		f.getContentPane().add(b32);
		b33=new JToggleButton(""+LrrationalNumber.name(33),true);
		f.getContentPane().add(b33);
		b34=new JToggleButton(""+LrrationalNumber.name(34),true);
		f.getContentPane().add(b34);
		b35=new JToggleButton(""+LrrationalNumber.name(35),true);
		f.getContentPane().add(b35);
		b36=new JToggleButton(""+LrrationalNumber.name(36),true);
		f.getContentPane().add(b36);
		
		b1.setFont(new Font("宋体", Font.PLAIN, 25));
		b2.setFont(new Font("宋体", Font.PLAIN, 25));
		b3.setFont(new Font("宋体", Font.PLAIN, 25));
		b4.setFont(new Font("宋体", Font.PLAIN, 25));
		b5.setFont(new Font("宋体", Font.PLAIN, 25));
		b6.setFont(new Font("宋体", Font.PLAIN, 25));
		b7.setFont(new Font("宋体", Font.PLAIN, 25));
		b8.setFont(new Font("宋体", Font.PLAIN, 25));
		b9.setFont(new Font("宋体", Font.PLAIN, 25));
		b10.setFont(new Font("宋体", Font.PLAIN, 25));
		b11.setFont(new Font("宋体", Font.PLAIN, 25));
		b12.setFont(new Font("宋体", Font.PLAIN, 25));
		b13.setFont(new Font("宋体", Font.PLAIN, 25));
		b14.setFont(new Font("宋体", Font.PLAIN, 25));
		b15.setFont(new Font("宋体", Font.PLAIN, 25));
		b16.setFont(new Font("宋体", Font.PLAIN, 25));
		b17.setFont(new Font("宋体", Font.PLAIN, 25));
		b18.setFont(new Font("宋体", Font.PLAIN, 25));
		b19.setFont(new Font("宋体", Font.PLAIN, 25));
		b20.setFont(new Font("宋体", Font.PLAIN, 25));
		b21.setFont(new Font("宋体", Font.PLAIN, 25));
		b22.setFont(new Font("宋体", Font.PLAIN, 25));
		b23.setFont(new Font("宋体", Font.PLAIN, 25));
		b24.setFont(new Font("宋体", Font.PLAIN, 25));
		b25.setFont(new Font("宋体", Font.PLAIN, 25));
		b26.setFont(new Font("宋体", Font.PLAIN, 25));
		b27.setFont(new Font("宋体", Font.PLAIN, 25));
		b28.setFont(new Font("宋体", Font.PLAIN, 25));
		b29.setFont(new Font("宋体", Font.PLAIN, 25));
		b30.setFont(new Font("宋体", Font.PLAIN, 25));
		b31.setFont(new Font("宋体", Font.PLAIN, 25));
		b32.setFont(new Font("宋体", Font.PLAIN, 25));
		b33.setFont(new Font("宋体", Font.PLAIN, 25));
		b34.setFont(new Font("宋体", Font.PLAIN, 25));
		b35.setFont(new Font("宋体", Font.PLAIN, 25));
		b36.setFont(new Font("宋体", Font.PLAIN, 25));
		tanqi();
		f.setVisible(true);
		}
		
	}
		
	public static void chuangjian() {
			
		b1.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(1,1);		
			}
		});
		b2.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(1,2);		
			}
			
		});
		b3.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(1,3);		
			}
		});
		b4.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(1,4);		
			}
			
		});
		b5.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(1,5);		
			}
		});
		b6.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(1,6);		
			}
			
		});
		b7.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(2,1);		
			}
		});
		b8.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(2,2);		
			}
			
		});
		b9.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(2,3);		
			}
		});
		b10.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(2,4);		
			}
			
		});
		b11.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(2,5);		
			}
		});
		b12.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(2,6);		
			}
			
		});
		b13.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(3,1);		
			}
		});
		b14.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(3,2);		
			}
			
		});
		b15.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(3,3);		
			}
		});
		b16.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(3,4);		
			}
			
		});
		b17.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(3,5);		
			}
		});
		b18.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(3,6);		
			}
			
		});
		b19.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(4,1);		
			}
		});
		b20.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(4,2);		
			}
			
		});
		b21.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(4,3);		
			}
		});
		b22.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(4,4);		
			}
			
		});
		b23.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(4,5);		
			}
		});
		b24.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(4,6);		
			}
			
		});
		b25.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(5,1);		
			}
		});
		b26.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(5,2);		
			}
			
		});
		b27.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(5,3);		
			}
		});
		b28.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(5,4);		
			}
			
		});
		b29.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(5,5);		
			}
		});
		b30.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(5,6);		
			}
			
		});
		b31.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(6,1);		
			}
		});
		b32.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(6,2);		
			}
			
		});
		b33.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(6,3);		
			}
		});
		b34.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(6,4);		
			}
			
		});
		b35.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(6,5);		
			}
		});
		b36.addActionListener(new ActionListener() {//监听点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shuaping(6,6);		
			}
			
		});
	
		
	}
		
		
	public static void shuaping(int x,int y) {
		
		int z=LrrationalNumber.run(x,y);//运行主程序
		
		if(z==-1) {
			try {
				Take.du();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Take.qu();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Play.bgm(6);
			JFrame p=new JFrame("游戏结束");
			p.setSize(700, 500);
			p.setBackground(Color.WHITE);
			p.setLocation(300, 100);	
			
			JLabel lblNewLabel = new JLabel("恭喜你！得分是：");
			lblNewLabel.setBounds(50, 103, 342, 149);
			lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 36));
			p.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("  "+LrrationalNumber.defen());
			lblNewLabel_1.setBounds(368, 41, 146, 219);
			lblNewLabel_1.setBackground(Color.RED);
			lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 66));
			p.add(lblNewLabel_1);
			
			JToggleButton btnNewButton_1 = new JToggleButton("返回查看",false);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p.setVisible(false);
				}
			});
			btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 24));
			btnNewButton_1.setBounds(93, 310, 171, 85);
			JToggleButton btnNewButton_2 = new JToggleButton("退出",false);
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(1);
				}
			});
			btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 24));
			btnNewButton_2.setBounds(343, 310, 171, 85);
			p.add(btnNewButton_1);
			p.add(btnNewButton_2);
			p.getContentPane().setLayout(new GridLayout(2, 1, 100, 100));
			
			p.setVisible(true);
			
			
		}
		if(z==1) {
			b1.setText(""+LrrationalNumber.name(1));
			b2.setText(""+LrrationalNumber.name(2));
			b3.setText(""+LrrationalNumber.name(3));
			b4.setText(""+LrrationalNumber.name(4));
			b5.setText(""+LrrationalNumber.name(5));
			b6.setText(""+LrrationalNumber.name(6));
			b7.setText(""+LrrationalNumber.name(7));
			b8.setText(""+LrrationalNumber.name(8));
			b9.setText(""+LrrationalNumber.name(9));
			b10.setText(""+LrrationalNumber.name(10));
			b11.setText(""+LrrationalNumber.name(11));
			b12.setText(""+LrrationalNumber.name(12));
			b13.setText(""+LrrationalNumber.name(13));
			b14.setText(""+LrrationalNumber.name(14));
			b15.setText(""+LrrationalNumber.name(15));
			b16.setText(""+LrrationalNumber.name(16));
			b17.setText(""+LrrationalNumber.name(17));
			b18.setText(""+LrrationalNumber.name(18));
			b19.setText(""+LrrationalNumber.name(19));
			b20.setText(""+LrrationalNumber.name(20));
			b21.setText(""+LrrationalNumber.name(21));
			b22.setText(""+LrrationalNumber.name(22));
			b23.setText(""+LrrationalNumber.name(23));
			b24.setText(""+LrrationalNumber.name(24));
			b25.setText(""+LrrationalNumber.name(25));
			b26.setText(""+LrrationalNumber.name(26));
			b27.setText(""+LrrationalNumber.name(27));
			b28.setText(""+LrrationalNumber.name(28));
			b29.setText(""+LrrationalNumber.name(29));
			b30.setText(""+LrrationalNumber.name(30));
			b31.setText(""+LrrationalNumber.name(31));
			b32.setText(""+LrrationalNumber.name(32));
			b33.setText(""+LrrationalNumber.name(33));
			b34.setText(""+LrrationalNumber.name(34));
			b35.setText(""+LrrationalNumber.name(35));	
			b36.setText(""+LrrationalNumber.name(36));
			tanqi();
			
		}
		//if(z==0) //大家就当无事发生
		
	}
	static void setSelected(boolean b) {
	}
	static void tanqi() {
		if(LrrationalNumber.name(1)==0) b1.setSelected(false);
		else b1.setSelected(true);
		if(LrrationalNumber.name(2)==0) b2.setSelected(false);
		else b2.setSelected(true);
		if(LrrationalNumber.name(3)==0) b3.setSelected(false);
		else b3.setSelected(true);
		if(LrrationalNumber.name(4)==0) b4.setSelected(false);
		else b4.setSelected(true);
		if(LrrationalNumber.name(5)==0) b5.setSelected(false);
		else b5.setSelected(true);
		if(LrrationalNumber.name(6)==0) b6.setSelected(false);
		else b6.setSelected(true);
		if(LrrationalNumber.name(7)==0) b7.setSelected(false);
		else b7.setSelected(true);
		if(LrrationalNumber.name(8)==0) b8.setSelected(false);
		else b8.setSelected(true);
		if(LrrationalNumber.name(9)==0) b9.setSelected(false);
		else b9.setSelected(true);
		if(LrrationalNumber.name(10)==0) b10.setSelected(false);
		else b10.setSelected(true);
		if(LrrationalNumber.name(11)==0) b11.setSelected(false);
		else b11.setSelected(true);
		if(LrrationalNumber.name(12)==0) b12.setSelected(false);
		else b12.setSelected(true);
		if(LrrationalNumber.name(13)==0) b13.setSelected(false);
		else b13.setSelected(true);
		if(LrrationalNumber.name(14)==0) b14.setSelected(false);
		else b14.setSelected(true);
		if(LrrationalNumber.name(15)==0) b15.setSelected(false);
		else b15.setSelected(true);
		if(LrrationalNumber.name(16)==0) b16.setSelected(false);
		else b16.setSelected(true);
		if(LrrationalNumber.name(17)==0) b17.setSelected(false);
		else b17.setSelected(true);
		if(LrrationalNumber.name(18)==0) b18.setSelected(false);
		else b18.setSelected(true);
		if(LrrationalNumber.name(19)==0) b19.setSelected(false);
		else b19.setSelected(true);
		if(LrrationalNumber.name(20)==0) b20.setSelected(false);
		else b20.setSelected(true);
		if(LrrationalNumber.name(21)==0) b21.setSelected(false);
		else b21.setSelected(true);
		if(LrrationalNumber.name(22)==0) b22.setSelected(false);
		else b22.setSelected(true);
		if(LrrationalNumber.name(23)==0) b23.setSelected(false);
		else b23.setSelected(true);
		if(LrrationalNumber.name(24)==0) b24.setSelected(false);
		else b24.setSelected(true);
		if(LrrationalNumber.name(25)==0) b25.setSelected(false);
		else b25.setSelected(true);
		if(LrrationalNumber.name(26)==0) b26.setSelected(false);
		else b26.setSelected(true);
		if(LrrationalNumber.name(27)==0) b27.setSelected(false);
		else b27.setSelected(true);
		if(LrrationalNumber.name(28)==0) b28.setSelected(false);
		else b28.setSelected(true);
		if(LrrationalNumber.name(29)==0) b29.setSelected(false);
		else b29.setSelected(true);
		if(LrrationalNumber.name(30)==0) b30.setSelected(false);
		else b30.setSelected(true);
		if(LrrationalNumber.name(31)==0) b31.setSelected(false);
		else b31.setSelected(true);
		if(LrrationalNumber.name(32)==0) b32.setSelected(false);
		else b32.setSelected(true);
		if(LrrationalNumber.name(33)==0) b33.setSelected(false);
		else b33.setSelected(true);
		if(LrrationalNumber.name(34)==0) b34.setSelected(false);
		else b34.setSelected(true);
		if(LrrationalNumber.name(35)==0) b35.setSelected(false);
		else b35.setSelected(true);
		if(LrrationalNumber.name(36)==0) b36.setSelected(false);
		else b36.setSelected(true);
	}
}
	
