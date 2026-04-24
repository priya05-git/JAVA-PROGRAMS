//String
import java.util.Scanner;
class prg15{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		char ch;
		System.out.println("Enter a character:");
		ch=in.next().charAt(0);
		if(Character.isLetter(ch))
		{
			if(Character.isUpperCase(ch))
			System.out.println("In upper case");
			else
			System.out.println("In Lower case");
		}
		else if(Character.isDigit(ch))
			System.out.println("Digit");
		else
			System.out.println("Special Char");
	}
}
		