package com.java;

import java.util.Scanner;

public class MultiplicationTable {

public void multiplicationTable(int num) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number:");
num=scanner.nextInt();
for(int i= 1;i <= 10;i++) 
{
System.out.println(num + " " + "x " + i + " " + "=" + " " +(num*i));
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
	MultiplicationTable multiply=new MultiplicationTable();
	int number=1;
	multiply.multiplicationTable(number);
}

}
