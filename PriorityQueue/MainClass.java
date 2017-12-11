import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		PriorityQueue pq = new PriorityQueue(num);
		System.out.println("Enter the values of the array");
		for(int i=0;i<num-4;i++)
		{
			pq.add(sc.nextInt());
			
		}
		pq.add(sc.nextInt());
		
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		
	}

}
