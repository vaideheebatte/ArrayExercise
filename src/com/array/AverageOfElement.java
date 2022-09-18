package com.array;

public class AverageOfElement {
	public void average() {
		int i,tot = 0;
		int ave = 0;
		int a[]= {5,6,2,7,4,1};
		for(i=0;i<a.length;i++)
		{
			tot=tot+a[i];
			ave=tot/5;
		}
		System.out.println("total of element  "+tot+ " average of element "+ave);
	}
	
	public static void main(String[] args) {
		AverageOfElement a= new AverageOfElement();
		a.average();
	}
}
