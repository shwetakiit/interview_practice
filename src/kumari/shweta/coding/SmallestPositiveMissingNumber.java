package kumari.shweta.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestPositiveMissingNumber {
	public static int missingNumber(int arr[]) {

		//Distinct and Sorted to reduce no of Iteration
		List<Integer> list = Arrays.stream(arr).boxed().distinct().sorted().collect(Collectors.toList());
		System.out.println(list);
		
		int min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		int max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		
		int missingNumber = 0;
		
		if (min >= 0 && max > 0) {
			for (int i = 1; i <= max; i++) {
				if (!list.contains(i)) {
					missingNumber = i;
					break;
				}
			}
			if (missingNumber == 0) {
				missingNumber = max + 1;
			}
		} else if (min < 0 && max >= 0) {
			if (max == 0)
				missingNumber = 1;
			else {
				for (int i = 1; i <= max; i++) {
					if (!list.contains(i)) {
						missingNumber = i;
						break;
					}
				}
			}
		} else { // min <0 and max<0
			missingNumber = 1;
		}

		System.out.println(list);

		return missingNumber;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 6, 4, 1, 2 };
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { -1, -3 };
		int arr3[] = { -3, -1, 0, 1, 5, 8 };

		// Check all Senarios
		int result = SmallestPositiveMissingNumber.missingNumber(arr);
		int result1 = SmallestPositiveMissingNumber.missingNumber(arr1);
		int result2 = SmallestPositiveMissingNumber.missingNumber(arr2);
		int result3 = SmallestPositiveMissingNumber.missingNumber(arr3);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
