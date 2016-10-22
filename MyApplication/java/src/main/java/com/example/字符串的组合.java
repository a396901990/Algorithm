package com.example;

/**
 * Created by DeanGuo on 10/18/16.
 * <p>
 * 打印字符串所有的组合可能,比如abc:a,b,c,ab,ac,bc,abc
 *
 * 思路:
 * 1.将字符串分为两部分,一部分是第一个字符串,第二部分是剩余的字符串(abc->a,bc)。
 * 2.根据字符串长度n,可以分为n个组合(1,2,3...n)
 * 3.用第一个字符加上剩余字符组成组合(abc->a,bc->ab,ac)
 */

public class 字符串的组合 {
    public static void main(String[] args) {
        listString("abcd");
    }

    private static void listString(String str) {

        // 第一层循环遍历组合数(a,ab,abc)
        for (int i = 0; i < str.length(); i++) {

            char[] replaceStr = str.toCharArray();
            char tempStr = replaceStr[0];
            replaceStr[0] = replaceStr[i];
            replaceStr[i] = tempStr;

            for (int j = 1; j < replaceStr.length; j++) {
//                // 将第一个元素和其他元素交换
                char[] resultStr = replaceStr;
//                tempStr = resultStr[0];
//                resultStr[0] = resultStr[j];
//                resultStr[j] = tempStr;
                StringBuffer sb = new StringBuffer(String.valueOf(replaceStr[0]));
                int count = i-1;
                if (i>0) {

                } else {

                }
                System.out.println(String.valueOf(sb.toString()));
            }
        }
    }
}
