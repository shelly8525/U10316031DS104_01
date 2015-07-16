import javax.swing.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U10316031DS104_01 extends JFrame implements ActionListener{
	private JLabel label1 = new JLabel("C統計");
	private JLabel label2 = new JLabel("輸入檔案");
	private JLabel label3 = new JLabel("輸入內容:");
	private JLabel label4 = new JLabel("處理結果:");
	private JLabel label5 = new JLabel("輸入內容:");
	
	private JTextField textField1 = new JTextField();
	private JTextField textField2 = new JTextField();
	private JTextField textField3 = new JTextField();
	private JTextField textField4 = new JTextField();
	
	private JButton button1 = new JButton("讀取");
	private JButton button2 = new JButton("處理");
	private JButton button3 = new JButton("處理結果存檔");
	private JButton button4 = new JButton("Clear all");
	
	public U10316031DS104_01(){
		this.setTitle("C統計");
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
