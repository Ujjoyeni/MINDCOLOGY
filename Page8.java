import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page8 extends JFrame implements ActionListener
{
	private JPanel p0;
	private JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	private ImageIcon img;
	private JButton b1,b2,b3;
	
	public Page8()
	{
		super ("MINDCOLOGY");
		setSize(new Dimension(1280, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
		
		p0= new JPanel();
		p0.setSize(new Dimension(1280, 720));
        p0.setLayout(null);
		
		l11 = new JLabel("Improving self-esteem and self-worth:");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l11.setForeground(Color.BLACK);
        l11.setBounds(70,10,1200,80);
        p0.add(l11);
		
		l1 = new JLabel("1.Practice self-compassion and positive self-talk.");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l1.setForeground(Color.BLACK);
        l1.setBounds(70,100,1200,45);
        p0.add(l1);
		
		l2 = new JLabel("2.Set achievable goals and celebrate accomplishments.");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l2.setForeground(Color.BLACK);
        l2.setBounds(70,148,1200,45);
        p0.add(l2);
		
		l3 = new JLabel("3.Focus on personal strengths and positive qualities.");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l3.setForeground(Color.BLACK);
        l3.setBounds(70,196,1200,45);
        p0.add(l3);
		
		l4 = new JLabel("4.Surround yourself with supportive and positive people.");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l4.setForeground(Color.BLACK);
        l4.setBounds(70,244,1200,45);
        p0.add(l4);
		
		l5 = new JLabel("5.Learn to say 'no' and set boundaries.");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l5.setForeground(Color.BLACK);
        l5.setBounds(70,292,1200,45);
        p0.add(l5);
		
		l6 = new JLabel("6.Engage in activities that bring joy and fulfillment.");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l6.setForeground(Color.BLACK);
        l6.setBounds(70,340,1200,45);
        p0.add(l6);
		
		l7 = new JLabel("7.Take care of your physical health through good nutrition, exercise, and sleep.");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l7.setForeground(Color.BLACK);
        l7.setBounds(70,388,1200,45);
        p0.add(l7);
		
		l8 = new JLabel("8.Practice mindfulness and meditation to manage stress and negative emotions.");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l8.setForeground(Color.BLACK);
        l8.setBounds(70,436,1200,45);
        p0.add(l8);
		
		l9 = new JLabel("9.Challenge negative beliefs and self-critical thoughts.");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l9.setForeground(Color.BLACK);
        l9.setBounds(70,484,1200,45);
        p0.add(l9);
		
		l10 = new JLabel("10.Seek professional support if needed.");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        l10.setForeground(Color.BLACK);
        l10.setBounds(70,532,1200,45);
        p0.add(l10);
		
		b1 = new JButton("Back");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b1.setBackground(new Color(234,212,212));
		b1.setBorder(null);
        b1.setForeground(Color.BLACK);
        b1.setBounds(150, 600, 150, 45);
        b1.addActionListener(this);
        p0.add(b1);
		
		b2 = new JButton("Seeking For Expert Consultancy!!!");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b2.setBackground(new Color(234,212,212));
		b2.setBorder(null);
        b2.setForeground(Color.BLACK);
        b2.setBounds(425, 600, 330, 45);
        b2.addActionListener(this);
        p0.add(b2);
		
		b3 = new JButton("Explore More");
        b3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b3.setBackground(new Color(234,212,212));
		b3.setBorder(null);
        b3.setForeground(Color.BLACK);
        b3.setBounds(880, 600, 250, 45);
        b3.addActionListener(this);
        p0.add(b3);
		
		
		
		img = new ImageIcon("E:/MINDCOLOGY/Pics/p3.jpg");
        l0 = new JLabel(img);
        l0.setBounds(0, 0, 1280, 720);
        p0.add(l0);
		
		this.add(p0);
			
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Page5 p5=new Page5();
			this.setVisible(false);
			p5.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			Page2 p2=new Page2();
			this.setVisible(false);
			p2.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			Page9 p9=new Page9();
			this.setVisible(false);
			p9.setVisible(true);
		}
	}
	public static void main(String[]args)
	{
		Page8 p8=new Page8();
		p8.setVisible(true);
	}
}