package java9;
import java.util.Scanner;

public class Five9_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a,b,c,d,e,f:");
		double a =input.nextInt(), b =input.nextInt(), c =input.nextInt();
		double d =input.nextInt(), e =input.nextInt(), f =input.nextInt();
		
		Five9_11_linearEquation le = new Five9_11_linearEquation(a,b,c,d,e,f);
		boolean bool = le.isSolvable();
		
		if(bool) {
			System.out.println("x is " + le.getX() + " and y is " + le.getY());
		}else
			System.out.println("The equation has no solution");
	}

}
