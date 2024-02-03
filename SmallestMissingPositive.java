import java.util.Arrays;
import java.util.Scanner;
public class SmallestMissingPositive {
    static int SmallestMissingElement(int arr[])
    {
       int n=arr.length; 
       for(int i=0;i<n;i++)
       {
        if(arr[i]!=i+1)
        {
            return i+1;
        }
       }
       return n+1;
    }
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
       Arrays.sort(arr);
       int SmallNumber=SmallestMissingElement(arr);
       System.out.println("The Smallest Missing Elements of the array is:" + SmallNumber);
    }
}
       