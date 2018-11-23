import java.io.IOException;

public class FindBestPhones {
	public static String PHONES_FILE = "phone-data-short.txt";
	
	public static void main(String[] args) {
		// TODO: use the parseFile method to get the phone data from the file
		try {
			PhoneList phoneList = PhoneParser.parseFile(PHONES_FILE);
			// TODO: print the model names of all the best phones

			for(Phone phone : phoneList.getBestPhones()){
				System.out.println(phone.getModel());
			}
			// TODO: handle I/O failures by printing an error message
		} catch (IOException e) {
			System.out.println("Input file error.");
		}


	}
}
