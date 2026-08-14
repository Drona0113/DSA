import java.util.*;
class Union_2_sorted_array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array 1 : ");
        int n=sc.nextInt();
        System.out.print("Enter array 1 : ");
        int[] arr1=new int[n];
        for(int i=0;i<n;i++) arr1[i]=sc.nextInt();
        System.out.print("Enter size of array 2 : ");
        int m=sc.nextInt();
        System.out.print("Enter array 2 : ");
        int[] arr2=new int[m];
        for(int j=0;j<m;j++) arr2[j]=sc.nextInt();
        System.out.print("Union of 2 sorted arrays : ");
        List<Integer> res=Union_2_sorted_array.findUnion(arr1,arr2);
        for(int num:res){
            System.out.print(num+ " ");
        }
    }
    public static List<Integer> findUnion(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        List<Integer> Union=new ArrayList<>();
        int i=0,j=0; // 2-pointers
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(Union.isEmpty() || Union.get(Union.size()-1)!=arr1[i]) Union.add(arr1[i]);
                i++;
            }
            else if(arr2[j]<arr1[i]){
                if(Union.isEmpty() || Union.get(Union.size()-1)!=arr2[j]) Union.add(arr2[j]);
                j++;
            }
            else{
                if(Union.isEmpty() || Union.get(Union.size()-1)!=arr1[i]) Union.add(arr1[i]);
                i++;j++;
            }
        }
        while(i<n){
            if(Union.isEmpty() || Union.get(Union.size()-1)!=arr1[i]) Union.add(arr1[i]);
                i++;
        }
        while(j<m){
            if(Union.isEmpty() || Union.get(Union.size()-1)!=arr2[j]) Union.add(arr2[j]);
                j++;
        }
        return Union;

    }
}