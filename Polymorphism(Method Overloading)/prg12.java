//Polymerphism[many form]
//method overloading

class A{
	int sum(int a, int b)
	{
		return (a+b);
	}
	int sum(int a, int b, int c)
	{
		return (a+b+c);
	}
	double sum(double a, double b)
	{
		return (a+b);
	}
}
class prg12{
	public static void main(String args[])
	{
	A ob=new A();
	int x= ob.sum(2,3);
	System.out.println("Sum="+x);
	x=ob.sum(2,3,5);
	System.out.println("Sum="+x);
	double y=ob.sum(2.5,7.2);
	System.out.println("Sum="+y);
	}
}
