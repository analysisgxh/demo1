import java.util.ArrayList;
import java.util.Scanner;

public class gai {
	
	
		   //����һ����άString�������飬������Ա������Ϣ
		   static String[][]students=new String[7][7];
		   static int count=7;
		   //��ŵ�ǰ��Ա������ 
		   //��ӡһ���˵� 
		   public static void printFirstMenu(){ 
			   //���һ���˵� 
			   System.out.println("*************��ӭʹ��Ա����Ϣ����ϵͳ�����װ棩 ***********");
			   System.out.println("********************************************************");
			   System.out.println("1.��½");
			   System.out.println();
			   System.out.println("2.�˳� ");
			   System.out.println("********************************************************");
			   System.out.print("��ѡ��Ҫִ�еĲ�����");
			   }
		   //��ӡ�����˵� 
		   public static void printSecondMenu(){
			   //��������˵�
			  System.out.println("*************��ӭʹ��Ա����Ϣ����ϵͳ�����װ棩 ***********");
			  System.out.println("********************************************************");
			  System.out.println(" 1.�鿴Ա����Ϣ");
			  System.out.println();
		      System.out.println(" 2.���Ա����Ϣ ");
		     System.out.println();
	        System.out.println(" 3.�޸�Ա����Ϣ ");
	        System.out.println();
	        System.out.println(" 4.��ѯͳ��Ա����Ϣ ");
	        System.out.println();
	        System.out.println(" 5.ɾ��Ա����Ϣ ");
	        System.out.println();
	        System.out.println("7.��������");
	        System.out.println(" 6.�� �� ");
	        System.out.println("********************************************************");
	        System.out.print("��ѡ��Ҫִ�еĲ�����");
	} 
	//��ӡ�����˵� 
	public static void printThirdMenu(){
		   //����������˵� 
		   System.out.println("*************��ӭʹ��Ա����Ϣ����ϵͳ����ѯͳ�ƽ��棩 ***********");
		   System.out.println("********************************************************");
		   System.out.println(" 1.Ա�����Ų�ѯ");
		   System.out.println();
		   System.out.println(" 2.Ա��������ѯ ");
		   System.out.println();
		   System.out.println(" 3.Ա�������ѯͳ��");
		   System.out.println();
		   System.out.println(" 4.Ա��ְ���ѯ");
		   System.out.println();
		   System.out.println(" 5.Ա�������ѯ");
		   System.out.println();
		 
		   System.out.println(" 0.�� �� ");
		   System.out.println("********************************************************");
		   System.out.print("��ѡ��Ҫִ�еĲ�����");
		   }
	//�����ʼ������
	public static void initStudent(){
		   String[]s1={"s001","����","21","Ա��","����","1#201","8677314","1995.2.11","����","����","��Ա"};
		   String[]s2={"s002","����","22","Ա��","����","1#205","6234871","1994.5.25","�ĳ�","����","��Ա"};
		   String[]s3={"s003","����","23","����","����","3#402","8325541","1993.12.01","��̨","����","��Ա"};
		   String[]s4={"s004","��ΰ","28","Ա��","�����","4#628","9418726","1995.2.17","����","����","��Ա"};
		   String[]s5={"s005","����","29","����","�赸","4#601","7623993","1994.1.13","����","����","��Ա"};
		   String[]s6={"s006","����","31","Ա��","����","3#311","6300873","1996.6.23","�ൺ","����","��Ա"};
		   String[]s7={"s007","����","31","Ա��","����","3#302","7365363","1995.4.15","Ϋ��","����","��Ա"};
		   students[0]=s1;
		   students[1]=s2;
		   students[2]=s3;
		   students[3]=s4;
		   students[4]=s5;
		   students[5]=s6;
		   students[6]=s7;
		   } 
	//�鿴ѧ����Ϣ 
	public static void lookStudent(){
		System.out.println("����               ����                ����                ְλ                    �س�                  ����                  ��ϵ��ʽ                   ��������                    ����                 ����                   ������ò");
		int  co=0; 
		   for(int i=0;i<count;i++){
			   for(int j=0;j<students[i].length;j++){
				   
				   System.out.print(students[i][j]+"\t");
				  
				   } 
			   co++;
			   System.out.println();
			   
			   }
		   System.out.println("�Ѵ���Ա����Ϣ������"+co);
		   } 
	//���Ա����Ϣ 
	public static void addStudent(){
		   Scanner scanner=new Scanner(System.in);
		   System.out.print("�������µĹ��ţ�");
		   String stuNo2=scanner.nextLine();
		   for(int i=0;i<count;i++){
			   if(students[i][0].equals(stuNo2)){
			   System.out.println("���Ŵ���");
			 return ; 
			 }  
			   }
		   scanner=new Scanner(System.in);
		   System.out.print("������������");
		   String stuName2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("���������䣺");
		   String stuAge2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("������ѧ����");
		   String stuTitle2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("������ְλ��");
		   String stuMajor2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("�������س���");
		   String stuHobby2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("���������᣺");
		   String stuDor2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("��������ϵ��ʽ��");
		   String stuNum2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("������������ڣ�");
		   String stuBir2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("�����뼮�᣺");
		   String stuLoc2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("���������壺");
		   String stuMin2=scanner.nextLine();
		   scanner=new Scanner(System.in);
		   System.out.print("��������֯��ϵ��");
		   String stuZu2=scanner.nextLine();
		   	scanner=new Scanner(System.in);
		   	   System.out.print("������ɼ���");
		   	   String stuGra2=scanner.nextLine();
		   	
		   	   //���û��������Ա����Ϣ����һ���µ�String����
		   	   String[] tmpStu2={stuNo2,stuName2,stuAge2,stuTitle2,stuMajor2,stuHobby2,stuDor2,stuNum2,stuBir2,stuLoc2,stuMin2,stuZu2,stuGra2,};
		   	   //������Ա����ӵ���ά������
	    students[count]=tmpStu2;
	    count++;
		   }

