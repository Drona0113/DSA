import java.util.*;
class Patterns{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of lines: ");
        int n=sc.nextInt();
        
        Patterns p=new Patterns();
        
        p.pattern1(n);
        p.pattern2(n);
        p.pattern3(n);
        p.pattern4(n);
        p.pattern5(n);
        p.pattern6(n);
    }

    public void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern4(int n){
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}