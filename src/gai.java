import java.util.ArrayList;
import java.util.Scanner;

public class gai {
	
	
		   //定义一个二维String类型数组，来保存员工的信息
		   static String[][]students=new String[7][7];
		   static int count=7;
		   //存放当前的员工人数 
		   //打印一级菜单 
		   public static void printFirstMenu(){ 
			   //输出一级菜单 
			   System.out.println("*************欢迎使用员工信息管理系统（简易版） ***********");
			   System.out.println("********************************************************");
			   System.out.println("1.登陆");
			   System.out.println();
			   System.out.println("2.退出 ");
			   System.out.println("********************************************************");
			   System.out.print("请选择要执行的操作：");
			   }
		   //打印二级菜单 
		   public static void printSecondMenu(){
			   //输出二级菜单
			  System.out.println("*************欢迎使用员工信息管理系统（简易版） ***********");
			  System.out.println("********************************************************");
			  System.out.println(" 1.查看员工信息");
			  System.out.println();
		      System.out.println(" 2.添加员工信息 ");
		     System.out.println();
	        System.out.println(" 3.修改员工信息 ");
	        System.out.println();
	        System.out.println(" 4.查询统计员工信息 ");
	        System.out.println();
	        System.out.println(" 5.删除员工信息 ");
	        System.out.println();
	        System.out.println("7.年龄排序");
	        System.out.println(" 6.退 出 ");
	        System.out.println("********************************************************");
	        System.out.print("请选择要执行的操作：");
	} 
	//打印三级菜单 
	public static void printThirdMenu(){
		   //输出第三级菜单 
		   System.out.println("*************欢迎使用员工信息管理系统（查询统计界面） ***********");
		   System.out.println("********************************************************");
		   System.out.println(" 1.员工工号查询");
		   System.out.println();
		   System.out.println(" 2.员工姓名查询 ");
		   System.out.println();
		   System.out.println(" 3.员工年龄查询统计");
		   System.out.println();
		   System.out.println(" 4.员工职务查询");
		   System.out.println();
		   System.out.println(" 5.员工宿舍查询");
		   System.out.println();
		 
		   System.out.println(" 0.退 出 ");
		   System.out.println("********************************************************");
		   System.out.print("请选择要执行的操作：");
		   }
	//定义初始化数据
	public static void initStudent(){
		   String[]s1={"s001","张三","21","员工","跳舞","1#201","8677314","1995.2.11","济南","汉族","团员"};
		   String[]s2={"s002","李四","22","员工","体育","1#205","6234871","1994.5.25","聊城","汉族","团员"};
		   String[]s3={"s003","王五","23","经理","器乐","3#402","8325541","1993.12.01","烟台","汉族","团员"};
		   String[]s4={"s004","张伟","28","员工","计算机","4#628","9418726","1995.2.17","德州","回族","团员"};
		   String[]s5={"s005","唐三","29","经理","舞蹈","4#601","7623993","1994.1.13","日照","汉族","党员"};
		   String[]s6={"s006","京京","31","员工","体育","3#311","6300873","1996.6.23","青岛","回族","团员"};
		   String[]s7={"s007","赵柳","31","员工","器乐","3#302","7365363","1995.4.15","潍坊","汉族","团员"};
		   students[0]=s1;
		   students[1]=s2;
		   students[2]=s3;
		   students[3]=s4;
		   students[4]=s5;
		   students[5]=s6;
		   students[6]=s7;
		   } 
	//查看学生信息 
	public static void lookStudent(){
		System.out.println("工号               姓名                年龄                职位                    特长                  宿舍                  联系方式                   出生日期                    籍贯                 民族                   政治面貌");
		int  co=0; 
		   for(int i=0;i<count;i++){
			   for(int j=0;j<students[i].length;j++){
				   
				   System.out.print(students[i][j]+"\t");
				  
				   } 
			   co++;
			   System.out.println();
			   
			   }
		   System.out.println("已存入员工信息数量："+co);
		   } 
	//添加员工信息 
	public static void addStudent(){
		   Scanner scanner=new Scanner(System.in);
		   System.out.print("请输入新的工号：");
		   String stuNo2=scanner.nextLine();
		   for(int i=0;i<count;i++){
			   if(students[i][0].equals(stuNo2)){
			   System.out.println("工号存在");
			 return ; 
			 }  
			   }
		   scanner=new Scanner(System.in);
		   System.out.print("请输入姓名：");
		   String stuName2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入年龄：");
		   String stuAge2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入学历：");
		   String stuTitle2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入职位：");
		   String stuMajor2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入特长：");
		   String stuHobby2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入宿舍：");
		   String stuDor2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入联系方式：");
		   String stuNum2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入出生日期：");
		   String stuBir2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入籍贯：");
		   String stuLoc2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入民族：");
		   String stuMin2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("请输入组织关系：");
		   String stuZu2=scanner.nextLine();
		   	scanner=new Scanner(System.in);
		   	   System.out.print("请输入成绩：");
		   	   String stuGra2=scanner.nextLine();
		   	
		   	   //将用户输入的新员工信息构造一个新的String数组
		   	   String[] tmpStu2={stuNo2,stuName2,stuAge2,stuTitle2,stuMajor2,stuHobby2,stuDor2,stuNum2,stuBir2,stuLoc2,stuMin2,stuZu2,stuGra2,};
		   	   //将此新员工添加到二维数组中
	    students[count]=tmpStu2;
	    count++;
		   }

