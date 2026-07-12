public class ArraySum {
    static void main(String[] args) {
        /// Problem --> 1

//        int[] arr = {5, 10, 15, 20}; //i ki values = 0,1,2,3
//        int sum = 0; //Iteration 1 = sum = 0 + 5 = 5,,,,Iteration 2 = sum = 5 + 10 = 15 ....Iteration 4
//        for (int i=0; i < arr.length; i++) {
//
//            sum = sum + arr[i]; // Most important line
//                }                 // sum+=arr[i]; & sum = sum + arr[i]; both are same meaning
//            System.out.println(sum);
//        }
//    }

       /// Problem --> 2
//
//         int[] array = {25, 15, 35, 10, 15};
//         int sum = 0; // sum Right side 0 se add kr raha hai { sum = sum + arr[i]; }
//         for(int i=0; i<array.length; i++){
//
//             sum =sum+array[i];
//     }
//            System.out.println("Sum=" +sum);
//    }
//}
            /// Problem --> 3


        int[] array = { 2,4,6 };
        int sum = 10; // change the sum values , then 10 add in the first values... and iteration start
        for(int i=0; i<array.length; i++){

            sum =sum+array[i]; //Accumulator pattern
        }
        System.out.println("Sum=" +sum);
    }
}