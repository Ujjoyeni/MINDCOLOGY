import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page12 extends JFrame implements ActionListener{

    JLabel l1, l2;
	JPanel p1;
    JButton b1, b2, b3, b4, b5;

    public Page12(){
        super("MINDCOLOGY");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBounds(0, 0, 1280, 720);
		p1.setLayout(null);

		l1 = new JLabel("Hey,Friend!");
        l1.setFont(new Font("Serif", Font.PLAIN, 70));
        l1.setForeground(new Color(102,0,102));
        l1.setBounds(350, 80, 800, 100);
        p1.add(l1);

		l2 = new JLabel("Which Type of Assistance can We Offer?");
        l2.setFont(new Font("Serif", Font.PLAIN, 40));
        l2.setForeground(new Color(128,0,0));
        l2.setBounds(160, 120, 700, 200);
        p1.add(l2);

        b1 = new JButton("General");
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b1.setBounds(50, 400, 290, 50);
        b1.setBackground(new Color(204,255,255));
		b1.setForeground(Color.RED);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Emergency");
		b2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b2.setBounds(460, 400, 260, 50);
		b2.setBackground(new Color(204,255,255));
        b2.setForeground(Color.RED);
        b2.addActionListener(this);
		p1.add(b2);

		b3 = new JButton("Self-Assessment");
		b3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b3.setBounds(260, 500, 300, 50);
        b3.setBackground(new Color(204,255,255));
		b3.setForeground(Color.RED);
        b3.addActionListener(this);
		p1.add(b3);
       
		b4 = new JButton("Back");
		b4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b4.setBounds(1030, 600, 150, 50);
        b4.setForeground(Color.RED);
        b4.addActionListener(this);
		p1.add(b4);
		
		b5 = new JButton("Consultant Info");
		b5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b5.setBounds(80, 600, 300, 50);
        b5.setForeground(Color.RED);
        b5.addActionListener(this);
		p1.add(b5);
       
		ImageIcon backgroundImage = new ImageIcon("E:/MINDCOLOGY/Pics/tata.png");
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
			Page16 p16=new Page16();
			this.setVisible(false);
			p16.setVisible(true);
		}
		else if(ae.getSource()==b4)
		{
			Page1 p1=new Page1();
			this.setVisible(false);
			p1.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			Page13 p13=new Page13();
			this.setVisible(false);
			p13.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			Page14 p14=new Page14();
			this.setVisible(false);
			p14.setVisible(true);
		}
		else if(ae.getSource()==b5)
		{
			Page20 p20=new Page20();
			this.setVisible(false);
			p20.setVisible(true);
		}
	}

    public static void main(String[] args) {
        new Page12();
    }
}

