package week1;

/**
 *
 * @author twiki
 * 
 */

public class LinearSearch {
    public static void main(String[] args) {
//        int arr[] =new int[]{1,2,9,8,-1,88,7,1,32,4};
//        int x =  4;
//        System.out.println("What is the index of 4 it's : " +linearSearch(arr,x)); 
    }
 
public static int linearSearch(int[] a , int x){
    for (int i=0;i<a.length;i++){
           if(a[i] == x )  return i;
        } 
     return -1; }
 }