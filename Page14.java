import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page14 extends JFrame implements ActionListener{

    JLabel l1, l2, l3, l4, l5, l6;
	JPanel p1;
	JRadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;
	JButton b1, b2, b3;
	ButtonGroup bg;

    public Page14(){
        super("MINDCOLOGY");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBounds(0, 0, 1280, 720);
		p1.setLayout(null);

		l1 = new JLabel("Self-Assessment Test");
        l1.setFont(new Font("Serif", Font.PLAIN, 70));
        l1.setForeground(new Color(128,0,0));
        l1.setBounds(350, 50, 800, 100);
        p1.add(l1);

		l2 = new JLabel("Have you experienced thoughts of self-harm or suicide?");
        l2.setFont(new Font("Serif", Font.PLAIN, 25));
        l2.setForeground(new Color(102,0,102));
        l2.setBounds(350, 130, 800, 50);
        p1.add(l2);

		rb1 = new JRadioButton("Yes");
        rb1.setFont(new Font("Serif", Font.PLAIN, 25));
        rb1.setBounds(530, 180, 100, 45);
        p1.add(rb1);

		rb2 = new JRadioButton("No");
        rb2.setFont(new Font("Serif", Font.PLAIN, 25));
        rb2.setBounds(640, 180, 100, 45);
        p1.add(rb2);

		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

		l3 = new JLabel("Do you experience frequent panic attacks or intense anxiety?");
        l3.setFont(new Font("Serif", Font.PLAIN, 25));
        l3.setForeground(new Color(102,0,102));
        l3.setBounds(350, 230, 800, 50);
        p1.add(l3);

		rb3 = new JRadioButton("Yes");
        rb3.setFont(new Font("Serif", Font.PLAIN, 25));
        rb3.setBounds(530, 280, 100, 45);
        p1.add(rb3);

		rb4 = new JRadioButton("No");
        rb4.setFont(new Font("Serif", Font.PLAIN, 25));
        rb4.setBounds(640, 280, 100, 45);
        p1.add(rb4);

		bg=new ButtonGroup();
		bg.add(rb3);
		bg.add(rb4);

		l4 = new JLabel("Do you feel constanstly irritable or angry?");
        l4.setFont(new Font("Serif", Font.PLAIN, 25));
        l4.setForeground(new Color(102,0,102));
        l4.setBounds(350, 330, 800, 50);
        p1.add(l4);

		rb5 = new JRadioButton("Yes");
        rb5.setFont(new Font("Serif", Font.PLAIN, 25));
        rb5.setBounds(530, 380, 100, 45);
        p1.add(rb5);

		rb6 = new JRadioButton("No");
        rb6.setFont(new Font("Serif", Font.PLAIN, 25));
        rb6.setBounds(640, 380, 100, 45);
        p1.add(rb6);

		bg=new ButtonGroup();
		bg.add(rb5);
		bg.add(rb6);

		l5 = new JLabel("Do you experience paranoid thoughts or have difficulty trusting others?");
        l5.setFont(new Font("Serif", Font.PLAIN, 25));
        l5.setForeground(new Color(102,0,102));
        l5.setBounds(350, 430, 800, 50);
        p1.add(l5);

		rb7 = new JRadioButton("Yes");
        rb7.setFont(new Font("Serif", Font.PLAIN, 25));
        rb7.setBounds(530, 480, 100, 45);
        p1.add(rb7);

		rb8 = new JRadioButton("No");
        rb8.setFont(new Font("Serif", Font.PLAIN, 25));
        rb8.setBounds(640, 480, 100, 45);
        p1.add(rb8);

		bg=new ButtonGroup();
		bg.add(rb7);
		bg.add(rb8);

		l6 = new JLabel("Do you have difficulty maintaining relationships or social connections?");
        l6.setFont(new Font("Serif", Font.PLAIN, 25));
        l6.setForeground(new Color(102,0,102));
        l6.setBounds(350, 530, 800, 50);
        p1.add(l6);

		rb9 = new JRadioButton("Yes");
        rb9.setFont(new Font("Serif", Font.PLAIN, 25));
        rb9.setBounds(530, 580, 100, 45);
        p1.add(rb9);

		rb10 = new JRadioButton("No");
        rb10.setFont(new Font("Serif", Font.PLAIN, 25));
        rb10.setBounds(640, 580, 100, 45);
        p1.add(rb10);

		bg=new ButtonGroup();
		bg.add(rb9);
		bg.add(rb10);

		b1 = new JButton("Result");
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b1.setBounds(550, 630, 150, 40);
        b1.setForeground(Color.RED);
		b1.setBackground(Color.ORANGE);
        b1.addActionListener(this);
        p1.add(b1);

		b2 = new JButton("Back");
		b2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b2.setBounds(1030, 630, 150, 40);
        b2.setForeground(Color.RED);
        b2.addActionListener(this);
        p1.add(b2);

		b3 = new JButton("More Assessment");
		b3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b3.setBounds(100, 630, 250, 40);
        b3.setForeground(Color.RED);
        b3.addActionListener(this);
        p1.add(b3);

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
			if (rb1.isSelected() || rb3.isSelected() || rb5.isSelected() || rb7.isSelected() || rb9.isSelected()) {
					JOptionPane.showMessageDialog(this, "MINDCOLOGY recommends you to have expert consultancy");
			}
		   else if (rb2.isSelected() || rb4.isSelected() || rb6.isSelected() || rb8.isSelected() || rb10.isSelected()) {
					JOptionPane.showMessageDialog(this, "You are Hale & Hearty");
			}  
        }

		else if(ae.getSource()==b3)
		{
			Page15 p15=new Page15();
			this.setVisible(false);
			p15.setVisible(true);
		}

		else if(ae.getSource()==b2)
		{
			Page12 p12=new Page12();
			this.setVisible(false);
			p12.setVisible(true);
		}
	}

	public static void main(String[] args) {
			new Page14();
	}	
}

