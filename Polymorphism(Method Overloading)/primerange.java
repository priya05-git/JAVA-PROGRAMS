import java.util.Scanner;

class prg1 {

    public static boolean isPrime(int n) {
        int f = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f++;
            }
        }

        if (f == 2)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int start, end;

        System.out.println("Enter starting number:");
        start = in.nextInt();

        System.out.println("Enter ending number:");
        end = in.nextInt();

        System.out.println("Prime numbers in the range are:");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}