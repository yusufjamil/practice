package com.java;

import java.util.Scanner;

public class Fibonacci {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
int a=0;
int b=1;
int sum=0;
int count=2;
while(count<=n) {
sum=a+b;
System.out.println(sum);
a=b;
b=sum;
}

}

}
