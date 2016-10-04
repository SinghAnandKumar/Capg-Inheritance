package com.simulationdemo;

public class Entry {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Feline","corner");
		
		System.out.println(cat1.getType());
		System.out.println(cat1.getLocation());
		System.out.println(cat1.getSize());
		cat1.roam();
		
		Animal a;
		a = cat1;
		
		System.out.println("\n\n"+a.getType());
		System.out.println(a.getLocation());
		//System.out.println(a.getSize());  can't access size bcase  it is cats attr
		a.roam();
		
		Feline f;
		f=cat1;
		
		System.out.println("\n\n"+f.getType());
		System.out.println(f.getLocation());
		//System.out.println(f.getSize());
		f.roam();
		
	}
}
