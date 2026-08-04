import java.util.*;
class Count_frequencies_in_array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array");
        int n=sc.nextInt();
        System.out.print("Enter the elements of an array : ");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + "-->"+ entry.getValue());
        }

    }
}