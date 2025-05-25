package com.java;

import java.util.Scanner;

public class MaximumMinimumArray {
Scanner scanner=new Scanner(System.in);
int []arr;
int size;
int max;
int min;
public int declareAndInitialize() {
	System.out.println("Enter Array size: ");
	size=scanner.nextInt();
	arr=new int[size];
	return size;
}
public int[] readArrayElements() {
System.out.println("Enter Array elements: ");
	for(int i=0;i<size;i++) {
		arr[i]=scanner.nextInt();
	}
	return arr;
}
public int printMaximumInArrayforEachLoop() {
	max=arr[0];
	for(int num:arr) {
		if(num>max) {
			max=num;
		}
	}
	return max;
}
public int printMinimumInArrayforEachLoop() {
	min=arr[0];
	for(int num:arr) {
		if(num<min) {
			min=num;
		}
		else {
			min=arr[0];	
		}
	}
	return min;
}
public int printMaximumInArrayforLoop() {
	max=arr[0];
	for(int i=1;i<size;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		else {
			max=arr[0];	
		}
	}
	return max;
}
public int printMinimumInArrayforLoop() {
	min=arr[0];
	for(int num:arr) {
		if(num<min) {
			min=num;
		}
	}
	return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumMinimumArray maximumMinimumArray=new MaximumMinimumArray();
		maximumMinimumArray.declareAndInitialize();
		maximumMinimumArray.readArrayElements();
		int max=maximumMinimumArray.printMaximumInArrayforEachLoop();
		int min=maximumMinimumArray.printMinimumInArrayforEachLoop();
		int max1=maximumMinimumArray.printMaximumInArrayforLoop();
		int min1=maximumMinimumArray.printMinimumInArrayforLoop();
		System.out.println("The maximum number in the given array is " + max);
		System.out.println("The minimum number in the given array is " + min);
		System.out.println("The maximum number in the given array is " + max1);
		System.out.println("The minimum number in the given array is " + min1);
		
	}

}
