import java.util.Scanner;
import java.lang.StringBuilder;

public class FormattingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		String s = "";
		float c = input.nextFloat();
		if (a >= 0 && a <= 500) {
			String hex = Integer.toHexString(a);
			String Binary = Integer.toBinaryString(a);
			String Binary1 = String.format("%s", Binary).replace(' ', '0');
			System.out.printf("|%s|%10s|%10.2f|%-10.3f|",padRight(hex.toUpperCase(),10),Binary1,b,c);
		}

	}
	public static String padRight(String s, int n) {
	     return String.format("%1$-" + n + "s", s);  
	}

	public static String padLeft(String s, int n) {
	    return String.format("%1$" + n + "s", s);  
	}
}
