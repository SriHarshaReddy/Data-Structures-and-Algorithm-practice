/*
 * @Author - SriHarshaReddy Munjuluru
 * @Date - 12/10/2017
 * Find K largest elements in an unsorted array.
 */
import java.util.Scanner;
public class FindKlargerstElements {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements in the array");
int numArr = sc.nextInt();
int[] arr = new int[numArr];
System.out.println("Enter the array values");
for(int i=0;i<numArr;i++)
{
	arr[i] = sc.nextInt();
}

System.out.println("Enter the K value");
int k = sc.nextInt();
int retVal = FindKelement(arr,0,arr.length,k);

	for(int i=k;i>0;i--)
		System.out.println(arr[arr.length-i]);


}

public static int FindKelement(int[] arr,int p,int r,int k)
{
	int n = r-1;
	if(r==0)
		return arr[0];
	int q = partition(arr,p,n);
	int left = q-p;
	int right = r-q;
	if(right>=k)
	return	FindKelement(arr,q+1,r,k);
	else if(right+1==k)
		return arr[0];
	else
		return FindKelement(arr,p,p+left,k-(right+1));
}

public static int partition(int[] arr,int p,int r)
{
	if(p<r)
	{
	int randVal = (int) ((Math.random()%(r-p+1))+p);
	int x = arr[randVal];
	arr[randVal] = arr[r];
	arr[r] = x;
	int i= p-1;
	for(int j= p;j<=r;j++)
	{
		
		if(x>arr[j])
		{
			i++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
	}
	int temp = arr[i+1];
	arr[i+1] = x;
	arr[r] = temp;
	return i+1;
	}
	return p;
}

}
