class Solution {
    public int removePalindromeSub(String s) {
        if(s.isEmpty())return 0;
        else{
            if(isPalindrome(s))return 1;
            else return 2;
        }
    }
    public boolean isPalindrome(String s){
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
}