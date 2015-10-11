import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	JFileChooser outputFile = new JFileChooser();
	
	File getFile;
	FileWriter fw;
	public AbstractButton fileOutputText;
	
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
		textArea2.setColumns(75);
		textArea2.setRows(300);
		p3.add(label4);
		p3.add(textArea3);
		p3.add(p2);
		
		add(p3);
		
		button1.addActionListener(new Button1());
		
		button2.addActionListener(new Button2());
		
		button3.addActionListener(new Button3());
		
		button4.addActionListener(new Button4());
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
	
	class Button2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			try{
				FileReader filereader = new FileReader(getFile);
				
				BufferedReader b = new BufferedReader(filereader);
				
				String str;
				
				int t = 1;
				
				while((str = b.readLine()) != null){
					str = b.readLine();
					
					String[] s = str.split("\\W+");
					int[] t1 = new int[s.length];
					
					for(int i = 0;i<s.length;i++){
						t1[i] = Integer.parseInt(s[i]);
					}
					
					int N = s.length;
					
					double total = 0;
					for(int i = 0;i<s.length;i++){
						total = total + t1[i];
					}
					
					double X = total/N;
					
					double CU = 0;
					double CD = 0;
					
					for(int i = 0;i<N;i++){
						CU = CU + (t1[i] - t1[i+1])*(t1[i] - t1[i+1]);
					}
					
					for(int i = 0;i<N;i++){
						CD = CD + (t1[i] - X)*(t1[i] - X);
					}
					
					double C = 1 - CU/(CD*2);
					
					double SC = Math.sqrt((double)(N - 2)/(N - 1)*(N + 1));
					
					double Z = C/SC;
					
					if(t ==1){
						textArea3.append("first phase\n");
					}
					else if(t == 2){
						textArea3.append("second phase\n");
					}
					else if(t == 3){
						textArea3.append("third phase\n");
					}
					else if(t == 4){
						textArea3.append("fourth phase\n");
					}
					else if(t == 5){
						textArea3.append("fifth phase\n");
					}
					else if(t == 6){
						textArea3.append("sixth phase\n");
					}
					else if(t == 7){
						textArea3.append("seventh phase\n");
					}
					else if(t == 8){
						textArea3.append("eighth phase\n");
					}
					else if(t == 9){
						textArea3.append("nineth phase\n");
					}else if(t == 10){
						textArea3.append("tenth phase\n");
					}
					
					textArea3.append("N="+Integer.toString(N)+"\n");
					textArea3.append("C="+Double.toString(C)+"\n");
					textArea3.append("X="+Double.toString(X)+"\n");
					textArea3.append("SC="+Double.toString(SC)+"\n");
					
					if(Z <= 1.64){
						textArea3.append("Z="+Double.toString(Z)+"<1.64  P>0.05"+"\n");
					}
					else{
						if(N==8 && Z>2.17){
							textArea3.append("Z="+Double.toString(Z)+">2.17  P<0.01"+"\n");
						}
						else if(N==8 && Z<2.17){
							textArea3.append("2.17>Z="+Double.toString(Z)+">1.64  P<0.05"+"\n");
						}
						else if(N==9 && Z>2.18){
							textArea3.append("Z="+Double.toString(Z)+">2.18  P<0.01"+"\n");
						}
						else if(N==9 && Z<2.18){
							textArea3.append("2.18>Z="+Double.toString(Z)+">1.64  P<0.05"+"\n");
						}
						else if(N==10 && Z>2.20){
							textArea3.append("Z="+Double.toString(Z)+">2.20   P<0.01"+"\n");
						}
						else if(N==10 && Z<2.20){
							textArea3.append("2.20>Z="+Double.toString(Z)+">1.64   P<0.05"+"\n");
			        	}
						else if(N==11 && Z>2.21){			        
							textArea3.append("Z="+Double.toString(Z)+">2.21   P<0.01"+"\n");
			        	}
						else if(N==11 && Z<2.21){
							textArea3.append("2.21>Z="+Double.toString(Z)+">1.64   P<0.05"+"\n");
			        	}
						else if(N==12 && Z>2.22){			        
							textArea3.append("Z="+Double.toString(Z)+">2.22   P<0.01"+"\n");
			        	}
						else if(N==12 && Z<2.22){
							textArea3.append("2.22>Z="+Double.toString(Z)+">1.64   P<0.05"+"\n");
			        	}
						else if(N==13 && Z>2.23){			        
							textArea3.append("Z="+Double.toString(Z)+">2.23   P<0.01"+"\n");
			        	}
						else if(N==13 && Z<2.23){
							textArea3.append("2.23>Z="+Double.toString(Z)+">1.64   P<0.05"+"\n");
			        	}
						else if(N>=14 && N<=16 && Z>2.24){			        
							textArea3.append("Z="+Double.toString(Z)+">2.24   P<0.01"+"\n");
			        	}
						else if(N>=14 && N<=16 && Z<2.24){
							textArea3.append("2.24>Z="+Double.toString(Z)+">1.64   P<0.05"+"\n");
			        	}
						else if(N>=17 && N<=18 && Z>2.25){			        
							textArea3.append("Z="+Double.toString(Z)+">2.25   P<0.01"+"\n");
			        	}
						else if(N>=17 && N<=18 && Z<2.25){
							textArea3.append("2.25>Z="+Double.toString(Z)+">1.64   P<0.05"+"\n");
			        	}
						else if(N>=19 && N<=22 && Z>2.26){			        
							textArea3.append("Z="+Double.toString(Z)+">2.26   P<0.01"+"\n");
			        	}
						else if(N>=19 && N<=22 && Z<2.26){
							textArea3.append("2.26>Z="+Double.toString(Z)+">1.64   P<0.05"+"\n");
			        	}
						else if(N>=23 && N<=25 && Z>2.27){			        
							textArea3.append("Z="+Double.toString(Z)+">2.27   P<0.01"+"\n");
			        	}
						else if(N>=23 && N<=25 && Z<2.27){
							textArea3.append("2.27>Z="+Double.toString(Z)+">1.64   P<0.05"+"\n");
			        	}
						else if(N>=26 && Z>2.33){
							textArea3.append("Z="+Double.toString(Z)+">2.27   P<0.01"+"\n");
			        	}
					}
					
					t++;
				}
				
				b.close();
			}
			catch(IOException q){
				q.printStackTrace();
			}
			catch(NullPointerException a){
				JOptionPane.showMessageDialog(null,"檔案未讀取!","錯誤",JOptionPane.WARNING_MESSAGE);
				a.printStackTrace();
			}
		}
	}
	
	class Button3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			try{
				FileWriter fw = new FileWriter(fileOutputText.getText(),false);
				BufferedWriter bfw = new BufferedWriter(fw);
				textArea3.write(bfw);
				
				bfw.flush();
				
				bfw.close();
				
				JOptionPane.showMessageDialog(null,"檔案已輸出至根目錄","輸出成功",JOptionPane.INFORMATION_MESSAGE);
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
	
	class Button4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			textField1.setText("");
			textArea2.setText("");
			textArea3.setText("");
			textField4.setText("");
			getFile = null;
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
