import java.util.Scanner;

public class Second3_19 {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        System.out.println("�����ߣ�");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();

        double temp;
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a > c){
            temp = a;
            a = c;
            c = temp;
        }
        if(b > c){
            temp = b;
            b = c;
            c = temp;
        }

        // �ж�������̱ߵĺ��Ƿ���ڵ�����
        if(a + b > c){
            double p = a + b + c;
            System.out.println("�ܳ�Ϊ��"+p);
        }else{
            System.out.println("����ֵ���Ϸ�");
        }
    }

}
