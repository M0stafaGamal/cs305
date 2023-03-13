
package week2;

/**
 *
 * @author twiki
 */
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("recursion "+fibrec(20));
        System.out.println("iterative "+fibit(20));
    }
     public static int fibrec(int n){
         if(n == 0)
             return 0;
         if (n==1)
             return 1;
         
      return fibrec(n-1)+fibrec(n-2);
     } 
   public static int fibit(int n){
       int[] arr = new int[n+5];
       arr[0]=0; arr[1]=1;
       for(int i=2;i<=n;++i){
           arr[i] = arr[i-1]+arr[i-2];
       }
      return arr[n];
    }
}
