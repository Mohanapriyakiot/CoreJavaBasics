package com.basicSamples;

public class Calculator {
	
	//instant variable
	int number;
	//class variable
	static int c;
	int a;
	
	final double pi=3.14;
	// a b are parameters
	public void add(int a, int b) {
		//local variable
		int sum;
		sum=a+b;
		System.out.println(a+b);
	}
	public void area(double radius) {
		pi = 5.23;
		double area = pi*radius*radius;
	}

	public static void main(String[] args) {
		Calculator calobj = new Calculator();
		calobj.add(10, 25);
		calobj.number=10;
		c=15;
		}

}
