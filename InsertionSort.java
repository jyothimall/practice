public class InsertionSort{
    public static void insertionSort(int[] arr)
	{
        for (int i=1;i<arr.length;i++)
		{
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key)
			{
                arr[j + 1]=arr[j];
                j--;
            }
            arr[j + 1]=key;
        }
    }
    public static void main(String[] args)
	{
        int[] arr={8, 6, 2, 7, 4};
        System.out.println("Before sorting:");
        for (int num:arr)
            System.out.print(num + " ");
        insertionSort(arr);
        System.out.println("\nAfter sorting:");
        for (int num:arr)
            System.out.print(num + " ");
    }
}
