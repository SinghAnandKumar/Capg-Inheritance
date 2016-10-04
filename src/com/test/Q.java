package com.test;

public class Q extends P{
	  static void printS1(){System.out.print("Q.printS1 ");}
	  void printS2(){System.out.print("Q.printS2 ");}
	  public static void main(String[] args) {
	    new Q().printS1S2();
	}

}
