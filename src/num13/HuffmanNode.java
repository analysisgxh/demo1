package num13;



public class HuffmanNode {
	public String c;
	public String b;
	public  int weight;//�ڵ�Ȩ��
	public int flag;//��־�ڵ��Ƿ������������У�flag=0,��ʾδ���룬flag=1,��ʾ����
	public HuffmanNode parent,lchild,rchild;
	public HuffmanNode() {
		this(0);
	}
	public HuffmanNode(int weight) {
		this.weight=weight;
		flag=0;
		parent=lchild=rchild=null;
		
	}
	

//���������ڵ���


}
