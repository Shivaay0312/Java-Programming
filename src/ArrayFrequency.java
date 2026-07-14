public class ArrayFrequency {
  public static void main(String[] args) {

      int[] arr = {10, 20, 10, 30, 10, 40, 20};
      int target = 10;
      int count = 0;

      for(int i=0; i<arr.length; i++){
          if(arr[i]==target){ //lekin interview me better hai ki variable use karo.
              // if(arr[i] == target)
              //10 hardcoding avoid karna
              count++;
          }
      }
      System.out.println(count);
    }
}
