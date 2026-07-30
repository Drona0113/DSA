import java.util.*;
class Divisors{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Divisors d=new Divisors();
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        List<Integer> divisors = d.getDivisors(n);
        System.out.print("Divisors of "+n+" : ");
        for(int val:divisors){
            System.out.print(val+" ");//1 2 3 4 6 12
        }
        System.out.println();
    }
    public List<Integer> getDivisors(int n){
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
            res.add(i);
            }
        }
        return res; //[1,2,3,4,6,12]
    }
}