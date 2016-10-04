package com.test;

/*public class F {
	
		  public static void main (String[] s) {
		    D x = new E(); 
		    System.out.print(x.s1 + x.getS1());
		}
		  }*/

public class F extends E {
	void printS1() {
		System.out.print("F.printS1 ");
	}

	static void printS2() {
		System.out.print("F.printS2");
	}

	public static void main(String args[]) {
		E x = new F();
		x.printS1();
		x.printS2();
	}

}