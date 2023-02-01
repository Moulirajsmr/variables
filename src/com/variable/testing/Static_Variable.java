package com.variable.testing;

public class Static_Variable {

	static int b = 100;

	private void lion() {
		b = 100;
		b = 200;
		System.out.println("number of lion = " + b);
	}

	private void deer() {
		b = 400;
		b = 800;
		System.out.println("number of deer = " + b);
	}

	private void tiger() {

		System.out.println("number of tiger = " + b);
	}

	public static void main(String[] args) {
		Static_Variable m = new Static_Variable();
		m.lion();
		m.tiger();
		m.deer();
	    m.lion();
		m.tiger();
		System.out.println("animals = " + b);

	}
}
