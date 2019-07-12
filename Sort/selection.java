import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = { 97, 56, 52, 58, 63, 1, 5, 7 };
        int temp;
        int min;

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
        	for (int j = i + 1; j < arr.length; j++) {

                if(arr[j] < arr[min]) 
                	min = j;
                
        	}

        	if(arr[i] != arr[min]) {
        		temp = arr[min];
        		arr[min] = arr[i];
        		arr[i] = temp;
        	} else {
        		arr[i] = arr[min];
        	}
        	
        }

        System.out.println(Arrays.toString(arr));
    }
}