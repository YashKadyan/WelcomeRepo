package com.cdac.welcomedemo;

import java.util.Date;
import java.util.Scanner;

public class WelcomeDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Please enter your Username : ");
		String name = sc.next();
		
		System.out.println("Welcome " + name + " !");
		
		Date date = new Date();
		System.out.println("Current Date is : " + date.getDay());
		System.out.println("Current Time is : " + date.getHours() + " : " + date.getMinutes() + " : " + date.getSeconds());
	}
}