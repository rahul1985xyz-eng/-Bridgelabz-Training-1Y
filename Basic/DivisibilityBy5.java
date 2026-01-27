package Basic;
import java.util.Scanner;
public class DivisibilityBy5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5 == 0){
            System.out.println(n + " is Divisible by 5");

        }
    }
}
