public class Natural {
    public static void main(String[] args) {
        int n,i=0,s=0;
        n=Integer.parseInt(args[0]);
        for(i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("Sum of"+" "+n+" "+"naturals number is"+" "+s);
    }
}
