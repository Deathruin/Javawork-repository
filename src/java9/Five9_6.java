package java9;
import java.util.Arrays;
import java.util.Random;

public class Five9_6 {
	public static void main(String[] args) {
		int[] arr = new int[100000];
		Random rd = new Random();
		for(int i = 0;i < arr.length; i++) {
			arr[i] = rd.nextInt(100000);
		}
		Five9_6_StopWatch sw = new Five9_6_StopWatch();
		Arrays.sort(arr);
		sw.stop();
		System.out.println("Ö´ÐÐÁË" + sw.getElaspsedTime() + "ºÁÃë");
	}

}
