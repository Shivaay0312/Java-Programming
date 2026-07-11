public class ArrayDefaultValues {
    static void main(String[] args) {
        /// Question 4 (Medium) Array Default Values
        /// Default value Question

        int[] arr = new int[4];
        arr[0] = 50; // Memory:Index : 0   1   2   3
         arr[3] = 100; //      Value :50   0   0 100
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
