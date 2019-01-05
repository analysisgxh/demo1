package num11;

public class Edge implements Comparable<Edge>{
	public int vertex1;
	public int vertex2;
	public int weight;
	public Edge(int vertex1,int vertex2,int weight) {
		this.vertex1=vertex1;
		this.vertex2=vertex2;
		this.weight=weight;
	}
	public int getVertex1() {
		return vertex1;
		
	}
	public int getVertex2() {
		return vertex2;
		
	}
	public int getWeight() {
		return weight;
		
	}
	public int compareTo(Edge otherEdge) {
		return this.getWeight()-otherEdge.getWeight();
	}
}
