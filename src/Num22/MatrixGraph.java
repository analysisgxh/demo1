package Num22;
import java.util.*;



public class MatrixGraph {
	public final static int INFINITY = Integer.MAX_VALUE;

	private GraphKind kind;

	private int vexNum, arcNum;

	private Object[] vexs;

	private int[][] arcs;

	public MatrixGraph() {
		this(null, 0, 0, null, null);
	}

	public MatrixGraph(GraphKind kind, int vexNum, int arcNum, Object[] vexs,
			int[][] arcs) {
		this.kind = kind;
		this.vexNum = vexNum;
		this.arcNum = arcNum;
		this.vexs = vexs;
		this.arcs = arcs;
	}

	
	public void createGraph() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入创建的图类型1.UDG(undirected graph)--2.DG(directed graph)--3.UDN(undirected network)--4.DN(directed network)");
		GraphKind kind = GraphKind.valueOf(sc.next());
		switch (kind) {
		case UDG:
			createUDG();
			return;
		case DG:
			createDG();
			return;
		case UDN:
			createUDN();
			return;
		case DN:
			createDN();
			return;
		}
	}

	
	private void createUDG() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顶点数和边数");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new Object[vexNum];
		System.out.println("请输入顶点");
		for (int v = 0; v < vexNum; v++)
			
			vexs[v] = sc.next();

		arcs = new int[vexNum][vexNum];
		for (int v = 0; v < vexNum; v++)
			
			for (int u = 0; u < vexNum; u++)
				arcs[v][u] = 0;

		System.out.println("请输入一条边的两个顶点");
		for (int k = 0; k < arcNum; k++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			arcs[v][u] = 1;
		}
		
	}

	
	private void createDG() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顶点数和边数");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new Object[vexNum];
		System.out.println("请输入顶点");
		for (int v = 0; v < vexNum; v++)
			
			vexs[v] = sc.next();

		arcs = new int[vexNum][vexNum];
		for (int v = 0; v < vexNum; v++)
			
			for (int u = 0; u < vexNum; u++)
				arcs[v][u] = 0;

		System.out.println("请输入一条边的两个顶点");
		for (int k = 0; k < arcNum; k++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			arcs[v][u] = 1;
		}
		
	}

	
	private void createUDN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顶点数和边数");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new Object[vexNum];
		System.out.println("请输入顶点");
		for (int v = 0; v < vexNum; v++)
			
			vexs[v] = sc.next();

		arcs = new int[vexNum][vexNum];
		for (int v = 0; v < vexNum; v++)
			
			for (int u = 0; u < vexNum; u++)
				arcs[v][u] = INFINITY;

		System.out.println("请输入一条边的两个顶点及其权值");
		for (int k = 0; k < arcNum; k++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			arcs[v][u] = arcs[u][v] = sc.nextInt();
		}
	}

	
	private void createDN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顶点数和边数");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new Object[vexNum];
		System.out.println("请输入顶点");
		for (int v = 0; v < vexNum; v++)
			
			vexs[v] = sc.next();

		arcs = new int[vexNum][vexNum];
		for (int v = 0; v < vexNum; v++)
			
			for (int u = 0; u < vexNum; u++)
				arcs[v][u] = INFINITY;

		System.out.println("请输入一条边的两个顶点及其权值");
		for (int k = 0; k < arcNum; k++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			arcs[v][u] = sc.nextInt();
		}

	}

	
	public int getVexNum() {
		return vexNum;
	}

	
	public int getArcNum() {
		return arcNum;
	}

	
	public int locateVex(Object vex) {
		for (int v = 0; v < vexNum; v++)
			if (vexs[v].equals(vex))
				return v;
		return -1;
	}

	
	public Object getVex(int v) throws Exception {
		if (v < 0 && v >= vexNum)
			throw new Exception("下标异常!");
		return vexs[v];
	}

	
	public int firstAdjVex(int v) throws Exception {
		if (v < 0 && v >= vexNum)
			throw new Exception("下标异常!");

		for (int j = 0; j < vexNum; j++)
			if (arcs[v][j] != 0 && arcs[v][j] < INFINITY)
				return j;

		return -1;
	}

	
	public int nextAdjVex(int v, int w) throws Exception {
		if (v < 0 && v >= vexNum)
			throw new Exception("下标异常");

		for (int j = w + 1; j < vexNum; j++)
			if (arcs[v][j] != 0 && arcs[v][j] < INFINITY)
				return j;

		return -1;
	}

	public GraphKind getKind() {
		return kind;
	}

	public int[][] getArcs() {
		return arcs;
	}

	public Object[] getVexs() {
		return vexs;
	}

	public void setArcNum(int arcNum) {
		this.arcNum = arcNum;
	}

	public void setArcs(int[][] arcs) {
		this.arcs = arcs;
	}

	public void setKind(GraphKind kind) {
		this.kind = kind;
	}

	public void setVexNum(int vexNum) {
		this.vexNum = vexNum;
	}

	public void setVexs(Object[] vexs) {
		this.vexs = vexs;
	}
	private  boolean[] visited;

	
	public  void BFSTraverse(MatrixGraph G) throws Exception {
		visited = new boolean[G.getVexNum()];
		for (int v = 0; v < G.getVexNum(); v++)
		
			visited[v] = false;
		for (int v = 0; v < G.getVexNum(); v++)
			if (!visited[v]) 
				BFS(G, v);
	}

	private  void BFS(MatrixGraph G, int v) throws Exception {
		visited[v] = true;
		System.out.print(G.getVex(v).toString() + " ");
		LinkQueue Q = new LinkQueue();// 辅助队列Q
		Q.offer(v);// v入队列
		while (!Q.isEmpty()) {
			int u = (Integer) Q.poll();// 队头元素出队列并赋值给u
			for (int w = G.firstAdjVex(u); w >= 0; w = G.nextAdjVex(u, w))
				if (!visited[w]) {// w为u的尚未访问的邻接顶点
					visited[w] = true;
					System.out.print(G.getVex(w).toString() + " ");
					Q.offer(w);
				}
		}
	}
	  boolean[] visited1;
		public  void DFSTraverse(MatrixGraph G) throws Exception {
			 visited1 = new boolean[G.getVexNum()];
			for (int v = 0; v < G.getVexNum(); v++)
				
				visited1[v] = false;
			for (int v = 0; v < G.getVexNum(); v++)
				if (!visited1[v]) 
					
			
					DFS(G, v);
					
		}

		
		public  void DFS(MatrixGraph  G, int v) throws Exception {
			visited1[v] = true;
			System.out.print(G.getVex(v).toString() + " ");
			for (int w = G.firstAdjVex(v); w >= 0; w = G.nextAdjVex(v, w))
				if (!visited1[w])
					DFS(G, w);
		}
		boolean[] visited3;
		public  void DFSTraversenon_(AdjacencyListGraph G) throws Exception {
			 visited3 = new boolean[G.getVexNum()];
			for (int v = 0; v < G.getVexNum(); v++)
				
				visited3[v] = false;
			for (int v = 0; v < G.getVexNum(); v++)
				if (!visited3[v]) 
					
			
					DFSnon_(G, v);
					
		}
		public void DFSnon_(AdjacencyListGraph  G, int v)throws Exception {
			LinkStack s=new LinkStack();
			s.push(v);
			while(!s.isEmpty()) {
				int n=(int)s.pop();
				visited3[v]=true;
				System.out.println(G.getVex(v).toString());
				for(int w=G.firstAdjVex(v);w>=0;w=G.nextAdjVex(v, w)) {
					if(!s.contains(w)&&!visited3[w]) {
						s.push(w);
					}
				}
			}
			
		}
}