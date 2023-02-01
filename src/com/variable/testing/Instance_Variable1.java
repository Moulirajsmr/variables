package com.variable.testing;


public class Instance_Variable1 {
	
	int a = 600000;
	private void chennai() {
		int a = 600001;
		System.out.println("chennai pincode = " + a);
	}
	private void salem() {
		a = 636000;
		System.out.println("salem pincode = " + a);
	}
	private void coimbatore() {
		a = 641001;
		System.out.println("coimbatore pincode = " + a);
	}
	public static void main(String[] args) {
		Instance_Variable1 p = new Instance_Variable1();
		p.chennai();
		System.out.println("tamilnadu = " + p.a);
		p.salem();
		p.coimbatore();
	}

}
