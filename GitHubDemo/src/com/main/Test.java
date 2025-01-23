package com.main;

public class Test {
public int m1(int a,int b) {
int c=a+b;
return c;
}
public static void main(String[] args) {
Test t=new Test();
int c=t.m1(10, 20);
System.out.println(c);
}
}
