package com.example;

/**
 * Created by DeanGuo on 10/23/16.
 * <p>
 * 给定一个字符串，求第一个不重复的字符 abbcad -> c
 * <p>
 * 使用哈希算法
 * ASCII单字节内码:256
 * ASCII双字节内码:６５５３６
 */

public class 第一个不重复的字符 {

    public static void main(String[] args) {
        String str = getFirstStr("abakckbaf");
        System.out.println(str);
    }

    private static String getFirstStr(String s) {
        char[] strs = s.toCharArray();
        // 定义哈希数组,大小为字符的取值范围即可
        int hashTable[] = new int[256];

        for (int i = 0; i < strs.length; i++) {
            hashTable[strs[i]]++;
        }

        for (int i=0; i < strs.length; i++) {
            if (hashTable[strs[i]] == 1) {
                return String.valueOf(strs[i]);
            }
        }

        return "";
    }

}
