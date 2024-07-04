package MyPackage;

public class MainClass
{
    public static void main(String[] args)
    {
        PrintThread p1=new PrintThread(1,10);
        p1.start();
        PrintThread p2=new PrintThread(10,20);
        p2.start();
    }
}
