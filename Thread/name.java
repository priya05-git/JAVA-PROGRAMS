class th implements Runnable
{
    Thread t;
    th(String name)
    {
        t = new Thread(this, name);
        t.start();
    }
    public void run()
    {
        for(int i=0;i<10;i++)
        {

            try
            {
                Thread.sleep(1000);
                System.out.println(t.getName()+": "+i);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class name
{
    public static void main(String[] args)
        {
            th t1 = new th("Asansol Engineering College");

        }
}