package kumari.shweta.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegrigateEvenOddInList {
	
	public static void main(String[] args) {
		
	int arr[] = {10,5,2,3,0,7};
	List<Integer> list = new ArrayList<Integer>();
	for(int i =0;i<8;i++) {
		list.add(i);
	}
	 
	System.out.println(list);
	
	int left = 0;int right=list.size()-1;
	while(left<right) {
		
		while(list.get(left)%2==0 && left<right) {
			left++;
		}
		while(list.get(right)%2==1 && left<right) {
		   right--;
		}
		
		if(left<right) {
			int temp = list.get(left);
          list.set(left, list.get(right));
          list.set(right, temp);
          left++;
          right--;
		}
	}
	
	System.out.println("Aftre segrigation of list is ");
	System.out.println(list);
	
		
	}

}