	//修改学生信息
	public static void modifyStudent(){
		   //按学号查找对应的员工信息 
		   System.out.print("请输入需要修改的员工的学号：");
		   Scanner scanner=new Scanner(System.in);
		   String changeNo=scanner.nextLine();
		   int changeCount=0;
		   //标记，作为所找员工的标记
		   boolean changeFlag=false;
		   //标记，决定是否修改
		   for(int i=0;i<count;i++){
			   if(students[i][0].equals(changeNo)){
				   System.out.println("找到，信息如下：");
				   for(int j=0;j<students[i].length;j++){
					   System.out.print(students[i][j]+"\t");
					   }
				   changeCount=i;
				   changeFlag=true;
				   break;
				   }
			   }
		   System.out.println();
		   //修改 
		   if(changeFlag){
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的工号：");
			   String stuNo3=scanner.nextLine();
			   
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的姓名：");
			   String stuName3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的年龄：");
			   String stuAge3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的学历：");
			   String stuTitle3=scanner.nextLine();
			   System.out.print("请输入新的职位：");
			   String stuMajor3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的特长：");
			   String stuHobby3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的宿舍：");
			   String stuDor3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的联系方式：");
			   String stuNum3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的出生日期：");
			   String stuBir3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的籍贯：");
			   String stuLoc3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的民族：");
			   String stuMin3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("请输入新的组织关系：");
			   String stuZu3=scanner.nextLine();
			   scanner=new Scanner(System.in);
	   		   System.out.print("请输入考绩：");
	   		   String stuGra3=scanner.nextLine();
	   		   String[] tmpStu3={stuNo3,stuName3,stuAge3,stuTitle3,stuMajor3,stuHobby3,stuDor3,stuNum3,stuBir3,stuLoc3,stuMin3,stuZu3,stuGra3};
	   		   students[changeCount]=tmpStu3;
	        //显示修改后的学生信息
	        System.out.println("修改后的员工信息：");
	        for(int i=0;i<1;i++)
		            lookStudent();
	        }
	        else{
		            System.out.println("没找到！！！请核实输入数据！");
		            System.out.println();
		       }
	}
	//查询员工信息
	//按员工工号查询
	public static void queryStudentNo(){
	System.out.print("请输入需要查询的员工的工号：");
	Scanner scanner=new Scanner(System.in);
	String findNo=scanner.nextLine();
	boolean findFlag1=true;
	//标记，用来显示是否找到
	for(int i=0;i<count;i++){
	   if(students[i][0].equals(findNo)){
	   System.out.println("找到，信息如下：");
	   for(int j=0;j<students[i].length;j++){
	   System.out.print(students[i][j]+"\t");
	   }
	   findFlag1=false;
	   System.out.println();
	   System.out.println();
	   break;
	   }
	}
	   if(findFlag1){
	       System.out.println("抱歉，没有此人！");
	       System.out.println();
	       }
	   }
	//按员工姓名查询
	public static void queryStudentName(){
	System.out.print("请输入需要查询的员工的姓名：");
	Scanner scanner=new Scanner(System.in);
	String findName=scanner.nextLine();
	boolean findFlag2=true;
	//标记，用来显示是否找到信息
	for(int i=0;i<count;i++){
		   if(students[i][1].equals(findName)){
			   System.out.println("找到，信息如下：");
			   for(int j=0;j<students[i].length;j++){
				   System.out.print(students[i][j]+"\t");
				   }
			   findFlag2=false;
			   System.out.println();
			   }
		   if(i==count){
			   break;
			   }
		   }
	if(findFlag2){
		   System.out.println("抱歉，没有此人！");
		   System.out.println();
		   }
	} 
	//按员工年龄查询 
	public static void queryStudentAge(){
		System.out.print("请输入需要查询统计的年龄：");
		   Scanner scanner=new Scanner(System.in);
		   String findAge=scanner.nextLine();
		   boolean findFlag2=true;
		   //标记，用来显示是否找到信息 
		   for(int i=0;i<count;i++){
			   if(students[i][2].equals(findAge)){
				   System.out.println("该年龄有：");
				   for(int j=0;j<students[i].length;j++){
					   System.out.print(students[i][j]+"\t");
					  
					   } 
				   System.out.println("人数为:"+i);
				   findFlag2=false;
				   System.out.println();
				   }
			   if(i==count){
				   break;
				   }
			   }
		   if(findFlag2){
			   System.out.println("抱歉，没有此年龄段的人！")
			   ;System.out.println();
			   }
		   }

