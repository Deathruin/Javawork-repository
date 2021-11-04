package quit3an5_2;

public class Second5_25 {
    public static void main(String[] args) {
        double formula = 0;
        for( int i = 10000; i <= 100000 ; i += 10000 ){
            formula = 0;
            for ( int n = 1 ; n <= i / 2; n++ ){
                formula += 1.0 / ( ( 4 * n - 3 ) * ( 4 * n - 1) );
            }
            formula = 8 * formula ;
            System.out.printf("当i=%d时，结果为%f\n", i, formula);
        }
    }

}
