import java.util.Scanner;

class hcf_lcm {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int a, b, hcf = 1, lcm;

        System.out.println("Enter 1st no.");
        a = in.nextInt();

        System.out.println("Enter 2nd no.");
        b = in.nextInt();

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        lcm = (a * b) / hcf;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}