package kumari.shweta.coding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FillTheMissingNumberInMatrix {
	public static void  printArray(int[][] mat) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	static int[][] doFind(int[][] mat) {
    //Arrays.asList() --create unmodifiable list so it throws unsupported exception
	 List<Integer> list=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
	 List<Integer> mList=new ArrayList<Integer>();
		 int index=0;
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 mList.add(mat[i][j]);
			 }
		 }

	   list.removeAll(mList);
      // System.out.println("final missing no is "+list);
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				if(mat[i][j]==0) {
					//System.out.println("at index "+list.get(index));
					mat[i][j]=list.get(index);
					index++;
					
				}
			 }
		 }
		 return mat;
	 }
	 
	public static void main(String[] args) {
		int [][]mat= {{2,3,5}, {0, 7, 9}, {8, 4, 0}};
		 printArray(mat);
		 mat = doFind(mat);
	        System.out.println("\nOutput:");
	        printArray(mat);
	}

}
