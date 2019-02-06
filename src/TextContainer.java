import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "/media/oksana/maindata/JavaStudy/CreateFiles/SaveHere.txt")
public class TextContainer {

	static String text = "This text should be saved";

	@Saver
	public  void save(String path) {

		try {

			File newTextFile = new File(path);
			FileWriter fw = new FileWriter(newTextFile);
			fw.write(text);
			fw.close();
			
		//	System.out.println("Done");

		} catch (IOException iox) {
			iox.printStackTrace();
		}
	}
}