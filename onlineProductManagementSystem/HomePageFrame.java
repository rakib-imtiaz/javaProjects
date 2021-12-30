
import java.io.File;
import java.io.IOException;

public class HomePageFrame {

	static File file = new File("./src/DataFiles");

	public static void main(String[] args) throws IOException {

		fileInitialiser();

	}

	static void fileInitialiser() throws IOException {
		if (!file.exists()) {
			file.mkdir();
			System.out.println("file created at : "+file.getAbsolutePath());
		}

	}

	
}
