import java.util.*;
class Longest_subarray_with_sum_K{
    // This is the Optimal Solution
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();
        System.out.print("Enter the array : ");
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.print("Enter the value of sum  K : ");
        int k=sc.nextInt();
        int res= length_longest_subarray(a,n,k);
        System.out.print("The Length of Longest subarray with array includes (+,0,-) :  "+res);
    }
    public static int length_longest_subarray(int[] a,int n,int k){
        int sum=0,maxlen=0;
        Map<Integer,Integer> prefixSum=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum==k) maxlen=Math.max(maxlen,i+1);
            int rem=sum-k;
            if(prefixSum.containsKey(rem)){
                int len=i-prefixSum.get(rem);
                maxlen=Math.max(maxlen,len);
            }
            if(!prefixSum.containsKey(sum)) prefixSum.put(sum,i);
        }
        return maxlen;
    }
}
