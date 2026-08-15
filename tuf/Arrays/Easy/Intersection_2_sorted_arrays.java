import java.util.*;
class Intersection_2_sorted_arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array 1 : ");
        int n=sc.nextInt();
        System.out.print("Enter the sorted array 1 : ");
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.print("Enter size of array 2 : ");
        int m=sc.nextInt();
        System.out.print("Enter the sorted array 2 : ");
        int[] b=new int[m];
        for(int i=0;i<m;i++) b[i]=sc.nextInt();
        
        List<Integer> res=new Intersection_2_sorted_arrays().findInter(a,b,n,m);
        System.out.print("Intersection of two sorted arrays : ");
        for(int num:res) System.out.print(num + " ");
    }
    List<Integer> findInter(int[] a,int [] b,int n,int m){
        // 2-pointers approach
        int i=0,j=0;
        List<Integer> Inter=new ArrayList<>();

        while(i<n && j<m){
            if(a[i]<b[j]) i++;
            else if(b[j]<a[i]) j++;
            else{
                Inter.add(a[i]);
                i++;
                j++;
            }
        }
        return Inter;


    }
}