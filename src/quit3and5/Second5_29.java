package quit3and5;
import java.util.Scanner;

public class Second5_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("输入年份和代表该年第一天是周几的数字：");
		int year = input.nextInt();
		int startDay = input.nextInt();
		
		printMonthTitle(1, year);
		int whatDay = printMonthBody(startDay, 1, year);
		for(int month = 2; month <= 12; month++) {
			printMonthTitle(month, year);
			whatDay = printMonthBody(whatDay, month, year);
		}		
	}
	
	public static boolean isLeap(int year) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		else 
			return false;
	}

	public static int[] makeSureDays(int year) {
		int[] leapDays = {
			31,29,31,30,31,30,31,31,30,31,30,31
		};
		int[] nonLeapDays = {
			31,28,31,30,31,30,31,31,30,31,30,31
		};
		
		if(isLeap(year))
			return leapDays;
		else
			return nonLeapDays;
	}
	
	public static String getMonthName(int month) {
		String monthName = "";
		switch(month) {
			case 1: monthName = "一月"; break;
			case 2: monthName = "二月"; break;
			case 3: monthName = "三月"; break;
			case 4: monthName = "四月"; break;
			case 5: monthName = "五月"; break;
			case 6: monthName = "六月"; break;
			case 7: monthName = "七月"; break;
			case 8: monthName = "八月"; break;
			case 9: monthName = "九月"; break;
			case 10: monthName = "十月"; break;
			case 11: monthName = "十一月"; break;
			case 12: monthName = "十二月";
		}
		
		return monthName;
	}
	
	public static void printMonthTitle(int month, int year) {
		String monthName = getMonthName(month);
		System.out.println("         " + monthName + " " + year);
		
		System.out.println("-----------------------------");
		
		System.out.println("   日  一  二  三  四  五  六");
	}
	
	public static int printMonthBody(int whatDay, int month, int year) {
		//whatDay is the first day of the month
		
		int track = 0;
		for(int j = 0; j < (whatDay % 7); j++) {
			System.out.print("    ");
			track++;
		}
		int[] days = makeSureDays(year);
		//days[month - 1]
		for(int i = 1; i <= days[month - 1]; i++) {
			System.out.printf("%4d", i);
			track++;
			if(track % 7 == 0) {
				System.out.printf("\n");
			}
		}
		System.out.printf("\n");
		return (track % 7);
	}

}
