import java.util.Arrays;
public class MergeSort
{
    // Main method to test merge sort
    public static void main(String[] args)
	{
        int[] arr = {18,24,5,46,10,28,30};
        System.out.println("Original array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
    // Recursive merge sort function
    public static void mergeSort(int[] arr, int left, int right)
	{
        if (left < right)
		{
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    // Merge two sorted halves of the array
    public static void merge(int[] arr, int left, int mid, int right)
	{
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2)
		{
            if (L[i] <= R[j])
			{
                arr[k++] = L[i++];
            } else
			{
                arr[k++] = R[j++];
            }
        }
        while (i < n1)
		{
            arr[k++] = L[i++];
        }
        while (j < n2)
		{
            arr[k++] = R[j++];
        }
    }
}
