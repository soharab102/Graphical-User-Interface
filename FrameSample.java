import java.lang.*;
import javax.swing.*;
import java.awt.*;
public class FrameSample extends JFrame
{
  private JPanel panel;
  private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
  private JTextField tf1,tf2,tf3,tf4;
  private JPasswordField pf1;
  //color ,font ,image 
  private Color c1,c2,c3,c4;
  private Font f1,f2;
  private ImageIcon img1;  

    public FrameSample()
    {
		//title of project
        super("Management GUI");
        super.setBounds(420,30,1000,1000);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add panel
		panel =new JPanel();
		panel.setLayout(null);
		c1=new Color(113,164,136);//panel color
		panel.setBackground(c1);		

		//font color
		f1=new Font("CAMBIA",Font.BOLD,30);//font 1
		f2=new Font("ROBOTO",Font.BOLD,20);//font 2
		c2=new Color(0,42,25);
		c3=new Color(0,70,70);
		c4=new Color(140,255,222);		
		//Heading 
		label1 =new JLabel("MANAGEMENT SYSTEM");//title
		label1.setFont(f1);
		label1.setForeground(c2);
		label1.setBackground(Color.WHITE);
		label1.setOpaque(true);// over lapping
		label1.setBounds(300,10,360,30);
		panel.add(label1);	
		
		//worker name
		
		label2=new JLabel("Worker Name");
		label2.setFont(f2);
		label2.setForeground(Color.WHITE);
		//label2.setBackground(Color.WHITE);
		//label2.setOpaque(true);// over lapping
		label2.setBounds(20,60,200,30);
		panel.add(label2);
		
		tf1=new JTextField();
		tf1.setFont(f2);
		tf1.setBackground(c4);
		tf1.setBounds(20,90,350,30);
		panel.add(tf1);
		
		//nationality

		label3=new JLabel("Worker Nationality");
		label3.setFont(f2);
		label3.setForeground(Color.WHITE);
		label3.setBounds(20,120,300,30);
		panel.add(label3);
		
		tf2=new JTextField();
		tf2.setFont(f2);
		tf2.setBackground(c4);
		tf2.setBounds(20,150,350,30);
		panel.add(tf2);		

		//age

		label4=new JLabel("Worker Age");
		label4.setFont(f2);
		label4.setForeground(Color.WHITE);
		label4.setBounds(20,180,300,30);
		panel.add(label4);
		
		tf3=new JTextField();
		tf3.setFont(f2);
		tf3.setBackground(c4);
		tf3.setBounds(20,210,350,30);
		panel.add(tf3);	

		//salary

		label5=new JLabel("Worker Salary");
		label5.setFont(f2);
		label5.setForeground(Color.WHITE);
		label5.setBounds(20,240,300,30);
		panel.add(label5);
		
		tf4=new JTextField();
		tf4.setFont(f2);
		tf4.setBackground(c4);
		tf4.setBounds(20,270,350,30);
		panel.add(tf4);	






        		//step 4(f)
		super.add(panel);
    }


}
