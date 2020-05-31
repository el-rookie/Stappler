package _LoginAndRegister;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class PanelLessons extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public PanelLessons() {
		setBounds(0,0,828,766);
		setLayout(null);
		setVisible(true);
		Image Schedule = new ImageIcon("/D:/Workspace/Stappler/src/res/Schedule.png").getImage().getScaledInstance(828, 666,Image.SCALE_SMOOTH);
		
		JLabel lblNewLabel = new JLabel("THIS IS LESSONS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setBounds(0, 0, 828, 100);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		JLabel schedule = new JLabel("");
		schedule.setBounds(0, 100, 828, 666);
		schedule.setHorizontalAlignment(SwingConstants.CENTER);
		schedule.setVerticalAlignment(SwingConstants.CENTER);
		schedule.setIcon(new ImageIcon(Schedule));
		this.add(schedule);
				
	}

}
