public class Test {
    public static void main(String[] args) {
     // find the smallest number in an array
        int[] arr = {5, 2, 9, 1, 5, 6};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The smallest number in the array is: " + min);

    }
}