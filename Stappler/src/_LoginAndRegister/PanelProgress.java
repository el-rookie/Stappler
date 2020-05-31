package _LoginAndRegister;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelProgress extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelProgress() {
		setBounds(0,0,828,766);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("THIS IS PROGRESS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setBounds(0, 0, 828, 100);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
	}

}
