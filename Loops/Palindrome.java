//check given word is palindrome or not
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	String s;
        System.out.println("Enter a String: ");
        s = in.nextLine();
        String x = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            x += s.charAt(i);
        }

        if (s.equalsIgnoreCase(x)) 
            System.out.println("Palindrome");
        else 
            System.out.println("Not a Palindrome");
        
    }
}