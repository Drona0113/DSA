
import java.util.*;
class Armstrong_Num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.print(num+" is a Armstrong number");
        }
        else{
            System.out.print(num+" is not a Armstrong number");
        }
    }
    public static boolean isArmstrong(int num){
        int k=Integer.toString(num).length();//String.valueOf(num).length()
        int sum=0;
        int n=num;
        while(n>0){
            int lastdigit=n%10;
            sum+=Math.pow(lastdigit,k);
            n=n/10;
        }
        return sum==num;
    }
}