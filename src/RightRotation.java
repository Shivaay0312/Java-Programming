public class RightRotation {
    public static void main(String[] args) {
        /// Rule --> Left Rotation & Right Rotation
        // first element shift last point = Left Rotation
        // last element shift first point = Right Rotation

        int[] arr = {10, 20, 30, 40, 50};

        // Save last element
        int temp = arr[arr.length - 1];

        // Shift all elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            /// Right Shift operation start from i= arr.length -1
            arr[i] = arr[i - 1];
        }
        // Place last element at first position
        arr[0] = temp;
        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

