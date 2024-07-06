import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Admin Sign in

public class Page27 extends JFrame //implements ActionListener 
{
    JLabel l1, l2, l3;
    JTextField t;
    JPasswordField pw;
    JButton b1, b2, b3;
    JCheckBox c;
    JPanel p;

    public Page27() {
        super("MINDCOLOGY");
        this.setSize(1280, 720);
		setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        p.setSize(new Dimension(1280, 720));
        p.setLayout(null);

        l1 = new JLabel("Name : ");
        l1.setFont(new Font("Serif", Font.PLAIN, 28));
        l1.setForeground(Color.blue);
        l1.setBounds(450, 200, 200, 50);
        p.add(l1);

        l2 = new JLabel("Password : ");
        l2.setFont(new Font("Serif", Font.PLAIN, 28));
        l2.setForeground(Color.blue);
        l2.setBounds(450, 270, 200, 50);
        p.add(l2);

        t = new JTextField();
        t.setFont(new Font("Serif", Font.PLAIN, 28));
        t.setBounds(650, 200, 200, 50);
        p.add(t);

        pw = new JPasswordField();
        pw.setFont(new Font("Serif", Font.PLAIN, 28));
        pw.setBounds(650, 270, 200, 50);
        p.add(pw);

        b1 = new JButton("SIGN IN");
        b1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b1.setBackground(Color.orange);
        b1.setForeground(Color.red);
        b1.setBounds(550, 400, 150, 50);
        //b1.addActionListener(this);
        p.add(b1);

        c = new JCheckBox("Show Password");
        c.setFont(new Font("Serif", Font.PLAIN, 20));
        c.setBounds(650, 330, 200, 40);
        c.setForeground(Color.red);
        //c.addActionListener(this);
        p.add(c);

        l3 = new JLabel("Not a Member! ");
        l3.setFont(new Font("Serif", Font.PLAIN, 30));
        l3.setForeground(Color.blue);
        l3.setBounds(450, 500, 200, 50);
        p.add(l3);

        b2 = new JButton("Register");
        b2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b2.setBounds(650, 500, 150, 50);
        b2.setBackground(Color.orange);
        b2.setForeground(Color.red);
        //b2.addActionListener(this);
        p.add(b2);

      	b3 = new JButton("Back");
        b3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b3.setBounds(950, 580, 130, 40);
      	b3.setBackground(Color.white);
		b3.setForeground(Color.red);
        //b3.addActionListener(this);
        p.add(b3);

		ImageIcon backgroundImage = new ImageIcon("E:/MINDCOLOGY/Pics/MHB1.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1280, 720);
        p.add(backgroundLabel);

        this.add(p);
        this.setVisible(true);
    }
	

/*
       public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String s1 = t.getText();
            String s2 = new String(pw.getPassword());
            if (s1.equals("") || s2.equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
            }
			else {
                JOptionPane.showMessageDialog(this, "Sign in Successful!");
			    Page12 p12=new Page12();
			    this.setVisible(false);
			    p12.setVisible(true);
            }
        }
        else if (ae.getSource() == c) {
            if (c.isSelected()) {
                pw.setEchoChar((char) 0);
            } else {
                pw.setEchoChar('#');
            }
        }
		else if (ae.getSource() == b2) {
            Page4 p4 = new Page4();
            this.setVisible(false);
            p4.setVisible(true);
        }
		else if (ae.getSource() == b3) {
            Page1 p1 = new Page1();
            this.setVisible(false);
            p1.setVisible(true);
        }
    }*/

    public static void main(String[] args) {
        new Page27();
	}
}

