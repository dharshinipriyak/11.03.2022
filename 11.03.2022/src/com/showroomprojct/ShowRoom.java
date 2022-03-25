package com.showroomprojct;

import java.util.Scanner;

public class ShowRoom {
	String name;
	long mobno;
	double cost,discount,amount;
	public ShowRoom(){
		name="";
		mobno=0;
		cost=0;
		discount=0;
		amount=0;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name");
		name=sc.nextLine();
		System.out.println("Enter Mobile number");
		mobno=sc.nextLong();
		System.out.println("Enter the cost");
		cost=sc.nextDouble();
	}
	void calculate(){
		if(cost<=10000)
		{
			discount=(cost*5)/100;
			amount=cost-discount;
		}
		else if(cost>10000&&cost<=20000)
		{
			discount=(cost*10)/100;
			amount=cost-discount;
		}
		else if(cost>20000&&cost<=35000)
		{
			discount=(cost*15)/100;
			amount=cost-discount;
		}
		else if(cost>35000)
		{
			discount=(cost*20)/100;
			amount=cost-discount;
		}
	}
	void display()
	{
		System.out.println("Customer       :"+name);
		System.out.println("Mobile number  :"+mobno);
		System.out.println("Amount         :"+amount);
	}
	public static void main(String[] args) {
		ShowRoom SR=new ShowRoom();
		SR.input();
		SR.calculate();
		SR.display();}
}
