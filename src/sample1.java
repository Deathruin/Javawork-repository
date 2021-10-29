import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		String lastName;
		
		String[] people = {"姚大","姚三","阿福",
				           "陈龙","特鲁","圣主"};
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("请输入姓：");
		lastName = keyboard.nextLine();
		
		System.out.println("查找到的姓名为：");
		for(int i = 0;i<people.length;i++) {
			if(people[i].startsWith(lastName)) {
				System.out.println(people[i]);
			}
		}
		
	}
}
