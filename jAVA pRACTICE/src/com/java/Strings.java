package com.java;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println("The length of the txt string is: " + txt.length() );
		 txt = "Hello World";
		 //System.out.println(txt.toLowerCase());
		 //System.out.println(txt.toUpperCase());
		 txt="Please locate where 'locate' occurs!";
		 //System.out.println(txt.indexOf("locate"));
		 String firstName = "John";
		 String lastName = "Doe";
		 //System.out.println(firstName + " " + lastName );
		 //System.out.println(firstName.concat(lastName));
		 //System.out.println(firstName + " ".concat(lastName));
		 String x = "10";
		 String y = "20";
		 int ya = 20;
		 String z = x + y;
		 z=x+ya;
		 //System.out.println(z);
		 //txt = "We are the so-called "Vikings" from the north.";
		 txt = "We are the so-called \"Vikings\" from the north.";
		 //System.out.println(txt);
		 txt = "It\'s alright.";
		 //System.out.println(txt);
		 txt = "The character \\ is called backslash.";
		 //System.out.println(txt);
		 txt="Hello\nWorld!";
		 //System.out.println(txt);
		 txt = "Hello\rWorld!";
		 //System.out.println(txt);
		 txt = "Hello\tWorld!";
		 //System.out.println(txt);
		 txt = "Hel\blo World!";
		 //System.out.println(txt);
		 txt = "Hel\flo World!";
		 System.out.println(txt);
		 
	}

}
