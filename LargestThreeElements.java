import java.util.Scanner;
import java.util.Arrays;
public class LargestThreeElements {
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
        int largestThree[]={arr[arr.length-1],arr[arr.length-2],arr[arr.length-3]};
        System.out.println("Largest three elements of the array" +Arrays.toString(largestThree));
        
    }
}
