interface Printer{
    String print();
}
class LaserPrinter implements Printer{
    public String print(){
        return "Laser Printer Printing";
    }
}
public class Driver{
    public static void main(String[] args){
        LaserPrinter lp = new LaserPrinter();
        System.out.println(lp.print());
    }
}
