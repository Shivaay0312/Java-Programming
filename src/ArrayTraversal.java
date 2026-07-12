public class ArrayTraversal {
    static void main(String[] args) {
/// 1. Array Basic question -->
        // int[] arr; --> Array Declaration
        // int[] arr = {5, 10, 15}; --> Array Initialization

            /// Program --> 1 ( < less than )
        int[] arr = {5, 10, 15}; // Array Initialization

        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

            /// Program 2 ---> ( less than or equal to )

        for (int i=2; i <= 6; i++) {
            System.out.print(i + " ");
        }

            /// Question --> 3 (Easy) Array Traversal

        int[] array = {10,20,30,40,50};
         for (int i=0; i<arr.length; i++){
             System.out.println(array[i]);
        }

            /// Question 4 (Easy)
            ///Agar new int[5] bola hai,to usi array me values store karni hain.
        int[] marks = new int[5];
          marks[0] = 80;
          marks[1] = 85;
          marks[2] = 90;
          marks[3] = 95;
          marks[4] = 100;
        for (int i=0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

            /// Question 5 (Hard) Array Traversal
            ///Is code me bug hai. Sirf bug identify karo aur sahi code likho.

        int[] arrays = {10, 20, 30, 40};
        for (int i=0; i < arr.length; i++) {
        ///for (int i=0; i <= arr.length; i++) {
            // <= not less than or equal to
            // < only < less than
            System.out.println(arrays[i]);
        }
    }
}

