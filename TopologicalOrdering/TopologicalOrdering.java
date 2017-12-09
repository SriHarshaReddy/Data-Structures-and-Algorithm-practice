/*@
 * Author : SriHarshaReddy Munjuluru
 * Finds the topological Order of the vertices in a Graph.
 * Date: 12/09/2017
 */
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class TopologicalOrdering {
Graph g;
TopologicalOrdering(Graph g)
{
	this.g = g;
}
public List<Vertex> orderTopologically()
{
	int topNum =0;
	LinkedList<Vertex> q = new LinkedList<Vertex>();
	List<Vertex> arrLst = new ArrayList<Vertex>();
	Indegree[] arrI = new Indegree[g.size()];
    for(Vertex u:g)
    {
    	arrI[u.getVertexName()]= new Indegree(u.revEdgeList.size());
    	if(u.revEdgeList.size()==0)
    	{
    		q.add(u);
    		
    	}
    	
    }
    while(!q.isEmpty())
    {
    	Vertex u= q.remove();
    	arrLst.add(u);
    	topNum++;
    	for(Edge e:u)
    	{
    		Vertex temp = g.verList[e.destVertex];
    		int val =--arrI[temp.getVertexName()].inCount;
    		if(val ==0)
    			q.add(temp);
    	}
    }
    if(topNum!= g.size())
    	System.out.println("Is not a DAG");
    return arrLst;
}
}
class Indegree
{
	int inCount;
	
	Indegree(int in)
	{
		inCount = in;
	}
}

