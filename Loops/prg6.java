import java.util.Scanner;
class prg6{
public static void main(String args[])
{
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}