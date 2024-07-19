import java.util.Scanner;
public class Comparetwonos {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        int a;
        a=sc.nextInt();
        System.out.print("enter second number");
        int b;
        b=sc.nextInt();

        if(a>b){
            System.out.print(a+"is greater than"+b);
        }
        else{
            System.out.print(b+"is grater than"+a);
        }
        sc.close();
    }
    
}
