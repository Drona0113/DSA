import java.util.*;
class Count_dig_Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n=sc.nextInt();
        int digits=countDigits(n);
        System.out.println("Number of Digits in "+ n +" is:  "+digits);
    }
    public static int countDigits(int n){
        int cnt=0;
        while(n>0){
            cnt+=1;
            n=n/10;
        }
        return cnt;
    }
}