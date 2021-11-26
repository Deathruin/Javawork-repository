package java9;
import java.util.GregorianCalendar;

public class Five9_5 {
	public static void main(String[] args) {
		GregorianCalendar gg = new GregorianCalendar();
		System.out.print(gg.get(GregorianCalendar.YEAR) + "年");
		System.out.print(gg.get(GregorianCalendar.MONTH) + "月");
		System.out.println(gg.get(GregorianCalendar.DAY_OF_MONTH ) + "日");
		
		gg.setTimeInMillis(1234567898765L);
		System.out.print(gg.get(GregorianCalendar.YEAR) + "年");
		System.out.print(gg.get(GregorianCalendar.MONTH) + "月");
		System.out.print(gg.get(GregorianCalendar.DAY_OF_MONTH ) + "日");
		
	}

}
