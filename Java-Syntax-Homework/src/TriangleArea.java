import java.util.Scanner;
public class TriangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Ax = input.nextInt();
		int Ay = input.nextInt();
		int Bx = input.nextInt();
		int By = input.nextInt();
		int Cx = input.nextInt();
		int Cy = input.nextInt();
		if (Ax==Ay||Bx==By||Cx==Cy) {
			System.out.println(0);
		} else {
			System.out.println(Math.abs((Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))/2));
		}
		
	}
}
