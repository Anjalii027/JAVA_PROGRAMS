public class Fibo {
    public static void main(String args[])
    {
        int f=0,s=1,n,t=0;
        int i=0;
        n=Integer.parseInt(args[0]);
        System.out.println(f);
        System.out.println(s);
        for(i=2;i<n;i++)
        {
            t=f+s;
            f=s;
            s=t;
            System.out.println(t);
        }
    }
}
