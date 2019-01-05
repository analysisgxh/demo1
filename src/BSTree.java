
public class BSTree {
	public BiTreeNode root;
	public BSTree() {
		root=null;
	}
	public boolean insertBST(Comparable key,Object theElement){
		if(key==null||!(key instanceof Comparable)) {
			return false;
		}
		if(root==null) {
			root=new BiTreeNode(new RecordNode(key, theElement));
			return true;
		}
		return insertBST(root, key,theElement);
		
	}
	public boolean insertBST(BiTreeNode p,Comparable key,Object theElement) {
		if(key.compareTo(((RecordNode)p.data).key)==0){
			return false;
		}
		if(key.compareTo(((RecordNode)p.data).key)<0) {
			if(p.lchild==null) {
				p.lchild=new BiTreeNode(new RecordNode(key,theElement));
				return true;
			}else {
				return insertBST(p.lchild,key,theElement);
				
				
			}
		
	}else if(p.rchild==null) {
		p.rchild=new BiTreeNode(new RecordNode(key,theElement));
		return true;
		
	}else {
		return insertBST(p.rchild,key,theElement);
		
	}
}
	public void inOrderTraverse(BiTreeNode p) {
		if(p!=null) {
			inOrderTraverse(p.lchild);
			System.out.print((p.data).toString()+" ");
			inOrderTraverse(p.rchild);
		}
	}
	public Object searchBST(Comparable key){
		if(key==null||!(key instanceof Comparable)) {
			return null;
		}
		return searchBST(this.root,key);
	}
	public Object searchBST(BiTreeNode p,Comparable key){  
		if(p!=null) {
			if(key.compareTo(((RecordNode)p.data).key)==0) {
				return p.data;
			}
			if(key.compareTo(((RecordNode)p.data).key)<0) {
				return searchBST(p.lchild,key);
			}else {
				return searchBST(p.rchild,key);
			}
		}
		return null;
	}
	public Object removeBST(Comparable key) {
		if(this.root==null||key==null||!(key instanceof Comparable)) {
			return null;
		}
		return removeBST(root,key,null);
	}
	public Object removeBST(BiTreeNode p,Comparable key,BiTreeNode parent) {
		if(p!=null) {
			if(key.compareTo(((RecordNode)p.data).key)<0) {
				return removeBST(p.lchild,key,p);
			}else if(key.compareTo(((RecordNode)p.data).key)>0) {
				return removeBST(p.rchild,key,p);
			}else if(p.lchild!=null&&p.rchild!=null) {
				BiTreeNode innext=p.rchild;
				while(innext.lchild!=null) {
					innext=innext.lchild;
				}
				p.data=innext.data;
				return removeBST(p.rchild,((RecordNode)p.data).key,p);
				
			}else {
				if(parent==null) {
					if(p.lchild!=null) {
						root=p.lchild;
					}else {
						root=p.rchild;
					}
					return p.data;
				}
				if(p==parent.lchild) {
					if(p.lchild!=null) {
						parent.lchild=p.rchild;
					}else {
						parent.lchild=p.rchild;
					}
				}else if(p.lchild!=null) {
					parent.rchild=p.lchild;
				}else {
					parent.rchild=p.rchild;
				}
				return p.data;
			}
		}
		return null;
	}
}  
