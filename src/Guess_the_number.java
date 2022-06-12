import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.util.Random;
import java.awt.event.ActionListener;import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;

/**New Update:
 * Added New Instruction Frame when user clicks on help
 * Added Keyboard Shortcut Key to Help User To guess 
 * Removed The Image of Guess the Number 
 * @version 1.3
 * 
 * @author PRATHAMESH
 *
 */
public class Guess_the_number {

	JFrame frmGuessTheNumber;
	JTextField userInput;
	JLabel scorelbl, roundlbl, welcomelbl, resultlbl;
	JButton quit, playagain, guess;
	Random r = new Random();
	JButton btnNewButton_1;
	String name;
	int rand = r.nextInt(100); // declare computer input.
	int count = 0; // declare count or rounds
	int score = 1; // declare score this all works under Guess button when user's click it
	int condition = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guess_the_number window = new Guess_the_number();
					window.frmGuessTheNumber.setVisible(true);
				} catch (Exception e) {
					// e.printStackTrace();

				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Guess_the_number() {
		initialize();
	}

	// this method is called when we presses the button click here to set the
	// username.
	public void name() {
		name = JOptionPane.showInputDialog(null, "Enter Your Name");
		try {
			if (name.isEmpty()) {
				name();
			} else {
				welcomelbl.setText("Welcome " + name);

			}
		} catch (NullPointerException E) {

		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		//frmGuessTheNumber.addWindowListener(new WindowListener);
		frmGuessTheNumber = new JFrame();
		frmGuessTheNumber.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\PRATHAMESH\\OneDrive\\Attachments\\Document\\images (1).jpeg"));
		frmGuessTheNumber.setTitle("Guess The Number Game");
		frmGuessTheNumber.getContentPane().setBackground(new Color(255, 255, 255));
		frmGuessTheNumber.setBackground(new Color(255, 255, 255));
		frmGuessTheNumber.setBounds(100, 100, 672, 445);
		frmGuessTheNumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuessTheNumber.setResizable(false);
		frmGuessTheNumber.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Guess The Number Game");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBounds(239, 11, 212, 21);
		frmGuessTheNumber.getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 29, 636, 2);
		frmGuessTheNumber.getContentPane().add(separator);

		JLabel lblNewLabel_1 = new JLabel("Your Number Should be between 1 to 100");
		lblNewLabel_1.setFont(new Font("Calibri", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(407, 39, 239, 14);
		frmGuessTheNumber.getContentPane().add(lblNewLabel_1);

		userInput = new JTextField();
		userInput.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		userInput.setBounds(546, 72, 86, 38);
		frmGuessTheNumber.getContentPane().add(userInput);
		userInput.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Enter the Number");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(443, 81, 93, 21);
		frmGuessTheNumber.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Score :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 47, 44, 14);
		frmGuessTheNumber.getContentPane().add(lblNewLabel_3);

		scorelbl = new JLabel("");
		scorelbl.setBackground(SystemColor.activeCaption);
		scorelbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scorelbl.setBounds(59, 38, 55, 32);
		frmGuessTheNumber.getContentPane().add(scorelbl);

		JLabel lblNewLabel_5 = new JLabel("Rounds :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(153, 49, 61, 14);
		frmGuessTheNumber.getContentPane().add(lblNewLabel_5);

		roundlbl = new JLabel("");
		roundlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		roundlbl.setBounds(215, 40, 61, 32);
		frmGuessTheNumber.getContentPane().add(roundlbl);

		welcomelbl = new JLabel("Welcome User !!");
		welcomelbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		welcomelbl.setBounds(10, 84, 292, 14);
		frmGuessTheNumber.getContentPane().add(welcomelbl);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(285, 122, 347, 121);
		frmGuessTheNumber.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("Results :");
		lblNewLabel_9.setBounds(10, 11, 62, 14);
		panel.add(lblNewLabel_9);

		resultlbl = new JLabel("");
		resultlbl.setVerticalAlignment(SwingConstants.TOP);
		resultlbl.setBounds(10, 28, 327, 82);
		panel.add(resultlbl);

		guess = new JButton("Guess ");
		guess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int user = Integer.parseInt(userInput.getText());
				System.out.print(rand + "\n");
				count = count + 1;
				condition = condition + 1;
				try {
					if (user >= 100) {
						resultlbl.setText(condition + ". Enter the Number Between 1 to 100");
						count = count - 1;

						score = 0;
					} else if (user < rand) {
						resultlbl.setText(condition + ". Entered Number is Less than Computer Input");
						score = 0;

					} else if (user > rand) {
						resultlbl.setText(condition + ". Entered Number is Greater than Computer Input");
						score = 0;

					} else {
						JOptionPane.showConfirmDialog(null,
								"Congratulations " + name + " You Win in " + count + " Rounds", "Congratulations",
								JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
						resultlbl.setText("Congratulations You win");
						guess.setEnabled(false);
						quit.setEnabled(false);
						userInput.setEditable(false);
						
						score = count * 5;
					}
					roundlbl.setText(count + "");
					scorelbl.setText(score + "");

				} catch (Exception e1) {

				}
			}
		});
		guess.setBackground(new Color(127, 255, 212));
		guess.setFont(new Font("Times New Roman", Font.BOLD, 16));
		guess.setMnemonic('G');
		guess.setBounds(423, 322, 89, 32);
		frmGuessTheNumber.getContentPane().add(guess);

		quit = new JButton("Quit ");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultlbl.setText("Selected Quit Option  The Correct Answer is " + rand);
				userInput.setText(null);
				userInput.setEnabled(false);
				guess.setEnabled(false);
				scorelbl.setText(null);
				roundlbl.setText(null);
				count = 0;
				score = 0;

			}
		});
		quit.setMnemonic('Q');
		quit.setBackground(new Color(127, 255, 212));
		quit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		quit.setBounds(324, 321, 89, 32);
		frmGuessTheNumber.getContentPane().add(quit);

		playagain = new JButton("Play Again");
		playagain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scorelbl.setText(null);
				roundlbl.setText(null);
				count = 0;
				score = 0;
				userInput.setText(null);
				resultlbl.setText(null);
				guess.setEnabled(true);
				userInput.setEnabled(true);
				rand = r.nextInt(100);
				condition = 0;
				quit.setEnabled(true);
				userInput.setEditable(true);
			}

		});
		playagain.setMnemonic('P');
		playagain.setBackground(new Color(127, 255, 212));
		playagain.setFont(new Font("Times New Roman", Font.BOLD, 16));
		playagain.setBounds(522, 322, 110, 32);
		frmGuessTheNumber.getContentPane().add(playagain);

		btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGuessTheNumber.dispose();
				frmGuessTheNumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnNewButton_1.setMnemonic('E');
		btnNewButton_1.setBackground(new Color(127, 255, 212));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(225, 322, 89, 32);
		frmGuessTheNumber.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_4 = new JLabel("Developed By Prathamesh Dhande");
		lblNewLabel_4.setBounds(407, 381, 239, 14);
		frmGuessTheNumber.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Click Here To See The Instruction Of The Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instruction i=new instruction();
				i.setVisible(true);
				i.setResizable(false);
				
			}
		});
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(307, 274, 325, 32);
		frmGuessTheNumber.getContentPane().add(btnNewButton);
		
		frmGuessTheNumber.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				name();
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
