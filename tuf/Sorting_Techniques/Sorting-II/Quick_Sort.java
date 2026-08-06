import java.util.Scanner;
class Quick_Sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();
        System.out.print("Enter the array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Quick_Sort q=new Quick_Sort();
        q.quickSort(arr,0,n-1);
        System.out.print("Sorted array : ");
        for (int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();

    }
    public void quickSort(int[] arr,int low,int high){
        if(low<high){
            int partition_index=Partition(arr,low,high);
            quickSort(arr, low, partition_index-1);
            quickSort(arr, partition_index+1, high);
        }
    }
    public int Partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low,j=high;
        while(i<j){
            int temp;
            while(arr[i]<=pivot && i<=high-1) i++;
            while(arr[j]>=pivot &&  j>=low+1) j--;
            if(i<j){
                
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
        }
        return j;
    }
}