	//按员工职位查询

	public static void queryStudentTitle(){
		   System.out.print("请输入需要查询统计的员工的职位：");
		   Scanner scanner=new Scanner(System.in);
		   String findTitle=scanner.nextLine();
		   boolean findFlag4=true;
		   //标记，用来显示是否找到信息 
		   for(int i=0;i<count;i++){
			   if(students[i][3].equals(findTitle)){
				   System.out.println("找到，信息如下：");
				   for(int j=0;j<students[i].length;j++){
					   System.out.print(students[i][j]+"\t");
					   } 
				   findFlag4=false;System.out.println();
				   }
			   if(i==count){
				   break;
				   }
			   }
		   if(findFlag4){
			   System.out.println("抱歉，没有此人！")
			   ;System.out.println();
			   }
		   }
	public static void queryStudentDor(){
		   System.out.print("请输入需要查询的宿舍号：");
		   Scanner scanner=new Scanner(System.in);
		   String findDor=scanner.nextLine();
		   boolean findFlag5=true;
		   //标记，用来显示是否找到信息 
		   for(int i=0;i<count;i++){
			   if(students[i][6].equals(findDor)){
				   System.out.println("找到，信息如下：");
				   for(int j=0;j<students[i].length;j++){
					   System.out.print(students[i][j]+"\t");
					   } 
				   findFlag5=false;
				   System.out.println();
				   }
			   if(i==count){
				   break;
				   }
			   }
		   if(findFlag5){
			   System.out.println("抱歉，没有此信息！")
			   ;System.out.println();
			   }
		   }
	public static void queryStudentLoc(){
		   System.out.print("请输入需要查询统计的员工籍贯：");
		   Scanner scanner=new Scanner(System.in);
		   String findLoc=scanner.nextLine();
		   boolean findFlag6=true;
		   //标记，用来显示是否找到信息 
		   for(int i=0;i<count;i++){
			   if(students[i][9].equals(findLoc)){
				   System.out.println("找到，信息如下：");
				   for(int j=0;j<students[i].length;j++){
					   System.out.print(students[i][j]+"\t");
					   } 
				   findFlag6=false;System.out.println();
				   }
			   if(i==count){
				   break;
				   }
			   }
		   if(findFlag6){
			   System.out.println("抱歉，没有此信息！")
			   ;System.out.println();
			   }
		   }
	//删除学生信息
	public static void deleteStudent(){
		   //按学号查找对应的员工信息 
		   System.out.print("请输入需要删除的员工的学号：");
		   Scanner scanner=new Scanner(System.in);
		   String deleteNo=scanner.nextLine();
		   int deleteCount=0;
		   //标记，作为所找员工的标记
		   boolean deleteFlag=false;
		   //标记，决定是否删除
		   for(int i=0;i<count;i++){
			   if(students[i][0].equals(deleteNo)){
				   System.out.println("找到，信息如下：");
				   for(int j=0;j<students[i].length;j++){
					   System.out.print(students[i][j]+"\t");
					   }
				   deleteCount=i;
				   deleteFlag=true;
				   System.out.println();
				   break;
				   }
			   } 
		   //删除
		   if(deleteFlag){ 
			   for(int j=deleteCount+1;j<students[count].length;j++){
				   students[deleteCount]=students[j];
				   deleteCount++;
				   }
			   count--; 
			   //显示删除后的员工信息 
			   System.out.println("删除后的员工信息：");
			   lookStudent();
			   }
		   else{ 
			   System.out.println("没找到！！！请核实输入数据！");
			   System.out.println();
			   }
		   }


