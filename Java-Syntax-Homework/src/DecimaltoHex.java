import java.util.Scanner;
import java.lang.StringBuilder;
public class DecimaltoHex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		String hex = Integer.toHexString(a);
		System.out.println(hex.toUpperCase());
	}
}
