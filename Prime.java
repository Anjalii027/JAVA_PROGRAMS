class Prime{
    public static void main(String args[])
    {
        int n,i,c=0,r=0;
        n= Integer.parseInt(args[0]);
        for(i=1;i<n;i++)
        {
            r=n%i;
            if(r==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println(n+" "+"is a prime number");
        }
        else
        {
            System.out.println(n+" "+"is not a prime number");
        }
    }
 }

 