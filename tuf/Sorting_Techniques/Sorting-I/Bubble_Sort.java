import java.util.*;
class Bubble_Sort{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter the elements of an array : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Bubble(arr,n);
        System.out.print("Sorted array : ");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void Bubble(int arr[],int n){
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}