import java.util.Scanner;
public class Comparethreenos {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        int a;
        a=sc.nextInt();
        System.out.print("enter second number");
        int b;
        b=sc.nextInt();
        System.out.print("enter third number");
        int c;
        c=sc.nextInt();

        if(a>b & a>c){
            System.out.print(a+"is greater than"+b+"and"+c);
        }
        else if(b>a & b>c){
            System.out.print(b+"is grater than"+a +" and"+c);
        }
        else{
            System.out.print(c+"is greater than"+a +"and"+b);
        }
        sc.close();
    }
    
}

