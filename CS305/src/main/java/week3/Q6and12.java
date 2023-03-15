package week3;

/**
 *
 * @author twiki
 */
public class Q6and12 {
    public static void main(String[] args) {
//        int [] a = new int[]{1,5,9,0,2,3};
//          MinMaxO(a);
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
  public static String MinMaxO(int[]a){
        int min,max;
        min = a[0]; max = a[1];
        if(min>max){
          int temp = min;
          min = max;
          max = temp;
        }
        if(a.length == 2){
            return "Min = "+min + "  Max = "+max;
        }
       for(int i=2;i<a.length/2;i+=2){
            if(a[i]>a[i+1] && a[i]>max) {
                max=a[i];
                if(a[i+1]<min && min<max){min = a[i+1];}                 
            }
            if(a[i]<a[i+1] && a[i+1]>max) {
                max=a[i+1];
                if(a[i]<min && min<max){min = a[i];}                 
            }
        } 
       return "Min = "+min + "  Max = "+max;
  }
}
