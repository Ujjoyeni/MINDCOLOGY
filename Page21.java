import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page21 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JPasswordField pw;
	JButton b1,b2;
	JCheckBox c1;
	JPanel p1;
	
	public Page21()
	{  
		super("MINDCOLOGY");
		this.setSize(1280,720);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon background_image = new ImageIcon("E:/MINDCOLOGY/Pics/4.png");
		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1280,720);
		this.add(background);
		
		this.setVisible(true);
	
		p1 = new JPanel();
        p1.setBounds(100,80,1050,590);
		p1.setBackground(new Color(0,0,0,80));
        p1.setLayout(null);
		background.add(p1);
	
		l1 = new JLabel("Consultant Registration");
		l1.setFont(new Font("Arial Black",Font.BOLD,30));
		l1.setForeground(new Color(255,102,0));
		l1.setBounds(375,5,500,100);
		background.add(l1);
		
		l2 = new JLabel("Name: ");
		l2.setFont(new Font("Arial Black",Font.BOLD,25));
		l2.setForeground(Color.WHITE);
		l2.setBounds(170,20,600, 100);
		p1.add(l2);
		
		l3 = new JLabel("Your speciality: ");
		l3.setFont(new Font("Arial Black",Font.BOLD,25));
		l3.setForeground(Color.WHITE);
		l3.setBounds(170, 70, 600, 100);
		p1.add(l3);
		
		l4 = new JLabel("Educational qualification: ");
		l4.setFont(new Font("Arial Black",Font.BOLD,25));
		l4.setForeground(Color.WHITE);
		l4.setBounds(170,120,600,100);
		p1.add(l4);
		
		l5 = new JLabel("Years Of Working Experience: ");
		l5.setFont(new Font("Arial Black",Font.BOLD,25));
		l5.setForeground(Color.WHITE);
		l5.setBounds(170,170,600,100);
		p1.add(l5);
		
		l6 = new JLabel("Email address: ");
		l6.setFont(new Font("Arial Black",Font.BOLD,25));
		l6.setForeground(Color.WHITE);
		l6.setBounds(170,220,600,100);
		p1.add(l6);
		
		l7 = new JLabel("Contact number: ");
		l7.setFont(new Font("Arial Black",Font.BOLD,25));
		l7.setForeground(Color.WHITE);
		l7.setBounds(170,270,600,100);
		p1.add(l7);
		
		l8 = new JLabel("Age: ");
		l8.setFont(new Font("Arial Black",Font.BOLD,25));
		l8.setForeground(Color.WHITE);
		l8.setBounds(170,320,500,100);
		p1.add(l8);
		
		l9 = new JLabel("Gender: ");
		l9.setFont(new Font("Arial Black",Font.BOLD,25));
		l9.setForeground(Color.WHITE);
		l9.setBounds(170,370,600,100);
		p1.add(l9);
		
		l10 = new JLabel("Password: ");
		l10.setFont(new Font("Arial Black",Font.BOLD,25));
		l10.setForeground(Color.WHITE);
		l10.setBounds(170,420,600,100);
		p1.add(l10);
		
		pw = new JPasswordField();
        pw.setFont(new Font("Arial Black", Font.PLAIN, 25));
        pw.setBounds(650, 450, 200, 40);
        p1.add(pw);
		
		c1 = new JCheckBox("Show Password");
        c1.setFont(new Font("Arial Black", Font.PLAIN, 15));
        c1.setBounds(650, 500, 200, 30);
		c1.setForeground(Color.BLUE);
        c1.addActionListener(this);
        p1.add(c1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Arial Black",Font.BOLD,20));
		t1.setBounds(650,50, 200, 40);
		p1.add(t1);
		
		t2 = new JTextField();
		t2.setFont(new Font("Arial Black",Font.BOLD,20));
		t2.setBounds(650,100,200, 40);
		p1.add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("Arial Black",Font.BOLD,20));
		t3.setBounds(650,150,200, 40);
		p1.add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("Arial Black",Font.BOLD,20));
		t4.setBounds(650,200,200, 40);
		p1.add(t4);
		
		t5 = new JTextField();
		t5.setFont(new Font("Arial Black",Font.BOLD,20));
		t5.setBounds(650,250,200, 40);
		p1.add(t5);
		
		t6 = new JTextField();
		t6.setFont(new Font("Arial Black",Font.BOLD,20));
		t6.setBounds(650,300,200, 40);
		p1.add(t6);
		
		t7 = new JTextField();
		t7.setFont(new Font("Arial Black",Font.BOLD,20));
		t7.setBounds(650,350,200, 40);
		p1.add(t7);
		
		t8 = new JTextField();
		t8.setFont(new Font("Arial Black",Font.BOLD,20));
		t8.setBounds(650,400,200, 40);
		p1.add(t8);
		
		b1 = new JButton("Register");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		b1.setBackground(new Color(0,255,255));
		b1.setForeground(Color.blue);
		b1.setBounds(430,540,180,40);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("BACK");
		b2.setFont(new Font("CooperBlack",Font.BOLD,15));
		b2.setBackground(Color.white);
		b2.setForeground(Color.RED);
		b2.setBounds(930,540,125,30);
		b2.addActionListener(this);
		p1.add(b2);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			Page1 p1=new Page1();
			this.setVisible(false);
			p1.setVisible(true);
		}
		else if(ae.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this, "Registration Successful!");
		}
		else if (ae.getSource() == c1) {
            if (c1.isSelected()) {
                pw.setEchoChar((char) 0);
            } else {
                pw.setEchoChar('#');
            }
        }
	}
	public static void main(String[] args)
	{
		Page21 p21=new Page21();
		p21.setVisible(true);
	}
 }