import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		String lastName;
		
		String[] people = {"Ҧ��","Ҧ��","����",
				           "����","��³","ʥ��"};
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("�������գ�");
		lastName = keyboard.nextLine();
		
		System.out.println("���ҵ�������Ϊ��");
		for(int i = 0;i<people.length;i++) {
			if(people[i].startsWith(lastName)) {
				System.out.println(people[i]);
			}
		}
		
	}
}
