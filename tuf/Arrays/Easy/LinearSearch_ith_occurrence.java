import java.util.*;
class LinearSearch_ith_occurrence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        System.out.print("Enter array : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("Enter target : ");
        int target=sc.nextInt();
        System.out.print("Enter the occurrence : ");
        int occurrence=sc.nextInt();
        int result=findIthOccurence(arr,target,occurrence,n);
        if(result !=-1){
            System.out.println("Occurrence " + occurrence + " of " + target + " is at index: " + result);
        } else {
            System.out.println("The element does not occur " + occurrence + " times.");
        }
        
    }
    public static int findIthOccurence(int arr[],int target,int occurrence,int n){
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                cnt++;
                if(cnt==occurrence) return i;
            }
        }
        return -1;
    }
}