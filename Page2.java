import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page2 extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2,b3, b4, b5;
	JPanel p1,p2,p3;

	public Page2()
	{  
		super("MINDCOLOGY");
		this.setSize(1280,720);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ImageIcon background_image = new ImageIcon("E:/MINDCOLOGY/Pics/MHB.png");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1280,720);
		this.add(background);

		this.setVisible(true);

		p1 = new JPanel();
		p1.setBounds(0,0,1280,150);
		p1.setBackground(new Color(0,0,0,80));
		p1.setLayout(null);
		background.add(p1);

		p2 = new JPanel();
		p2.setSize(400,200);
		p2.setBounds(150,150,500,450);
		p2.setBackground(new Color(255,0,0,60));
		p2.setLayout(null);
		background.add(p2);

		p3 = new JPanel();
		p3.setSize(400,200);
		p3.setBounds(649,150,500,450);
		p3.setBackground(new Color(0,0,255,60));
		p3.setLayout(null);
		background.add(p3);

		l1 = new JLabel("SIGN IN/REGISTER FORM");
		l1.setFont(new Font("Arial Black",Font.BOLD,30));
		l1.setForeground(Color.RED);
		l1.setBounds(425,40,500,100);
		p1.add(l1);;

		l2 = new JLabel("To keep connected with us");
		l2.setFont(new Font("Cascadia Mono",Font.BOLD,21));
		l2.setForeground(Color.BLUE);
		l2.setBounds(100,100,500,100);
		p2.add(l2);

		l3 = new JLabel("please");
		l3.setFont(new Font("Cascadia Mono",Font.BOLD,21));
		l3.setForeground(Color.BLUE);
		l3.setBounds(200,125,500,100);
		p2.add(l3);

		l4 = new JLabel("sign in with your personal info");
		l4.setFont(new Font("Cascadia Mono",Font.BOLD,21));
		l4.setForeground(Color.BLUE);
		l4.setBounds(90,150,500,100);
		p2.add(l4);

		l5 = new JLabel("Hello,Friend!");
		l5.setFont(new Font("Cascadia Mono",Font.BOLD,40));
		l5.setForeground(Color.BLUE);
		l5.setBounds(150,50,300,100);
		p3.add(l5);

		l6 = new JLabel("Enter your details and start journey with us");
		l6.setFont(new Font("Cascadia Mono",Font.BOLD,17));
		l6.setForeground(Color.BLUE);
		l6.setBounds(100,130,500,75);
		p3.add(l6);

		b1 = new JButton("SIGN IN AS AN USER");
		b1.setFont(new Font("CooperBlack",Font.BOLD,18));
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.RED);
		b1.setBounds(150,250,300,60);
		b1.addActionListener(this);
		p2.add(b1);
		
		b5 = new JButton("SIGN IN AS AN ADMIN");
		b5.setFont(new Font("CooperBlack",Font.BOLD,18));
		b5.setBackground(Color.WHITE);
		b5.setForeground(Color.RED);
		b5.setBounds(150,350,300,60);
		b5.addActionListener(this);
		p2.add(b5);

		b2 = new JButton("REGISTER AS AN USER");
		b2.setFont(new Font("CooperBlack",Font.BOLD,18));
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.RED);
		b2.setBounds(130,250,300,60);
		b2.addActionListener(this);
		p3.add(b2);
		
		b4 = new JButton("REGISTER AS AN ADMIN");
		b4.setFont(new Font("CooperBlack",Font.BOLD,18));
		b4.setBackground(Color.WHITE);
		b4.setForeground(Color.RED);
		b4.setBounds(130,350,300,60);
		b4.addActionListener(this);
		p3.add(b4);


		b3 = new JButton("BACK");
		b3.setFont(new Font("CooperBlack",Font.BOLD,18));
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.RED);
		b3.setBounds(600,610,125,60);
		b3.addActionListener(this);
		background.add(b3);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1)
		{
			Page3 p3 = new Page3();
			this.setVisible(false);
			p3.setVisible(true);
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
		else if (ae.getSource() == b4) {
			 Page23 p23=new Page23();
			 this.setVisible(false);
	         p23.setVisible(true);
		}
		else if (ae.getSource() == b5) {
			 Page27 p27=new Page27();
			 this.setVisible(false);
	         p27.setVisible(true);
		}
	}
    public static void main(String[] args)
	{
	     new Page2();
	}
}

