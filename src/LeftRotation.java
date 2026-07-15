public class LeftRotation {
    public static void main(String[] args) {

 /// Rotation method also Using DSA Shifting Method
        int[] arr = {10, 20, 30, 40, 50};
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) { // This loop Only shifting , not printing
            ////// Right Shift operation start from i= 0;
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = temp;// the rotation is complete
        // Print Array
        for (int i = 0; i < arr.length; i++) { // IInd for loop --> this loop only print rotate Array element
            System.out.print(arr[i] + " ");
        }
    }
}