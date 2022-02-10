package com.si.LIS;


public class LIS {
   
	static int increase_subseq(int array[], int arr_length)
	{
      int sequence_arr[] = new int[arr_length];
      int i, j, max = 0;
      for (i = 0; i < arr_length; i++)
         sequence_arr[i] = 1;
      for (i = 1; i < arr_length; i++)
      for (j = 0; j < i; j++)
      if (array[i] > array[j] && sequence_arr[i] < sequence_arr[j] + 1)
      sequence_arr[i] = sequence_arr[j] + 1;
      for (i = 0; i < arr_length; i++)
      if (max < sequence_arr[i])
      max = sequence_arr[i];
      return max;
   }
	
   public static void main(String args[])
   {
	  
       int array[] = {1,31,24,7,8,10,12,83,58 };
       int arr_len = array.length;
      System.out.println("The length of the longest increasing subsequence is " +  increase_subseq(array, arr_len));
   }
}