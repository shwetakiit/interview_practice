package kumari.shweta;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class SecondLargeNumber {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 2, 4, 1, 6 };
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		for (int j = 0; j < arr.length; j++) {

			set2.add(arr[j]);

		}

		System.out.println(set2);
		Iterator<Integer> itrIterator = set2.iterator();

		while (itrIterator.hasNext()) {

			System.out.println(itrIterator.next());
		}

		List<Integer> list = Arrays.asList(10, 10, 2, 3, 6, 6, 1, 0, 34, 2, 34);
		Collections.sort(list);
		int max = Collections.max(list);
		System.out.println("max element is " + max);
		int secondLargest = 0;
		for (int i = list.size() - 2; i >= 0; i--) {
			if (max != list.get(i)) {
				secondLargest = list.get(i);
				break;
			}
		}
		System.out.println("Second largest is " + secondLargest);

	}

}
