import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
public class Graph implements Iterable<Vertex> {
private int Vertices;
Vertex[] verList;
	Graph(int v)
	{
		Vertices = v;
		verList = new Vertex[v];
		for(int i=0;i<verList.length;i++)
		{
			verList[i] = new Vertex(i);
		}
	}
	public int size()
	{
		return Vertices;
	}
	public void addEdge(int s,int d)
	{
		if(s>0)
		{
		int source = s-1;
		
		Vertex v = verList[source];
		Edge e=new Edge(s-1,d-1);
		v.adjEdgesList.add(e);
		
		}
		else
		{
			System.out.println("Enter correct vertex name");
		}
		
	}
	public Iterator<Vertex> iterator()
	{
		return new ArrayIterator<Vertex>(verList);
	}
	
		
}
class Vertex implements Iterable<Edge>
{
	int vertexName;
	List<Edge> adjEdgesList;
	Vertex(int i)
	{
		vertexName = i;
		adjEdgesList = new ArrayList<Edge>();
	}
	public int getVertexName()
	{
		return this.vertexName;
	}
	public Iterator<Edge> iterator()
	{
		return this.adjEdgesList.iterator();
	}
}
class Edge
{
	int Edgename;
	int srcVertex;
	int destVertex;
	Edge(int src,int dest)
	{
		srcVertex = src;
		destVertex = dest;
	}
public Edge	createEdge(int s,int d)
	{
		return new Edge(s,d);
	}
}
