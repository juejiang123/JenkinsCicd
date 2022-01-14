package com.jenkins.leetCode;

import java.util.HashMap;

public class LongestPalindrome {

    public String longestPalindrome(String s){
        String str;
        int left = 0;
        int right = 0;

        return s.substring(left,right);
    }

    public static void main(String[] args) {
        String str = "abccde";
        LongestSubString lss = new LongestSubString();
        String s = lss.LengthOfLongestSubString(str);
        System.out.println(s);


    }
}
