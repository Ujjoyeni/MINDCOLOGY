import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page4 extends JFrame implements ActionListener {
	 JLabel fl, ll, el, dl, gl, pl, arl;
     JTextField ft, lt, et;
     JComboBox<String> combo, monthComboBox, yearComboBox;
     JRadioButton rb1, rb2;
     JPasswordField pf;
     JCheckBox cb, cb1;
     JButton b1, b2, b3, b4;
     ButtonGroup bg;

    public Page4() {

        super("MINDCOLOGY");
        setSize(1280, 720);
        setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        fl = new JLabel("First Name:");
		fl.setFont(new Font("Serif", Font.PLAIN, 20));
        fl.setBounds(370, 100, 150, 30);
        fl.setForeground(Color.blue);
        panel.add(fl);

        ll = new JLabel("Last Name:");
		ll.setFont(new Font("Serif", Font.PLAIN, 20));
        ll.setBounds(370, 150, 150, 30);
        ll.setForeground(Color.blue);
        panel.add(ll);

        el = new JLabel("Email:");
		el.setFont(new Font("Serif", Font.PLAIN, 20));
        el.setBounds(370, 200, 150, 30);
        el.setForeground(Color.blue);
        panel.add(el);

        dl = new JLabel("Date of Birth:");
		dl.setFont(new Font("Serif", Font.PLAIN, 20));
        dl.setBounds(370, 250, 150, 30);
        dl.setForeground(Color.blue);
        panel.add(dl);

        gl = new JLabel("Gender:");
		gl.setFont(new Font("Serif", Font.PLAIN, 20));
        gl.setBounds(370, 300, 150, 30);
        gl.setForeground(Color.blue);
        panel.add(gl);

        pl = new JLabel("Password:");
		pl.setFont(new Font("Serif", Font.PLAIN, 20));
        pl.setBounds(370, 350, 150, 30);
        pl.setForeground(Color.blue);
        panel.add(pl);

        ft = new JTextField();
		ft.setBackground(new Color(255,204,153));
        ft.setBounds(570, 100, 200, 30);
        panel.add(ft);

        lt = new JTextField();
		lt.setBackground(new Color(255,204,153));
        lt.setBounds(570, 150, 200, 30);
        panel.add(lt);

        et = new JTextField();
		et.setBackground(new Color(255,204,153));
        et.setBounds(570, 200, 200, 30);
        panel.add(et);

        JComboBox<String> combo = new JComboBox<>();
        combo.setBackground(new Color(255,204,153));
		combo.setBounds(570, 250, 100, 30);
        combo.addItem("Select Date");
        for (int i = 1; i <= 31; i++) {
            combo.addItem(Integer.toString(i));
        }
		panel.add(combo);

		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        monthComboBox = new JComboBox<>(months);
		monthComboBox.setBackground(new Color(255,204,153));
		monthComboBox.setBounds(690, 250, 100, 30);
        panel.add(monthComboBox);

        String[] years = new String[100];
        for (int i = 0; i < 100; i++) {
            years[i] = Integer.toString(2023 - i);
        }
		yearComboBox = new JComboBox<>(years);
		yearComboBox.setBackground(new Color(255,204,153));
        yearComboBox.setBounds(810, 250, 100, 30);

		panel.add(yearComboBox);
       
        rb1 = new JRadioButton("Male");
		rb1.setBackground(new Color(255,204,153));
        rb1.setBounds(570, 300, 100, 30);
        panel.add(rb1);

        rb2 = new JRadioButton("Female");
		rb2.setBackground(new Color(255,204,153));
        rb2.setBounds(690, 300, 100, 30);
        panel.add(rb2);

		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

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
		
		cb1 = new JCheckBox("I agree to the ");
		cb1.setFont(new Font("Serif", Font.PLAIN, 15));
		cb1.setBounds(420, 450, 120, 20);
		cb1.setBackground(new Color(255,204,153));
        cb1.setForeground(Color.black);
		cb1.addActionListener(this);
        panel.add(cb1);

		
		b4 = new JButton("Terms & Conditions");
		b4.setBorderPainted(false);
        b4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        b4.setBounds(540, 450, 230, 20);
		b4.setBackground(new Color(255,204,153));
		b4.setForeground(Color.red);
        b4.addActionListener(this);
        panel.add(b4);


		ImageIcon backgroundImage = new ImageIcon("E:/MINDCOLOGY/Pics/MHB2.png");
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
			if (cb1.isSelected()) {
					JOptionPane.showMessageDialog(this, "MINDCOLOGY recommends you to have expert consultancy");
			}
		   else{
			   JOptionPane.showMessageDialog(this, "You are Hale & Hearty");
			}
       	}
		else if(ae.getSource() == cb) {
			if (cb.isSelected()) {
				pf.setEchoChar((char) 0);
			} else {
				pf.setEchoChar('#');
			}
		}
		else if (ae.getSource() == b2) {
            Page3 p3 = new Page3();
            this.setVisible(false);
            p3.setVisible(true);
        }
		else if (ae.getSource() == b3) {
            Page1 p1 = new Page1();
            this.setVisible(false);
            p1.setVisible(true);
        }
		else if (ae.getSource() == b4) {
            Page22 terms = new Page22();
            this.setVisible(false);
            terms.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Page4();
    }
}