package com.java;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int ans=0;
int num1=scanner.nextInt();
int num2=scanner.nextInt();
while(true) {
char op=scanner.next().trim().charAt(0);
if(op=='+'|| op=='-'||op=='*'||op=='/'||op=='%')
{
	
}
if(op=='+') {
ans=num1+num2;
}
if(op=='-') {
ans=num1-num2;
}
if(op=='*') {
ans=num1*num2;
}
if(op=='/') {
ans=num1/num2;
}
if(op=='%') {
if(num2!=0)
ans=num1/num2;
}
System.out.println(ans);	
}
}

}
