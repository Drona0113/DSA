import java.util.*;
class Print_N_to_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n=sc.nextInt();
        Print_N_to_1.printNumbers(n);
    }
    public static void printNumbers(int current){
        if(current<1) return;
        System.out.print(current + " ");
        printNumbers(current-1);
    }
}