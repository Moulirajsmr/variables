package com.variable.testing;


public class Static_Variable1 {
	
static long c ;
	
	private void sachin() {
		long c = 792384391283l;
		System.out.println("sachin aadhar no : " + c);
	}
	private void dravid() {
		System.out.println("dravid aadhar no : " + c);
	}
	private void kholi() {
		c = 419367295368l;
		System.out.println("kholi aadhar no : " + c);
	}
	public static void main(String[] args) {
		Static_Variable1 k = new Static_Variable1();
		k.sachin();
		k.dravid();
		System.out.println("unknown aadhar no : " + c);
		k.kholi();
	}

}
