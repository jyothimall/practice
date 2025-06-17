import java.util.Scanner;
public class BubbleSort
{
    public static void main(String[] args)
	{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i=0;i<n;i++)
		{
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);
        sc.close();
    }
    public static void bubbleSort(int[] arr) 
	{
        int n = arr.length;
        boolean swapped;
        for (int i=0;i<n-1;i++) 
		{
            swapped = false;
            for (int j=0;j<n-i-1;j++)
			{
                if (arr[j] > arr[j+1])
				{
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void printArray(int[] arr)
	{
        for (int value : arr)
		{
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
