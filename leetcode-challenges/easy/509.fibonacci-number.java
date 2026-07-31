/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int prev2=0;
        int prev1=1;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    /*
    public int fib(int n){
    if(n<=1) return n;
    return fib(n-1)+fib(n-2);
    }
    */
}
// @lc code=end

