import java.util.*;
class Missing_number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of Natural numbers : ");
        int N=sc.nextInt();

        System.out.print("Enter the array : ");
        int[] a=new int[N-1];
        for(int i=0;i<N-1;i++) a[i]=sc.nextInt();
        //int res=findNum(a,N); //Better approach
        //int ans=findUsingSum(a,N); //Optimal
        int x=findUsingXOR(a,N); //Best optimal
        System.out.print("Missing number : "+x);
    }
    public static int findNum(int[] a,int N){
        int[] hash=new int[N+1];
        for(int i=0;i<N-1;i++) hash[a[i]]=1; 
        for(int i=1;i<=N;i++){
            if(hash[i]==0) return i;
        }
        return -1;
    }
    public static int findUsingSum(int[] a,int N){
        int sum1=(N*(N+1))/2;
        int sum2=0;
        for(int i=0;i<N-1;i++){
            sum2+=a[i];
        }
        return sum1-sum2;
    }
    public static int findUsingXOR(int[] a,int N){
        int XOR1=0,XOR2=0;
        for(int i=0;i<N-1;i++){
            XOR2=XOR2 ^ a[i];
            XOR1 = XOR1 ^ (i+1);
        }
        XOR1=XOR1^N;
        return XOR1 ^ XOR2;
    }
}