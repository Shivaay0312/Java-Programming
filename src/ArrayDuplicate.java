public class ArrayDuplicate {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

// Nested loop --> use hoga Duplicate Array mai aur j = i+1 rahega..
        for (int i = 0; i < arr.length; i++) { // outer loop
            for (int j = i + 1; j< arr.length; j++) { // Inner Loop
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}



