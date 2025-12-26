package genericutilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaUtils {
	/**
	 * This method is used to get random no int value
	 * 
	 * @return randomly generated integer value
	 */
	public int getRandomNo() {
		Random ran = new Random();
		int random = ran.nextInt(1000);
		return random;
	}

	/**
	 * Fetches the current system date in the format yyyy-MM-dd. Example output:
	 * 2025-12-08
	 * 
	 * @return system date as a String
	 */
	public String SystemDate() {
		LocalDate date = LocalDate.now();
		DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String systemDate = d.format(date);
		return systemDate;

	}
}