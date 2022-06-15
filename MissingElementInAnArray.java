package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	
  public static void main(String[] args) {
	int [] arr = {1,2,3,4,7,6,8};
	Arrays.sort(arr);
	int length = arr.length;
	for (int i = 0; i < length; i++) {
		if (arr[i] != i+1) {
			System.out.println("The missing number is " + (i+1));
			break;
		}
	}
}	
}
