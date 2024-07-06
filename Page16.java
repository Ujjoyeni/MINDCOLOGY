import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page16 extends JFrame implements ActionListener{

    JLabel l1, l2;
	JPanel p1;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
	JButton b1, b2;

    public Page16(){
        super("MINDCOLOGY");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBounds(0, 0, 1280, 720);
		p1.setLayout(null);

		l1 = new JLabel("Which Type of Mental Health Issue(s)");
        l1.setFont(new Font("Serif", Font.PLAIN, 45));
        l1.setForeground(new Color(102,0,102));
        l1.setBounds(300, 30, 700, 150);
        p1.add(l1);

		l2 = new JLabel("Are You Facing?");
        l2.setFont(new Font("Serif", Font.PLAIN, 45));
        l2.setForeground(new Color(102,0,102));
        l2.setBounds(450, 90, 700, 150);
        p1.add(l2);

		c1 = new JCheckBox("Depression");
        c1.setFont(new Font("Serif", Font.PLAIN, 25));
        c1.setBounds(100, 250, 250, 35);
		c1.setForeground(new Color(128,0,0));
        c1.addActionListener(this);
        p1.add(c1);

		c2 = new JCheckBox("Anxiety");
        c2.setFont(new Font("Serif", Font.PLAIN, 25));
        c2.setBounds(100, 310, 250, 35);
		c2.setForeground(new Color(128,0,0));
        c2.addActionListener(this);
        p1.add(c2);

		c3 = new JCheckBox("Panic");
        c3.setFont(new Font("Serif", Font.PLAIN, 25));
        c3.setBounds(100, 370, 250, 35);
		c3.setForeground(new Color(128,0,0));
        c3.addActionListener(this);
        p1.add(c3);

		c4 = new JCheckBox("Addiction");
        c4.setFont(new Font("Serif", Font.PLAIN,25));
        c4.setBounds(100, 430, 250, 35);
		c4.setForeground(new Color(128,0,0));
        c4.addActionListener(this);
        p1.add(c4);

		c5 = new JCheckBox("Insomnia");
        c5.setFont(new Font("Serif", Font.PLAIN, 25));
        c5.setBounds(100, 490, 250, 35);
		c5.setForeground(new Color(128,0,0));
        c5.addActionListener(this);
        p1.add(c5);

		c6 = new JCheckBox("Phobia");
        c6.setFont(new Font("Serif", Font.PLAIN, 25));
        c6.setBounds(700, 250, 250, 35);
		c6.setForeground(new Color(128,0,0));
        c6.addActionListener(this);
        p1.add(c6);

		c7 = new JCheckBox("Dissociation");
        c7.setFont(new Font("Serif", Font.PLAIN, 25));
        c7.setBounds(700, 310, 250, 35);
		c7.setForeground(new Color(128,0,0));
        c7.addActionListener(this);
        p1.add(c7);

		c8 = new JCheckBox("Personality Disorder");
        c8.setFont(new Font("Serif", Font.PLAIN, 25));
        c8.setBounds(700, 370, 250, 35);
		c8.setForeground(new Color(128,0,0));
        c8.addActionListener(this);
        p1.add(c8);

		c9 = new JCheckBox("Suicidal Tendancy");
        c9.setFont(new Font("Serif", Font.PLAIN, 25));
        c9.setBounds(700, 430, 250, 35);
		c9.setForeground(new Color(128,0,0));
        c9.addActionListener(this);
        p1.add(c9);

		c10 = new JCheckBox("Eating Disorder");
        c10.setFont(new Font("Serif", Font.PLAIN, 25));
        c10.setBounds(700, 490, 250, 35);
		c10.setForeground(new Color(128,0,0));
        c10.addActionListener(this);
        p1.add(c10);

		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b1.setBounds(1030, 630, 150, 40);
        b1.setForeground(Color.RED);
        b1.addActionListener(this);
        p1.add(b1);

		b2 = new JButton("Next");
		b2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b2.setBounds(100, 630, 150, 40);
        b2.setForeground(Color.RED);
        b2.addActionListener(this);
        p1.add(b2);


		ImageIcon backgroundImage = new ImageIcon("E:/MINDCOLOGY/Pics/final.jpg");
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
			Page17 p17=new Page17();
			this.setVisible(false);
			p17.setVisible(true);
		}
	}

	public static void main(String[] args) {
        new Page16();
    }
}

