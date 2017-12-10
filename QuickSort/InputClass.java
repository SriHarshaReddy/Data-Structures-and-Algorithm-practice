import java.util.Scanner;
public class InputClass {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		Integer[] arr = new Integer[len];
		System.out.println("Enter the values");
		for(int i=0;i<len;i++)
			arr[i] = sc.nextInt();
		QuickSortAlgorithm q = new QuickSortAlgorithm(arr);
		Integer[] finalArr =(Integer[])q.quickSort();
		System.out.println("Sorted Array is:");
		for(int temp:finalArr)
		{
			
			System.out.print(temp+" ");
		}
	}
}
