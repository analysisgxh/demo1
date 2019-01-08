package num33;

public class SolvePuzzle {
	LinkStack sp;
	String[][] mp1;
	public void passMatrix(int[][] mp) {
		//String m
		mp1=new String[mp.length][mp[0].length];
		for(int i=0;i<mp.length;i++) {
			for(int v=0;v<mp[0].length;v++) {
				mp1[i][v]=String.valueOf(mp[i][v]);
			}
		}
	}
	public boolean seaechPath(int xi,int yi,int xe,int ye,int[][] m) {
	
		
		
		int i,j,nextPosition,isFind;
		LinkStack s=new LinkStack();
		PuzzleNode p1=new PuzzleNode(xi,yi,-1);
		m[xi][yi]=-1;//入口出走了
		s.push(p1);
		while(!s.isEmpty()) {
			i=((PuzzleNode)s.peek()).i;
			j=((PuzzleNode)s.peek()).j;
			nextPosition=((PuzzleNode)s.peek()).nextPosition;
			if(i==xe&&j==ye) {//找到出口;
				sp=s;
				return true;//s.display();
				
			}
			isFind=0;
			while(nextPosition<4&&isFind==0) {
				nextPosition++;
				switch(nextPosition) {
				case 0://上方位
					i=((PuzzleNode)s.peek()).i-1;
					j=((PuzzleNode)s.peek()).j;
					break;
				case 1://右方位
					i=((PuzzleNode)s.peek()).i;
					j=((PuzzleNode)s.peek()).j+1;
					break;	
				case 2://下方位
					i=((PuzzleNode)s.peek()).i+1;
					j=((PuzzleNode)s.peek()).j;
					break;
				case 3://左方位
					i=((PuzzleNode)s.peek()).i;
					j=((PuzzleNode)s.peek()).j-1;
					break;	
				default:
					break;
					
				}
				if(m[i][j]==0) {//
					isFind=1;
				}
				
			}//找方位段;
			if(isFind==1) {//找到后行走
				((PuzzleNode)s.peek()).nextPosition=nextPosition;//当前方块往哪走了
				
				PuzzleNode p2=new PuzzleNode(i,j,-1);
				s.push(p2);
				m[i][j]=-1;
				
				
			}else {//找不到出栈
				m[((PuzzleNode)s.peek()).i][((PuzzleNode)s.peek()).i]=0;
				s.pop();
			}
			
		}
		
		return false;
		
		
	}
	public void display() {
		while(!sp.isEmpty()) {
			PuzzleNode p=(PuzzleNode)sp.pop();
			mp1[p.i][p.j]="*";
			
			System.out.print("("+p.i+","+p.j+")");
		}
	}
	public void displaymatrix() {
		for(int i=0;i<mp1.length;i++) {
			for(int v=0;v<mp1[i].length;v++) {
			System.out.print(mp1[i][v]+"  ");
			}
			System.out.println();
		}
	}
	
	

}
