package Javastring;
public class substring {
   public static void main(String[] args) {

       /// substring();

        /// Most important topic in Strings.
       // Widely used this topic in DSA.

       /// Example 1 - substring

       // String word = "Backend";
       // Just find =  Back // this is called substring
        // ya Just find =  end // this is called substring

       /// Syntax 1
       // substring(startIndex)
       // Example;-
       String word = "Backend";
       System.out.println(word.substring(4));

       // Character : B  a  c  k  e  n  d
       //Index     : 0  1  2  3  4  5  6
       /// substring(4) Means ;- 4 index to last index => Output - end

      //// Syntax 2
       ///  substring(startIndex, endIndex)

///       ⚠️ Bahut Important Rule
//       Start index include hota hai. ✅
//       End index include nahi hota. ❌

       // Example -
       String words = "Backend";
       System.out.println(words.substring(0,4)); // Output - Back

       // Index:
       // Character : B  a  c  k  e  n  d
       //Index     : 0  1  2  3  4  5  6
       //Java lega:
      // 0 ✅ 1 ✅ 2 ✅ 3 ✅ 4 ❌ (stop)
   }
}



