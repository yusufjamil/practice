package com.java;

import java.util.Scanner;

public class ArraySumAverage {
	Scanner scanner=new Scanner(System.in);
	int sum=0;
	int average=0;
	int []arr;
	int size=0;
	public int declareAndInitializeArray() {
		System.out.println("Enter Array size: ");
		size=scanner.nextInt();
		arr=new int[size];
		return size;
	}
	public int[] readArrayElements() {
		for(int i=0;i<size;i++) {
			System.out.println("Enter Array elements: ");
			arr[i]=scanner.nextInt();
		}
		return arr;
	}
	public int arraySum() {
		for(int j=0;j<size;j++) {
			sum=sum + arr[j];
		}
		System.out.println("The sum of the given array elements is " + sum);
		return sum;

	}

	public int arrayAverage() {
		average=sum/size;
		System.out.println("The average of the given array elements is " + average);
		return average;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySumAverage arraySumAverage=new ArraySumAverage();
		int size=0;
		int []arr=new int[size];
		arraySumAverage.declareAndInitializeArray();
		arraySumAverage.readArrayElements();
		arraySumAverage.arraySum();
		arraySumAverage.arrayAverage();

	}

}
