import java.util.Scanner;
class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the natural number to print the Factorial: ");
        int n=sc.nextInt();
        int fac=Factorial.factorial(n);
        System.out.print("Factorial of a number "+n+" is: "+fac);
    }
    public static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}