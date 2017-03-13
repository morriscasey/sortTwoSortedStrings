package sortTwoSortedStrings;

public class SortTwoSortedArrays {
	
	public String[] sort(String[] array1, String[] array2) {
		String[] finalSort = new String[array1.length + array2.length];
		int index1 = 0;
		int index2 = 0;
		int finalIndex = 0;
		
		// Loops until an index reaches the end of one of the arrays.
		while(index1 < array1.length && index2 < array2.length){
			
			if(array1[index1].compareTo(array2[index2]) <= 0){
				finalSort[finalIndex] = array1[index1];
				index1++;
				
				finalIndex++;
			}else {
				finalSort[finalIndex] = array2[index2];
				index2++;
			
				finalIndex++;
			}
			
		}
		
		// If one of the arrays has an element left, then loop through remaining array
		if(index1 >= array1.length && index2 < array2.length){
			for(int i = index2; i < array2.length; i++){
				finalSort[finalIndex] = array2[i];
				finalIndex++;
			}
		}else if(index2 >= array2.length && index1 < array1.length){
			for(int i = index1; i < array1.length; i++){
				finalSort[finalIndex] = array1[i];
				finalIndex++;
			}
		}
		
	
		return finalSort;
	}
	
	// Format output
	public static String toString(String[] array){
		String content = "[";
		for(String item : array){
			content += item + " ";
		}
		content += "]";
		return content;
	}
	

}
