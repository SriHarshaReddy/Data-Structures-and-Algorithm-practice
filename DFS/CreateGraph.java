import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CreateGraph {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Vertices");
		Graph g = new Graph(sc.nextInt());
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 5);
		for(Vertex v: g)
		{
			System.out.println(v.getVertexName());
		}
		Vertex v = g.verList[0];
		for(Edge e: v)
		{
			System.out.println(e.srcVertex+" "+e.destVertex);
		}
		DFS b = new DFS(g,0);
		List<Edge> arr = new ArrayList<Edge>();
		boolean[] seen = new boolean[g.size()];
		Arrays.fill(seen, false);
		seen[0] = true;
				b.dfs(g.verList[0],arr,seen);
		for(Edge e: arr)
			System.out.println(e.srcVertex+1+"  "+ (int)(e.destVertex+1));
	}

}
