import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page1 extends JFrame implements ActionListener{

    private JPanel p1;
    private JButton b1, b2, b3;

    public Page1(){
        super("MINDCOLOGY");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBounds(0, 0, 1280, 720);
        p1.setLayout(null);

        b1 = new JButton("Need Assistance?");
        b1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b1.setBounds(50, 500, 290, 50);
        b1.setBackground(new Color(243,230,209));
		b1.setForeground(Color.BLACK);
        b1.setLayout(null);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Let's Explore");
        b2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		b2.setBounds(460, 500, 260, 50);
        b2.setBackground(new Color(243,230,209));
		b2.setForeground(Color.BLACK);
        b2.setLayout(null);
        b2.addActionListener(this);
        p1.add(b2);
       
	    b3= new JButton("Apply as a Consultant");
        b3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b3.setBounds(250, 600, 360, 50);
		b3.setBackground(new Color(243,230,209));
        b3.setForeground(Color.BLACK);
        b3.setLayout(null);
        b3.addActionListener(this);
        p1.add(b3);
	   
        ImageIcon backgroundImage = new ImageIcon("E:/MINDCOLOGY/Pics/MH.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1280, 720);
        p1.add(backgroundLabel);

        add(p1);
        this.setVisible(true);
    }

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Page2 p2=new Page2();
			this.setVisible(false);
			p2.setVisible(true);
		}
		else if(ae.getSource()==b2)	{
			Page5 p5=new Page5();
			this.setVisible(false);
			p5.setVisible(true);
		}
		else if(ae.getSource()==b3)	{
			Page21 p21=new Page21();
			this.setVisible(false);
			p21.setVisible(true);
		}
    }

    public static void main(String[] args) {
     	new Page1();
	}
}