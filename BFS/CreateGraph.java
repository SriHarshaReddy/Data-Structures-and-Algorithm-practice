import java.util.Scanner;
import java.util.List;
public class CreateGraph {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Vertices");
		Graph g = new Graph(sc.nextInt());
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(1, 4);
		g.addEdge(4, 5);
		for(Vertex v: g)
		{
			System.out.println(v.getVertexName());
		}
		Vertex v = g.verList[0];
		for(Edge e: v)
		{
			System.out.println(e.srcVertex+" "+e.destVertex);
		}
		BFS b = new BFS(g,0);
		List<Edge> arr = b.bfs();
		for(Edge e: arr)
			System.out.println(e.srcVertex+1+"  "+ (int)(e.destVertex+1));
	}

}
