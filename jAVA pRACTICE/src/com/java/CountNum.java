package com.java;

public class CountNum {

public static void main(String[] args) {
// TODO Auto-generated method stub
int n=45536;
int count=0;
while(n>0) {
int rem=n%10;
if(rem==5) {
count++;
}
n=n/10;
}
System.out.println(count);
}

}
