import java.util.Scanner;

public class Second3_22 {
    public static void main(String[] args) {
        // ��ȡ������
        Scanner input = new Scanner(System.in);
        System.out.println("������һ���������: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        // �ж��Ƿ���Բ��
        double x1 = 0.0, y1 = 0.0;
        double distance = Math.pow( (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)), 0.5);

        double radius = 10.0;

        final double EPSILON = 0.001;
        boolean bool = false;
        if((radius - distance) > EPSILON){
            // ������Ϊ����Բ��
            bool = true;
        }

        // ������
        if(bool){
            System.out.println("�� (" + x2 + ", " +  y2 + ") ��Բ��");
        }else{
            System.out.println("�� (" + x2 + ", " +  y2 + ") ����Բ��");
        }
    }

}
