package com.java;

import java.util.Scanner;

public class Functions {

public static void main(String[] args) {
// TODO Auto-generated method stub
//int ans=sum();
//String ans=greeting();
//int ans=sum3(1,2);
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your name");
String name=scanner.next();
String personalised=myGreet(name);
System.out.println(personalised);
}
//static void sum() {
//Scanner in=new Scanner(System.in);
//System.out.println("Enter number 1");
//int num1=in.nextInt();
//System.out.println("Enter number 2");
//int num2=in.nextInt();
//int sum=num1+num2;
//System.out.println("The sum is: "+sum);
//}
//static int sum() {
//Scanner in=new Scanner(System.in);
//System.out.println("Enter number 1");
//int num1=in.nextInt();
//System.out.println("Enter number 2");
//int num2=in.nextInt();
//int sum=num1+num2;
////System.out.println("The sum is: "+sum);
//return sum;
//}
//static String greeting() {
//String greeting="How are you";
//return greeting;
//}
//static int sum3(int a,int b) {
//Scanner in=new Scanner(System.in);
//a=in.nextInt();
//b=in.nextInt();
//int sum=a+b;
//return sum;
//}
static String myGreet(String name) {
String message="Hello"+" "+name;
return message;
}
}
