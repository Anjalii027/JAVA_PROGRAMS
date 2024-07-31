import java.util.Scanner;
public class Double {
    public static void main(String args[])
    {
        int i=0;
        Scanner sc= new Scanner(System.in);
            System.out.println("enter the size of an array");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("enter the values");
            for(i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("before doubling");
            for(i=0;i<size;i++)
            {
                System.out.println(arr[i]);
            }
            for(i=0;i<size;i++)
            {
                arr[i]=arr[i]*2;
            }
            System.out.println("After doubling");
            for(i=0;i<size;i++)
            {   
               System.out.println(arr[i]);
            }
            sc.close();
        }
    }
   

