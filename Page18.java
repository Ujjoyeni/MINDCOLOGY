import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page18 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1,b2;
	
	public Page18()
	{  
		super("MINDCOLOGY");
		this.setSize(1280,720);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		ImageIcon background_image = new ImageIcon("E:/MINDCOLOGY/Pics/1.png");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(640,330,Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,640,330);
		this.add(background);
		
		
		this.setVisible(true);
		
		ImageIcon background_image2 = new ImageIcon("E:/MINDCOLOGY/Pics/2.png");

		Image img2 = background_image2.getImage();
		Image temp_img2 = img2.getScaledInstance(640,330,Image.SCALE_SMOOTH);
		background_image2 = new ImageIcon(temp_img2);
		JLabel background2 = new JLabel("",background_image2,JLabel.CENTER);
		background2.setBounds(639,0,640,330);
		this.add(background2);
		
		this.setVisible(true);
		
		ImageIcon background_image3 = new ImageIcon("E:/MINDCOLOGY/Pics/3.png");

		Image img3 = background_image3.getImage();
		Image temp_img3 = img3.getScaledInstance(1280,390,Image.SCALE_SMOOTH);
		background_image3 = new ImageIcon(temp_img3);
		JLabel background3 = new JLabel("",background_image3,JLabel.CENTER);
		background3.setBounds(0,330,1280,390);
		this.add(background3);
		
		this.setVisible(true);
		
		l1 = new JLabel("Relationship status?");
		l1.setFont(new Font("Arial Black",Font.PLAIN,16));
		l1.setForeground(Color.WHITE);
		l1.setBounds(50,40,250,40);
		background.add(l1);
		
		String demi[] = {"Single", "Married", "In a relationship", "Divorced", "Recently broke up"  }; 
        JComboBox<String> dropdown = new JComboBox<String>(demi); 
        dropdown.setBounds(50, 90, 300, 30); 
		background.add(dropdown);
		background.setVisible(true);
		
		l2 = new JLabel("Education level?");
		l2.setFont(new Font("Arial Black",Font.PLAIN,16));
		l2.setForeground(Color.WHITE);
		l2.setBounds(50,120,250,40);
		background.add(l2);
		
		String el[] = {"Primary", "Secondary", "Undergraduate", "Graduate"}; 
        JComboBox<String> dropdown1 = new JComboBox<String>(el); 
        dropdown1.setBounds(50, 170, 300, 30); 
		background.add(dropdown1);
		background.setVisible(true);
		
		l3 = new JLabel("Employment status?");
		l3.setFont(new Font("Arial Black",Font.PLAIN,16));
		l3.setForeground(Color.WHITE);
		l3.setBounds(50,200,250,40);
		background.add(l3);
		
		String es[] = {"Student", "Service Holder", "Business", "Self-employed", "Unemployed"  }; 
        JComboBox<String> dropdown2 = new JComboBox<String>(es); 
        dropdown2.setBounds(50, 260, 300, 30); 
		background.add(dropdown2);
		background.setVisible(true);
		
		l4 = new JLabel("Previous mental health diagnosis?");
		l4.setFont(new Font("Arial Black",Font.PLAIN,16));
		l4.setForeground(Color.WHITE);
		l4.setBounds(200,80,330,40);
		background2.add(l4);
		
		String pmhd[] = {"Anxiety Disorders", "Depression", "Bipolar Disorder", "Post-Traumatic Stress Disorder (PTSD)", "Schizophrenia","Eating Disorders","Disruptive behaviour and dissocial disorders", "Neurodevelopmental disorders"  }; 
        JComboBox<String> dropdown3 = new JComboBox<String>(pmhd); 
        dropdown3.setBounds(200, 130, 300, 30); 
		background2.add(dropdown3);
		background2.setVisible(true);
		
		l5 = new JLabel("Current symptoms?");
		l5.setFont(new Font("Arial Black",Font.PLAIN,16));
		l5.setForeground(Color.WHITE);
		l5.setBounds(200,160,250,40);
		background2.add(l5);
		
		String cs[] = {"Depression", "Panicking", "Anxiety", "Stress","Suicidal thoughts"}; 
        JComboBox<String> dropdown4 = new JComboBox<String>(cs); 
        dropdown4.setBounds(200, 210, 300, 30); 
		background2.add(dropdown4);
		background2.setVisible(true);
		
		l6 = new JLabel("Frequency of specific symptoms?");
		l6.setFont(new Font("Arial Black",Font.PLAIN,16));
		l6.setForeground(Color.WHITE);
		l6.setBounds(50,30,300,40);
		background3.add(l6);
		
		String fos[] = {"Loss of appetite", "Fatigue", "Uninterested in socialization"}; 
        JComboBox<String> dropdown5 = new JComboBox<String>(fos); 
        dropdown5.setBounds(50, 80, 300, 30); 
		background3.add(dropdown5);
		background3.setVisible(true);
		
		l7 = new JLabel("How often do you feel sad or hopeless?");
		l7.setFont(new Font("Arial Black",Font.PLAIN,16));
		l7.setForeground(Color.WHITE);
		l7.setBounds(50,110,350,40);
		background3.add(l7);
		
		String ho[] = {"Frequently", "Once in a week", "2-3 times in every month", "I don't feel sad"}; 
        JComboBox<String> dropdown6 = new JComboBox<String>(ho); 
        dropdown6.setBounds(50, 160, 300, 30); 
		background3.add(dropdown6);
		background3.setVisible(true);
		
		l8 = new JLabel("Do you have supportive friends or family members?");
		l8.setFont(new Font("Arial Black",Font.PLAIN,16));
		l8.setForeground(Color.WHITE);
		l8.setBounds(50,190,460,40);
		background3.add(l8);
		
		String sfofm[] = {"Yes", "No" }; 
        JComboBox<String> dropdown7 = new JComboBox<String>(sfofm); 
        dropdown7.setBounds(50, 240, 300, 30); 
		background3.add(dropdown7);
		background3.setVisible(true);
		
		l9 = new JLabel("How do you cope up with sadness?");
		l9.setFont(new Font("Arial Black",Font.PLAIN,16));
		l9.setForeground(Color.WHITE);
		l9.setBounds(850,30,350,40);
		background3.add(l9);
		
		String cm[] = {"Listening to music", "Crying", "Isolating myself from everyone", "Yelling", "Sleeping","Eating","Talking it out with my closed one","Giving a treat to self"}; 
        JComboBox<String> dropdown8 = new JComboBox<String>(cm); 
        dropdown8.setBounds(850, 80, 300, 30); 
		background3.add(dropdown8);
		background3.setVisible(true);
		
		l10 = new JLabel("What do you do from these?");
		l10.setFont(new Font("Arial Black",Font.PLAIN,16));
		l10.setForeground(Color.WHITE);
		l10.setBounds(850,110,350,40);
		background3.add(l10);
		
		String sc[] = {"Yoga", "Breathing exercises", "Walk in the nature", "Going to the places which give me comfort","Nothing"};
        JComboBox<String> dropdown9 = new JComboBox<String>(sc); 
        dropdown9.setBounds(850, 160, 300, 30); 
		background3.add(dropdown9);
		background3.setVisible(true);
		
		b1 = new JButton("SUBMIT");
		b1.setFont(new Font("CooperBlack",Font.BOLD,18));
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.RED);
		b1.setBounds(50,280,125,40);
		b1.addActionListener(this);
		background3.add(b1);
		
		b2 = new JButton("BACK");
		b2.setFont(new Font("CooperBlack",Font.BOLD,18));
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.RED);
		b2.setBounds(1030,280,125,40);
		b2.addActionListener(this);
		background3.add(b2);
		
	   }
	   
       	public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==b2)
			{
				Page17 p17=new Page17();
				this.setVisible(false);
				p17.setVisible(true);
			}
			else if(ae.getSource()==b1)
			{
				Page19 p19=new Page19();
				this.setVisible(false);
				p19.setVisible(true);
			}
	    }
	
		public static void main(String[] args)
		{
		 Page18 p18=new Page18();
		 p18.setVisible(true);
		}
}