package com.greatlearning.Main;

import java.util.Scanner;

import com.greatlearning.Service.CurrencyDenominations;

public class Driver
{
	public static void main(String[] args)
	{	
			int size = 0; 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of currency denominations ");
			size = sc.nextInt();
			
			int currArray[] = new int[size];
			System.out.println("Enter the currency denominations value");
			for(int i = 0; i < size; i++)
			{
				currArray[i] = sc.nextInt();
			}	
			
			int amount = 0;
			CurrencyDenominations service = new CurrencyDenominations();
			System.out.println("Enter the amount you want to pay ");
			amount = sc.nextInt();
			
			service.sortAmount(currArray, 0, currArray.length-1);
			
			service.notesCount(currArray, amount);
			
			sc.close();
			
	}
}
