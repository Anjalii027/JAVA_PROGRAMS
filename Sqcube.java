import java.util.Scanner;

public class Sqcube {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number");
        int n= sc.nextInt();

        if(n<5)
        {
            int sq=n*n;
            System.out.print("Square of the number is"+ sq);
        }
        else
        {
            int cube=n*n*n;
            System.out.print("Cube of the number is"+ cube);
        }
        sc.close();
    }
}
 