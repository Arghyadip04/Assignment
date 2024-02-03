import java.util.Scanner;
public class DIFFERENCEEVENODD {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Print the elements of the array");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int p=0,q=0;
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                p+=arr[i];
            }
            else 
            {
                q+=arr[i];
            }
        }
        int difference=p-q;
       System.out.println(difference);
    }
}