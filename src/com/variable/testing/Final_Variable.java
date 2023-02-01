package com.variable.testing;

public class Final_Variable {
	
	final int c =100;
	
	private void moto() {
		int c = 700 ;
		System.out.println("number of moto = " + c);
	}
	private void vivo() {
		System.out.println("number of vivo = " + c);
	}
	private void mi() {
		int c = 800;
		System.out.println("number of mi = " + c);
	}
	public static void main(String[] args) {
		Final_Variable n = new Final_Variable();
		n.moto();
		n.vivo();
		n.mi();
		System.out.println("mobiles = " + n.c);
	}

}
