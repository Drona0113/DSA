/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int rev=0;
     while(x!=0){
        int lastDigit=x%10;
        x=x/10;
        //check overflow
        if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE && lastDigit>7)) return 0;
        if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE && lastDigit<-8)) return 0;

        rev=rev*10+lastDigit;
        
     }  
     return rev; 
    }
}
// @lc code=end

