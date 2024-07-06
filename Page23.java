import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page23 extends JFrame implements ActionListener {
	 JLabel n, l1, pl, arl;
     JTextField ft, lt, et;
     JPasswordField pf;
     JCheckBox cb;
     JButton b1, b2, b3;

    public Page23() {

        super("MINDCOLOGY");
        setSize(1280, 720);
        setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        n = new JLabel("Name:");
		n.setFont(new Font("Serif", Font.PLAIN, 20));
        n.setBounds(370, 100, 150, 30);
        n.setForeground(Color.blue);
        panel.add(n);

		l1 = new JLabel("Email");
        l1.setFont(new Font("Serif", Font.PLAIN, 28));
        l1.setForeground(Color.blue);
        l1.setBounds(370, 200, 150, 30);
        p.add(l1);
		
        pl = new JLabel("Password:");
		pl.setFont(new Font("Serif", Font.PLAIN, 20));
        pl.setBounds(370, 350, 150, 30);
        pl.setForeground(Color.blue);
        panel.add(pl);

        ft = new JTextField();
		ft.setBackground(new Color(255,204,153));
        ft.setBounds(570, 100, 200, 30);
        panel.add(ft);

        et = new JTextField();
		et.setBackground(new Color(255,204,153));
        et.setBounds(570, 200, 200, 30);
        panel.add(et);

        pf = new JPasswordField();
		pf.setBackground(new Color(255,204,153));
        pf.setBounds(570, 350, 200, 30);
        panel.add(pf);

        cb = new JCheckBox("Show Password");
		cb.setFont(new Font("Serif", Font.PLAIN, 20));
		cb.setBounds(570, 400, 200, 40);
		cb.setBackground(new Color(255,204,153));
        cb.setForeground(Color.red);
		cb.addActionListener(this);
        panel.add(cb);

        b1= new JButton("REGISTER");
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b1.setBounds(470, 490, 180, 50);
		b1.setBackground(Color.orange);
		b1.setForeground(Color.red);
        b1.addActionListener(this);
		panel.add(b1);

		arl = new JLabel("Already Registered!");
		arl.setFont(new Font("Serif", Font.PLAIN, 30));
        arl.setBounds(370, 550, 250, 50);    
        arl.setForeground(Color.blue);
		panel.add(arl);

        b2= new JButton("SIGN IN");
        b2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b2.setBounds(650, 550, 150, 50);
		b2.setBackground(Color.orange);
		b2.setForeground(Color.red);
        b2.addActionListener(this);
		panel.add(b2);

		b3 = new JButton("Back");
        b3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        b3.setBounds(950, 580, 130, 40);
		b3.setBackground(Color.white);
		b3.setForeground(Color.red);
        b3.addActionListener(this);
        panel.add(b3);

		ImageIcon backgroundImage = new ImageIcon("E:/MINDCOLOGY/Pics/6.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1280, 720);
        panel.add(backgroundLabel);

        this.add(panel);
		this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {   
		if (ae.getSource() == b1) {
			String s1 = ft.getText();
			String s2 = lt.getText();
			String s3 = et.getText();
			String s4 = new String(pf.getPassword());

			if (s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("")) {
			   JOptionPane.showMessageDialog(this,"Please fill all fields!");
			}
			else {
				JOptionPane.showMessageDialog(this, "Registration Successful!");
				Page3 p3=new Page3();
				this.setVisible(false);
				p3.setVisible(true);
			}
       	}
		else if(ae.getSource() == cb) {
			if (cb.isSelected()) {
				pf.setEchoChar((char) 0);
			} else {
				pf.setEchoChar('#');
			}
		}
    }

    public static void main(String[] args) {
       Page23 p23=new Page23();
	   p23.setVisible(true);
    }
}

//Admin Registration