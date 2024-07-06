import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page26 extends JFrame implements ActionListener {

  private JLabel cardHolderNameLabel, cardNumberLabel, expirationDateLabel, cvvLabel, cardTypeLabel;
  private JTextField cardHolderNameField, cardNumberField, expirationDateField, cvvField;
  private JComboBox<String> cardTypeCombo;
  private JButton submitButton, cancelButton;

  public Page26() {
    super("Mindcology Payment");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(1280, 720));
    setLayout(null);

    JLabel titleLabel = new JLabel("Mindcology Payment");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
    titleLabel.setBounds(450, 20, 400, 50);

    cardHolderNameLabel = new JLabel("Name:");
    cardNumberLabel = new JLabel("Card Number:");
    expirationDateLabel = new JLabel("Expiration Date:");
    cvvLabel = new JLabel("CVV:");
    cardTypeLabel = new JLabel("Card Type:");

    cardHolderNameField = new JTextField();
    cardNumberField = new JTextField();
    expirationDateField = new JTextField();
    cvvField = new JTextField();

    cardTypeCombo = new JComboBox<String>(new String[] { "Visa", "Mastercard" });

    submitButton = new JButton("Submit Payment");
    submitButton.addActionListener(this);

    cancelButton = new JButton("Cancel");
    cancelButton.addActionListener(this);

    Dimension fieldSize = new Dimension(100, 40);
    Font fieldFont = new Font("Arial", Font.PLAIN, 20);
    cardHolderNameField.setBounds(450, 100, 400, 50);
    cardHolderNameField.setFont(fieldFont);
    cardNumberField.setBounds(450, 180, 400, 50);
    cardNumberField.setFont(fieldFont);
    expirationDateField.setBounds(450, 260, 400, 50);
    expirationDateField.setFont(fieldFont);
    cvvField.setBounds(450, 340, 400, 50);
    cvvField.setFont(fieldFont);

    cardHolderNameLabel.setBounds(300, 100, 150, 50);
    cardHolderNameLabel.setFont(fieldFont);
    cardNumberLabel.setBounds(300, 180, 150, 50);
    cardNumberLabel.setFont(fieldFont);
    expirationDateLabel.setBounds(300, 260, 150, 50);
    expirationDateLabel.setFont(fieldFont);
    cvvLabel.setBounds(300, 340, 150, 50);
    cvvLabel.setFont(fieldFont);
    cardTypeLabel.setBounds(300, 420, 150, 50);
    cardTypeLabel.setFont(fieldFont);
    cardTypeCombo.setBounds(450, 420, 400, 50);
    cardTypeCombo.setFont(fieldFont);

    Dimension buttonSize = new Dimension(150, 50);
    Font buttonFont = new Font("Arial", Font.PLAIN, 20);
    submitButton.setBounds(450, 500, 200, 50);
    submitButton.setFont(buttonFont);
    cancelButton.setBounds(650, 500, 150, 50);
    cancelButton.setFont(buttonFont);

    add(titleLabel);
    add(cardHolderNameLabel);
    add(cardNumberLabel);
    add(expirationDateLabel);

    add(cvvLabel);
    add(cardTypeLabel);
    add(cardHolderNameField);
    add(cardNumberField);
    add(expirationDateField);
    add(cvvField);
    add(cardTypeCombo);
    add(submitButton);
    add(cancelButton);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }

  
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submitButton) {
      String cardHolderName = cardHolderNameField.getText();
      String cardNumber = cardNumberField.getText();
      String expirationDate = expirationDateField.getText();
      String cvv = cvvField.getText();
      String cardType = (String) cardTypeCombo.getSelectedItem();
      
      JOptionPane.showMessageDialog(this, "Payment successful!");
    }
  }
  
  public static void main(String[] args) {
    Page26 p26=new Page26();
	p26.setVisible(true);
  }
}
