import javax.swing.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U10316031DS104_01 extends JFrame implements ActionListener{
	private JLabel label1 = new JLabel("C�έp");
	private JLabel label2 = new JLabel("��J�ɮ�");
	private JLabel label3 = new JLabel("��J���e:");
	private JLabel label4 = new JLabel("�B�z���G:");
	private JLabel label5 = new JLabel("��J���e:");
	
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
		
	}
	public void actionPerformed(ActionEvent e){
		
	}
	
	public static void main(String[] args){
		U10316031DS104_01 frame = new U10316031DS104_01();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
