package week5;

/**
 *
 * @author twiki
 */
public class Q4and8 {
    public static void main(String[] args) {

    }
public static int max_position (int [] s , int low , int high) {
 int position;
 if(low == high)
   return low;
else {
position = max_position(s,low+1 ,high);
if( s[low] > s[position])
   position = low;
return position;
 }
}
public static int Q8(int n) {
      int result = 1;
      if(n > 1) {
         result += Q8(n-1) + Math.pow(2, n-1);
      }
      return result;
   }
}   