package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {

	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0)
				break;
			println(addCommasToNumericStringTest(digits));
		}

	}
	
	private String addCommasToNumericStringTest(String digits) {
		String num = "";
		int len = digits.length();
		if (digits.length() >= 3) {
			for (int i = 1; i <= digits.length(); i++) {
				len --;
				num += digits.charAt(len);
				
				if (i % 3 == 0 && i != 0) {
					num += ",";
				}	
			}
			if (num.charAt(num.length()-1) == ',') {
				num = num.substring(0, num.length() -1);
			}
			
			return (new StringBuilder(num).reverse().toString());
		} else {
			return digits;
		}
	}
}
	