import java.util.Scanner;
class prg3{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	double ci;
	int p,r,t;
	System.out.println("Enter principal:");
	p=in.nextInt();
	System.out.println("Enter rate:");
	r=in.nextInt();
	System.out.println("Enter time:");
	t=in.nextInt();
	ci=p*((1+r/100)^t)-p;
	System.out.println("Compound Interest="+ci);
}
}
	
	
	