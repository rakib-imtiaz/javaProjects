
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginAsUserFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private JLabel userIDLabel, userPassLabel;
	private JTextField userField;
	private JPasswordField userPassField;
	private JButton loginButton, backButton, signUpButton;
	private Container container;
	private JTextField textField;

	public LoginAsUserFrame() {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);

		initializeComponents();

	}

	void initializeComponents() {

		frame = new JFrame();
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("LOGIN AS USER");
		setBounds(600, 300, 400, 255);

		Container container = new Container();
		container = this.getContentPane();
		container.setLayout(null);

		userIDLabel = new JLabel("Enter ID :");
		userIDLabel.setBounds(61, 12, 85, 21);
		container.add(userIDLabel);

		userField = new JTextField();
		userField.setBounds(213, 12, 137, 21);
		container.add(userField);

		userPassLabel = new JLabel("Enter Password :");
		userPassLabel.setBounds(61, 50, 134, 21);
		container.add(userPassLabel);

		userPassField = new JPasswordField();
		userPassField.setBounds(213, 50, 137, 21);
		container.add(userPassField);

		loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		loginButton.setBackground(UIManager.getColor("List.dropLineColor"));
		loginButton.setBounds(256, 95, 94, 31);
		loginButton.setFont(new Font("Lato Black", Font.BOLD, 12));
		container.add(loginButton);

		backButton = new JButton("Go Back");
		backButton.setFont(new Font("Lato Black", Font.BOLD, 12));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		backButton.setBounds(61, 95, 94, 31);
		container.add(backButton);

		signUpButton = new JButton("Sign Up");
		signUpButton.setFont(new Font("Lato Black", Font.BOLD, 12));
		signUpButton.setBounds(152, 174, 94, 31);
		getContentPane().add(signUpButton);

		frame.setVisible(true);
		addActionListener();

	}
//
//	public static void main(String[] args) {
//		LoginAsUserFrame f = new LoginAsUserFrame();
//		f.setVisible(true);
//
//	}

	public void addActionListener() {
		loginButton.addActionListener(this);
		backButton.addActionListener(this);
		signUpButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginButton) {
			this.dispose();
			SignUpUserFrame s = new SignUpUserFrame();

		} else if (e.getSource() == signUpButton) {
			this.dispose();
			LoginAsUserFrame s = new LoginAsUserFrame();
			s.setVisible(true);
		}

		else if (e.getSource() == backButton) {
			this.dispose();
			LoginPortalFrame f = new LoginPortalFrame();
			f.setVisible(true);
			// needs to add homeframe
		}

	}
}
