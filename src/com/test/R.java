package com.test;

public class R {

	  private void printS1(){System.out.print("R.printS1 ");}
	  protected void printS2() {System.out.print("R.printS2 ");}
	  protected void printS1S2(){printS1();printS2();}
}
