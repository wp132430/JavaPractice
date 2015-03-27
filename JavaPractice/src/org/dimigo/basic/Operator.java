package org.dimigo.basic;

public class Operator{
	public static void main(String[] args){
		int a1=9;
		double b1=5.8, b2=5.4;
		
		double sa=((a1+(a1+1))*b1)/2;
		double py=a1*(b2);
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이 : "+sa);
		System.out.println("평행사변형 넓이 : "+py);
		System.out.println();
		System.out.println("사다리꼴이 평행사변형 보다 "+(sa-py)+" 더 큽니다.");
	}
}