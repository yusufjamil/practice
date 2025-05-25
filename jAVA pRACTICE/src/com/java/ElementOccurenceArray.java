package com.java;

import java.util.Scanner;

public class ElementOccurenceArray {

Scanner scanner=new Scanner(System.in);	
int []arr;
int size;
int occurence;
public int declareAndInitialize() {
	System.out.println("Enter Array size: ");
	size=scanner.nextInt();
	arr=new int[size];
	System.out.println("Enter the element for which the occurence to be found out :");
	occurence=scanner.nextInt();
	return size;
}
public int[] readArrayElements() {
System.out.println("Enter Array elements: ");
	for(int i=0;i<size;i++) {
		arr[i]=scanner.nextInt();
	}
	return arr;
}
public int printOccurenceOfElementinArray() {
	int count=0;
	for(int i=0;i<size;i++) {
		if(arr[i]==occurence) {
			count++;
		}
	}
	System.out.println("The occurence of the element in the given list is " + count);
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementOccurenceArray elementOccurenceArray=new ElementOccurenceArray();
		elementOccurenceArray.declareAndInitialize();
		elementOccurenceArray.readArrayElements();
		elementOccurenceArray.printOccurenceOfElementinArray();
		
	}

}
