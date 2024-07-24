import java.util.Scanner;

public class Between {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter a number");
        n=sc.nextInt();

        if(1<=n & n<10){
            System.out.println(n+" lies between 1 to 10");
        }
        else if(10<=n & n<20){
            System.out.println(n+" lies between 11 and 20");
        }
        else if(20<=n & n<30){
            System.out.println(n+" lies between 21 and 30");
        }
        else{
            System.out.println(n+" is greater than 30");
        }
        sc.close();
    }

}
