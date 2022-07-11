package com.greatlearning.Service;

public class CurrencyDenominations
{
	public void sortAmount(int[] currArray, int left, int right)
	{
		if(left < right)
		{
			
			int mid = (left + right) / 2;
			
			sortAmount(currArray, left, mid);
			sortAmount(currArray, mid+1, right);
			
			mergeAmount(currArray, left, mid, right);
		}
	}

	private void mergeAmount(int[] currArray, int left, int mid, int right)
	{
		
		int n1 = mid  - left + 1;
		int n2 = right - mid;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int i = 0; i < n1; i++)
		{
			leftArr[i] = currArray[left + i];
		}
		
		for(int j = 0; j < n2; j++)
		{
			rightArr[j] = currArray[mid + 1 + j];
		}
		
		int i, j, k ;
		
		i = 0;
		j = 0;
		
		k = left;
		
		while(i < n1 && j < n2)
		{
			if(leftArr[i] >= rightArr[j])
			{
				currArray[k] = leftArr[i];
				i++;
			}
			else
			{
				currArray[k] = rightArr[j];
				j++;
			}
			k++;	
		}
		
		while(i < n1)
		{
			currArray[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j < n2)
		{
			currArray[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public void notesCount(int[] currArray, int amount)
	{
		int[] notesCounter = new int[currArray.length];
		
		try
		{
			for(int i = 0; i < currArray.length; i++)
			{
				if(amount >= currArray[i])
				{
					notesCounter[i] = amount / currArray[i];
					amount = amount - notesCounter[i] * currArray[i];
				}
			}
			
			if(amount > 0)
			{
				System.out.println(" Exact amount cannot be given with highest denomination!!!");
			}
			else
			{
				System.out.println("Your payment approach in order to give min no of notes will be : ");
				for(int i = 0; i < currArray.length; i++)
				{
					if(notesCounter[i] != 0)
					{
						System.out.println(currArray[i] + " : " + notesCounter[i]);
					}
				}
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e + " notes of denomination 0 is invalid!!! ");
		}
	
	}
}
