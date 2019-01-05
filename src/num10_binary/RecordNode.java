package num10_binary;


public class RecordNode {
	public Comparable key;
	public Object element;
	public RecordNode(Comparable key) {
		this.key=key;
	}
	public RecordNode(Comparable key,Object element) {
		this.key=key;
		this.element=element;
	}
	public String toString(){
		return this.key+"";
	}

}