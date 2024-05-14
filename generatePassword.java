package Password_Project;

import java.util.*;

public class generatePassword {

	public static String generate(int length) {
		StringBuilder chars = new StringBuilder();
		StringBuilder Password = new StringBuilder();
		Random random = new Random();

		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String specialchars = "!@#$%^&*()_-+={}[]|.,<>;:";

		chars.append(lowercase);
		chars.append(uppercase);
		chars.append(numbers);
		chars.append(specialchars);

		for (int i = 0; i < length; i++) {
			Password.append(chars.charAt(random.nextInt(chars.length())));
		}

		return Password.toString();

	}

}
