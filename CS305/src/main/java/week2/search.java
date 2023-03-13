package week2;

/**
 *
 * @author twiki
 */
public class search {
    public static void main(String[] args) {
        int[]a = new int[]{5,2,9,1,0,4,2,8,5,6,0,7,1,9};
        int x = -1;
        System.out.println(""+binarySearch(a,x));
//        System.out.println(""+linearSearch(a,x));
    }
    
    public static String linearSearch(int[] a , int x){
    for (int i=0;i<a.length;i++){
           if(a[i] == x )  return x+" found at index "+i;
        } 
     return x+" not found :("; }
    
    public static String binarySearch(int[]a,int x){
          int max = a[0];
          for(int i=1; i < a.length;++i){
              if(a[i]>max) max = a[i];}
          int[] frq = new int [max+2];
          for(int i=0;i<a.length;++i)
               frq[a[i]]=i;
             exchangeSort(a);
             int start =0; 
             int end = a.length -1;
             int mid ;
          System.out.println(max);
        while (start<=end){
             mid = (start+end)/2;
             if(a[mid] == x){
               return x + " found at index "+frq[a[mid]];
             }else if(a[mid]>x){
              end = mid-1; 
             } else {
               start= mid+1;
             }
        }
             return x+ " not found :(";
    }
        private static void exchangeSort(int a[]){
        int n = a.length;
        for(int i=0;i<n;++i){
           for(int j = i+1; j<n;++j){
               if(a[i]>a[j]){
                   int temp =  a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
           }
        }
    }
    public static String binarySearchSorted(int[]a,int x){
             int start =0; 
             int end = a.length -1;
             int mid ;
          
        while (start<=end){
             mid = (start+end)/2;
             if(a[mid] == x){
               return x + " found at index "+mid;
             }else if(a[mid]>x){
              end = mid-1; 
             } else {
               start= mid+1;
             }
        }
             return x+ " not found :(";
    }
      
}
