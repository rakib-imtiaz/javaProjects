
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;

public class AdminPortalFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private JButton customerManagementBtn, productManagementBtn, logoutBtn;
	private Container container;

	public AdminPortalFrame() {
		setBackground(new Color(230, 230, 250));
		getContentPane().setBackground(new Color(192, 192, 192));
		initComponents();

	}

	void initComponents() {

		this.frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		this.setBounds(500 , 300, 578, 241);
		this.setTitle("Product Management");
		frame.setResizable(false);

		container = new Container();
		container = this.getContentPane();
		container.setLayout(null);

		customerManagementBtn = new JButton("Customer Management");
		customerManagementBtn.setForeground(SystemColor.text);
		customerManagementBtn.setBackground(SystemColor.activeCaptionText);
		customerManagementBtn.setBounds(31, 49, 225, 39);

		container.add(customerManagementBtn);

		productManagementBtn = new JButton("Product Management");
		productManagementBtn.setForeground(SystemColor.text);
		productManagementBtn.setBackground(SystemColor.textHighlight);
		productManagementBtn.setBounds(328, 49, 208, 39);
		container.add(productManagementBtn);

		logoutBtn = new JButton("Logout");
		logoutBtn.setBackground(new Color(0, 0, 128));
		logoutBtn.setForeground(UIManager.getColor("Button.highlight"));
		logoutBtn.setBounds(208, 150, 154, 39);

		container.add(logoutBtn);
		addActionListner();

	}

	public static void main(String[] args) {
		AdminPortalFrame f = new AdminPortalFrame();
		f.setVisible(true);

	}

	void addActionListner() {
		customerManagementBtn.addActionListener(this);
		productManagementBtn.addActionListener(this);
		logoutBtn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == customerManagementBtn) {
			this.dispose();
			CustomerManagementFrame d = new CustomerManagementFrame();
			d.setVisible(true);

		} else if (e.getSource() == productManagementBtn) {
			this.dispose();
			productModificationFrame s = new productModificationFrame();
			s.setVisible(true);

		} else if (e.getSource() == logoutBtn) {

			this.dispose();
			LoginPortalFrame a = new LoginPortalFrame();
			a.setVisible(true);

		}

	}

}
