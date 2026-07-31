import java.util.*;
class Print_1_to_N{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num up to print: ");
        int n=sc.nextInt();
        Print_1_to_N.printNumbers(1,n);
    }
    public static void printNumbers(int current,int n){
        if(current>n) return;
        System.out.print(current + " ");
        printNumbers(current+1, n);
    }
}