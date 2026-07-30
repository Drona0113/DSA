
import java.util.Scanner;

class GCD_Num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1=sc.nextInt();
        System.out.print("Enter num2: ");
        int n2=sc.nextInt();
        System.out.print("Enter the approach: ");
        String approach=sc.next();
        if(approach.equals("normal")){
            int gcd=findGcd(n1,n2);
            System.out.println("GCD of "+n1+" and "+n2+" in a "+approach+" is : "+gcd);
        }
        else{
            int gcd1=findGcdOptimal(n1,n2);
            System.out.println("GCD of "+n1+" and "+n2+" in a "+approach+" is : "+gcd1);  
        }
    }

    public static int findGcd(int n1,int n2){
        int gcd=1;

        for(int i=1;i<=Math.min(n1,n2);i++){

            if(n1 % i==0 && n2 % i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static int findGcdOptimal(int a,int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        else return a;
    }
}