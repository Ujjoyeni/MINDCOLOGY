import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.*;

public class Page20 extends JFrame implements ActionListener 
{

    private JTable expertsTable;
	private JButton b1;
	private JLabel l1;
	private JPanel p1;

    public Page20() {
        setTitle("MINDCOLOGY");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
        p1.setBounds(0, 0, 1280, 720);
		p1.setLayout(null);

        String[] columnNames = {"Name", "Speciality", "Degree", "Years of Experience"};
        Object[][] data = {
            {"Dr. Antarta Roy", "Clinical Psychology", "Ph.D.", "15"},
            {"Dr. Saif Ibna Karim", "Child and Adolescent Psychiatry", "M.D.", "10"},
            {"Dr. Rana Alam", "Addiction Psychiatry", "M.D.", "12"},
            {"Dr. Asif Sikder", "Neuropsychology", "Psy.D.", "8"},
            {"Dr. Liza Rahman", "Geriatric Psychiatry", "M.D.", "5"},
            {"Dr. Kanika Islam", "Clinical Psychology", "Ph.D.", "20"},
            {"Dr. Sumon Chakrabarthy", "Child and Adolescent Psychiatry", "M.D.", "7"},
            {"Dr. Jamal Sorder", "Addiction Psychiatry", "M.D.", "18"},
            {"Dr. Neela Hasan", "Neuropsychology", "Ph.D.", "10"},
            {"Dr. Jasmin Jenny", "Geriatric Psychiatry", "M.D.", "13"},
            {"Dr. Magdalin Rosario ", "Clinical Psychology", "Ph.D.", "8"},
            {"Dr. Nibir Hossain", "Child and Adolescent Psychiatry", "M.D.", "15"},
            {"Dr. Sarah Karim", "Addiction Psychiatry", "M.D.", "5"},
            {"Dr. William Kim", "Neuropsychology", "Ph.D.", "12"},
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        expertsTable = new JTable(model);
		
		expertsTable.setBackground(new Color(243,230,209));

        expertsTable.setRowHeight(40);

        TableColumnModel columnModel = expertsTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(300);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(150);

        JScrollPane scrollPane = new JScrollPane(expertsTable);
        scrollPane.setPreferredSize(new Dimension(1280, 620));

        scrollPane.setBounds(0, 50, 1280, 540);
		p1.add(scrollPane);

        JLabel headerLabel = new JLabel("The Experts working with MINDCOLOGY", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
		headerLabel.setForeground(new Color(102,0,102));
        add(headerLabel, BorderLayout.NORTH);
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        b1.setBounds(1030, 600, 150, 40);
        b1.setForeground(Color.RED);
        b1.addActionListener(this);
        p1.add(b1);

		ImageIcon backgroundImage = new ImageIcon("E:/MINDCOLOGY/Pics/p3.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1280, 720);
        p1.add(backgroundLabel);
		
		add(p1);
        setVisible(true);
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Page12 p12=new Page12();
			this.setVisible(false);
			p12.setVisible(true);
		}
	}

    public static void main(String[] args) {
        Page20 p20=new Page20();
		p20.setVisible(true);
    }
}

