import java.util.*;

class Remove_duplicates_in_sorted_array {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        System.out.print("Enter array : ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        Remove_duplicates_in_sorted_array sol = new Remove_duplicates_in_sorted_array();
        int k = sol.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
   
    public int removeDuplicates(int[] nums) {
        // HashSet to store unique elements we have seen
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;
        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);
                nums[index] = num;
                index++;
            }
        }
        return index;
    }
}


   

