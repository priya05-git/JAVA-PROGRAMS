//prime or not
import java.util.Scanner;
class prg1{
	public static boolean isPrime(int n)
	{
		int f=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
		{
			f++;
		}
	}
	if(f==2)
		return true;
	else
		return false;
	}
	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);
        	int num;
        	System.out.println("Enter a number:");
        	num = in.nextInt();
		if(isPrime(num))
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");
	}
}
