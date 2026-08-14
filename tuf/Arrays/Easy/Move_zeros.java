import java.util.*;
class Move_zeros{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        System.out.print("Enter array : ");
        int nums[]=new int[n];
        for(int i=0;i<n;i++) nums[i]=sc.nextInt();
        int[] result=new Move_zeros().moveZeroes(nums,n);
        System.out.print("After moving Zeroes : ");
        for(int num: result) System.out.print(num + " ");
    }

    public int[] moveZeroes(int[] nums,int n) {
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if (j==-1) return nums;
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}