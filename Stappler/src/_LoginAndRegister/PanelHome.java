package _LoginAndRegister;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBounds(0, 0, 828, 766);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("THIS IS HOME Your lessons,teams and responsibilities will show here");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 828, 100);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
	}
}
