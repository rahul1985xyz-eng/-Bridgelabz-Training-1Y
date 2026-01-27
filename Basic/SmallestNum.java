package Basic;
import java.util.Scanner;
public class SmallestNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<b && a<c){
            System.out.println(a+" is Smallest of three");
        }
        else if(b<a && b<c){
            System.out.println(b+" is Smallest of three");
        }
        else System.out.println(c+" is Smallest of three");
    }
}
//
