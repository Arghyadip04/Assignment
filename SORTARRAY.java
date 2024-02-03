import java.util.Scanner;
public class SORTARRAY {
    static boolean SORTTING(int arr[])
    {
      for(int i=0;i<arr.length-1;i++)
      {
        if(arr[i]>arr[i+1])
        {
            return false;
        }
      }
      return true;
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
       System.out.println("Print the elements of the array");
       for(int i=0;i<size;i++)
       {
        System.out.print(arr[i]+" ");
       }
       System.out.println();
       System.out.println(SORTTING(arr));
    }
    
}