	//验证登录信息
	public static boolean verifyStudent(){ 
		   boolean verifyFlag=false;
		   System.out.print("请输入用户名：");
		   Scanner scanner=new Scanner(System.in);
		   String userName=scanner.nextLine();
		   System.out.print("请输入密码：");
		   scanner=new Scanner(System.in);
		   String password=scanner.nextLine(); 
		   if("staff".equals(userName)&&"123456".equals(password)){ 
			   verifyFlag=true;
			   }
		   return verifyFlag;
		   }
	public static void main(String[]args){
		   //main函数
		   initStudent();
		   //初始化员工信息数组 
		   Scanner scanner=new Scanner(System.in);
		   boolean firstFlag=false;
		   //标记位，据此决定是否退出一级菜单
		   while(true){
			   printFirstMenu();
			   //打印一级菜单
			   int firstChoice=scanner.nextInt();
			   //接受用户的操作
			   switch(firstChoice){ 
			   case 1:
			   boolean Flag1=verifyStudent() ;
				   
			   //控制输出二级菜单（验证通过会输出）
			   if(Flag1){ 
				   boolean secondFlag=true;
			   //标记位，决定是否退出二级菜单
			   do{ 
				   printSecondMenu();
				   //打印二级菜单
				   scanner=new Scanner(System.in);
				   int secondChoice=scanner.nextInt();
				   switch(secondChoice){
				   case 1:
					   //查看员工信息
					   lookStudent();
				   System.out.print("输入0返回上一菜单——>:");
				   scanner=new Scanner(System.in);
				   int back1=scanner.nextInt();
				   if(back1==0){
					   break; 
					   }
				   break;
				   case 2://添加员工信息 
					   addStudent();
				   //显示添加后的员工信息 
					   
				   System.out.println("已添加！");
				   System.out.println("************");
				   System.out.print("输入0返回上一菜单——>:");
				   scanner=new Scanner(System.in);
				   int back2=scanner.nextInt();
				   if(back2==0){
					   break;
					   }
				   break;
				   case 3:
					   //修改员工信息 
					   modifyStudent();
				   System.out.print("输入0返回上一菜单——>:");
				   scanner=new Scanner(System.in);
				   int back3=scanner.nextInt();
				   if(back3==0){
					   break;
					   }
				   break;
				   case 4:
					   //查询员工信息
					   boolean thirdFlag=false;//标记，决定是否退出第三级菜单
				   while(true){
					   printThirdMenu();
					   //打印三级菜单
					   scanner=new Scanner(System.in);
					   int thirdChoice=scanner.nextInt();
					   switch(thirdChoice){
					   case 1:
						   //按员工学号查询 
						   queryStudentNo();
					   System.out.print("输入0返回上一菜单——>:");
					   scanner=new Scanner(System.in);
					   int back4=scanner.nextInt();
					   if(back4==0){  
						   break;
						   }
					   break;
					   case 2://按员工姓名查询
						   queryStudentName(); 
					   System.out.print("输入0返回上一菜单——>:");
					   scanner=new Scanner(System.in);
					   int back5=scanner.nextInt();
					   if(back5==0){ 
						   break;
						   }
					   break;
					   case 3://按员工年龄查询 
						   queryStudentAge();
					   System.out.print("输入0返回上一菜单——>:");
					   scanner=new Scanner(System.in);
					   int back6=scanner.nextInt();
					   if(back6==0){ 
						   break; 
						   }
					   break;
					   case 4://按员工职位查询
						   queryStudentTitle();
					   System.out.print("输入0返回上一菜单——>:");
					   scanner=new Scanner(System.in);
					   int back7=scanner.nextInt();
					   if(back7==0){ 
						   break;
						   }
					   break;
					   case 5://按员工宿舍
						   queryStudentDor();
					   System.out.print("输入0返回上一菜单——>:");
					   scanner=new Scanner(System.in);
					   int back8=scanner.nextInt();
					   if(back8==0){ 
						   break;
						   }
					   break;
					   case 6://按员工籍贯
						   
						   queryStudentLoc();
					   case 7:
					   bubblepre();
					   System.out.print("输入0返回上一菜单——>:");
					   scanner=new Scanner(System.in);
					   int back9=scanner.nextInt();
					   if(back9==0){ 
						   break;
						   }
					   break;
					   case 0: //退出第三级菜单 
						   thirdFlag=true;
					   break;
					   default:
						   break;
					   }
					   if(thirdFlag) 
						   break; 
					   }
				   break; 
				   case 5://删除员工信息 
					   deleteStudent(); 
				   System.out.print("输入0返回上一菜单——>:");
				   scanner=new Scanner(System.in);
				   int back8=scanner.nextInt();
				   if(back8==0){ 
					   break;
					   }
				   break;
				   case 7:
					   bubblepre();
				
				   case 6://退出二级菜单
					   secondFlag=false;
				   break;
				   default: break;}
				   }
			   while(secondFlag);
			   break;
			   }
			   else{
				   System.out.println("用户名或密码错误");
				   }
			   break;
			   case 2: 
				   firstFlag=true;
			   break;
			   default: break;
			   }
			   if(firstFlag) 
				   break; 
			   }
		   System.out.println("*********************** 谢 谢 使 用 ************************"); 
		   	   
		   }
	
