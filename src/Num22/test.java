package Num22;

public class test {

	public static void main(String[] args)throws Exception {
		AdjacencyListGraph a=new AdjacencyListGraph();
		TraversAdj b=new TraversAdj();
		a.createGraph();
		System.out.println("BFS");
		
		b.BFSTraverse(a);
		System.out.println();
		
		System.out.println("DFS�ݹ�");
		b.DFSTraverse(a);
		System.out.println();
	
		System.out.println("DFS�ǵݹ�");
		b.DFSTraversenon_(a);
		// TODO Auto-generated method stub

	}

}
