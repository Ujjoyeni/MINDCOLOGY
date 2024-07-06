import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page17 extends JFrame implements ActionListener{

    JLabel l1;
	JPanel p1;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
	JButton b1, b2;

    public Page17(){
        super("MINDCOLOGY");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBounds(0, 0, 1280, 720);
		p1.setLayout(null);

		l1 = new JLabel("What Led You to Seek Consultancy Today?");
        l1.setFont(new Font("Serif", Font.PLAIN, 45));
        l1.setForeground(new Color(102,0,102));
        l1.setBounds(230, 20, 800, 120);
        p1.add(l1);

		c1 = new JCheckBox("I have been feeling depressed");
        c1.setFont(new Font("Serif", Font.PLAIN, 25));
        c1.setBounds(280, 140, 650, 35);
		c1.setBackground(new Color(204,255,255));
		c1.setForeground(new Color(128,0,0));
        c1.addActionListener(this);
        p1.add(c1);

		c2 = new JCheckBox("I feel anxious or overwhelmed");
        c2.setFont(new Font("Serif", Font.PLAIN, 25));
        c2.setBounds(280, 190, 650, 35);
		c2.setForeground(new Color(128,0,0));
		c2.setBackground(new Color(204,255,255));
        c2.addActionListener(this);
        p1.add(c2);

		c3 = new JCheckBox("I struggle with building or maintaining relationships");
        c3.setFont(new Font("Serif", Font.PLAIN, 25));
        c3.setBounds(280, 240, 650, 35);
		c3.setBackground(new Color(204,255,255));
		c3.setForeground(new Color(128,0,0));
        c3.addActionListener(this);
        p1.add(c3);

		c4 = new JCheckBox("I can't find purpose and meaning in my life");
        c4.setFont(new Font("Serif", Font.PLAIN,25));
        c4.setBounds(280, 290, 650, 35);
		c4.setBackground(new Color(204,255,255));
		c4.setForeground(new Color(128,0,0));
        c4.addActionListener(this);
        p1.add(c4);

		c5 = new JCheckBox("I need to talk through a specific challenge");
        c5.setFont(new Font("Serif", Font.PLAIN, 25));
        c5.setBounds(280, 340, 650, 35);
		c5.setBackground(new Color(204,255,255));
		c5.setForeground(new Color(128,0,0));
        c5.addActionListener(this);
        p1.add(c5);

		c6 = new JCheckBox("I have lost interest in activities previously enjoyed");
        c6.setFont(new Font("Serif", Font.PLAIN, 25));
        c6.setBounds(280, 390, 650, 35);
		c6.setBackground(new Color(204,255,255));
		c6.setForeground(new Color(128,0,0));
        c6.addActionListener(this);
        p1.add(c6);

		c7 = new JCheckBox("I am facing difficulty concentrating or making decisions");
        c7.setFont(new Font("Serif", Font.PLAIN, 25));
        c7.setBounds(280, 440, 650, 35);
		c7.setBackground(new Color(204,255,255));
		c7.setForeground(new Color(128,0,0));
        c7.addActionListener(this);
        p1.add(c7);

		c8 = new JCheckBox("I constantly experience irritability or restlessness");
        c8.setFont(new Font("Serif", Font.PLAIN, 25));
        c8.setBounds(280, 490, 650, 35);
		c8.setBackground(new Color(204,255,255));
		c8.setForeground(new Color(128,0,0));
        c8.addActionListener(this);
        p1.add(c8);

		c9 = new JCheckBox("I have been going through trauma or abuse");
        c9.setFont(new Font("Serif", Font.PLAIN, 25));
        c9.setBounds(280, 540, 650, 35);
		c9.setBackground(new Color(204,255,255));
		c9.setForeground(new Color(128,0,0));
        c9.addActionListener(this);
        p1.add(c9);

		c10 = new JCheckBox("I would prefer talking directly to the consultant on the issue");
        c10.setFont(new Font("Serif", Font.PLAIN, 25));
        c10.setBounds(280, 590, 650, 35);
		c10.setBackground(new Color(204,255,255));
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
			Page16 p16=new Page16();
			this.setVisible(false);
			p16.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			Page18 p18=new Page18();
			this.setVisible(false);
			p18.setVisible(true);
		}
	}

	public static void main(String[] args) {
        new Page17();
    }
}

