package sortingOperations;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Prime_Elements 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Array" + Arrays.toString(arr));
		int count = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(isPrime(arr[i]))
				count++;
		}
		int newArr[] = new int[count];
		int index = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(isPrime(arr[i]))
				newArr[index++] = arr[i]; 
		}
		System.out.println("New Array " + Arrays.toString(newArr));
		for(int i=0;i<=newArr.length-1;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(newArr[j]>newArr[i])
				{
					int temp = newArr[i];
					newArr[i] = newArr[j];
					newArr[j] = temp;
				}
			}
		}
		System.out.println("New Array Sorted" + Arrays.toString(newArr));
		index = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(isPrime(arr[i]))
			{
				arr[i] = newArr[index++];
			}
		}
		System.out.println("Sorted Array" + Arrays.toString(arr));
	}
	
	public static boolean isPrime(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
}
