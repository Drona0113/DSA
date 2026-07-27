import java.util.*;
class Reverse_Integer{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num=sc.nextInt();
        int rev=rev_Int(num);
        System.out.println("Reverse Integer is : "+rev);
    }
    public static int rev_Int(int num){
        int r=0;
        while(num>0){
            int lastDigit=num%10;
            r=r*10+lastDigit;
            num=num/10;

        }
        return r;
    }

}

//Optimal Solution: 