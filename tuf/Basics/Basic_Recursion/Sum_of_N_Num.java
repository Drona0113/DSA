import java.util.Scanner;
class Sum_of_N_Num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the natural number to print sum up to: ");
        int n=sc.nextInt();
        int sum=Sum_of_N_Num.sumNumbers(n);
        System.out.print("Sum of first "+n+" Natural numbers is: "+sum);
    }
    public static int sumNumbers(int n){
        if(n==1) return 1;
        return n+sumNumbers(n-1);
    }
}