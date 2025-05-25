package com.java;

import java.util.Scanner;

public class OddSum {
public void sumOddNumbers(int n) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter number");
n=scanner.nextInt();
int sum=0;
for(int i= 0;i< n;i++) {
	if(n%2!=0){
	sum=sum + i;
	}
}
System.out.println("The odd sum of the numbers is "+sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddSum oddsum=new OddSum();
		int number=0;
		oddsum.sumOddNumbers(number);
	}

}
