package com.rukshanu.javaconditionals;

public class JavaConditionals {

	public static void main(String[] args) {
		
		System.out.println(oddEven(97));
		Car.move(1);
	}
	public static String oddEven(int integer) {
		String result;
		boolean prime = true;
		if (integer == 0) {
			return result = "Odd";
		}
		if (integer == 2 || integer == 3) {
			return result = "Prime";
		}
		if (integer % 2 == 0) {
			result = "Even";
		} else {
				for(int i=3; i*i<=integer; i+=2) {
					if(integer % i == 0) {
					   prime = false;
					}
				}}
					 {
						 if (prime) {
							 result = "Prime";
						 } else {
							 result = "Odd";
						 }
			
		}
		return result;
	}
}
