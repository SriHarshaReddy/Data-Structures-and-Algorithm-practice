/*
 * @Author - SriHarshaReddy Munjuluru
 * @Date - 12/10/2017
 * Description -
Priority Queue - arranged from Lower value to higher value
*/
public class PriorityQueue extends Exception {
int[] arr;
int size;

PriorityQueue(int s)
{
arr = new int[s];
size = 0;
}

public void add(int val) throws Exception
{
	if(size== arr.length)
		throw new Exception("size limit reached");
	arr[size] = val;
	PercolateUp(size);
	size++;
}

public int remove() throws Exception
{
	if(size <0)
		throw new Exception("No elements left to remove");
	int x = arr[0];
	arr[0]= arr[size-1];
	PercolateDown(0);
	size--;
	return x;
	
}
public void PercolateDown(int i)
{
	int x = arr[i];
	int c = 2*i+1;
	while(c<size)
	{
		if(arr[c]>arr[c+1])
			c=c+1;
		if(x<arr[c])
			break;
		else
		{
			arr[i] = arr[c];
			i = c;
			c= 2*i+1;
		}
	}
	arr[i] = x;
	
	
}
public void PercolateUp(int s)
{
	
	int x = arr[s];
    while(x<arr[parent(s)])
    {
    	if(s==0)
    		break;
    	arr[s] =arr[parent(s)];
    	s = parent(s);
    }
    arr[s] = x;
}
public int parent(int i)
{
	return (i-1)/2;
	
}

}
