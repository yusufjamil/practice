package com.java;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 20;
		if (time < 18) {
		  //System.out.println("Good day.");
		} else {
		  //System.out.println("Good evening.");
		}
		String result =(time < 18) ? "Good day.":"Good evening.";
		System.out.println(result);
	}

}
