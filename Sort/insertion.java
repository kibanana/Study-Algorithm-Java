import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = { 97, 56, 52, 58, 63, 1, 5, 7 };
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}