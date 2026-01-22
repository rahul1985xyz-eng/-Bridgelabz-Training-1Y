import java.util.Scanner;
class Operators{
	public static void main(String [] args){
		for ( int k=0;k<10;k++){
			System.out.println("k:" +k);
		}
		int j =10;
		while(j>0){
		System.out.println("j:" +j);
		j--;
		}
			int i =0;
            System.out.println("Value:"+i);
            i++;
            System.out.println("Value:"+ i++);
            System.out.println("Value:"+i );
            ++i;
            System.out.println("Value:"+ i++);
            System.out.println("Value:"+ i++);
            int z = i - i++ - --i + i - ++i + i++;
            System.out.println("Value:"+i);
		}
	}
