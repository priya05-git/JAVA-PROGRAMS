//calculate area of a circle, square, rectangle, triangle 
class Area{
	double circle(int r)
	{
		return (3.14*r*r);
	}
	double square(int s)
	{
		return (s*s);
	}
	double rectangle(int l, int b)
	{
		return (l*b);
	}
	double triangle(int b, int h)
	{
		return (0.5*b*h);
	}
}
	
class prg13{
	public static void main(String args[])
	{
	Area ob=new Area();
	double x= ob.circle(12.0,3.0);
	System.out.println("area="+x);
	x=ob.Area(2,3,5);
	System.out.println("area="+x);
	double y=ob.Area(2.5,7.2);
	System.out.println("area="+y);
	double z=ob.Area(24.2,78.0);
	System.out.println("area="+z);
	
	}
}

