package Num22;

public class TraversAdj {
    boolean[] visited;
	public  void DFSTraverse(AdjacencyListGraph G) throws Exception {
		 visited = new boolean[G.getVexNum()];
		for (int v = 0; v < G.getVexNum(); v++)
			
			visited[v] = false;
		for (int v = 0; v < G.getVexNum(); v++)
			if (!visited[v]) 
				
		
				DFS(G, v);
				
	}

	
	public  void DFS(AdjacencyListGraph  G, int v) throws Exception {
		visited[v] = true;
		System.out.print(G.getVex(v).toString() + " ");
		for (int w = G.firstAdjVex(v); w >= 0; w = G.nextAdjVex(v, w))
			if (!visited[w])
				DFS(G, w);
		//System.out.println();
	}
	boolean[] visited1;
	public  void DFSTraversenon_(AdjacencyListGraph G) throws Exception {
		 visited1 = new boolean[G.getVexNum()];
		for (int v = 0; v < G.getVexNum(); v++)
			
			visited1[v] = false;
		for (int v = 0; v < G.getVexNum(); v++)
			if (!visited1[v]) 
				
		
				DFSnon_(G, v);
				
	}
	public void DFSnon_(AdjacencyListGraph  G, int v)throws Exception {
		LinkStack s=new LinkStack();
		s.push(v);
		while(!s.isEmpty()) {
			int n=(int)s.pop();
			visited1[n]=true;
			System.out.print(G.getVex(n).toString()+" ");
			for(int w=G.firstAdjVex(n);w>=0;w=G.nextAdjVex(n, w)) {
				if(!s.contains(w)&&!visited1[w]) {
					s.push(w);
				}
			}
		}
		
	}
	private  boolean[] visited2;

	
	public  void BFSTraverse(AdjacencyListGraph G) throws Exception {
		visited2= new boolean[G.getVexNum()];
		for (int v = 0; v < G.getVexNum(); v++)
		
			visited2[v] = false;
		for (int v = 0; v < G.getVexNum(); v++)
			if (!visited2[v]) 
				BFS(G, v);
	}

   private  void BFS(AdjacencyListGraph G, int v) throws Exception {
		visited2[v] = true;
		System.out.print(G.getVex(v).toString() + " ");
		LinkQueue Q = new LinkQueue();// 辅助队列Q
		Q.offer(v);// v入队列
		while (!Q.isEmpty()) {
			int u = (Integer) Q.poll();// 队头元素出队列并赋值给u
			for (int w = G.firstAdjVex(u); w >= 0; w = G.nextAdjVex(u, w))
				if (!visited2[w]) {// w为u的尚未访问的邻接顶点
					visited2[w] = true;
					System.out.print(G.getVex(w).toString() + " ");
					Q.offer(w);
				}
		}
	}

}
