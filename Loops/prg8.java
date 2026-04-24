import java.util.Scanner;
public class prg8 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter cost price first shop:");
        double cp = in.nextDouble();

        double disc1 = cp * 30 / 100.0;
        double disc2 = cp * 20 / 100.0;

        cp -= disc2;
        disc2 += cp * 10 / 100.0;

        if (disc1 > disc2) {
            System.out.println("Discount 1 is better");
        } else {
            System.out.println("Discount 2 is better");
        }
    }

}