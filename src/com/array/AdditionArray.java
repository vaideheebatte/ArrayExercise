package com.array;

public class AdditionArray {
	
	public void addition() {
		int i;
		int a[]={1,2,3,4,5,6};
		int b[]={1,2,3,4,5,6};
		int c[]=new int[6];
		
		for(i=0;i<=5;i++)
		{
			c[i]=a[i]+b[i];
		}
		for(i=0;i<=5;i++)
		{
			System.out.println(c[i]);
		}
		
	}

	public static void main(String[] args) {
		AdditionArray a=new AdditionArray();
		a.addition();
	}
}
