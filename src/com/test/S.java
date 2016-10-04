package com.test;

public class S extends R {
	  private void printS1(){System.out.print("S.printS1 ");}
	  protected void printS2(){System.out.print("S.printS2 ");}
	  public static void main(String[] args) {
	    new S().printS1S2();
	}
}
