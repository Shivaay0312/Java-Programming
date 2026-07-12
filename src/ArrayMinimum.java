public class ArrayMinimum {
    static void main(String[] args) {
        int[] arr = {15, 80, 25, 90, 40};
        int Minimum = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<Minimum){ //for Minimum < use this operator
                Minimum = arr[i];
            }
        }
        System.out.println(Minimum);
    }
}
