package telran.numbers;

import java.util.Arrays;

public class ArrayInt {
	public static int[] addNumber(int[] ar, int number ) {
		int res[] = new int[ar.length + 1];
		
		
		for(int i = 0; i < ar.length; i++) {
			res[i] = ar[i];
		}
		res[res.length - 1] = number;
		
		return res;
		//rewrite this method using class Arrays. method copyOf
	}
	
	public static int[] insertNumber(int ar[], int index, int number) {
		int res[] = new int[ar.length + 1];
		System.arraycopy(ar, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(ar, index, res, index + 1, ar.length - index);
		return res;
		
	}
	
	public static int[] removeNumber(int ar[], int index) {
		int[] res = new int[ar.length-1];
		System.arraycopy(ar, 0, res, 0, index);
		System.arraycopy(ar, index+1, res, index, res.length - index);
		return res;
	}
	public static int indexOf(int ar[], int number) {
		int res = -1;
		for(int i = 0; i<ar.length; i++) {
			if(ar[i] == number) {
				res = i;
				break;
			}
		}
		return res;
	}

//	public static void sort(int[] ar) {
//		for(int i = 0; i < ar.length; i++) {
//			moveMaxToEnd(ar);
//		}
//	}
	public static void sort(int[] ar) {
		boolean flSorted = true;
		int length = ar.length;
		do {
			flSorted = moveMaxToEnd(ar, length);
			length--;
		}while(!flSorted);
			
		
	}

	private static boolean moveMaxToEnd(int[] ar, int length) {
		boolean flSorted = true;
		for(int i = 1; i < length; i++) {
			if(ar[i] < ar[i-1]) {
				flSorted = false;
				swap(ar, i);
			}
		}
		return flSorted;
	}

	private static void swap(int[] ar, int index) {
		int tmp = ar[index - 1];
		ar[index - 1] = ar[index];
		ar[index] = tmp;
		
	}

	public static int binaryIndexOf(int[] ar, int number) {
		int left = 0;
		int right = ar.length - 1;
		int middle = ar.length / 2;
		int res = -1;
		while(left <= right) {
			if(ar[middle] < number) {
				left = middle + 1;
			} else {
				if(ar[middle] == number) {
					res = middle;
				}
				right = middle - 1;
			}
			middle = (left + right) / 2;
		}
		return res == -1 ? (left + 1) : res;
	}
}
