import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page6 extends JFrame implements ActionListener
{
	private JPanel p0;
	private JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	private ImageIcon img;
	private JButton b1,b2,b3;
	
	public Page6()
	{
		super ("MINDCOLOGY");
		setSize(new Dimension(1280, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
		
		p0= new JPanel();
		p0.setSize(new Dimension(1280, 720));
        p0.setLayout(null);
		
		l11 = new JLabel("Stress Management Techniques:");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l11.setForeground(Color.BLACK);
        l11.setBounds(100,10,1200,80);
        p0.add(l11);
		
		l1 = new JLabel("1.Deep breathing exercises");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l1.setForeground(Color.BLACK);
        l1.setBounds(100,100,1200,45);
        p0.add(l1);
		
		l2 = new JLabel("2.Mindfulness meditation");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l2.setForeground(Color.BLACK);
        l2.setBounds(100,148,1200,45);
        p0.add(l2);
		
		l3 = new JLabel("3.Progressive muscle relaxation");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l3.setForeground(Color.BLACK);
        l3.setBounds(100,196,1200,45);
        p0.add(l3);
		
		l4 = new JLabel("4.Regular exercise");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l4.setForeground(Color.BLACK);
        l4.setBounds(100,244,1200,45);
        p0.add(l4);
		
		l5 = new JLabel("5.Yoga");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l5.setForeground(Color.BLACK);
        l5.setBounds(100,292,1200,45);
        p0.add(l5);
		
		l6 = new JLabel("6.Adequate sleep");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l6.setForeground(Color.BLACK);
        l6.setBounds(100,340,1200,45);
        p0.add(l6);
		
		l7 = new JLabel("7.Social support");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l7.setForeground(Color.BLACK);
        l7.setBounds(100,388,1200,45);
        p0.add(l7);
		
		l8 = new JLabel("8.Time management");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l8.setForeground(Color.BLACK);
        l8.setBounds(100,436,1200,45);
        p0.add(l8);
		
		l9 = new JLabel("9.Cognitive-behavioral therapy");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l9.setForeground(Color.BLACK);
        l9.setBounds(100,484,1200,45);
        p0.add(l9);
		
		l10 = new JLabel("10.Self-care");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l10.setForeground(Color.BLACK);
        l10.setBounds(100,532,1200,45);
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
		
		
		
		img = new ImageIcon("E:/MINDCOLOGY/Pics/MHP1.png");
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
			Page7 p7=new Page7();
			this.setVisible(false);
			p7.setVisible(true);
		}
	}
	public static void main(String[]args)
	{
		Page6 ok=new Page6();
		ok.setVisible(true);
	}
	
}
