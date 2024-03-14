package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registerisation {

	private JFrame frame;
	private JTextField tb2;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerisation window = new registerisation();
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
	public registerisation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 230, 140));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("student_registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(122, 25, 135, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel text = new JLabel("name");
		text.setFont(new Font("Tahoma", Font.BOLD, 12));
		text.setBounds(49, 69, 46, 23);
		frame.getContentPane().add(text);
		
		JLabel text2 = new JLabel("rollno");
		text2.setFont(new Font("Tahoma", Font.BOLD, 12));
		text2.setBounds(49, 98, 56, 14);
		frame.getContentPane().add(text2);
		
		JLabel cbb = new JLabel("branch");
		cbb.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbb.setBounds(49, 123, 46, 14);
		frame.getContentPane().add(cbb);
		
		JLabel cb2 = new JLabel("gender");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 12));
		cb2.setBounds(49, 158, 46, 14);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_5 = new JLabel("prog_lang");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(49, 200, 88, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String roll=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton,"name "+name+"\n rollno "+roll);

							}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(149, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextField tb1 = new JTextField();
		tb1.setBounds(132, 71, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(142, 96, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		r1.setBounds(149, 157, 56, 19);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		r2.setBounds(237, 159, 66, 14);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("python");
		c1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		c1.setBounds(122, 196, 79, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("java");
		c2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		c2.setBounds(209, 196, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("c");
		c3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		c3.setBounds(309, 196, 97, 23);
		frame.getContentPane().add(c3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		cb1.setToolTipText("");
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "DS", "AIML", "IT", "EEE", "CIVIL"}));
		cb1.setBounds(132, 123, 86, 22);
		frame.getContentPane().add(cb1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 155, 86, 23);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(228, 155, 82, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
