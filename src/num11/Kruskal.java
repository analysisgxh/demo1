package num11;
import java.util.Collections;
import java.util.*;
import java.io.*;

public class Kruskal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入顶点数和边数");
		int vexNum=sc.nextInt();
		int arcNum=sc.nextInt();
		ArrayList<Edge> graphEdges=new ArrayList<Edge>();
		System.out.print("请输入边顶点和权值");
		for(int i=0;i<arcNum;i++) {
			graphEdges.add((new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt())));
			
		}
		Kruskal graph=new Kruskal();
		graph.kruskalMST(graphEdges,vexNum);
		// TODO Auto-generated method stub
		

	}
	public void kruskalMST(ArrayList<Edge> graphEdges,int vexNum) {
		Collections.sort(graphEdges);
		ArrayList<Edge> mstEdges=new ArrayList<Edge>();
		DisjointSet vexSet=new DisjointSet(vexNum);
		for(int i=0;i<graphEdges.size()&&mstEdges.size()<vexNum-1;i++) {
			Edge curEdge=graphEdges.get(i);
			int root1=vexSet.find(curEdge.getVertex1());
			int root2=vexSet.find(curEdge.getVertex2());
			if(root1!=root2) {
				mstEdges.add(curEdge);
				vexSet.union(root1,root2);
				
			}
			
		}
		System.out.println("最小生成树为");
		for(int i=0;i<mstEdges.size();i++) {
			System.out.println(mstEdges.get(i).getVertex1()+"------"+mstEdges.get(i).getVertex2()+"--权值为"+mstEdges.get(i).getWeight());
		}
		
		
	}

}
