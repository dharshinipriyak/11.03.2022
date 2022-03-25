package com.showroomprojct;
import java.util.Scanner;
public class BookFair {
	String Bookname;
	double price;
	public BookFair() {
		Bookname="";
		price=0.0;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Book name  :");
		Bookname=sc.nextLine();
		System.out.println("Enter the Price of the book :");
		price=sc.nextDouble();
	}void calculate()
	{
		double disc;
		if (price<=1000)
		{
			disc =2*price/100;
			
		}
		else if(price<=3000)
		{
			disc=10.0*price/100;
		}
		else
		{
			disc=15.0*price/100;
			price=price-disc;
		}
		price=price-disc;
	}
	void display() {
		System.out.println("Book name           :"+Bookname);
		System.out.println("price after dicount :"+ price);
	}
	public static void main(String[] args) {
		BookFair bf=new BookFair();
		bf.input();
		bf.calculate();
		bf.display();
	}

}
