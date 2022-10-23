package practice;
import java.util.Scanner;

public class fibonacci {
    static int fib (int n) {
        if(n==1||n==2){
            return 1;
        }
        return fib (n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        /** 1 1 2 3 5 8 13......
         * f(1)=1 first fibonacci number
         * f(2)=2 =====> f(1)+1 second fibonacci number
         * f(3)=3 =====> f(1)+f(2) third f n
         * f(4)=5 =====> f(2)+f(3)======> f(n)=f(n-1)+f(n-2)
         */
        int number;
        Scanner fibo = new Scanner(System.in);
        System.out.print("Please Enter Number:");
       number= fibo.nextInt();
        System.out.println("fibonacci "+number+". number is: "+fib(number));


    }
}
