package com.greatlearning.Main;

import java.util.Scanner;

import com.greatlearning.Service.PayMoney;

public class Driver
{
	public static void main(String[] args)
	{
		int transactionSize = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array ");
		transactionSize = sc.nextInt();
		
		int transactionArray[] = new int[transactionSize];
		
		System.out.println("Enter the values of array ");
		for(int i = 0; i < transactionSize; i++)
		{
			transactionArray[i] = sc.nextInt();
		}
		
		int totalTarget = 0;
		System.out.println("Enter the total no of targets that needs to be achieved");
		totalTarget = sc.nextInt();
		
		PayMoney service = new PayMoney();
		service.checkTarget(transactionArray, totalTarget);
		
		sc.close();
	}
}
