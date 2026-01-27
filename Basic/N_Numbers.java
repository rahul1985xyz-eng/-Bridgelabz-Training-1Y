package Basic;
import java.util.Scanner;
public class N_Numbers {
    static void main(String[] args) {
        for(int i = 1 ; i<=100 ; i++){
            if ( i%3==0 || i%5 == 0){
                System.out.println(i);
            }
        }
    }
}
