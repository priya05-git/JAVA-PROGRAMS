interface A{
    int sum(int a, int b);
}
interface B{
    int pro(int a, int b);
}
class C implements A,B{
    public int sum(int a, int b){
        return (a+b);
    }
    public int pro(int a, int b){
        return (a*b);
    }
}
class interface1{
    public static void main(String[] args){
        C c = new C();
        System.out.println("The sum: "+c.sum(5,10));
        System.out.println("The product: "+c.pro(5,10));
        //C ob=new C();
        //int x= ob.sum(5,10);
        //System.out.println("The sum: "+x);
        //x= ob.pro(5,10);
        //System.out.println("The product: "+x);
    }
}