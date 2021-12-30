
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SignUpUserFrame extends JFrame implements ActionListener {
	private Container c;
	private JLabel nameLabel, genderLabel, ageLabel, addressLabel, emailLabel, numberLabel, lb10;
	private JTextField nameField, ageField, addressField, emailfield, numberField;
	private Font f1, f2;
	private JRadioButton malebtn, femalebtn;
	private JButton cancelbtn;
	private ButtonGroup grp;
	private JTextField form_text;
	private JButton submitbtn_1;

	String filename;
	File file = new File("./src/Data_Files/UserDirectory");
	File file3 = new File("./src/Data_Files/UserDirectory/allinfo.txt");

	SignUpUserFrame() {
		initcomponent();

	}

	public void initcomponent() {
		file.mkdir();
		// this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(255, 155, 456, 533);

		c = this.getContentPane();
		c.setBackground(UIManager.getColor("MenuItem.acceleratorForeground"));
		c.setLayout(null);

		this.setTitle("Donar form");
		f1 = new Font("Arial", Font.BOLD, 20);

		nameLabel = new JLabel();
		nameLabel.setText("Customer Name");
		nameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel.setForeground(Color.white);
		nameLabel.setBounds(12, 12, 118, 100);
		c.add(nameLabel);

		genderLabel = new JLabel();
		genderLabel.setText("Gender");
		genderLabel.setForeground(Color.white);
		genderLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		genderLabel.setBounds(12, 52, 150, 100);
		c.add(genderLabel);

		ageLabel = new JLabel();
		ageLabel.setText("Age");
		ageLabel.setForeground(Color.white);
		ageLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel.setBounds(12, 92, 100, 100);
		c.add(ageLabel);

		addressLabel = new JLabel();
		addressLabel.setText("Address");
		addressLabel.setForeground(Color.white);
		addressLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		addressLabel.setBounds(12, 132, 100, 100);
		c.add(addressLabel);

		emailLabel = new JLabel();
		emailLabel.setText("Email");
		emailLabel.setForeground(Color.white);
		emailLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		emailLabel.setBounds(12, 172, 100, 100);
		c.add(emailLabel);

		numberLabel = new JLabel();
		numberLabel.setText("Phone no");
		numberLabel.setForeground(Color.white);
		numberLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		numberLabel.setBounds(12, 220, 100, 100);
		c.add(numberLabel);

		f2 = new Font("Arial", Font.CENTER_BASELINE, 15);

		nameField = new JTextField();
		nameField.setFont(f2);
		nameField.setBounds(166, 47, 218, 25);
		c.add(nameField);

		ageField = new JTextField();
		ageField.setFont(f2);
		ageField.setBounds(166, 127, 65, 25);
		c.add(ageField);

		addressField = new JTextField();
		addressField.setFont(f2);
		addressField.setBounds(166, 167, 218, 25);
		c.add(addressField);

		emailfield = new JTextField();
		emailfield.setFont(f2);
		emailfield.setBounds(166, 207, 218, 25);
		c.add(emailfield);

		numberField = new JTextField();
		numberField.setText("+880");
		numberField.setFont(f2);
		numberField.setBounds(166, 255, 218, 25);
		c.add(numberField);

		malebtn = new JRadioButton("Male");
		malebtn.setBounds(176, 82, 65, 30);
		malebtn.setForeground(Color.WHITE);
		malebtn.setBackground(UIManager.getColor("Menu.selectionBackground"));
		c.add(malebtn);

		femalebtn = new JRadioButton("Female");
		femalebtn.setBounds(276, 82, 100, 30);
		femalebtn.setForeground(Color.WHITE);
		femalebtn.setBackground(UIManager.getColor("Menu.selectionBackground"));
		c.add(femalebtn);

		grp = new ButtonGroup();
		grp.add(malebtn);
		grp.add(femalebtn);

		cancelbtn = new JButton("Cancel");
		cancelbtn.setFont(new Font("Dialog", Font.BOLD, 17));
		cancelbtn.setForeground(new Color(255, 250, 250));
		cancelbtn.setBackground(new Color(0, 0, 128));
//		cancelbtn.addActionListener(new ActionListener() {
//			
//			}
//		});
		cancelbtn.setBounds(294, 310, 100, 25);
		getContentPane().add(cancelbtn);

		form_text = new JTextField();
		form_text.setFont(new Font("Dialog", Font.PLAIN, 20));
		form_text.setForeground(new Color(248, 248, 255));
		form_text.setBackground(UIManager.getColor("MenuItem.acceleratorForeground"));
		form_text.setText("Sign Up User");
		form_text.setBounds(148, 0, 150, 35);
		getContentPane().add(form_text);
		form_text.setColumns(10);
		form_text.setBorder(null);

		submitbtn_1 = new JButton("Submit");
		submitbtn_1.setFont(new Font("Dialog", Font.BOLD, 17));
		submitbtn_1.setForeground(new Color(255, 250, 250));
		submitbtn_1.setBackground(SystemColor.activeCaption);
		submitbtn_1.setBounds(166, 310, 100, 25);
		getContentPane().add(submitbtn_1);
		addActionEvent();

	}

	public void addActionEvent() {
		submitbtn_1.addActionListener(this);
		cancelbtn.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == submitbtn_1) {
			if ((nameField.getText().isEmpty()) || (ageField.getText().isEmpty()) || (addressField.getText().isEmpty())
					|| (emailfield.getText().isEmpty()) || (numberField.getText().isEmpty())) {
				JOptionPane.showMessageDialog(null, "Field Cant Be Empty!", "WARNING", JOptionPane.WARNING_MESSAGE);

			} else {

				boolean flag = true;
				String password = null;
				while (flag) {
					password = JOptionPane.showInputDialog(null, "Create your password",
							JOptionPane.INFORMATION_MESSAGE);
					String passAttempt2 = JOptionPane.showInputDialog(null, "Confirm your password",
							JOptionPane.INFORMATION_MESSAGE);
					if (password.equals(passAttempt2)) {
						JOptionPane.showMessageDialog(null, "Password saved successfully!", "Password Verificartion",
								JOptionPane.DEFAULT_OPTION);
						flag = false;

					} else {
						JOptionPane.showMessageDialog(null, "Password Didnt Matched!", "Error",
								JOptionPane.ERROR_MESSAGE);
						continue;
					}

				}

				try {

					FileWriter file = new FileWriter(this.file.getAbsolutePath() + "/" + emailfield.getText() + ".txt");
					FileWriter file2 = new FileWriter(
							this.file.getAbsolutePath() + "/" + emailfield.getText() + ".txt.info.txt");

					filename = file2.toString();

					BufferedWriter write = new BufferedWriter(file);

					BufferedWriter write2 = new BufferedWriter(file2);

					write.append(emailfield.getText() + ",");
					write.append(password + ",");
					write.close();

					write2.append(nameField.getText() + ",");
					if (malebtn.isSelected()) {
						write2.append("male,");
					} else {
						write2.append("Female,");

					}
					write2.append(ageField.getText() + ",");
					write2.append(addressField.getText() + ",");
					write2.append(numberField.getText() + "\n");
					write2.close();

					BufferedWriter write3 = new BufferedWriter(new FileWriter(file3, true));
					// write3.

					// write3.append(emailfield.getText() + ",");
					// write3.append(password + ",");

					write3.append(nameField.getText() + ",");
					if (malebtn.isSelected()) {
						write3.append("male,");
					} else {
						write3.append("Female,");

					}
					write3.append(ageField.getText() + ",");
					write3.append(addressField.getText() + ",");
					write3.append(numberField.getText() + "\n");
					write3.close();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				JOptionPane.showMessageDialog(null, "Donor Registration Successfull!", "Success!",
						JOptionPane.DEFAULT_OPTION);
				dispose();
				HomePageFrame h = new HomePageFrame();
				// h.setVisible(true);
			}
		}

		/**********/

		if (e.getSource() == cancelbtn) {
			dispose();
			LoginPortalFrame a = new LoginPortalFrame();
			a.setVisible(true);
		}

		/*************/

	}

//	public static void main(String[] args) {
//
//		SignUpUserFrame a = new SignUpUserFrame();
//
//		a.setVisible(true);
//	}
}
