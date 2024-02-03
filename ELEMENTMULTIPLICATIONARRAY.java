import java.util.Scanner;
public class ELEMENTMULTIPLICATIONARRAY{
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
        System.out.println("The elements of the array");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int ans=1;
        for(int i=0;i<size;i++)
        {
            ans*=arr[i];
        }
        System.out.println("The product of the all elements in array  " + ans);
    }
}