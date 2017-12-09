import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CreateGraph {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Vertices");
		int cntV = sc.nextInt();
		
		System.out.println("Is the graph directed or undirected?(Enter boolean values:)");
		boolean isDirected = sc.nextBoolean();
		Graph g = new Graph(cntV,isDirected);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(4, 3);
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
		TopologicalOrdering t = new TopologicalOrdering(g);
		List<Vertex> outputList = t.orderTopologically();
		int trackCount = 1;
		System.out.println("Topological Ordering of the graph is:");
		for(Vertex out: outputList)
		{
			if(trackCount< outputList.size())
			System.out.print(out.getVertexName()+1 + "---------->");
			else
				System.out.print(out.getVertexName()+1);
			trackCount++;
		}
	}

}
