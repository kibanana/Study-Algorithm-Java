import java.util.Arrays;

public class bubble {

	public static void main(String[] args) {
		int[] arr = { 97, 56, 52, 58, 63, 1, 5, 7 };
        int temp;
        
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
        System.out.println(Arrays.toString(arr));
	}
}
