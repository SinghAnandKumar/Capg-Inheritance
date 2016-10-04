package com.test;

public class B extends A {
	String s1 = "B";
	String getS1() {return s1;}
//	static void m() {System.out.print("B");}
	void m() {System.out.print("B");}
	public void m2() {System.out.print("B2");}

	String s11 = "B.s1";
	  public static void main(String args[]) {
	    B x = new B(); A y = (A)x;
	    System.out.println(x.s1+" "+x.s2+" "+y.s1+" "+y.s2);
	}

}
