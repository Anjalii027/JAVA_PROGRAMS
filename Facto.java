class Facto {
    public static void main(String args[]){
        int n,i,f;
        f=1;
        n=Integer.parseInt(args[0]);
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("factorial of the number is"+f);
    }
}
