import java.util.Scanner;
public class UPDATEARRAY {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
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
        for(int i=0;i<size;i++)
        {
        if(i%2!=0)
        {
            arr[i]*=2;
        }
        else
        {
            arr[i]+=10;
        }
        }
        System.out.println("After updation elements of the array");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
