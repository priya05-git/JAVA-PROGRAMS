import java.util.Scanner;
class prg4{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	double sq,cu;
	int n;
	System.out.println("Enter no.:");
	n=in.nextInt();
	if(n%2==0){
	sq=Math.sqrt(n);
	System.out.println("Square root="+sq);
}
	else{
	cu=Math.cbrt(n);
	System.out.println("Cube root="+cu);
}
	
}
}
	
	
	