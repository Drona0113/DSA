import java.util.*;
class PrimeNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n=sc.nextInt();
        //PrimeNum p=new PrimeNum();
        //boolean isPrime=p.checkPrime(n);
        if(PrimeNum.checkPrime(n)){
            System.out.println(n+" is a Prime number");
        }
        else{
            System.out.println(n+" is not a Prime number");
        }

    }
    public static boolean checkPrime(int n){
        int cnt=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                cnt++;
                if(n/i!=i){
                    cnt++;
                }
            }
        }
        return cnt==2;
    }
}