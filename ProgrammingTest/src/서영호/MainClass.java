package ����ȣ;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MainClass extends JFrame implements ActionListener {
	
	JPanel jp1, jp2, jp3;
	JLabel jl1,jl2,jl3,jl4;
	JTextField tf1,tf2,tf3;
	JRadioButton jr1, jr2;
	JButton jb1,jb2,jb3,jb4;
	JTextArea ja;
	
	ProgTest1 pt1 = new ProgTest1();
	ProgTest2 pt2 = new ProgTest2();
	ButtonGroup bg1 = new ButtonGroup();
	
	public MainClass() {
		super("���α׷��־��Ȱ����");
		setLayout(new FlowLayout());
		
		jp1 = new JPanel(new BorderLayout());
		jp1.setBorder(new TitledBorder(new EtchedBorder(), "ȸ�����,����,��ȸ"));
		
		Box hbox = Box.createHorizontalBox();
		hbox.add(Box.createHorizontalStrut(60));
		hbox.add(jl1=new JLabel("ȸ��ID : "));
		hbox.add(tf1=new JTextField(10));
		hbox.add(Box.createHorizontalStrut(10));
		hbox.add(jl2=new JLabel("ȸ���̸�: "));
		hbox.add(tf2=new JTextField(10));
		hbox.add(Box.createHorizontalStrut(10));
		hbox.add(jl3=new JLabel("��ȭ��ȣ : "));
		hbox.add(tf3=new JTextField(10));
		hbox.add(Box.createHorizontalStrut(10));
		hbox.add(jl4=new JLabel("���� : "));
		jr1=new JRadioButton("��", true);
		jr2=new JRadioButton("��", false);
		bg1.add(jr1); bg1.add(jr2);
		hbox.add(jr1);
		hbox.add(jr2);
		hbox.add(Box.createHorizontalStrut(60));	
		
		Box qhbox = Box.createHorizontalBox();
		qhbox.add(Box.createVerticalStrut(40));
		qhbox.add(jb1=new JButton("ȸ�����"));
		qhbox.add(Box.createHorizontalStrut(5));
		qhbox.add(jb2=new JButton("ȸ������"));
		qhbox.add(Box.createHorizontalStrut(5));
		qhbox.add(jb3=new JButton("��üȸ����ȸ"));
		qhbox.add(Box.createHorizontalStrut(240));
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		Box vbox = Box.createVerticalBox();
		
		add(jp1);
		add(vbox);
		jp1.add(vbox);
		vbox.add(hbox);
		vbox.add(qhbox);
		
		jp2 = new JPanel(new BorderLayout());
		jp2.setBorder(new TitledBorder(new EtchedBorder(), "������"));
		Box hhbox = Box.createHorizontalBox();
		
		hhbox.add(Box.createHorizontalStrut(335));
		hhbox.add(jb4=new JButton("�����ܺ���"));
		jb4.addActionListener(this);
		hhbox.add(Box.createHorizontalStrut(335));
		jp2.add(hhbox);
		add(jp2);
		
		jp3 = new JPanel(new BorderLayout());
		jp3.setBorder(new TitledBorder(new EtchedBorder(), "���"));
		Box hhhbox = Box.createHorizontalBox();
		
		hhhbox.add(ja=new JTextArea(9,70));
		jp3.add(hhhbox);
		add(jp3);		
		
		setSize(800,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb1) {
			int con = JOptionPane.showConfirmDialog(this, "ȸ���� ����Ͻðڽ��ϱ�?", "ȸ�����", JOptionPane.YES_NO_OPTION);
			if(con==0) {
				Enumeration<AbstractButton> enums = bg1.getElements();
				pt2.mapListAdd(tf1.getText(), tf2.getText(), tf3.getText(),((JLabel) enums).getText());
				int bt;
				while(enums.hasMoreElements()) {
					AbstractButton ab = enums.nextElement();
					JRadioButton jr1 = (JRadioButton) ab;
					JRadioButton jr2 = (JRadioButton) ab;
					
					if(jr1.isSelected()) {
						bt=Integer.parseInt(jr1.getText().trim());
						break;
					}
					
					if(jr2.isSelected()) {
						bt=Integer.parseInt(jr2.getText().trim());
						break;
					}
					
				}
				
			}
			
			if(con==1);

		}
		
		if(e.getSource()==jb2) {
			int con = JOptionPane.showConfirmDialog(this, "ȸ���� �����Ͻðڽ��ϱ�?", "ȸ������", JOptionPane.YES_NO_OPTION);
			if(con==0);
			if(con==1);
		}
		
		if(e.getSource()==jb3) {
			String str = "ȸ��ID\t ȸ���̸�\t ��ȭ��ȣ\t ����\n";
			ja.setText(str);
		}
		
		if(e.getSource()==jb4) {
			int dan=Integer.parseInt(JOptionPane.showInputDialog(this, "����� ���ðڽ��ϱ�?"));
				String gugu = pt1.getGugudan(dan);
				ja.setText(gugu);
	}
}
}		
			
