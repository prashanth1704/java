package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class login {

	private JFrame frame;
	private JPasswordField p1;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("elicpse");
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(0, 51, 51));
		frame.getContentPane().setBackground(new Color(102, 153, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("login");
		lblNewLabel.setForeground(new Color(0, 51, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(178, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		p1 = new JPasswordField();
		p1.setToolTipText("");
		p1.setBounds(155, 154, 109, 20);
		frame.getContentPane().add(p1);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		tb1.setBounds(155, 102, 109, 20);                                                 
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=tb1.getText();
				String Password=p1.getText();
				//JOptionPane.showMessageDialog(btnNewButton,"name "+Name+"\n password "+Password);
				if (Name.equals("raj")&& Password.equals("123"))
				{
					JOptionPane.showMessageDialog(btnNewButton,"valid user");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"invalid user");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnNewButton.setBounds(175, 200, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(96, 103, 78, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(67, 157, 78, 14);
		frame.getContentPane().add(lblNewLabel_2);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{p1, tb1, btnNewButton, lblNewLabel_1, lblNewLabel_2, lblNewLabel}));
	}
}
