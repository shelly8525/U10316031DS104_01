import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class U10316031DS104_01 extends JFrame{
	private JLabel label1 = new JLabel("C統計");
	private JLabel label2 = new JLabel("輸入檔案");
	private JLabel label3 = new JLabel("輸入內容:");
	private JLabel label4 = new JLabel("處理結果:");
	
	
	private JTextField textField1 = new JTextField();
	protected JTextArea textArea2 = new JTextArea();
	private JTextArea textArea3 = new JTextArea();
	private JTextField textField4 = new JTextField();
	
	private JButton button1 = new JButton("讀取");
	private JButton button2 = new JButton("處理");
	private JButton button3 = new JButton("處理結果存檔");
	private JButton button4 = new JButton("Clear all");
	
	JFileChooser chooser = new JFileChooser();
	
	File getFile;
	
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
		p3.setLayout(new GridLayout(7,1));
		p3.add(label1);
		p3.add(p1);
		p3.add(label3);
		p3.add(textArea2);
		p3.add(label4);
		p3.add(textArea3);
		p3.add(p2);
		
		add(p3);
		
		button1.addActionListener(new Button1());
		
	}
	
	class Button1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			int s = chooser.showOpenDialog(null);
			
			if(s == JFileChooser.APPROVE_OPTION){
				getFile = chooser.getSelectedFile();
				
				String fileName = chooser.getSelectedFile().getName();
				
					textField1.setText(fileName);
			}
			try{
				FileReader filereader = new FileReader(getFile);
				
				BufferedReader b = new BufferedReader(filereader);
				
				String str;
				
				while((str = b.readLine()) != null){
					textArea2.append(str+"\n");
				}
				
				b.close();
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
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
