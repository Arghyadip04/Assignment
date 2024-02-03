import java.util.Scanner;
import java.util.Arrays;
public class SECONDLARGEST {
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
    System.out.println("Enter the elements of the array");
    for(int i=0;i<size;i++)
    {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    int ans=arr[arr.length-2];
    System.out.println("The second largest elements of the array:" +ans);
}    
}
