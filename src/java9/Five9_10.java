package java9;
import java.util.Scanner;

public class Five9_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c:");
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
		
		Five9_10_QuadraticEquation qe = new Five9_10_QuadraticEquation(a,b,c);
		double judge = qe.getDiscriminant();
		if (judge > 1) {
			System.out.printf("%.3f%.3f\n", qe.getRoot1(), qe.getRoot2());
		}else if(judge < 0.0001 && judge > -0.0001) {
			System.out.printf("%.3f\n", qe.getRoot1());
		}else {
			System.out.printf("The equation has no roots");
		}
	}

}
