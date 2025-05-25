package com.java;

import java.util.Scanner;

public class SwitchFruit {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
//
//String Fruit=in.next();
//switch(Fruit){
//case "Mango":
//System.out.println("king of fruits");
//case "Apple":
//System.out.println("A sweet red fruit");
//break;
//case "Orange":
//System.out.println("A round fruit");
//case "Grapes":
//System.out.println("A green fruit");
//default:
//System.out.println("Please enter a valid fruit");

//case "Mango"->System.out.println("king of fruits");
//case "Apple"->System.out.println("A sweet red fruit");
//case "Orange"->System.out.println("A round fruit");
//case "Grapes"->System.out.println("A green fruit");
//default->System.out.println("Please enter a valid fruit");

//int day=in.nextInt();
//switch(day) {
//case 1:
//case 2:
//case 3:
//case 4:
//case 5:
//System.out.println("Weekday");
//break;
//case 6:
//case 7:
//System.out.println("Weekend");
//}

int empId=in.nextInt();
String department=in.next();
switch(empId) {
case 1:
System.out.println("Yousuf");
break;
case 2:
System.out.println("Jamil");
break;
case 3:
System.out.println("empNo 3");
switch(department) {
case "IT":
System.out.println("IT department");
break;
case "Management":
System.out.println("Management department");
break;
default:
System.out.println("No department entered");
}
break;
default:
System.out.println("Enter correct empId");
}
}

}
