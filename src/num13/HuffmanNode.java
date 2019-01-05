package num13;



public class HuffmanNode {
	public String c;
	public String b;
	public  int weight;//节点权重
	public int flag;//标志节点是否加入哈夫曼树中，flag=0,表示未加入，flag=1,表示加入
	public HuffmanNode parent,lchild,rchild;
	public HuffmanNode() {
		this(0);
	}
	public HuffmanNode(int weight) {
		this.weight=weight;
		flag=0;
		parent=lchild=rchild=null;
		
	}
	

//哈夫曼树节点类


}
