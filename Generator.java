package Password_Project;

import java.util.*;

public class Generator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many words do you want for your password: ");
		int pass_length = input.nextInt();
		
		
		System.out.println(generatePassword.generate(pass_length));

		input.close();
	}

}
