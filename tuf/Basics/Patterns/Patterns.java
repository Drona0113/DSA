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
        p.pattern7(n);
        p.pattern8(n);
        p.pattern9(n);
        p.pattern10(n);
        p.pattern11(n);
        p.pattern12(n);
        p.pattern13(n);
        p.pattern14(n);
        p.pattern15(n);
        p.pattern16(n);
        p.pattern17(n);
        p.pattern18(n);
        p.pattern19(n);
        p.pattern20(n);
        p.pattern21(n);
        p.pattern22(n);
    }
    
    public void pattern22(int n){
        for(int i=0;i<(2*n-1);i++){
            for(int j=0;j<(2*n-1);j++){
                int top=i;
                int bottom=2*n-2-i;
                int left=j;
                int right=2*n-2-j;
                
                int minDist=Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print((n-minDist)+ " ");
            }
            System.out.println();
        }
    }

    public void pattern21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern20(int n){
        int spaces=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;

            //left stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // right stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();

            if(i<n) spaces-=2;
            else spaces+=2;
        }
        
    }
    public void pattern19(int n){
        int init=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i ;j++){
                System.out.print("*");
            }
            for(int j=0;j<init;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            init+=2;
            System.out.println();
        }
        init=2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<init;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            init-=2;
            System.out.println();
        }
    }

    public void pattern18(int n){
        for(int i=0;i<n;i++){
            for(char ch=(char)('A'+n-i-1);ch<=(char)('A'+n-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public void pattern17(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=(2*i+1);j++){
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern16(int n){
        for(int i=0;i<n;i++){
            char ch=(char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public void pattern15(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void pattern14(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public void pattern13(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=1;
            }
            System.out.println();
        }
    }

    public void pattern12(int n){
        int spaces=2*n-2;
        for(int i=1;i<=n;i++){
            //left
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //right
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
            spaces-=2;
        }
    }

    public void pattern11(int n){
        int start;
        for(int i=0;i<n;i++){
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;

            }
            System.out.println();
        }
    }

    public void pattern10(int n){
        this.pattern2(n);
        this.pattern5(n);
    }

    public void pattern9(int n){
        this.pattern7(n);
        this.pattern8(n);
    }

     public void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
               System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
               System.out.print(" ");
            }
            System.out.println();
        }
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
