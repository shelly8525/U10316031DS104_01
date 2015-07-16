import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class U10316031DS104_01 extends JFrame implements ActionListener{
	private JLabel label1 = new JLabel("C統計");
	private JLabel label2 = new JLabel("輸入檔案");
	private JLabel label3 = new JLabel("輸入內容:");
	private JLabel label4 = new JLabel("處理結果:");
	
	
	private JTextField textField1 = new JTextField();
	private JTextField textField2 = new JTextField();
	private JTextField textField3 = new JTextField();
	private JTextField textField4 = new JTextField();
	
	private JButton button1 = new JButton("讀取");
	private JButton button2 = new JButton("處理");
	private JButton button3 = new JButton("處理結果存檔");
	private JButton button4 = new JButton("Clear all");
	
	public U10316031DS104_01(){
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
		p3.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		p3.add(label1);
		p3.add(p1);
		p3.add(label3);
		p3.add(textField2);
		p3.add(label4);
		p3.add(textField3);
		p3.add(p2);
		
		add(p3);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
	}
	public static void main(String[] args){
		JFrame frame = new U10316031DS104_01();
		frame.setTitle("C統計");
		frame.setSize(500,1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
