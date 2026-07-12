public class ArrayAverage {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50}; // Array Initialization

        int sum = 0; // first find sum value
        /// int Average = sum / 5; // This is the Hardcode method.
       // int Average = sum/arr.length; // it's not wrong but,
        // this method using after loop is a good way.

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]; /// formula Sum = sum += arr[i];
        }
           int Average = sum /arr.length; /// formula average = sum / total elements

        System.out.println(sum + "," + Average); //150, 30
    }
}
