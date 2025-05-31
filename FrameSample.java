import java.lang.*;
import javax.swing.*;
import java.awt.*;
public class FrameSample extends JFrame
{
  private JPanel panel;
  private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
  private JTextField tf1;
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
		//gmail 
		label2=new JLabel("Gmail");
		label2.setFont(f2);
		label2.setForeground(c3);
		label2.setBackground(Color.WHITE);
		label2.setOpaque(true);// over lapping
		label2.setBounds(20,60,60,30);
		panel.add(label2);
		
		tf1=new JTextField();
		tf1.setFont(f2);
		tf1.setBackground(c4);
		tf1.setBounds(150,60,350,30);
		panel.add(tf1);
		//password
		label3=new JLabel("Password");//3rd pass
		label3.setFont(f2);
		label3.setForeground(c3);
		label3.setBackground(Color.WHITE);	
		label3.setOpaque(true);//overlapping
		label3.setBounds(20,110,100,30);
		panel.add(label3);
				
		pf1=new JPasswordField();
		pf1.setFont(f2);
		pf1.setBackground(c4);
		pf1.setBounds(150,110,350,30);
		pf1.setEchoChar('#');//EchoChar
		panel.add(pf1);

		














        		//step 4(f)
		super.add(panel);
    }


}
