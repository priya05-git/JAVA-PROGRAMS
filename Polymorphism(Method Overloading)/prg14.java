class A{
	boolean Prime(int n)
	{
		if(n<=1)
		   return false;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			    return false;
		}
		return true;
	
	}
	void Prime(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(Prime(i))
			System.out.println(" "+i);
		}
	}
}
	
class prg14{
	public static void main(String args[])
	{
	A ob=new A();
	boolean x=ob.Prime(57);
	System.out.println("Prime="+x);
	System.out.println("Prime numbers between 1 to 100");
	ob.Prime(1,100);
		
	}
}

