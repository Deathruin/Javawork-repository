package quit3an5_2;
import java.util.Scanner;

public class Second5_38 {
    public static void main(String[] args) {
        //1. 接收用户输入的10进制整数
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个十进制整数：");
        int decimal = input.nextInt();

        // 2. 对十进制整数进行转换：除8倒序的余数；以十进制整数形式存储八进制数
        int remainder = 0, binary = 0;
        for (int i = 1;decimal > 0;i *= 10){
            remainder = decimal % 8;
            decimal /= 8;
            binary += remainder * i;
        }

        // 3. 输出
        System.out.println(binary);
    }

}
