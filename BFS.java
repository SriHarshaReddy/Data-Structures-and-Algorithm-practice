import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class BFS {
Graph g;
int rootVertex;
BFS(Graph g,int r)
{
this.g= g;
rootVertex =r;
}
public List<Edge> bfs()
{
	Vertex v= g.verList[rootVertex];
	LinkedList<Vertex> q = new LinkedList<Vertex>();
	q.add(v);
	List<Edge> arrLst = new ArrayList<Edge>();
	boolean[] seen = new boolean[g.size()];
	
	while(!q.isEmpty())
	{
		Vertex tempV = q.remove();
		seen[tempV.vertexName] = true;
		if(seen[tempV.vertexName]!=false)
		{
			for(Edge e: tempV)
			{
				Vertex newV = g.verList[e.destVertex];
				if(seen[e.destVertex]!=true)
				{
					arrLst.add(e);
					q.add(g.verList[e.destVertex]);
				}
		
		
			}
		}
	}
	return arrLst;
}
}
