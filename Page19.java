import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page19 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2;
	JCheckBox c1, c2, c3, c4, c5,c6, c7, c8;
	JPanel p1;
	
	public Page19()
	{  
		super("MINDCOLOGY");
		this.setSize(1280,720);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon background_image = new ImageIcon("E:/MINDCOLOGY/Pics/5.jpg");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1280,720);
		this.add(background);
		
		p1 = new JPanel();
        p1.setBounds(100,80,1050,590);
		p1.setBackground(new Color(0,0,0,80));
        p1.setLayout(null);
		
		
		l1 = new JLabel("How can MINDCOLOGY assist you?");
		l1.setFont(new Font("Arial Black",Font.BOLD,30));
		l1.setForeground(new Color(255,102,0));
		l1.setBounds(350,20,950,90);
		background.add(l1);
		
		c1 = new JCheckBox("To respond differently to my anger");
		c1.setFont(new Font("Arial Black",Font.BOLD,20));
		c1.setBackground(new Color(0,255,255));
		c1.setForeground(Color.blue);
		c1.setBounds(300, 70, 500, 35);
		p1.add(c1);
		
		
		c2 = new JCheckBox("To be more productive at work");
		c2.setFont(new Font("Arial Black",Font.BOLD,20));
		c2.setBackground(new Color(0,255,255));
		c2.setForeground(Color.blue);
		c2.setBounds(300, 130, 500, 35);	
		p1.add(c2);
		
		c3 = new JCheckBox("To improve my emotional health");
		c3.setFont(new Font("Arial Black",Font.BOLD,20));
		c3.setBackground(new Color(0,255,255));
		c3.setForeground(Color.blue);
		c3.setBounds(300, 190, 500, 35);
		p1.add(c3);
		
		c4 = new JCheckBox("To have a healthy response to stress");
		c4.setFont(new Font("Arial Black",Font.BOLD,20));
		c4.setBackground(new Color(0,255,255));
		c4.setForeground(Color.blue);
		c4.setBounds(300, 250, 500, 35);
		p1.add(c4);
		
		c5 = new JCheckBox("To be less anxious in general");
		c5.setFont(new Font("Arial Black",Font.BOLD,20));
		c5.setBackground(new Color(0,255,255));
		c5.setForeground(Color.blue);
		c5.setBounds(300, 310, 500, 35);
		p1.add(c5);
		
		c6 = new JCheckBox("To feel rested during the day");
		c6.setFont(new Font("Arial Black",Font.BOLD,20));
		c6.setBackground(new Color(0,255,255));
		c6.setForeground(Color.blue);
		c6.setBounds(300, 370, 500, 35);
		p1.add(c6);
		
		c7 = new JCheckBox("To have energy throughout my day");
		c7.setFont(new Font("Arial Black",Font.BOLD,20));
		c7.setBackground(new Color(0,255,255));
		c7.setForeground(Color.blue);
		c7.setBounds(300, 430, 500, 35);
		p1.add(c7);
		
		c8 = new JCheckBox("To find more peaceful moments in my day");
		c8.setFont(new Font("Arial Black",Font.BOLD,20));
		c8.setBackground(new Color(0,255,255));
		c8.setForeground(Color.blue);
		c8.setBounds(300, 490, 500, 35);
		p1.add(c8);
		
		b1 = new JButton("NEXT");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.red);
		b1.setBounds(60,550,125,30);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("BACK");
		b2.setFont(new Font("CooperBlack",Font.BOLD,15));
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.red);
		b2.setBounds(900,550,125,30);
		b2.addActionListener(this);
		p1.add(b2);
		background.add(p1);
		this.setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==b2)
			{
				Page18 p18=new Page18();
				this.setVisible(false);
				p18.setVisible(true);
			}
			else if(ae.getSource()==b1)
			{
				Page24 p24=new Page24();
				this.setVisible(false);
				p24.setVisible(true);
			}
	}
	public static void main(String[] args)
	{
		Page19 p19=new Page19();
		p19.setVisible(true);
	}
 }