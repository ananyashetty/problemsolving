package problem1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class IPValidationRegex {
	private static String RegularExpression =
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    
	public static void main(String[] args) {
		String[] ipArgs = new String[] {"01.1.1.1", 
										"256.255.255.255", 
										"192.168.1.1" , 
										"10.10.1.1", 
										"132.254.111.10", 
										"2623.10.2.10", 
										"2a7.0.0.1"};
		testValidity(ipArgs);
	}
	
	public static void testValidity(final String[] validIpArgs){
		Arrays.stream(validIpArgs)
				.forEach(ip -> 
				System.out.println("IP address " + ip + " = " + Pattern.compile(RegularExpression).matcher(ip).matches()));
	}
}
