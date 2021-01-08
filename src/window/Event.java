package window;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

import file.Deposit;
	public class Event implements WindowListener {
		 
		@Override
		public void windowClosing(WindowEvent e) {
			//System.out.println("windowClosing--->窗口关闭");
			JFrame p=new JFrame("需要存档吗？");
			p.setSize(250, 200);
			p.setBackground(Color.WHITE);
			p.setLocation(350, 250);	
			
			JButton btnNewButton_1 = new JButton("确定");
			
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Deposit.xie();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					p.dispose();
					JFrame q=new JFrame("存档成功！");
					q.setSize(300, 200);
					q.setBackground(Color.WHITE);
					q.setLocation(350, 250);	
					
					JButton Button = new JButton("确定");
					Button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							q.dispose();
						}
					});
					Button.setFont(new Font("Dialog", Font.PLAIN, 24));
					q.add(Button);
					q.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
					q.setVisible(true);
					
				}
			});
			
			btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 24));
			btnNewButton_1.setBounds(93, 310, 171, 85);
			JButton btnNewButton_2 = new JButton("取消");
			
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p.dispose();
				}
			});
			
			btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 24));
			btnNewButton_2.setBounds(343, 310, 171, 85);
			p.add(btnNewButton_1);
			p.add(btnNewButton_2);
			p.getContentPane().setLayout(new GridLayout(2, 1, 2, 3));
			
			p.setVisible(true);
		}
	 
		@Override
		public void windowClosed(WindowEvent e) {
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	 

	 
	}
