
public class Second5_33 {
    public static void main(String[] args) {
        int temp = 0;
        for (int i = 6; i <= 10000; i++){
            temp = 0;
            // 找出i的所有除数（n）
            for (int n = 1; n < i;n++){
                // 判断n是否为i的除数
                if (i % n == 0){
                    temp += n;
                }
            }
            // 判断除数之和是否为i
            if (temp == i)
                System.out.println(i+"为完全数");
        }
    }

}
