/*
 * @Author : SriHarshaReddy Munjuluru
 * @Date : 12/09/2017
 * This code is to implement the logic of quick sort over an array provided.
 * Also it is built on Generics logic so that it can sort any type of array.
 * Input can be a integer array, Character array or a string array.
 */
import java.util.Comparator;
public class QuickSortAlgorithm<T>  {
T[] arrToSort;
QuickSortAlgorithm(T[] arr)
{
	arrToSort = arr;
}
public <T extends Comparable<T>> T[] quickSort()
{
	quickSort((T[]) arrToSort,0,arrToSort.length-1);
	return (T[])arrToSort;
	
}
public <T extends Comparable<T>> void quickSort(T[] arrToSort2, int p,int r )
{
	if(p<r)
	{
	int q = partition(arrToSort2,p,r);
	quickSort(arrToSort2,p,q-1);
	quickSort(arrToSort2,q+1,r);
	}
	
}
public <T extends Comparable<T>> int partition(T[] arr,int p,int r)
{
	
	int randVal = (int) ((Math.random()%(r-p+1))+p);
	T x = arr[randVal];
	arr[randVal] = arr[r];
	arr[r] = x;
	int i= p-1;
	for(int j= p;j<r;j++)
	{
		
		if(x.compareTo(arr[j])>=0)
		{
			i++;
			T temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
	}
	T temp = arr[i+1];
	arr[i+1] = x;
	arr[r] = temp;
	return i+1;
}




}
