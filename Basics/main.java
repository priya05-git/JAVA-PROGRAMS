import java.util.Scanner;
class Student{
	String name;
	int age;
	double marks;
	String stream;
void accept()
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter name:");
	name=in.nextLine();
	System.out.println("Enter age:");
	age=in.nextInt();
	System.out.println("Enter marks:");
	marks=in.nextDouble();
}
void allocate()
{
	if(marks>=300)
	  stream="Science & Computer";
	else if(marks>=200 && marks<300)
	  stream="Commerce & Computer";
	else if(marks>=75 && marks<200)
	  stream="Arts & Animation";
	else
	  stream="Try again";
}
void display()
{
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Marks:"+marks);
	System.out.println("Stream:"+stream);
}
}
class main{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.accept();
		s.allocate();
		s.display();
	}
} 
	
	