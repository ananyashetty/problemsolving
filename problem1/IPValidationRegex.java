package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IPValidationRegex {
	private static String RegularExpression =
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	public static void main(String[] args) throws FileNotFoundException {
		try(Scanner sc = new Scanner(new File("IpAddress.txt"))) {
			List<String> list = new ArrayList<>();
			while(sc.hasNextLine()) {
				list.add(sc.nextLine());
			}
			testValidity(list);
		}
	}
	
	public static void testValidity(List<String> validIpArgs){
		validIpArgs.forEach(ip -> System.out.println("IP address " + ip + " = " + Pattern.compile(RegularExpression).matcher(ip).matches()));
	}
}
