public class ArrayEvenOdd {
    static void main(String[] args) {
        ///Count Even & Odd Elements

        int[] arr = {10, 15, 20, 25, 30};
        int  evenelement = 0;
        int oddelement = 0;

        for(int i=0; i<arr.length; i++){
            if( arr[i] % 2==0) { //arr[i] --> array elements
                evenelement++; // if condition is true
            }
            else { // false condition
                    oddelement++;
                }
            }
        System.out.println(evenelement+ "," +oddelement);
    }
}
