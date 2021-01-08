package major;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Window.Type;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import file.Take;
import game.LrrationalNumber;
import music.Play;

import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import window.Core;
import window.Over;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;

public class Menu extends JFrame {
	public static JFrame f=null;
	static int s;//��¼����
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("��ӭ���鱾��Ϸ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("����");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Play.bgm(5);
			}
		});
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("��Ϸ����");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						  Take.dayin(2);
			}
		});
		mntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("������Ϸ");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Take.dayin(3);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		Play.bgm(5);
		JButton btnNewButton_01 = new JButton("��ʼ");
		btnNewButton_01.setFont(new Font("����", Font.PLAIN, 22));
		btnNewButton_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s=1;
				if(s==1) LrrationalNumber.suiji(8);//��ʼ�������8������
				Core.chushihua(s);//��ʼ����ť
				// TODO Auto-generated method stub
				//dispose();
				s=0;
				Core.chuangjian();//��ť�ļ����¼�
				
				
			}
				 //�ر�jiemian
				
				//��һ���Ǻ��ģ���
		});
		
		//fangfa.chaungjian();
		
		JButton btnNewButton_02 = new JButton("��ȡ�浵");
		btnNewButton_02.setFont(new Font("����", Font.PLAIN, 18));
		btnNewButton_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��ȡ�浵
				int t=1;
				if(t==1) LrrationalNumber.suiji(-1);
				Core.chushihua(t);//��ʼ����ť//��ʼ����ť
				// TODO Auto-generated method stub
				//dispose();
				t=0;
				Core.chuangjian();//��ť�ļ����¼�
			}
		});
		
		JButton btnNewButton_03 = new JButton("����ѡ��");
		btnNewButton_03.setFont(new Font("����", Font.PLAIN, 18));
		btnNewButton_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame m=new JFrame("��������");
				m.setSize(600,600);
				m.setBackground(Color.WHITE);
				m.setLocation(300,50);
				setContentPane(contentPane);
				m.getContentPane().setLayout(new GridLayout(2, 2, 3, 3));

				for(int i=1;i<=4;i++){
					JButton btnNewButton_i=null;
					if(i==1) btnNewButton_i=new JButton("OtherSideBlue");
					if(i==2) btnNewButton_i=new JButton("AdventureForBlack");
					if(i==3) btnNewButton_i=new JButton("WhiteWithYou");
					if(i==4) btnNewButton_i=new JButton("GoldenHours");
					
					
					m.getContentPane().add(btnNewButton_i);
					int j=i;
					btnNewButton_i.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Play.bgm(j);
							m.setVisible(false);
						}
					});
				}
					m.setVisible(true);
			}


		});
		
		
		JButton btnNewButton_04 = new JButton("���а�");
		btnNewButton_04.setFont(new Font("����", Font.PLAIN, 20));
		btnNewButton_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_04.setText("ǰ�ٸ߷�����");
				  Take.dayin(1);
				
			
			}

	
		});
		
		JButton btnNewButton_05 = new JButton("�˳�");
		btnNewButton_05.setFont(new Font("����", Font.PLAIN, 22));
		btnNewButton_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		contentPane.add(btnNewButton_01);
		contentPane.add(btnNewButton_02);
		contentPane.add(btnNewButton_03);
		contentPane.add(btnNewButton_04);
		contentPane.add(btnNewButton_05);
	}

}
