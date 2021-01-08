package window;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

import game.LrrationalNumber;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;

public class Over extends JFrame {

	public static void main(String[] args) {
		JFrame p=new JFrame("游戏结束");
		p.setSize(700, 500);
		p.setBackground(Color.WHITE);
		p.setLocation(300, 100);	
		
		JLabel lblNewLabel = new JLabel("恭喜你！得分是：");
		lblNewLabel.setBounds(50, 103, 342, 149);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 36));
		p.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("     "+LrrationalNumber.defen());
		lblNewLabel_1.setBounds(368, 41, 146, 219);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 66));
		p.add(lblNewLabel_1);
		
		JToggleButton btnNewButton_1 = new JToggleButton("再来一局！",true);
		
		//dispose();
		
		
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		btnNewButton_1.setBounds(93, 310, 171, 85);
		JToggleButton btnNewButton_2 = new JToggleButton("退出",true);
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 24));
		btnNewButton_2.setBounds(343, 310, 171, 85);
		p.add(btnNewButton_1);
		p.add(btnNewButton_2);
		p.getContentPane().setLayout(new GridLayout(2, 1, 100, 100));
		
		p.setVisible(true);
	}

	
}