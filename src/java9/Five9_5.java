package java9;
import java.util.GregorianCalendar;

public class Five9_5 {
	public static void main(String[] args) {
		GregorianCalendar gg = new GregorianCalendar();
		System.out.print(gg.get(GregorianCalendar.YEAR) + "��");
		System.out.print(gg.get(GregorianCalendar.MONTH) + "��");
		System.out.println(gg.get(GregorianCalendar.DAY_OF_MONTH ) + "��");
		
		gg.setTimeInMillis(1234567898765L);
		System.out.print(gg.get(GregorianCalendar.YEAR) + "��");
		System.out.print(gg.get(GregorianCalendar.MONTH) + "��");
		System.out.print(gg.get(GregorianCalendar.DAY_OF_MONTH ) + "��");
		
	}

}
