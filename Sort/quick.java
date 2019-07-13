import java.util.Arrays;

public class quick {
	
	public static int partition(int arr[], int left, int right) {
		int pivot = arr[(left+right)/2];
		
		while(left < right) {
			while(arr[left] < pivot && left < right)
				left++;
			
			while(arr[right] > pivot && left < right)
				right--;
			
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		return left;
	}
	
	public static void quickProc(int arr[], int left, int right) {
		if(left < right) {
			int pivot = partition(arr, left, right);
			
			quickProc(arr, left, pivot -1);
			quickProc(arr, pivot +1, right);
		}
	}
	
	public static void main(String[] args) {
	    int[] arr = { 97, 56, 52, 58, 63, 1, 5, 7 };
        
	    quickProc(arr, 0, arr.length-1);
	    
        System.out.println(Arrays.toString(arr));

	}

}
