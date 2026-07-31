
import java.util.Scanner;


class Palindrome_String{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.next().toLowerCase();
        System.out.print("The given String is Palindrome? : "+Palindrome_String.palindrome(0,s));

    }
    public static boolean palindrome(int i,String s){
        if(i>=s.length()/2) return true;

        if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;

        return palindrome(i+1, s);
    }
}