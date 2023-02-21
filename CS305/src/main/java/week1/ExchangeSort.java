package week1;

/**
 *
 * @author twiki
 */
public class ExchangeSort {
    public static void main(String[] args) { 
//         int arr[] = new int[] {9,8,7,6,5,4,3,2,1,-1,0};
//         System.out.println("Sorted array is :");
//         exchangeSort(arr);
//         for(int x : arr){
//             System.out.print(x+" ");
//         } 
        
    }
    public static void exchangeSort(int a[]){
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
}
