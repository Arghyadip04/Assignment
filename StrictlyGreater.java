import java.util.Scanner;
import java.util.Arrays;
public class StrictlyGreater {
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
    System.out.println("Enter the element which you want to compare");
    int x=sc.nextInt();
    int count=0;
    for(int i=0;i<size;i++)
    {
        if(arr[i]>x)
        {
            count++;
        }
    }
    System.out.println("The number of element strictly greater than" +count);
}
}