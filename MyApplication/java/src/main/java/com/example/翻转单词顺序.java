package com.example;

/**
 * Created by DeanGuo on 10/25/16.
 * <p>
 * 翻转句子中单词的顺序,但单词内字符顺序不变:"I have an apple" "apple an have I"
 * <p>
 * 思路:翻转两次单词顺序:第一次全部,第二次单词
 */

public class 翻转单词顺序 {

    public static void main(String[] args) {
        String s = "I have an apple";
        String str = reverseStr(s, 0, s.length()-1);
        char[] strs = str.toCharArray();
        int start = 0;
        for (int i = 0; i< strs.length; i++) {
            if (strs[i] == ' ') {
                str = (reverseStr(str, start, i-1));
                start = i+1;
            }
        }
        System.out.println(str);
    }

    private static String reverseStr(String s, int start, int end) {
        char[] strs = s.toCharArray();

        while(start < end) {
            char temp = strs[start];
            strs[start] = strs[end];
            strs[end] = temp;

            start++;
            end--;
        }
        return String.valueOf(strs);
    }

}
