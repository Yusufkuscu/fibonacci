import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Fibonacci Serisi: 0,1,1,2,3,5,8,13,21,...

        Scanner ksc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = ksc.nextInt();

        int n1 = 0, n2 = 1, total;

        for (int i = 1; i <= number; i++) {
            System.out.print(n1 + ",");
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }

    }
}
