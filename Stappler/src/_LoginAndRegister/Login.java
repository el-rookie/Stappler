package _LoginAndRegister;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login extends JFrame {

	private Image img_logo = new ImageIcon("/D:/Workspace/Stappler/src/res/stappler_logo.png").getImage().getScaledInstance(215, 250,Image.SCALE_SMOOTH);
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel loginMessage = new JLabel("");

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
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals("")) {
					txtUsername.setText("Username");
				}
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtUsername.setBounds(197, 165, 233, 37);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("Password");
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char)0);
		txtPassword.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtPassword.setBounds(197, 212, 233, 37);
		contentPane.add(txtPassword);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBorder(null);
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin123")) {
					loginMessage.setText("");
					JOptionPane.showMessageDialog(null,"Login Successful");
				}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username") || txtPassword.getText().equals("") || txtPassword.getText().equals("password"))
				{
					loginMessage.setText("Please input all requirements!");
				}
				else {
					loginMessage.setText("Invalid Username/Password!");
				}
			}
		});
		loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginButton.setBounds(197, 283, 104, 46);
		contentPane.add(loginButton);
		
		JButton closeButton = new JButton("Close");
		closeButton.setBorder(null);
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
		closeButton.setBounds(315, 283, 115, 46);
		contentPane.add(closeButton);
		
		JLabel username = new JLabel("Username");
		username.setFont(new Font("Tahoma", Font.PLAIN, 15));
		username.setBounds(118, 171, 71, 32);
		contentPane.add(username);
		
		JLabel password = new JLabel("Password");
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		password.setBounds(118, 218, 71, 32);
		contentPane.add(password);
		
		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(8, 28, 613, 145);
		contentPane.add(logo);
		logo.setIcon(new ImageIcon(img_logo));
		
		loginMessage.setFont(new Font("Sitka Text", Font.BOLD, 15));
		loginMessage.setBounds(197, 249, 233, 37);
		contentPane.add(loginMessage);
		setLocationRelativeTo(null);
		
		setUndecorated(true); //removes border
	}
}
