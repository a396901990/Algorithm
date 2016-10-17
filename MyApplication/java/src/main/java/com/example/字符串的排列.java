package com.example;

/**
 * Created by DeanGuo on 10/18/16.
 * <p>
 * 打印字符串所有的排列可能,比如abc:abc,acb,bac,bca,cab,cba
 *
 * 思路:将字符串分为两部分,第一个字符,和剩下的字符。然后用第一个字符去交换循环剩下的字符
 * 1.将字符串分为两部分,一部分是第一个字符串,第二部分是剩余的字符串(abc:a,bc)。
 */

public class 字符串的排列 {
    public static void main(String[] args) {
        listString("abcd");
    }

    private static void listString(String str) {

        // 第一层循环将每个字符交换到最前面
        for (int i = 0; i < str.length(); i++) {

            char[] replaceStr = str.toCharArray();
            char tempStr = replaceStr[0];
            replaceStr[0] = replaceStr[i];
            replaceStr[i] = tempStr;

            for (int j = 1; j < replaceStr.length; j++) {
                // 将第一个元素和其他元素交换
                char[] resultStr = replaceStr;
                tempStr = resultStr[0];
                resultStr[0] = resultStr[j];
                resultStr[j] = tempStr;
                System.out.println(String.valueOf(resultStr));
            }
        }
    }
}
