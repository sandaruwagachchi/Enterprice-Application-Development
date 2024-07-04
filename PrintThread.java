package MyPackage;

public class PrintThread extends Thread
{
    int f_num;
    int l_num;
    public PrintThread(int f_num,int l_num)
    {
       this.f_num=f_num;
       this.l_num=l_num;
    }
    public void run()
    {
        for (int i=f_num;i<=l_num;i++)
        {
            System.out.println(i);
        }
        System.out.println();
    }
}
