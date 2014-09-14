import java.util.Arrays;
import java.util.Scanner;
public class SortArrayofStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] words = new String[n+1];
		for (int i = 0; i <= n; i++) {
			words[i]= input.nextLine();
		}
		Arrays.sort(words);
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}
