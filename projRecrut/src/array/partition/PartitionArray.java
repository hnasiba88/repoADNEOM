package array.partition;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * @author Nasiba HUSEYNOVA
 *
 */
public class PartitionArray {

	/** 
	 * 
	 * Have put this part just in 
	 * case if there will be someone 
	 * who wants to see what does our 
	 * class do and call it in command
	 * line. In this case you'll need 
	 * only follow the commands.
	 * 
	 * **/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter size of array: ");
		int[] numbers = new int[input.nextInt()];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter number");
			numbers[i] = input.nextInt();
		}
		System.out.println("Please enter size of sub array: ");
		int[][] result = partitionArray(numbers, input.nextInt());
		System.out.println(Arrays.deepToString(result));
	}

	/**
	 * 
	 * This is the main method of 
	 * our class which will return 
	 * an array of arrays as a result.
	 * What means you should pass as 
	 * argument an array and the size
	 * of partitions.For ex.: see Test class
	 * 
	 * **/
	public static int[][] partitionArray(int[] arr, int size) {
		int size1 = 0;
		int sizeLast = size;
		if (arr.length % size == 0) {
			size1 = arr.length / size;
		} else {
			size1 = arr.length / size + 1;
			sizeLast = arr.length % size;
		}
		int[][] result = new int[size1][size];
		int[] res = null;
		for (int j = 0; j < size1; j++) {
			if (j == size1 - 1) {
				res = new int[sizeLast];
			} else {
				res = new int[size];
			}
			for (int i = j * size; i <= (j + 1) * size - 1; ++i) {
				if (i < arr.length) {
					res[(i - j * size)] = arr[i];
				}
			}
			result[j] = res;
		}
		return result;
	}

}
