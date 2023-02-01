package com.variable.testing;

public class Instance_Variable {
	
int a;
	
	private void states() {
		int a = 500;
		a = 600;
		System.out.println("the value of states = " + a);

	}
	
	private void district() {
		
		a = 700;
		System.out.println("value of district = " + a);

	}
	public static void main(String[] args) {
		Instance_Variable k = new Instance_Variable();
		k.states();
		k.district();
		System.out.println("total value = " + k.a);
	}

}
