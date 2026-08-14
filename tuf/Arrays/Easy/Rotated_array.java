import java.util.*;
class Rotated_array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        System.out.print("Enter array : ");
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter no. of places to rotate : ");
        int k=sc.nextInt();
        System.out.print("Enter Direction : ");
        String direction=sc.next().toLowerCase();

        int[] result=new Rotated_array().rotateArray(nums,k,direction,n);

        for(int num:result){
            System.out.print(num + " ");
        }
    }
    public int[] rotateArray(int[] nums,int k,String direction,int n){
        if(n==0 || k==0) return nums;

        k = k % n;
        if(direction.equals("right")){
            reverse(nums,0,n-1);
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
        }
        if(direction.equals("left")){
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
            reverse(nums,0,n-1);
        }
        return nums;
    }

    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}