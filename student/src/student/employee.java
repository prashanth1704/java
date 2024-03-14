package student;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.Sql.Statement;
import java.Sql.DriveManager;
import java.SQLException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;



public class employee {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee window = new employee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Student Details");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_4.setBounds(108, 11, 218, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		JLabel lblNewLabel = new JLabel("ID ");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(79, 78, 46, 25);
		frame.getContentPane().add(lblNewLabel);

		tb1 = new JTextField();
		tb1.setBounds(240, 84, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("NAME ");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(61, 120, 86, 21);
		frame.getContentPane().add(lblNewLabel_1);

		tb2 = new JTextField();
		tb2.setBounds(240, 121, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("BRANCH ");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(61, 152, 109, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Arial Black", Font.BOLD, 16));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE", "DS", "IT", "ECE"}));
		cb1.setBounds(240, 154, 86, 22);
		frame.getContentPane().add(cb1);
		
		
		JLabel lblNewLabel_3 = new JLabel("MARKS ");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3.setBounds(61, 188, 109, 30);
		frame.getContentPane().add(lblNewLabel_3);
	
		tb3 = new JTextField();
		tb3.setBounds(240, 197, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tb1.getText();
				String name=tb2.getText();
				String branch=(String)cb1.getSelectedItem();
				String marks=tb3.getText();
				int m=Integer.parseInt(marks);
				try
				{
					java.sql.Connection con=DriverManager.getConnection
							("jdbc:mysql://localhost:3306/anil","root","mrec");
					String q="insert into students values('"+id+"','"+name+"','"+branch+"','"+m+"')";
							Statement stn=con.createStatement();
					stn.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton,"inserted successfully !!");
				}
				catch (SQLException el)
				{
					el.printStackTrace();
							
				}
			}//jjjjjjjjjjjjjjjjjjjjjjjjjjjj
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton.setBounds(144, 227, 110, 23);
		frame.getContentPane().add(btnNewButton);
	
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\student.jpg"));
		lblNewLabel_5.setBounds(0, 0, 424, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
