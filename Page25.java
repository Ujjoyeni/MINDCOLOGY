import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Page25 extends JFrame implements ActionListener {

    private JLabel titleLabel;
    private JLabel imgLabel;
    private ImageIcon img;
    private JLabel nameLabel;
    private JTextField textField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JLabel amountLabel;
    private JTextField amountField;
    private JButton payButton;
    private JButton closeButton;
    private JLabel notificationLabel;
    private JLabel payLabel;


    public Page25() {
        setLayout(null);
		
		img = new ImageIcon (getClass().(getResource("E:/MINDCOLOGY/Pics/bKash.PNG"));
		imgLabel = new JLabel(img);
		imgLabel.setBounds(10,10,1280,720);
		add(imgLabel);

        
        titleLabel = new JLabel("PCash");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setBounds(570, 180, 200, 40);
        add(titleLabel);

        nameLabel = new JLabel("PCash Number:");
        nameLabel.setBounds(450, 270, 100, 40);
        add(nameLabel);

        textField = new JTextField();
        textField.setBounds(560, 270, 200, 40);
        add(textField);

        passwordLabel = new JLabel("OTP:");
        passwordLabel.setBounds(450, 320, 100, 40);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(560, 320, 100, 40);
        add(passwordField);

        amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(450, 370, 70, 40);
        add(amountLabel);

        amountField = new JTextField();
        amountField.setBounds(560, 370, 70, 40);
        add(amountField);
		
		payLabel = new JLabel("Taka");
        payLabel.setBounds(650, 370, 50, 30);
        add(payLabel);

        payButton = new JButton("Pay");
        payButton.setBounds(450, 420, 150, 50);
        payButton.addActionListener(this);
        add(payButton);

        closeButton = new JButton("Close");
        closeButton.setBounds(660, 420, 150, 50);
        closeButton.addActionListener(this);
        add(closeButton);

        notificationLabel = new JLabel();
        notificationLabel.setBounds(450, 470, 310, 30);
        notificationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(notificationLabel);

        setTitle("Payment System");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == payButton) {
            notificationLabel.setText("Payment processed successfully!");
            JOptionPane.showMessageDialog(this, "Payment processed successfully!");
        } else if (e.getSource() == closeButton) {
            textField.setText("");
            passwordField.setText("");
            amountField.setText("");
        }
    }



    public static void main(String[] args) {
        Page25 p25=new Page25();
		p25.setVisible(true);
    }
}