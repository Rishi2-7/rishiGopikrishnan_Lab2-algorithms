package com.greatlearning.Service;

import java.util.Scanner;

public class PayMoney
{
	public void checkTarget(int[] transactionArray, int totalTarget)
	{
		Scanner sn = new Scanner(System.in);
		
		int flag = 0;
		long target;
		
		while(totalTarget-- != 0)
		{
			System.out.println("Enter the value of target ");
		    target = sn.nextInt();

			long targetSum = 0;
			
			for(int i = 0; i < transactionArray.length; i++)
			{
				targetSum += transactionArray[i];
				
				if(targetSum >= target)
				{
					System.out.println("Target achieved after " + (i+1) + " transactions");
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
			{
				System.out.println("Given target is not achieved ");
			}
				
		}
		sn.close();
	}
}
