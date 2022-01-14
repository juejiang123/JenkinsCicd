package com.jenkins.leetCode;

import java.util.HashMap;

public class LongestSubString {

    public String LengthOfLongestSubString(String str){
        int res = 0;
        int le =0;
        int ri =0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int left=0,right=0; right<str.length();right++){
            if(map.containsKey(str.charAt(right))){
                left = Math.max(left,map.get(str.charAt(right))+1);
            }
            map.put(str.charAt(right),right);
            res = Math.max(res,right-left+1);
            if(res<=(right-left+1)){
                le = left;
                ri = right;
            }

        }
        return str.substring(le, ri+1);
    }

    public static void main(String[] args) {
        String s1 = "abcdcbefgh";
        LongestSubString subString = new LongestSubString();
        String integer = subString.LengthOfLongestSubString(s1);
        System.out.println(integer);
    }
}
