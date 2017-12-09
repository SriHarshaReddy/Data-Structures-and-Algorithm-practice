import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
public class Graph implements Iterable<Vertex> {
private int Vertices;
Vertex[] verList;
boolean isDirected;
	Graph(int v,boolean flag)
	{
		Vertices = v;
		verList = new Vertex[v];
		isDirected = flag;
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
		int destination = d-1;
		Vertex v = verList[source];
		Vertex vD = verList[destination];
		if(isDirected== false)
		{
		Edge e=new Edge(s-1,d-1);
		Edge e1 = new Edge(d-1,s-1);
		v.adjEdgesList.add(e);
		vD.revEdgeList.add(e1);
		vD.adjEdgesList.add(e1);
		vD.revEdgeList.add(e);
		}
		else if(isDirected == true)
		{
			Edge e=new Edge(s-1,d-1);
			Edge e1 = new Edge(d-1,s-1);
			v.adjEdgesList.add(e);
			vD.revEdgeList.add(e1);
		}
		
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
	List<Edge> revEdgeList;
	Vertex(int i)
	{
		vertexName = i;
		adjEdgesList = new ArrayList<Edge>();
		revEdgeList = new ArrayList<Edge>();
	}
	public int getVertexName()
	{
		return this.vertexName;
	}
	public Iterator<Edge> iterator()
	{
		return this.adjEdgesList.iterator();
	}
	public Iterator<Edge> revListIterator()
	{
		return this.revEdgeList.iterator();
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
public Edge reverseEdge(int s,int d)
{
	return new Edge(d,s);}
}
