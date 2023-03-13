package week3;

/**
 *
 * @author twiki
 */
public class Q6and12 {
    public static void main(String[] args) {
        
    } 
   public static void sortKN(int[]arr){
      int max = 0;
      for(int i=0;i<arr.length;i++){ if(arr[i]>max) max = arr[i]; }
      int[] f = new int[max+2];
      for(int i=0;i<arr.length;++i) f[arr[i]]++;
      int k=0;
      for(int i=0;i<max;i++){ 
          if(f[i]!=0){ 
            while(f[i]>0) { 
                arr[k]=i;
                f[i]=f[i]-1;
                 k++;  } 
          }
      }
    } 
  public static void MinMaxO(int[]a){
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       for(int i=0;i<a.length;++i){
            if(a[i]>max) max=a[i];
            if (a[i]<min)min=a[i];
            if(min>max){
               int temp = max;
               max=min;
               min=temp;
            }
        } 
       System.out.println("Min = "+min);
       System.out.println("Max = "+max);
  }
}
