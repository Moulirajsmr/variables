package com.variable.testing;

public class Static_Class_Variable {
	
	int a = 100;
	static int b = 200;
	
	private void one() {
		System.out.println("Instance="+ ++a);
		System.out.println("Static=" + ++b);
	}
	
	private void two() {
		System.out.println("Instance 1=" + ++a);
		System.out.println("Static 2=" + ++b);
	}
	
	public static void main(String[] args) {
		Static_Class_Variable l = new Static_Class_Variable();
		l.one();
		l.two();
		System.out.println("----------------");
		Static_Class_Variable m = new Static_Class_Variable();
		System.out.println(m.a);
		System.out.println(b);
		m.one();
		m.two();
		}

}
