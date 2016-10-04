package com.test;

//public class C extends B implements I{
public class C{
	
	String s1 = "C";
	
	String getS1() {return s1;}
	
//Q7	
		  void printS1() {System.out.print("C.printS1 ");}
		  static void printS2() {System.out.print("C.printS2 ");}

	
//	static void m() {System.out.print("C");}
	/*void m() {System.out.print("C");}
	
	void printIt() {
	    System.out.print(((A)this).s1 + ((B)this).s1 +
	                     ((C)this).s1 + ((I)this).s1);
	  }
	  public static void main (String[] args) {new C().printIt();
	}*/
	
	 /* public static void main(String[] args) {
		    A a1 = new B();
		    a1.m();      // 1
		    a1.m2();      // 2
		   ((B)a1).m();  // 3
		   ((B)a1).m2();  // 4
		}*/

}