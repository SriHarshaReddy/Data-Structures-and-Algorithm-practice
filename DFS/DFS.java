/*
 * @Author - SriHarshaReddy Munjuluru
 * @Date - 12/09/2017
 * Performs the depth first search operation.
 */
import java.util.List;
public class DFS {
	Graph g;
	int root;
	DFS(Graph g, int root)
	{
		this.g =g;
		this.root = root;
	}
	public List<Edge> dfs(Vertex v,List<Edge> arr,boolean[] seen)
	{
		if(v.adjEdgesList.size()==0)
			return arr;
		for(Edge e: g.verList[v.getVertexName()])
		{
			arr.add(e);
			if(seen[e.destVertex]!= true)
			{
				seen[e.destVertex] = true;	
			dfs(g.verList[e.destVertex],arr,seen);
			
			
			}
		}
		return arr;
	}

}
