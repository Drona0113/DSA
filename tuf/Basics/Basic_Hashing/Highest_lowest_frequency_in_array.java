import java.util.*;
class Highest_lowest_frequency_in_array{
    public static void main(String args[]){
        Highest_lowest_frequency_in_array hl=new Highest_lowest_frequency_in_array();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        System.out.print("Enter the elements in an array : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        hl.Frequency(a,n);

    }
    public void Frequency(int[] arr,int n){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int maxFreq=0, minFreq=Integer.MAX_VALUE;
        List<Integer> maxElements = new ArrayList<>();
        List<Integer> minElements = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int element=entry.getKey();
            int cnt=entry.getValue();

            if(cnt>maxFreq){
                maxFreq=cnt;
                maxElements.clear();
                maxElements.add(element);
            } else if(cnt==maxFreq){
                maxElements.add(element);
            }

            if(cnt<minFreq){
                minFreq=cnt;
                minElements.clear();
                minElements.add(element);
            } else if(cnt==minFreq){
                minElements.add(element);
            }
        }

        if(maxElements.size()==1)
            System.out.println("The highest frequency element is "+maxElements.get(0)+ " with frequency of "+maxFreq);
        else
            System.out.println("The highest frequency elements are "+maxElements+ " with frequency of "+maxFreq);

        if(minElements.size()==1)
            System.out.println("The lowest frequency element is "+minElements.get(0)+ " with frequency of "+minFreq);
        else
            System.out.println("The lowest frequency elements are "+minElements+ " with frequency of "+minFreq);
    }
}