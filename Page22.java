import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page22 extends JFrame implements ActionListener{
    JButton b;
	
    public Page22() {
        super("MINDCOLOGY");
        this.setSize(1280,720);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JCheckBox c1 = new JCheckBox("I am using this software for mental health purposes.");
        c1.setFont(new Font("Arial", Font.PLAIN, 14));
		c1.setBackground(new Color(243,230,209));
        c1.setSize(500, 30);
        c1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (c1.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Thank you for letting us know that you are using this software for mental health purposes.");
                }
            }
        });
        this.add(c1);

        JTextArea termsTextArea = new JTextArea();
        termsTextArea.setEditable(false);
        termsTextArea.setLineWrap(true);
        termsTextArea.setWrapStyleWord(true);
        termsTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
		termsTextArea.setBackground(new Color(243,230,209));
        termsTextArea.setText("TERMS AND CONDITIONS FOR MINDCOLOGY, A USER FRIENDLY MENTAL HEALTH & WELLNESS PLATFORM\n\n"
                + "1. Introduction\n"
                + "Welcome to MINDCOLOGY, a mental health and wellness related platform. These terms and conditions (\"Terms\") govern the use of our platform, including any associated software (\"Software\"). By using MINDCOLOGY, you agree to these Terms.\n\n"
                + "2. License\n"
                + "You are granted a non-exclusive, non-transferable license to use the platform and Software. You may not use the platform or Software for any other purpose without prior written consent from MINDCOLOGY.\n\n"
                + "3. Ownership\n"
                + "The platform and Software are owned by MINDCOLOGY. All intellectual property rights remain with us.\n\n"
                + "4. Restrictions\n"
                + "You may not modify, reverse engineer, decompile, or disassemble the platform or Software. You may not distribute, sublicense, or transfer the platform or Software to any third party without prior written consent from MINDCOLOGY.\n\n"
                + "5. User Conduct\n"
                + "When using MINDCOLOGY, you must not:\n"
                + "- Use the platform or Software for any illegal or unauthorized purpose.\n"
                + "- Post or transmit any content that is unlawful, defamatory, harassing, harmful, or otherwise objectionable.\n"
                + "- Impersonate any person or entity, or falsely state or otherwise misrepresent your affiliation with a person or entity.\n"
                + "- Interfere with or disrupt the operation of the platform or Software or the servers or networks used to make the platform or Software available.\n"
                + "- Engage in any activity that would cause MINDCOLOGY to violate any applicable law, statute, ordinance or regulation.\n\n"
                + "6. Liability\n"
                + "MINDCOLOGY is not liable for any damages or injuries resulting from the use of the platform or Software.\n\n"
                + "By clicking the checkbox above, you acknowledge that you have read and agreed to the Terms.");

        JScrollPane scrollPane = new JScrollPane(termsTextArea);
        scrollPane.setBounds(10, 50, 1250, 600);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane);
		
		b = new JButton("Back");
        b.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b.setBounds(960, 650, 130, 30);
		b.setBackground(Color.white);
		b.setForeground(Color.red);
        b.addActionListener(this);
        this.add(b);
		
		ImageIcon backgroundImage = new ImageIcon("E:/MINDCOLOGY/Pics/p3.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1280, 720);
        this.add(backgroundLabel);
		
        this.setVisible(true);
    }
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b)
		{
			Page4 p4=new Page4();
			this.setVisible(false);
			p4.setVisible(true);
		}
	}

    public static void main(String[] args) {
        Page22 terms=new Page22();
		terms.setVisible(true);
	}
}
