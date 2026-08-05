import java.util.*;
class Selection_Sort{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter the elements of an array : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Selection(arr,n);
        System.out.print("Sorted array : ");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void Selection(int arr[],int n){
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp;
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}