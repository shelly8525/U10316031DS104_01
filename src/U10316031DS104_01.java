import javax.swing.*;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U10316031DS104_01 extends JFrame implements ActionListener{
	private JLabel label1 = new JLabel("C�έp");
	private JLabel label2 = new JLabel("��J�ɮ�");
	private JLabel label3 = new JLabel("��J���e:");
	private JLabel label4 = new JLabel("�B�z���G:");
	
	
	private JTextField textField1 = new JTextField();
	private JTextField textField2 = new JTextField();
	private JTextField textField3 = new JTextField();
	private JTextField textField4 = new JTextField();
	
	private JButton button1 = new JButton("Ū��");
	private JButton button2 = new JButton("�B�z");
	private JButton button3 = new JButton("�B�z���G�s��");
	private JButton button4 = new JButton("Clear all");
	
	public U10316031DS104_01(){
		this.setTitle("C�έp");
		this.init();
		this.setLocation(500,1000);
		this.setResizable(false);
		pack();
	}
	
	public void init(){
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,4));
		p1.add(label2);
		p1.add(textField1);
		p1.add(button1);
		p1.add(button2);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,4));
		p2.add(textField4);
		p2.add(button3);
		p2.add(button4);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		p3.add(label1);
		p3.add(p1);
		p3.add(label3);
		p3.add(textField2);
		p3.add(label4);
		p3.add(textField3);
		p3.add(p2);
		
		add(p3);
	}
	public void actionPerformed(ActionEvent e){
		
	}
	
	public static void main(String[] args){
		U10316031DS104_01 frame = new U10316031DS104_01();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
