package org.dimigo.basic;

public class loop {
	public static void main(String[] args) {
		int i=0, j=0;
		char a=0;
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				if(j==i){
					a='*';
				}
				else{
					a='x';
				}
				if(a=='*'){
					System.out.print(a);
				}
				else{
					System.out.print(j);
				}
			}
			System.out.println("");
		}
	}
}
