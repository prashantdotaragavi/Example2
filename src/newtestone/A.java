package newtestone;

import java.security.DomainCombiner;

//public class A {
//	A(){
//	System.out.println();
//	}
//	A(int x){
//		System.out.println(x);
//	}
//	A(int x,int y){
//		System.out.println(x);
//		System.out.println(y);
//	}
//	public static void main(String[] args) {
//		A a1 = new A(1);
//		A a2 = new A(1);
//		A a3 = new A(2,3);
//		
//	}
	//Exception Handling
//	public class A {
//	public static void main(String[] args) {
//		try {
//		int x = 60;
//		int y = 0;
//		int z = x/y;
//		System.out.println(z);
//		//System.out.println("welcome");
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("welcome");
//	}	]
//}


//abstract public class A{
//	int x = 10;
//	static int y = 200;
//	public void test1 ()
//	{
//		System.out.println(1);		
//	}
//	public abstract void test2();
//	public void test3();//error incomplete abstract method is mandatory
//	public static void main(String[] args) {
//		A a1 = new A();//error  Object not Created
//	}
//}
	
	//Null Pointer EH
//	public class A{
//		int x =  10;
//		public static void main(String[] args) {
//			A a1 = null;
//			try {
//				System.out.println(a1.x);
//			}catch (NullPointerException n){
//				n.printStackTrace();
//				}
//			System.out.println(100);
//			}		
//		}


public class A{
public static void main(String[] args) {
	String Str = "hkukckdjcijd";
	try {
		int val = Integer.parseInt (Str);
		System.out.println(val);
	}catch(NumberFormatException e){	
		e.printStackTrace();
	}
	System.out.println(200);
	}
	}

	
	