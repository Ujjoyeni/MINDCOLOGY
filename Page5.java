import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page5 extends JFrame implements ActionListener {
    private JPanel p1;
    private JButton b1, b2, b3, b4, b5, b6, b7;
    private ImageIcon img1;
    private JLabel l0, l1;

    public Page5() {
        super("MINDCOLOGY");
        setSize(new Dimension(1280, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        p1 = new JPanel();
        p1.setSize(new Dimension(1280, 720));
        p1.setBackground(Color.BLACK);
        p1.setLayout(null);
		

        l0 = new JLabel("What Are You Looking For!");
        l0.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l0.setForeground(new Color(128,0,0));
        l0.setBounds(400, 90, 920, 80);
        p1.add(l0);

        b1 = new JButton("Stress Management Techniques");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b1.setBorder(null);
        b1.setForeground(Color.BLACK);
		b1.setBackground(new Color(100,179,213));
        b1.setBounds(55, 235, 620, 65);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Depression and Treatment Options");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b2.setBorder(null);
        b2.setForeground(Color.BLACK);
		b2.setBackground(new Color(96,147,209));
        b2.setBounds(55, 305, 620, 65);
        b2.addActionListener(this);
        p1.add(b2);

        b3 = new JButton("Improving self-esteem and self-worth");
        b3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b3.setBorder(null);
        b3.setForeground(Color.BLACK);
		b3.setBackground(new Color(100,179,213));
        b3.setBounds(55, 375, 620, 65);
        b3.addActionListener(this);
        p1.add(b3);

        b4 = new JButton("Managing work-life balance");
        b4.setFont(new Font("Times New Roman", Font.BOLD, 25));
        b4.setBorder(null);
        b4.setForeground(Color.BLACK);
		b4.setBackground(new Color(96,147,209));
        b4.setBounds(55, 445, 620, 65);
        b4.addActionListener(this);
        p1.add(b4);

        b5 = new JButton("Techniques for managing anger and frustration");
        b5.setFont(new Font("Times New Roman", Font.BOLD, 25));
        b5.setBorder(null);
        b5.setForeground(Color.BLACK);
		b5.setBackground(new Color(100,179,213));
        b5.setBounds(55, 515, 620, 65);
        b5.addActionListener(this);
        p1.add(b5);

        b6 = new JButton("Mind-body practices");
        b6.setFont(new Font("Times New Roman", Font.BOLD, 25));
        b6.setBorder(null);
        b6.setForeground(Color.BLACK);
		b6.setBackground(new Color(96,147,209));
        b6.setBounds(55, 585, 620, 65);
        b6.addActionListener(this);
        p1.add(b6);
		
		b7 = new JButton("Back");
        b7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        b7.setForeground(Color.RED);
		b7.setBorder(null);
		b7.setBackground(Color.white);
        b7.setBounds(900, 600, 100, 50);
        b7.addActionListener(this);
        p1.add(b7);

        this.add(p1);
		
		img1 = new ImageIcon("E:/MINDCOLOGY/Pics/tata.png");
        l1 = new JLabel(img1);
        l1.setBounds(0, 0, 1280, 720);
        p1.add(l1);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
		{
			Page6 p6=new Page6();
			this.setVisible(false);
			p6.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			Page7 p7=new Page7();
			this.setVisible(false);
			p7.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			Page8 p8=new Page8();
			this.setVisible(false);
			p8.setVisible(true);
		}
		else if(ae.getSource()==b4)
		{
			Page9 p9=new Page9();
			this.setVisible(false);
			p9.setVisible(true);
		}
		else if(ae.getSource()==b5)
		{
			Page10 p10=new Page10();
			this.setVisible(false);
			p10.setVisible(true);
		}
		else if(ae.getSource()==b6)
		{
			Page11 p11=new Page11();
			this.setVisible(false);
			p11.setVisible(true);
		}
		else if(ae.getSource()==b7)
		{
			Page1 p1=new Page1();
			this.setVisible(false);
			p1.setVisible(true);
		}
	}
	public static void main(String[]args)
	{
		Page5 p5=new Page5();
		p5.setVisible(true);
	}
}