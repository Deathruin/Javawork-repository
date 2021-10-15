import java.util.Scanner;
public class Firstwork5 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter an integer for seconds: ");
			int seconds = input.nextInt();
			int minutes = seconds / 60;
			int remainingSeconds = seconds % 60;
			System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds ");
		}
	}
}
