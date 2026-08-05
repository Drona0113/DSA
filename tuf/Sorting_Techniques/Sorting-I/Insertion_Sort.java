import java.util.*;
class Insertion_Sort{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter the elements of an array : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Insertion(arr,n);
        System.out.print("Sorted array : ");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void Insertion(int arr[],int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}