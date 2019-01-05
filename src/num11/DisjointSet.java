package num11;

public class DisjointSet {
	public int[] set;
	public int[] sz;
	/*public int[] getSet() {
		return set;
	}*/
	public DisjointSet(int vexNum) {
		set=new int[vexNum];
		sz=new int[vexNum];
		for(int i=0;i<set.length;i++) {
			set[i]=i;
			sz[i]=1;
		}
	}
	public void union(int p,int q) {
		int pRoot=find(p);
		int qRoot=find(q);
		if(pRoot==qRoot) {
			return;
		}
		if(sz[pRoot]<sz[qRoot]) {
			set[pRoot]=qRoot;
			sz[qRoot]+=sz[pRoot];
		}else {
			set[qRoot]=pRoot;
			sz[pRoot]+=sz[qRoot];
		}
	}
/*	public void union(int root1,int root2) {
		if(set[root2]<set[root1]) {
			set[root1]=root2;
		}else {
			if(set[root1]==set[root2]) {
				set[root1]--;
			}
			set[root2]=root1;
		}
	}*/
	public int find(int p) {
		while(p!=set[p]) {
			set[p]=set[set[p]];
			p=set[p];
			
		}
		return p;
	}
	/*public int find(int x) {public int 
		if(set[x]<0) {
			return x;
		}
		int next=x;
		while(set[next]>0) {
			next=set[next];
			
		}
		return next;
	}*/

}
