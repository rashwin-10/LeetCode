class Solution {
    public boolean isPalindrome(String s) {
        String n = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = n.length() - 1;
        while (left < right) {
            if (n.charAt(left) != n.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}