import java.util.Scanner;
import java.util.Arrays;
public class MINIMUM {
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
        int ans=arr[0];
        System.out.println("The minimum element of the array " + ans);
    }
}
