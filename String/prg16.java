//input a string and count no. of vowels and consonant
import java.util.Scanner;
class prg16{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s;
		int c=0,v=0;
		System.out.println("Enter a string:");
		s=in.nextLine().toLowerCase();
		for(int i=0;i<s.length;i++)
		if(Character.isLetter(ch))
		{
			char ch=s.charAt(i);
			if(Character.isLetter(ch))
			{
				if("aeiou".indexof(ch)!=-1)
					v++;
				else
					c++;
			}
		}
		System.out.println("Vowels="+v+"Consonent="+c);
				
}
}
		