	//排序开始调用bubblepre()开始排序，students.length是由你输入的确定
	public static void bubblepre() {
	int[] d=new int[students.length];
	for(int i=0;i<d.length;i++) {
		d[i]=Integer.parseInt(students[i][2]);
		
	}
	bubblesort(d);
	}
	 public static void bubblesort(int[] lst)
	  {
	    int n = lst.length;
	    boolean swapped;
	    do
	    {
	      swapped = false;
	      for (int i = 0; i < n - 1; i++) {
	        if (lst[i] > lst[(i + 1)])
	        {
	          int temp = lst[i];
	          lst[i] = lst[(i + 1)];
	          lst[(i + 1)] = temp;
	          swapped = true;
	        }
	      }
	    } while (swapped);
	    ArrayList<Integer> a=new   ArrayList<Integer>();
	    for(int c=0;c<lst.length;c++) {
	    	if(!a.contains(lst[c])) {
	    		a.add(lst[c]);
	    		
	    	}
	    }
	 
	 for(int i=0;i<a.size();i++) {
		 for(int j=0;j<students.length;j++){
			 if(a.get(i)==Integer.parseInt(students[j][2])){
				 System.out.println(students[j][1]);
				 
			 }
		 }
		 
	 }
	System.out.println("排序完毕");
	  }
	
	


}
