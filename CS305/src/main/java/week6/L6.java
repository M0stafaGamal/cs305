package week6;

/**
 *
 * @author twiki
 */
import java.util.Arrays;
public class L6 {
    public static void main(String[] args) {
        int [] s = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("largest is "+largest(s,0,s.length-1));
        System.out.println("sorted array  is ");
        sortList(s,0,s.length-1);
        System.out.println(Arrays.toString(s));
    }
    public static int largest(int [] s , int low , int high ){
       int mid;
       if(low==high)
            return s[low];
       else{
           mid = (low+high)/2;
           int left_largest=largest(s,low,mid);
           int right_largest=largest(s,mid+1,high);
          if(left_largest>right_largest) return left_largest;
          else return right_largest;
       }
     }
    public static void sortList(int [] s , int low , int high){ // mergesort2
        int mid1,mid2;
        if (low < high) {
              // FOR HARD DEBUGGING PURPOSE :D 
//            System.out.println("low is : "low+" high is : " +high);   
        mid1=low + (high - low) / 3;
        mid2=low + 2*(high - low + 1) / 3;
            
            sortList(s,low,mid1);
            sortList(s,mid1+1,mid2);
            sortList(s,mid2+1,high);
            merge(s,low,mid1,mid2,high);
            
        }
     }
public static void merge(int[] s, int low, int mid1, int mid2, int high) {
    int i,j,m,k ;
    int [] u = new int [high-low+1];
    i=low ; j=mid1+1 ; m=mid2+1; k=0;
    while(i<=mid1 && j<=mid2 && m<=high){
          if( s[i]<s[j] && s[i] < s[m]) { u[k]=s[i]; i++; }
          else if( s[j]<s[i] && s[j] < s[m]) { u[k]=s[j]; j++; }
          else if( s[m]<s[i] && s[m] < s[j]) { u[k]=s[m]; m++; }
          k++; 
    }
    while(i<=mid1 && j<=mid2){
        if(s[i]<s[j]){u[k]=s[i];i++;}
        else{u[k]=s[j];j++;}
        k++;
    }
    while(i<=mid1 && m<=high){
        if(s[i]<s[m]){u[k]=s[i];i++;}
        else{u[k]=s[m];m++;}
        k++;
    }
    while(j<=mid2 && m<=high){
        if(s[j]<s[m]){u[k]=s[j];j++;}
        else{u[k]=s[m];m++;}
        k++;
    }
        while(i<=mid1){
            u[k] = s[i];
            i++; k++;
        }

        while(j<=mid2){
            u[k] = s[j];
            j++; k++;
        }

        while(m<=high){
            u[k] = s[m];
            m++; k++;
        }
     
    k=0;i=low;
    for(;i<=high &&k<high-low+1;i++){
        s[i] = u[k];
        k++;
    }
}

}
