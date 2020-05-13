package _LoginAndRegister;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 100, 629, 356);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(139, 128, 386, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(139, 184, 386, 32);
		contentPane.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginButton.setBounds(139, 245, 169, 46);
		contentPane.add(loginButton);
		
		JButton closeButton = new JButton("Close");
		closeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		closeButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		closeButton.setBounds(356, 245, 169, 46);
		contentPane.add(closeButton);
		
		JLabel username = new JLabel("Username");
		username.setFont(new Font("Tahoma", Font.PLAIN, 15));
		username.setBounds(60, 128, 71, 32);
		contentPane.add(username);
		
		JLabel password = new JLabel("Password");
		password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		password.setBounds(60, 184, 71, 32);
		contentPane.add(password);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(139, 31, 386, 87);
		contentPane.add(lblNewLabel_2);
		
		setUndecorated(true); //removes border
	}
}
