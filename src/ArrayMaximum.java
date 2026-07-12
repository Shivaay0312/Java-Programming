public class ArrayMaximum {
    static void main(String[] args) {

        int[] arr = {15, 80, 25, 90, 40};
        int Maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Maximum) { //for Maximum > use this operator
                Maximum = arr[i];
            }
        }
            System.out.println(Maximum);
        }
    }
