/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */


 class LongestCommonPrefix {
    public static String CommonString(String s1, String s2){

        StringBuilder str = new StringBuilder();
        int n = Math.min(s1.length(),s2.length());
        for(int i = 0; i < n; ++i){
            if(s1.charAt(i) == s2.charAt(i)){
                str.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return str.toString();
    }
    public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i = 1; i<strs.length;++i){
           str = CommonString(str,strs[i]);
        }
        return str;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
