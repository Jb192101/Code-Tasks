// Задача : Flood Fill
// Ссылка : https://www.codewars.com/kata/5576f6719988e71ea30000ae

using System;

public class Kata {
	static int[,] global_arr;
	static int startValue;
	  
	public static int[,] FloodFill(int[,] array, int x, int y, int newValue)
	{
		global_arr = array;
		startValue = array[x, y];
		
		FloodFillRec(x, y, newValue);
		
		return global_arr;
	}
	  
	public static void FloodFillRec(int x, int y, int new_c)
	{
		if (x < 0 || x >= global_arr.GetLength(0) || y < 0 || y >= global_arr.GetLength(1))
			return;

		if (global_arr[x, y] == startValue) {
			global_arr[x, y] = new_c;
			FloodFillRec(x+1, y, new_c);
			FloodFillRec(x-1, y, new_c);
			FloodFillRec(x, y+1, new_c);
			FloodFillRec(x, y-1, new_c);
		  }
			  
	}
}