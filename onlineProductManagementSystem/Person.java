
import javax.swing.JOptionPane;

public abstract class Person {

	private String name;
	private String address;
	private int contactNumber;

	public abstract void generatePassword();

	public static void main(String[] args) {

		int isAdult = JOptionPane.showConfirmDialog(null, "Are you Adult? ", "Confirmation", JOptionPane.YES_NO_OPTION);

		if (isAdult == JOptionPane.YES_OPTION) {

			String name = JOptionPane.showInputDialog("Enter your name : ");

			JOptionPane.showMessageDialog(null, "Welcome " + name);

		} else {
			JOptionPane.showMessageDialog(null, "you have to adult", "Error", JOptionPane.WARNING_MESSAGE);

		}

		String options[] = { "abc", "123", "eng" };

		int position = JOptionPane.showOptionDialog(null, "Choose your Option ", "Options", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

		System.out.println(options[position]);

	}

}
