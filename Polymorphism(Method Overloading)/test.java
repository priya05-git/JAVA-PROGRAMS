import java.util.*;
import java.util.Scanner;
class cloudstorage
{
    Scanner sc=new Scanner(System.in);
    int acno=0;
    int space=0;
    double bill=0.0;
}
void accept(){
    System.out.println("Enter the Account number:");
    acno=sc.nextInt();
    System.out.println("Enter the storage space:");
    space=sc.nextInt();
}
void calculate(){
    if (space<=15)
    {
        bill=15*space;
    }
    else if(space>15 && space<=30)
    {
        bill=(15*15)+(13*(space-15));
    }
    else
    {
        bill=(15*15)+(13*15)+(11*(space-30));
    }
}
void display()
{
    System.out.println("Account number:"+acno);
    System.out.println("Storage space:"+space);
    System.out.println("Bill:"+bill);
}
public class test {
    public static void main(String[] args) {
        cloudstorage cs = new cloudstorage();
        cs.accept();
        cs.calculate();
        cs.display();
    }
}
