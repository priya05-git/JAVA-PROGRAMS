import java.util.Scanner;
public class prg9{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter first number:");
	int a=in.nextInt();
	System.out.println("Enter second number:");
	int b=in.nextInt();
	int hcf=1;
	for(int i=2;i<=Math.min(a,b);i++){
	if(a%i==0 && b%i==0){
	hcf=i;
	}
	}
	if(hcf==1){
	System.out.println("co-prime");
	}
	else{
	System.out.println("Not a co-prime");
	}
}
}