package com.test;

//public abstract class D {
public class D extends C {
	String s1 = "D";

	/*
	 * static void m() {System.out.print("D");} String getS1() {return s1;}
	 * public static void main(String[] args) { C c = new C(); c.m(); B b = c;
	 * b.m(); A a = b; a.m(); }
	 */

	/*
	 * static void m1(A x) {System.out.print(x.s1);} static void m1(B x)
	 * {System.out.print(x.s1);} static void m1(C x) {System.out.print(x.s1);}
	 * public static void main(String[] args) { A a; B b; C c; a = b = c = new
	 * C(); m1(a); m1(b); m1(c); }
	 */

	/*
	 * void m1() { System.out.print(this.s1 + ","); // 1
	 * System.out.print(((C)this).s1 + ","); // 2 System.out.print(((B)this).s1
	 * + ","); // 3 System.out.print(((A)this).s1); // 4 } public static void
	 * main (String[] args) { new D().m1(); // 5 }
	 */

	/*
	 * void m() {System.out.print("D");} void m2() { m(); ((C)this).m(); // 1
	 * ((B)this).m(); // 2 ((A)this).m(); // 3 } public static void main
	 * (String[] args) { new D().m2(); // 4 }
	 */

	// Q7
	void printS1() {
		System.out.print("D.printS1 ");
	}

	static void printS2() {
		System.out.print("D.printS2 ");
	}

	public static void main(String args[]) {
		C c = new D();
		c.printS1();
		c.printS2();
	}

}
