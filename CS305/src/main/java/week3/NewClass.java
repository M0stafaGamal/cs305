package week3;

/**
 *
 * @author twiki
 */
public class NewClass {
   /*
    write a Θ(n) algorithm that sorts n distinct integers, ranging in size between 1 and kn inclusive, where k is a constant positive integer. (Hint: Use a knelement array.) Pseudocode is fine
Sort(A[],n)//A array with n elements{ int max=0;
//to store max element in n
for(int i=0;i<n;i++)
//finding max element
{ if(A[i]>max) max = A[i]; }
//creating array with max+1 size
int f[max+1]={0};
//and setting all values of f to 0
for(int i=0;i<n;i++)
//finding frequency of elements in A
{ f[A[i]]+=1;//increasin count }
int k=0;
for(int i=0;i<max;i++)
//generating sorted sequence
{ if(f[i]!=0)
{ while(f[i]>0) { A[k]=i;
//inserting in sorted order
k++; f[i]=f[i]-1; } } }
return A;
//sorted list is returned}
    */ 
    
    /*
    6 
N/2 
Compare each 2
We got n/2 max and min 
Compare
Then output
    */
}
