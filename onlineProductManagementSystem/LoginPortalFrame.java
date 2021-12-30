
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class LoginPortalFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private Container container;
	private JButton loginAsAdminBtn, loginAsUserBtn, signupUserBtn, goBackbtn;

	public LoginPortalFrame() {
		getContentPane().setBackground(SystemColor.text);
		initialise();
	}

	public void initialise() {
		frame = new JFrame();
		//frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Login Portal");
		setBounds(600, 300, 313, 243);

		Container container = new Container();
		container = this.getContentPane();
		container.setLayout(null);
		loginAsAdminBtn = new JButton("Login As Admin");
		loginAsAdminBtn.setBackground(SystemColor.text);
		loginAsAdminBtn.setBounds(79, 12, 154, 39);
		loginAsAdminBtn.setFont(new Font("Lato Black", Font.BOLD, 12));

		container.add(loginAsAdminBtn);

		loginAsUserBtn = new JButton("Login As User");
		loginAsUserBtn.setBackground(Color.WHITE);
		loginAsUserBtn.setBounds(79, 86, 154, 39);
		
		loginAsUserBtn.setFont(new Font("Lato Black", Font.BOLD, 12));
		container.add(loginAsUserBtn);

		signupUserBtn = new JButton("Sign Up");
		signupUserBtn.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		signupUserBtn.setBackground(Color.WHITE);
		signupUserBtn.setBounds(34, 157, 88, 39);
		signupUserBtn.setFont(new Font("Lato Black", Font.BOLD, 12));

		container.add(signupUserBtn);

		goBackbtn = new JButton("Go Back");
		goBackbtn.setFont(new Font("Lato Black", Font.BOLD, 12));
		goBackbtn.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		goBackbtn.setBackground(Color.WHITE);
//		goBackbtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
		goBackbtn.setBounds(190, 157, 90, 39);
		container.add(goBackbtn);
		
		addActionListener();
	}
	
	public void addActionListener()
	{
		signupUserBtn.addActionListener(this);
		loginAsAdminBtn.addActionListener(this);
		goBackbtn.addActionListener(this);
		loginAsUserBtn.addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==signupUserBtn)
		{
			this.dispose();
			SignUpUserFrame s = new SignUpUserFrame();
			s.setVisible(true);
			
			
		}
		else if(e.getSource()==loginAsUserBtn)
		{
			this.dispose();
			LoginAsUserFrame s = new LoginAsUserFrame();
			s.setVisible(true);
		}
		else if(e.getSource()==loginAsAdminBtn)
		{
			this.dispose();
			LoginAsAdminFrame s;
			try {
				s = new LoginAsAdminFrame();
				s.setVisible(true);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		else if(e.getSource()==goBackbtn)
		{
			this.dispose();
			//needs to add homeframe
		}
		

	}
	
//	 public static void main(String[] args) {
//		
//		 LoginPortalFrame s = new LoginPortalFrame();
//		 s.setVisible(true);
//		 
//	}

}
