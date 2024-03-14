package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class r {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					r window = new r();
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
	public r() {
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
		
		JLabel lblNewLabel = new JLabel("student_register");
		lblNewLabel.setBounds(155, 11, 114, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(37, 54, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("roll");
		lblNewLabel_2.setBounds(37, 92, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("branch");
		lblNewLabel_3.setBounds(37, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("gender");
		lblNewLabel_4.setBounds(37, 150, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("pro");
		lblNewLabel_5.setBounds(37, 188, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(97, 51, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(107, 89, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "ds", "aiml", "it", "EEE"}));
		cb1.setBounds(97, 113, 104, 22);
		frame.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String roll=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender=" ";
		
					
					JOptionPane.showMessageDialog(btnNewButton,"name "+name+"\n rollno "+roll+"\n branch "+branch+"\n gender "+gender);
					

			}
		});
		btnNewButton.setBounds(145, 227, 89, 23);
		frame.getContentPane().add(btnNewButtonz
				
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setBounds(103, 146, 80, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setBounds(210, 146, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("python");
		c1.setBounds(89, 178, 80, 35);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("java");
		c2.setBounds(172, 184, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("c");
		c3.setBounds(278, 184, 97, 23);
		frame.getContentPane().add(c3);
	}

}
