package DataStructures;

import java.util.Iterator;
import java.util.LinkedList;
class  BFS_graph
	{
		private int V;
		private LinkedList<Integer> adj[];
		BFS_graph(int v)
		{
			V=v;
			adj=new LinkedList[v];
			for(int i=0;i<v;i++)
				adj[i]=new LinkedList();
		}
		void addEdge(int v,int w)
		{
			adj[v].add(w);
		}
		void BFS(int s)
		{
			boolean visited[]=new boolean[V];
			LinkedList<Integer> queue=new LinkedList<Integer>();
			visited[s]=true;
			queue.add(s);
			while(queue.size()!=0)
			{
				s=queue.poll();
				System.out.print(s+" ");
				
				Iterator<Integer> i=adj[s].listIterator();
				while(i.hasNext())
				{
					int n=i.next();
					while(!visited[n])
					{
						visited[n]=true;
						queue.add(n);
					}
				}
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS_graph g=new BFS_graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		g.BFS(0);
	}
}
