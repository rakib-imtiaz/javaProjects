
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.SystemColor;

public class productModificationFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private JButton addbtn, editbtn, deletebtn, goBackbtn;
	private Container container;

	public productModificationFrame() {
		getContentPane().setBackground(SystemColor.textInactiveText);
		initComponents();

	}

	void initComponents() {

		this.frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		this.setBounds(550, 150, 310, 321);
		this.setTitle("Product Management");
		frame.setResizable(false);

		container = new Container();
		container = this.getContentPane();
		container.setLayout(null);

		addbtn = new JButton("Add Product");
		addbtn.setBounds(79, 12, 154, 39);

		container.add(addbtn);

		editbtn = new JButton("Edit Product");
		editbtn.setBounds(79, 114, 154, 39);
		container.add(editbtn);

		deletebtn = new JButton("Delete Product");
		deletebtn.setBounds(79, 63, 154, 39);

		container.add(deletebtn);

		goBackbtn = new JButton("Go Back");
		goBackbtn.setBounds(115, 177, 90, 39);
		container.add(goBackbtn);
		addActionListner();

	}

//	public static void main(String[] args) {
//		productModificationFrame f = new productModificationFrame();
//		f.setVisible(true);
//
//	}

	void addActionListner() {
		addbtn.addActionListener(this);
		editbtn.addActionListener(this);
		deletebtn.addActionListener(this);
		goBackbtn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addbtn) {

		} else if (e.getSource() == goBackbtn) {
			this.dispose();
			AdminPortalFrame a = new AdminPortalFrame();
			a.setVisible(true);

		}

	}

}
