package Num22;

import java.util.Scanner;





public class AdjacencyListGraph {
	private GraphKind kind;

	private int vexNum, arcNum;

	private VNode[] vexs;

	public AdjacencyListGraph() {
		this(null, 0, 0, null);
	}

	public AdjacencyListGraph(GraphKind kind, int vexNum, int arcNum, VNode[] vexs) {
		this.kind = kind;
		this.vexNum = vexNum;
		this.arcNum = arcNum;
		this.vexs = vexs;
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
		case DN:
			createDN();
			return;
		case UDN:
			createUDN();
			return;
		}
	}

	
	private void createUDG() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顶点数和边数");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new VNode[vexNum];
		System.out.println("请输入顶点");
		for (int v = 0; v < vexNum; v++)
			
			vexs[v] = new VNode(sc.next());

		System.out.println("请输入边的两个顶点及其权值为1 表示有边");
		for (int k = 0; k < arcNum; k++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			//int value = sc.nextInt();
			addArc(v, u, 1);
			addArc(u, v, 1);
		
		
	}
	}
	
	

	
	private void createDG() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顶点数和边数");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new VNode[vexNum];
		System.out.println("请输入顶点");
		for (int v = 0; v < vexNum; v++)
			
			vexs[v] = new VNode(sc.next());

		System.out.println("请输入边的两个顶点及其权值为1表示有边");
		for (int k = 0; k < arcNum; k++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			//int value = sc.nextInt();
			addArc(v, u, 1);
			//addArc(u, v, 1);
		
	}
	}

	
	private void createUDN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顶点数和边数");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new VNode[vexNum];
		System.out.println("请输入顶点");
		for (int v = 0; v < vexNum; v++)
			
			vexs[v] = new VNode(sc.next());

		System.out.println("请输入边的两个顶点及其权值");
		for (int k = 0; k < arcNum; k++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			int value = sc.nextInt();
			addArc(v, u, value);
			addArc(u, v, value);
		}
	}

	
	private void createDN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顶点数和边数");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new VNode[vexNum];
		System.out.println("请输入顶点");
		for (int v = 0; v < vexNum; v++)
			
			vexs[v] = new VNode(sc.next());

		System.out.println("请输入边的两个顶点及其权值");
		for (int k = 0; k < arcNum; k++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			int value = sc.nextInt();
			addArc(v, u, value);
		}
	}

	
	public void addArc(int v, int u, int value) {
		ArcNode arc = new ArcNode(u, value);
		arc.nextArc=vexs[v].firstArc;
		vexs[v].firstArc=arc;
	}

	
	public int getVexNum() {
		return vexNum;
	}

	
	public int getArcNum() {
		return arcNum;
	}

	
	public int locateVex(Object vex) {
		for (int v = 0; v < vexNum; v++)
			if (vexs[v].data.equals(vex))
				return v;
		return -1;
	}

	public VNode[] getVexs() {
		return vexs;
	}

	public GraphKind getKind() {
		return kind;
	}

	
	public Object getVex(int v) throws Exception {
		if (v < 0 && v >= vexNum)
			throw new Exception("绗�" + v + "涓《鐐逛笉瀛樺湪!");

		return vexs[v].data;
	}

	
	public int firstAdjVex(int v) throws Exception {
		if (v < 0 && v >= vexNum)
			throw new Exception("绗�" + v + "涓《鐐逛笉瀛樺湪!");

		VNode vex = vexs[v];
		if (vex.firstArc != null)
			return vex.firstArc.adjVex;
		else
			return -1;
	}

	
	public int nextAdjVex(int v, int w) throws Exception {
		if (v < 0 && v >= vexNum)
			throw new Exception("绗�" + v + "涓《鐐逛笉瀛樺湪!");
		VNode vex = vexs[v];

		ArcNode arcvw = null;
		for (ArcNode arc = vex.firstArc; arc != null; arc = arc.nextArc)
			if (arc.adjVex == w) {
				arcvw = arc;
				break;
			}
		if (arcvw != null && arcvw.nextArc != null)
			return arcvw.nextArc.adjVex;
		else
			return -1;
	}

	public void setArcNum(int arcNum) {
		this.arcNum = arcNum;
	}

	public void setKind(GraphKind kind) {
		this.kind = kind;
	}

	public void setVexNum(int vexNum) {
		this.vexNum = vexNum;
	}

	public void setVexs(VNode[] vexs) {
		this.vexs = vexs;
	}
	
     
	

	

}
