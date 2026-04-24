class A{
	int x;
	A(int x)
	{
			this.x=x;
	}
}
class B extends A{
	int y;
	B(int x, int y)
	{
		super(x);
		this.y=y;
	}
	void show()
	{
		System.out.println("Sum="+(x+y));
	}
}
class inheritance
{
	public static void main(String args[])
	{
		B ob=new B(2,5);
		ob.show();
	}
}
