/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y=x;
        int lastdigit;
        while (x>0){
            lastdigit=x%10;
            rev=rev*10+lastdigit;
            x=x/10;
        }
        if(y==rev){
            return true;
        }
        else return false;
    }
}
// @lc code=end

