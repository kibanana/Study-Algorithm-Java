import java.util.Arrays;

public class heap {

	public static void heapProc(int[] arr, int number) {

	    for(int i=1; i<number; i++) {
            int child = i;
            while(child > 0) {
                int parent = (child-1)/2;
                if(arr[child] > arr[parent]) {
                    int temp = arr[parent];
                    arr[parent] = arr[child];
                    arr[child] = temp;
                }
                child = parent;
            }
        }
	    
	}
	
	public static void main(String[] args) {
	    int[] arr = { 97, 56, 52, 58, 63, 1, 5, 7 };
        
	    heapProc(arr, arr.length);
	    
        for(int i = arr.length-1; i>0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapProc(arr, i);
        }

        System.out.println(Arrays.toString(arr));

	}

}
