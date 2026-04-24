
import java.util.Scanner;
class prg2{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	double sum,avg;
	int a,b,c;
	System.out.println("Enter 1st marks:");
	a=in.nextInt();
	System.out.println("Enter 2nd marks:");
	b=in.nextInt();
	System.out.println("Enter 3rd marks:");
	c=in.nextInt();
	sum=a+b+c;
	System.out.println("Sum="+sum);
	avg=sum/3;
	System.out.println("Average="+avg);
}
}
	
	
	