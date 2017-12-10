
import java.util.Iterator;
public class ArrayIterator<T> implements Iterator<T> {
	int startIndex,endIndex,cursor;
	T[] arr;
	public ArrayIterator(T[] temparr)
	{
		arr= temparr;
		startIndex = 0;
		endIndex = temparr.length-1;
		cursor = -1;
		
		
	}
	public ArrayIterator(T[] temparr, int val)
	{
		startIndex = val;
		endIndex = temparr.length-val-1;
		cursor = val;
	}
public boolean hasNext()
{
	return cursor<endIndex;
}
public T next()
{
	return arr[++cursor];
	}
}