	//�޸�ѧ����Ϣ
	public static void modifyStudent(){
		   //��ѧ�Ų��Ҷ�Ӧ��Ա����Ϣ 
		   System.out.print("��������Ҫ�޸ĵ�Ա����ѧ�ţ�");
		   Scanner scanner=new Scanner(System.in);
		   String changeNo=scanner.nextLine();
		   int changeCount=0;
		   //��ǣ���Ϊ����Ա���ı��
		   boolean changeFlag=false;
		   //��ǣ������Ƿ��޸�
		   for(int i=0;i<count;i++){
			   if(students[i][0].equals(changeNo)){
				   System.out.println("�ҵ�����Ϣ���£�");
				   for(int j=0;j<students[i].length;j++){
					   System.out.print(students[i][j]+"\t");
					   }
				   changeCount=i;
				   changeFlag=true;
				   break;
				   }
			   }
		   System.out.println();
		   //�޸� 
		   if(changeFlag){
			   scanner=new Scanner(System.in);
			   System.out.print("�������µĹ��ţ�");
			   String stuNo3=scanner.nextLine();
			   
			   scanner=new Scanner(System.in);
			   System.out.print("�������µ�������");
			   String stuName3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("�������µ����䣺");
			   String stuAge3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("�������µ�ѧ����");
			   String stuTitle3=scanner.nextLine();
			   System.out.print("�������µ�ְλ��");
			   String stuMajor3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("�������µ��س���");
			   String stuHobby3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("�������µ����᣺");
			   String stuDor3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("�������µ���ϵ��ʽ��");
			   String stuNum3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("�������µĳ������ڣ�");
			   String stuBir3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("�������µļ��᣺");
			   String stuLoc3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("�������µ����壺");
			   String stuMin3=scanner.nextLine();
			   scanner=new Scanner(System.in);
			   System.out.print("�������µ���֯��ϵ��");
			   String stuZu3=scanner.nextLine();
			   scanner=new Scanner(System.in);
	   		   System.out.print("�����뿼����");
	   		   String stuGra3=scanner.nextLine();
	   		   String[] tmpStu3={stuNo3,stuName3,stuAge3,stuTitle3,stuMajor3,stuHobby3,stuDor3,stuNum3,stuBir3,stuLoc3,stuMin3,stuZu3,stuGra3};
	   		   students[changeCount]=tmpStu3;
	        //��ʾ�޸ĺ��ѧ����Ϣ
	        System.out.println("�޸ĺ��Ա����Ϣ��");
	        for(int i=0;i<1;i++)
		            lookStudent();
	        }
	        else{
		            System.out.println("û�ҵ����������ʵ�������ݣ�");
		            System.out.println();
		       }
	}
	//��ѯԱ����Ϣ
	//��Ա�����Ų�ѯ
	public static void queryStudentNo(){
	System.out.print("��������Ҫ��ѯ��Ա���Ĺ��ţ�");
	Scanner scanner=new Scanner(System.in);
	String findNo=scanner.nextLine();
	boolean findFlag1=true;
	//��ǣ�������ʾ�Ƿ��ҵ�
	for(int i=0;i<count;i++){
	   if(students[i][0].equals(findNo)){
	   System.out.println("�ҵ�����Ϣ���£�");
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
	       System.out.println("��Ǹ��û�д��ˣ�");
	       System.out.println();
	       }
	   }
	//��Ա��������ѯ
	public static void queryStudentName(){
	System.out.print("��������Ҫ��ѯ��Ա����������");
	Scanner scanner=new Scanner(System.in);
	String findName=scanner.nextLine();
	boolean findFlag2=true;
	//��ǣ�������ʾ�Ƿ��ҵ���Ϣ
	for(int i=0;i<count;i++){
		   if(students[i][1].equals(findName)){
			   System.out.println("�ҵ�����Ϣ���£�");
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
		   System.out.println("��Ǹ��û�д��ˣ�");
		   System.out.println();
		   }
	} 
	//��Ա�������ѯ 
	public static void queryStudentAge(){
		System.out.print("��������Ҫ��ѯͳ�Ƶ����䣺");
		   Scanner scanner=new Scanner(System.in);
		   String findAge=scanner.nextLine();
		   boolean findFlag2=true;
		   //��ǣ�������ʾ�Ƿ��ҵ���Ϣ 
		   for(int i=0;i<count;i++){
			   if(students[i][2].equals(findAge)){
				   System.out.println("�������У�");
				   for(int j=0;j<students[i].length;j++){
					   System.out.print(students[i][j]+"\t");
					  
					   } 
				   System.out.println("����Ϊ:"+i);
				   findFlag2=false;
				   System.out.println();
				   }
			   if(i==count){
				   break;
				   }
			   }
		   if(findFlag2){
			   System.out.println("��Ǹ��û�д�����ε��ˣ�")
			   ;System.out.println();
			   }
		   }

	//��Ա��ְλ��ѯ

	public static void queryStudentTitle(){
		   System.out.print("��������Ҫ��ѯͳ�Ƶ�Ա����ְλ��");
		   Scanner scanner=new Scanner(System.in);
		   String findTitle=scanner.nextLine();
		   boolean findFlag4=true;
		   //��ǣ�������ʾ�Ƿ��ҵ���Ϣ 
		   for(int i=0;i<count;i++){
			   if(students[i][3].equals(findTitle)){
				   System.out.println("�ҵ�����Ϣ���£�");
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
			   System.out.println("��Ǹ��û�д��ˣ�")
			   ;System.out.println();
			   }
		   }
	public static void queryStudentDor(){
		   System.out.print("��������Ҫ��ѯ������ţ�");
		   Scanner scanner=new Scanner(System.in);
		   String findDor=scanner.nextLine();
		   boolean findFlag5=true;
		   //��ǣ�������ʾ�Ƿ��ҵ���Ϣ 
		   for(int i=0;i<count;i++){
			   if(students[i][6].equals(findDor)){
				   System.out.println("�ҵ�����Ϣ���£�");
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
			   System.out.println("��Ǹ��û�д���Ϣ��")
			   ;System.out.println();
			   }
		   }
	public static void queryStudentLoc(){
		   System.out.print("��������Ҫ��ѯͳ�Ƶ�Ա�����᣺");
		   Scanner scanner=new Scanner(System.in);
		   String findLoc=scanner.nextLine();
		   boolean findFlag6=true;
		   //��ǣ�������ʾ�Ƿ��ҵ���Ϣ 
		   for(int i=0;i<count;i++){
			   if(students[i][9].equals(findLoc)){
				   System.out.println("�ҵ�����Ϣ���£�");
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
			   System.out.println("��Ǹ��û�д���Ϣ��")
			   ;System.out.println();
			   }
		   }
	//ɾ��ѧ����Ϣ
	public static void deleteStudent(){
		   //��ѧ�Ų��Ҷ�Ӧ��Ա����Ϣ 
		   System.out.print("��������Ҫɾ����Ա����ѧ�ţ�");
		   Scanner scanner=new Scanner(System.in);
		   String deleteNo=scanner.nextLine();
		   int deleteCount=0;
		   //��ǣ���Ϊ����Ա���ı��
		   boolean deleteFlag=false;
		   //��ǣ������Ƿ�ɾ��
		   for(int i=0;i<count;i++){
			   if(students[i][0].equals(deleteNo)){
				   System.out.println("�ҵ�����Ϣ���£�");
				   for(int j=0;j<students[i].length;j++){
					   System.out.print(students[i][j]+"\t");
					   }
				   deleteCount=i;
				   deleteFlag=true;
				   System.out.println();
				   break;
				   }
			   } 
		   //ɾ��
		   if(deleteFlag){ 
			   for(int j=deleteCount+1;j<students[count].length;j++){
				   students[deleteCount]=students[j];
				   deleteCount++;
				   }
			   count--; 
			   //��ʾɾ�����Ա����Ϣ 
			   System.out.println("ɾ�����Ա����Ϣ��");
			   lookStudent();
			   }
		   else{ 
			   System.out.println("û�ҵ����������ʵ�������ݣ�");
			   System.out.println();
			   }
		   }


	//��֤��¼��Ϣ
	public static boolean verifyStudent(){ 
		   boolean verifyFlag=false;
		   System.out.print("�������û�����");
		   Scanner scanner=new Scanner(System.in);
		   String userName=scanner.nextLine();
		   System.out.print("���������룺");
		   scanner=new Scanner(System.in);
		   String password=scanner.nextLine(); 
		   if("staff".equals(userName)&&"123456".equals(password)){ 
			   verifyFlag=true;
			   }
		   return verifyFlag;
		   }
	public static void main(String[]args){
		   //main����
		   initStudent();
		   //��ʼ��Ա����Ϣ���� 
		   Scanner scanner=new Scanner(System.in);
		   boolean firstFlag=false;
		   //���λ���ݴ˾����Ƿ��˳�һ���˵�
		   while(true){
			   printFirstMenu();
			   //��ӡһ���˵�
			   int firstChoice=scanner.nextInt();
			   //�����û��Ĳ���
			   switch(firstChoice){ 
			   case 1:
			   boolean Flag1=verifyStudent() ;
				   
			   //������������˵�����֤ͨ���������
			   if(Flag1){ 
				   boolean secondFlag=true;
			   //���λ�������Ƿ��˳������˵�
			   do{ 
				   printSecondMenu();
				   //��ӡ�����˵�
				   scanner=new Scanner(System.in);
				   int secondChoice=scanner.nextInt();
				   switch(secondChoice){
				   case 1:
					   //�鿴Ա����Ϣ
					   lookStudent();
				   System.out.print("����0������һ�˵�����>:");
				   scanner=new Scanner(System.in);
				   int back1=scanner.nextInt();
				   if(back1==0){
					   break; 
					   }
				   break;
				   case 2://���Ա����Ϣ 
					   addStudent();
				   //��ʾ��Ӻ��Ա����Ϣ 
					   
				   System.out.println("����ӣ�");
				   System.out.println("************");
				   System.out.print("����0������һ�˵�����>:");
				   scanner=new Scanner(System.in);
				   int back2=scanner.nextInt();
				   if(back2==0){
					   break;
					   }
				   break;
				   case 3:
					   //�޸�Ա����Ϣ 
					   modifyStudent();
				   System.out.print("����0������һ�˵�����>:");
				   scanner=new Scanner(System.in);
				   int back3=scanner.nextInt();
				   if(back3==0){
					   break;
					   }
				   break;
				   case 4:
					   //��ѯԱ����Ϣ
					   boolean thirdFlag=false;//��ǣ������Ƿ��˳��������˵�
				   while(true){
					   printThirdMenu();
					   //��ӡ�����˵�
					   scanner=new Scanner(System.in);
					   int thirdChoice=scanner.nextInt();
					   switch(thirdChoice){
					   case 1:
						   //��Ա��ѧ�Ų�ѯ 
						   queryStudentNo();
					   System.out.print("����0������һ�˵�����>:");
					   scanner=new Scanner(System.in);
					   int back4=scanner.nextInt();
					   if(back4==0){  
						   break;
						   }
					   break;
					   case 2://��Ա��������ѯ
						   queryStudentName(); 
					   System.out.print("����0������һ�˵�����>:");
					   scanner=new Scanner(System.in);
					   int back5=scanner.nextInt();
					   if(back5==0){ 
						   break;
						   }
					   break;
					   case 3://��Ա�������ѯ 
						   queryStudentAge();
					   System.out.print("����0������һ�˵�����>:");
					   scanner=new Scanner(System.in);
					   int back6=scanner.nextInt();
					   if(back6==0){ 
						   break; 
						   }
					   break;
					   case 4://��Ա��ְλ��ѯ
						   queryStudentTitle();
					   System.out.print("����0������һ�˵�����>:");
					   scanner=new Scanner(System.in);
					   int back7=scanner.nextInt();
					   if(back7==0){ 
						   break;
						   }
					   break;
					   case 5://��Ա������
						   queryStudentDor();
					   System.out.print("����0������һ�˵�����>:");
					   scanner=new Scanner(System.in);
					   int back8=scanner.nextInt();
					   if(back8==0){ 
						   break;
						   }
					   break;
					   case 6://��Ա������
						   
						   queryStudentLoc();
					   case 7:
					   bubblepre();
					   System.out.print("����0������һ�˵�����>:");
					   scanner=new Scanner(System.in);
					   int back9=scanner.nextInt();
					   if(back9==0){ 
						   break;
						   }
					   break;
					   case 0: //�˳��������˵� 
						   thirdFlag=true;
					   break;
					   default:
						   break;
					   }
					   if(thirdFlag) 
						   break; 
					   }
				   break; 
				   case 5://ɾ��Ա����Ϣ 
					   deleteStudent(); 
				   System.out.print("����0������һ�˵�����>:");
				   scanner=new Scanner(System.in);
				   int back8=scanner.nextInt();
				   if(back8==0){ 
					   break;
					   }
				   break;
				   case 7:
					   bubblepre();
				
				   case 6://�˳������˵�
					   secondFlag=false;
				   break;
				   default: break;}
				   }
			   while(secondFlag);
			   break;
			   }
			   else{
				   System.out.println("�û������������");
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
		   System.out.println("*********************** л л ʹ �� ************************"); 
		   	   
		   }
	
	//����ʼ����bubblepre()��ʼ����students.length�����������ȷ��
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
	System.out.println("�������");
	  }
	
	


}
