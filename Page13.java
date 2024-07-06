import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page13 extends JFrame implements ActionListener{

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JPanel p1;
    JButton b1, b2;
	JTextField t1;
	JTextArea a1;

    public Page13(){
        super("MINDCOLOGY");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBounds(0, 0, 1280, 720);
		p1.setLayout(null);

		l1 = new JLabel("Don't Worry,Friend!");
        l1.setFont(new Font("Serif", Font.PLAIN, 60));
        l1.setForeground(new Color(102,0,102));
        l1.setBounds(350, 20, 600, 100);
        p1.add(l1);

		l2 = new JLabel("We Are There For You");
        l2.setFont(new Font("Serif", Font.PLAIN, 50));
        l2.setForeground(new Color(128,0,0));
        l2.setBounds(355, 50, 900, 150);
        p1.add(l2);
		
		l3 = new JLabel("Dial 108 for instant assistance");
        l3.setFont(new Font("Serif", Font.PLAIN, 35));
        l3.setForeground(Color.RED);
        l3.setBounds(125, 150, 900, 150);
        p1.add(l3);
		
		l4 = new JLabel("One of our Expert Representatives is awaiting for you");
        l4.setFont(new Font("Serif", Font.PLAIN, 30));
		l4.setForeground(new Color(0,102,204));
        l4.setBounds(125, 210, 900, 100);
        p1.add(l4);
		
		l5 = new JLabel("OR");
        l5.setFont(new Font("Serif", Font.PLAIN, 50));
        l5.setForeground(new Color(255,102,0));
        l5.setBounds(375, 270, 100, 80);
        p1.add(l5);
		
		l6 = new JLabel("Just leave your Contact Number");
        l6.setFont(new Font("Serif", Font.PLAIN, 35));
        l6.setForeground(Color.RED);
        l6.setBounds(125, 290, 900, 150);
        p1.add(l6);
		
		l7 = new JLabel("We will reach you shortly");
        l7.setFont(new Font("Serif", Font.PLAIN, 30));
        l7.setForeground(new Color(0,102,204));
        l7.setBounds(125, 350, 900, 100);
        p1.add(l7);
		
		l8 = new JLabel("MOBILE:");
        l8.setFont(new Font("Serif", Font.PLAIN, 30));
        l8.setForeground(new Color(128,0,128));
        l8.setBounds(125, 350, 300, 200);
        p1.add(l8);
		
		t1=new JTextField();
		t1.setFont(new Font("Serif", Font.PLAIN, 30));
		t1.setBackground(new Color(204,204,255));
        t1.setBounds(285, 430, 300, 40);
        p1.add(t1);
		
		l9 = new JLabel("Can you briefly tell us your condition so that we can proceed accordingly?");
        l9.setFont(new Font("Serif", Font.PLAIN, 35));
        l9.setForeground(new Color(128,0,128));
        l9.setBounds(125, 440, 1050, 100);
        p1.add(l9);
		
		a1=new JTextArea();
		a1.setFont(new Font("Serif", Font.PLAIN, 30));
        a1.setBackground(new Color(204,204,255));
        a1.setBounds(125, 510, 1030, 100);
        p1.add(a1);
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b1.setBounds(1030, 630, 150, 40);
        b1.setForeground(Color.RED);
        b1.addActionListener(this);
        p1.add(b1);

		b2 = new JButton("Return");
		b2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b2.setBounds(100, 630, 150, 40);
        b2.setForeground(Color.RED);
        b2.addActionListener(this);
        p1.add(b2);


		ImageIcon backgroundImage = new ImageIcon("E:/MINDCOLOGY/Pics/p3.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1280, 720);
        p1.add(backgroundLabel);

        this.add(p1);
        this.setVisible(true);
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Page12 p12=new Page12();
			this.setVisible(false);
			p12.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			Page1 p1=new Page1();
			this.setVisible(false);
			p1.setVisible(true);
		}
	}

	public static void main(String[] args) {
        new Page13();
    }
}