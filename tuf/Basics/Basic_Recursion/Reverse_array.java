import java.util.Scanner;
class Reverse_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the array of "+n+" elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Reverse_array.reversearray(a,n);
        System.out.print("Enter the Reversed array: ");
        for(int i : a){
            System.out.print(i+ " ");
        }
        System.out.println();

    }
    public static void reversearray(int a[],int n){
        int p1=0;
        int p2=n-1;
        while(p1<p2){
            int temp=a[p1];
            a[p1]=a[p2];
            a[p2]=temp;
            p1++;
            p2--;
        }
    }
}