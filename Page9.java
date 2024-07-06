import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page9 extends JFrame implements ActionListener
{
	private JPanel p0;
	private JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	private ImageIcon img;
	private JButton b1,b2,b3;
	
	public Page9()
	{
		super ("MINDCOLOGY");
		setSize(new Dimension(1280, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
		
		p0= new JPanel();
		p0.setSize(new Dimension(1280, 720));
        p0.setLayout(null);
		
		l11 = new JLabel("Managing Work life balance");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l11.setForeground(Color.BLACK);
        l11.setBounds(80,10,1200,80);
        p0.add(l11);
		
		l1 = new JLabel("1. Set clear boundaries between work and personal life.");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l1.setForeground(Color.BLACK);
        l1.setBounds(80,100,1200,45);
        p0.add(l1);
		
		l2 = new JLabel("2.Prioritize and plan out your daily tasks.");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l2.setForeground(Color.BLACK);
        l2.setBounds(80,148,1200,45);
        p0.add(l2);
		
		l3 = new JLabel("3.Communicate openly with your manager or supervisor about workload and expectations.");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l3.setForeground(Color.BLACK);
        l3.setBounds(80,196,1200,45);
        p0.add(l3);
		
		l4 = new JLabel("4.Learn to say no to unnecessary commitments.");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l4.setForeground(Color.BLACK);
        l4.setBounds(80,244,1200,45);
        p0.add(l4);
		
		l5 = new JLabel("5.Take breaks throughout the day to recharge.");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l5.setForeground(Color.BLACK);
        l5.setBounds(80,292,1200,45);
        p0.add(l5);
		
		l6 = new JLabel("6. Practice good time management skills.");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l6.setForeground(Color.BLACK);
        l6.setBounds(80,340,1200,45);
        p0.add(l6);
		
		l7 = new JLabel("7. Establish a consistent sleep schedule.");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l7.setForeground(Color.BLACK);
        l7.setBounds(80,388,1200,45);
        p0.add(l7);
		
		l8 = new JLabel("8. Avoid overworking or taking work home with you.");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l8.setForeground(Color.BLACK);
        l8.setBounds(80,436,1200,45);
        p0.add(l8);
		
		l9 = new JLabel("9. Engage in activities that bring you joy and relaxation outside of work.");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l9.setForeground(Color.BLACK);
        l9.setBounds(80,484,1200,45);
        p0.add(l9);
		
		l10 = new JLabel("10. Set realistic goals for yourself both in your personal and professional life.");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l10.setForeground(Color.BLACK);
        l10.setBounds(80,532,1200,45);
        p0.add(l10);
		
		b1 = new JButton("Back");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setForeground(Color.BLACK);
        b1.setBounds(150, 600, 150, 45);
        b1.addActionListener(this);
        p0.add(b1);
		
		b2 = new JButton("Seeking For Expert Consultancy!!!");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setForeground(Color.BLACK);
        b2.setBounds(425, 600, 330, 45);
        b2.addActionListener(this);
        p0.add(b2);
		
		b3 = new JButton("Explore More");
        b3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b3.setForeground(Color.BLACK);
        b3.setBounds(880, 600, 250, 45);
        b3.addActionListener(this);
        p0.add(b3);
		
		
		
		img = new ImageIcon("E:/MINDCOLOGY/Pics/MHP2.jpg");
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
			Page10 p10=new Page10();
			this.setVisible(false);
			p10.setVisible(true);
		}
	}
	public static void main(String[]args)
	{
	    Page9 p9=new Page9();
		p9.setVisible(true);
	}
	
}