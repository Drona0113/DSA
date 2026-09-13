import java.util.*;
class Longest_subarray_sum_K{
    //This is the optimal solution for the array containing postives and 0's only not negatives...
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int res=findLongest_subarray_length(a,n,k);
        System.out.print(res);

    }
    public static int findLongest_subarray_length(int[] a,int n,int k){
        int left=0,right=0;
        int sum=a[0];
        int maxlen=0;
        while(right<n){
            if(sum==k) maxlen=Math.max(maxlen, right-left+1);
            right++;
            if(right<n) sum+=a[right];
            while(sum>k){
                sum-=a[left];
                left++;
            }

        }
        return maxlen;
    }
    
}