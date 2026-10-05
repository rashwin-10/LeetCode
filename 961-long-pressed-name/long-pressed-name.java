class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] n = name.toCharArray();
        char[] t = typed.toCharArray();
        int i = 0 , j = 0;
        while( j < t.length){
            if(i < n.length && n[i] == t[j]){
                i++;
            }
            else if(j == 0 || t[j] != t[j-1]){
                return false;
            }
            j++;
        }
        return i == n.length;
    }
}