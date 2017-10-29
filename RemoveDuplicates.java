/*
* Victor Bieniek
* 10/27/17
* This class takes an input of 10 numbers and prints a list of the distinct numbers in that list
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicates
{
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<String> errors = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String inputBuf;

		System.out.print("Enter 10 integers: ");
		//read in numbers
		while(nums.size() < 10)
		{
			inputBuf = scan.next();

			try{
				nums.add(Integer.parseInt(inputBuf));
			} catch(Exception e) {
				System.out.println("Error " + inputBuf + " is not an integer");
			}
		}

		removeDuplicate(nums);

		System.out.print("The distinct integers are: ");
		//print changed array
		for(Integer num : nums)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void removeDuplicate(ArrayList<Integer> list)
	{
		HashSet<Integer> numsSeen = new HashSet<Integer>();

		for(int i = 0; i < list.size();)
		{
			if(numsSeen.add(list.get(i)))
			{
				//if num is not in numsSeen
				i++;
			}
			else
			{
				//if we encounter a duplicate
				list.remove(i);
			}
		}
	}

}//end class