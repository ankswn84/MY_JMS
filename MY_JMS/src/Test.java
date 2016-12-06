
class Test1{
	
	public static void show(){
		System.out.println("parent caleed");
	}
	public  void show1(){
		System.out.println("parent caleed non static");
	}
	public Test1(){
		show();
		show1();
	}
}

public class Test extends Test1{
	static String name ="Test";
	public Test(int j){
		//super(j);
		show();
		System.out.println("2");
	}
	/*public  void show1(){
		System.out.println("child called non static");
	}
public static void show() {
		System.out.println("child called");
	}*/
public static void main(String []aa) {
	
	//Test t = new Test(2);
	//Test1.show();
	//System.out.println(name);
String s = "Java";
String s1 = "Programming";
String s2 = s+s1;
String s3 = "JavaProgramming";
System.out.println(s2==s3);
Integer i =129;
Integer i1 =129;
System.out.println(i==i1);
}
}
