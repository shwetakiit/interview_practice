package kumari.shweta.coding;

import java.util.ArrayList;

import java.util.List;
public class SplitArrayInChunk {
	public static List<List<Integer>> splitedArray(int arr[],int chunk){
	
		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<>();
		int noOfChunk=0;
		for(int i=0;i<arr.length;i++) {
			temp.add(arr[i]);
			if((i+1)<=arr.length && (i+1)%chunk==0) {
				result.add(temp);
				temp=new ArrayList<Integer>();
				noOfChunk++;
			}  if((i+1)==arr.length && (i+1)%chunk!=0) {
				
				temp=new ArrayList<Integer>();
				int totalchunk=chunk*noOfChunk;
			
				for(int k=totalchunk;k<arr.length;k++) {
					temp.add(arr[k]);
				}
				result.add(temp);
				
			}
		}
		
		return  result;
	}
	public static void main(String[] args) {
		int splitsize=3;
		int arr[]= {1,2,3,4,5,6,7,8};
		int arr1[]={3,2,5,7,9,1,3,5,7};
		int arr2[]= {1,2,3,4,5,6,7,8,9,10,11};
		
	List<List<Integer>>	 resultsList=SplitArrayInChunk.splitedArray(arr, 2);
	List<List<Integer>>	 resultsList1=SplitArrayInChunk.splitedArray(arr1, 2);
	List<List<Integer>>	 resultsList2=SplitArrayInChunk.splitedArray(arr2, 4);
	System.out.println(resultsList);
	System.out.println(resultsList1);
	System.out.println(resultsList2);
	}
}


