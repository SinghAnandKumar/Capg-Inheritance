package com.simulationdemo;

public class Person implements Comparable{
	String name = "NA";
	int age = 0;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o){
		return this.age ==((Person)o).age;
	}


//	@Override
//	public int compareTo(Person o) {
//		System.out.println(this+" compared to "+o);
//		int diff = this.age - o.age;
//		return 0;
//	}
	
	@Override
	public int compareTo(Object o) {
		//System.out.println(this+" compared to "+o);
		int diff = this.age - ((Person)o).age;
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "[ "+name+":"+age+"]";
	}
}
