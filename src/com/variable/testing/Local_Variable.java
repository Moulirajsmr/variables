package com.variable.testing;

public class Local_Variable {
	
	protected void bike() {
		long a = 15092;
		
		a = 190;
		
		a =1809974232285328l;
		
		System.out.println("the value of honda = " + a);

	}
	
	private void car() {
		int a = 10;
		
		System.out.println("the value of maruti = " + a);
	
	}
	public static void main(String[] args) {
		Local_Variable s = new Local_Variable();
		s.bike();
		s.car();
	}
	
	

}
