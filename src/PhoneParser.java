import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneParser {
	/*
	 * Parses a phone data string, in the following format:
	 * 
	 *     model screenSize batteryCapacity
	 * 
	 * The model name is encoded with underscores instead of spaces.
	 */
	public static Phone parse(String data) {
		// TODO: parse the phone data string, and return a Phone object.
		// you may use string manipulation, a regex, or a Scanner
		String[] splitStr = data.trim().split("\\s+");

		return new Phone(splitStr[0].replace("_", " "), Double.parseDouble(splitStr[1]), Integer.parseInt(splitStr[2]));
	}
	
	/*
	 * Returns a PhoneList by parsing a text file containing the phone data.
	 */
	public static PhoneList parseFile(String filename) throws IOException {
		// TODO: create a PhoneList
		PhoneList phoneList = new PhoneList();
		// TODO: create a BufferedReader to read from the file
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		// TODO: for each line, parse it as a Phone and add it to the list 

		fileReader = new FileReader(filename);
		bufferedReader = new BufferedReader(fileReader);

		String currLine;
		while ((currLine = bufferedReader.readLine()) != null){
			phoneList.addPhone(parse(currLine));
		}

		return phoneList;
	}
}
