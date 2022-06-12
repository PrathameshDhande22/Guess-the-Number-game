

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;

public class instruction extends JFrame {

	/**
	 * Added This Frame to Instruct the User About The game.
	 * @author PRATHAMESH
	 * @version 1.3
	 */
	private static final long serialVersionUID = -3027085566949125705L;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public instruction() {
		setBackground(new Color(255, 255, 255));
		
		setBounds(100, 100, 504, 317);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnEeee = new JTextPane();
		txtpnEeee.setBackground(new Color(144, 238, 144));
		txtpnEeee.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtpnEeee.setText("1. Press ALT+G To guess or Press the Guess button to guess.\r\n2. Press ALT+E to Exit The Game.\r\n3. Press ALT+P To Play the Game Again\r\n4. Press ALT+Q To Quit The Game.\r\n5. Don't Enter Any Alphabet or any Name.\r\n\r\n");
		txtpnEeee.setBounds(10, 92, 468, 109);
		txtpnEeee.setEditable(false);
		contentPane.add(txtpnEeee);
		
		JLabel lblNewLabel = new JLabel("Developed By Prathamesh Dhande");
		lblNewLabel.setBounds(264, 253, 214, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INSTRUCTION");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(177, 24, 207, 38);
		contentPane.add(lblNewLabel_1);
	}
}
