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
            
            num=num/10;
            //check overflow
        if(r>Integer.MAX_VALUE/10 || (r==Integer.MAX_VALUE && lastDigit>7)) return 0;
        if(r<Integer.MIN_VALUE/10 || (r==Integer.MIN_VALUE && lastDigit<-8)) return 0;
        r=r*10+lastDigit;
        }
        return r;
    }

}
//Integer.MAX_VALUE=2147483647 last digit-->7
//Integer.MIN_VALUE= -2147483648  last digit--> 8