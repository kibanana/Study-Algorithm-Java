import java.util.Arrays;

public class merge {
    static int[] sorted = new int[8];
	public static void mergeProc(int arr[], int start, int middle, int end) {
		
		int i = start; // 첫번째 부분집합의 시작 위치
		int j = middle+1; // 두번째 부분집합의 시작 위치
		int k = start; // 정렬된 원소
		
		while(i <= middle && j <= end) {
			if(arr[i] <= arr[j]) {
				sorted[k] = arr[i];
				i++;
			} else {
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}
		
		if(i > middle) {
			for(int t = j; t <= end; t++, k++) {
				sorted[k] = arr[t];
			}
		} else {
			for(int t = i; t <= middle; t++, k++) {
				sorted[k] = arr[t];
			}
		}
		
		for(int t = start; t <= end; t++) {
			arr[t] = sorted[t];
		}
	}
	
	public static void mergeSort(int arr[], int start, int end) {
		int middle;
		if(start < end) {
			middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle+1, end);
			mergeProc(arr, start, middle, end);
		}
	}
	
	public static void main(String[] args) {
	    int[] arr = { 97, 56, 52, 58, 63, 1, 5, 7 };
	    mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
	}

}
