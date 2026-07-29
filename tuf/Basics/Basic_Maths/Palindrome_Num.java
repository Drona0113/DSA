
import java.util.Scanner;


class Palindrome_Num{
    public boolean palindrome(int num){
        int rev=0;
        int dup=rev;
        while(num>0){
            int lastdigit=num%10;
            rev=rev*10+lastdigit;
            num=num/10;
        }
        return dup==num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        Palindrome_Num p=new Palindrome_Num();
        if(p.palindrome(num)){
            System.out.println(num+ " is a palindrome number");
        }
        else{
            System.out.println(num+" is not a palindrome number");
        }
    }
}