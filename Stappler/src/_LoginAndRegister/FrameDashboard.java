package _LoginAndRegister;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FrameDashboard extends JFrame {

	private JPanel contentPane;

	private Image logo_icon = new ImageIcon("/D:/Workspace/Stappler/src/res/stappler_logo.png").getImage().getScaledInstance(215, 250,Image.SCALE_SMOOTH);
	
	private PanelHome panelHome;
	private PanelMyTeams panelMyTeams;
	private PanelLessons panelLessons;
	private PanelSocial panelSocial;
	private PanelProgress panelProgress;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDashboard frame = new FrameDashboard();
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
	public FrameDashboard() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		panelHome = new PanelHome();
		panelHome.setBounds(0, 0, 828, 766);
		panelMyTeams = new PanelMyTeams();
		panelLessons = new PanelLessons();
		panelLessons.setLocation(0, 0);
		panelLessons.setSize(828, 766);
		panelSocial = new PanelSocial();
		panelProgress = new PanelProgress();
		
		JLabel Exit = new JLabel("X");
		Exit.setHorizontalAlignment(SwingConstants.CENTER);
		Exit.setForeground(Color.white);
		Exit.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		Exit.setBounds(1180, 0, 20, 20);
		Exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0){
					FrameDashboard.this.dispose();
				}
			}
		});
		contentPane.add(Exit);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(230, 230, 250));
		panelMenu.setBounds(0, 0, 356, 800);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel icon = new JLabel("");
		icon.setHorizontalAlignment(SwingConstants.CENTER);
		icon.setBounds(0, 42, 356, 182);
		icon.setIcon(new ImageIcon(logo_icon));
		panelMenu.add(icon);
		
		JPanel Lessons = new JPanel();
		Lessons.addMouseListener(new PanelButtonMouseAdapter(Lessons){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelLessons);
			}
		});
		Lessons.setBackground(new Color(224, 255, 255));
		Lessons.setBounds(0, 320, 356, 55);
		panelMenu.add(Lessons);
		Lessons.setLayout(null);
		
		JLabel lblLessons = new JLabel("Lessons");
		lblLessons.setHorizontalAlignment(SwingConstants.CENTER);
		lblLessons.setFont(new Font("Consolas", Font.BOLD, 18));
		lblLessons.setBounds(70, 10, 204, 35);
		Lessons.add(lblLessons);
		
		JPanel Home = new JPanel();
		Home.addMouseListener(new PanelButtonMouseAdapter(Home) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		Home.setBackground(new Color(224, 255, 255));
		Home.setBounds(0, 265, 356, 55);
		panelMenu.add(Home);
		Home.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home Menu");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(70, 10, 204, 35);
		Home.add(lblNewLabel);
		
		JPanel Teams = new JPanel();
		Teams.addMouseListener(new PanelButtonMouseAdapter(Teams){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelMyTeams);
			}
		});
		Teams.setBackground(new Color(224, 255, 255));
		Teams.setBounds(0, 375, 356, 55);
		panelMenu.add(Teams);
		Teams.setLayout(null);
		
		JLabel lblMyTeams = new JLabel("My Teams");
		lblMyTeams.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyTeams.setFont(new Font("Consolas", Font.BOLD, 18));
		lblMyTeams.setBounds(68, 10, 204, 35);
		Teams.add(lblMyTeams);
		
		JPanel Social = new JPanel();
		Social.addMouseListener(new PanelButtonMouseAdapter(Social){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelSocial);
			}
		});
		Social.setBackground(new Color(224, 255, 255));
		Social.setBounds(0, 429, 356, 55);
		panelMenu.add(Social);
		Social.setLayout(null);
		
		JLabel lblSocial = new JLabel("Social");
		lblSocial.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocial.setFont(new Font("Consolas", Font.BOLD, 18));
		lblSocial.setBounds(70, 10, 204, 35);
		Social.add(lblSocial);
		
		JPanel Progress = new JPanel();
		Progress.addMouseListener(new PanelButtonMouseAdapter(Progress){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelProgress);
			}
		});
		Progress.setBackground(new Color(224, 255, 255));
		Progress.setBounds(0, 483, 356, 55);
		panelMenu.add(Progress);
		Progress.setLayout(null);
		
		JLabel lblMyprogress = new JLabel("MyProgress");
		lblMyprogress.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyprogress.setFont(new Font("Consolas", Font.BOLD, 18));
		lblMyprogress.setBounds(65, 10, 204, 35);
		Progress.add(lblMyprogress);
		
		JPanel SignOut = new JPanel();
		SignOut.addMouseListener(new PanelButtonMouseAdapter(SignOut){
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?") == 0) {
					Login login  = new Login();
					login.show();
					FrameDashboard.this.dispose();
				}	
			}
		});
		SignOut.setBackground(new Color(224, 255, 255));
		SignOut.setBounds(0, 666, 356, 55);
		panelMenu.add(SignOut);
		SignOut.setLayout(null);
		
		JLabel lblSignOut = new JLabel("Sign Out");
		lblSignOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignOut.setFont(new Font("Consolas", Font.BOLD, 18));
		lblSignOut.setBounds(64, 10, 204, 35);
		SignOut.add(lblSignOut);
		
		JPanel MainContent = new JPanel();
		MainContent.setBounds(364, 24, 828, 766);
		contentPane.add(MainContent);
		MainContent.setLayout(null);
		
		MainContent.add(panelHome);
		MainContent.add(panelMyTeams);
		MainContent.add(panelLessons);
		panelLessons.setLayout(null);
		MainContent.add(panelSocial);
		MainContent.add(panelProgress);
		
		menuClicked(panelHome);
	}
	
	public void menuClicked(JPanel panel) {
		panelHome.setVisible(false);
		panelMyTeams.setVisible(false);
		panelLessons.setVisible(false);
		panelSocial.setVisible(false);
		panelProgress.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(224,255,255));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(224,255,255));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
	}
}
