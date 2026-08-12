import java.util.*;

class second_largest_smallest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        System.out.print("Enter array : ");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s_largest=second_largest_smallest.second_largest(a,n);
        int s_smallest=second_largest_smallest.second_smallest(a,n);

        System.out.println("Second Largest : "+s_largest);
        System.out.println("Second Smallest : "+s_smallest);
        
    }

    public static int second_largest(int[] a,int n){
        if (n<2) return -1;
        int largest=a[0],s_largest=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                s_largest=largest;
                largest=a[i];
            }
            else if(a[i]<largest && a[i]>s_largest) s_largest=a[i];
        }
        return s_largest;
    }
    public static int second_smallest(int[] a,int n){
        if(n<2) return -1;
        int smallest=a[0],s_smallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                s_smallest=smallest;
                smallest=a[i];
            }
            else if(a[i]!=smallest && a[i]<s_smallest) s_smallest=a[i];
        }
        return s_smallest;
    }
}