package org.dimigo.basic;

public class PrimitiveDataType{
	public static void main(String[] args){
		String name = "아이유";
		boolean male = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("이름 : "+name);
		if(male == false){
			System.out.println("성별 : 여자");
		}
		else{
			System.out.println("성별 : 남자");
		}
		
		System.out.println("나이 : "+age+"세");
		System.out.printf("키 : %.1fcm\n",height);
		System.out.printf("몸무게 : %.1fkg\n",weight);
		System.out.printf("혈액형 : %c형\n",bloodtype);
	}
}