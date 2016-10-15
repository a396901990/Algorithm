package com.example;

/**
 * Created by DeanGuo on 10/14/16.
 *
 * 大数相加(仅限正数):
 *
 * 1.反转两个字符串，便于从低位到高位相加和最高位的进位导致和的位数增加；
 *
 * 2.对齐两个字符串，即短字符串的高位用‘0’补齐，便于后面的相加；
 *
 * 3.把两个正整数相加，一位一位的加并加上进位。
 */
public class 大数相加 {
    public static void main(String[] args) {
        additionTwoNumber("1249999","43991000000000000");
    }

    public static void additionTwoNumber(String num1, String num2) {

        // 检查输入
        if (!checkIsNumber(num1) || !checkIsNumber(num2)) {
            System.out.println("input error");
            return;
        }

        // 反转两个字符串,使个位数在最前方便计算
        StringBuffer s1 = new StringBuffer(num1).reverse();
        StringBuffer s2 = new StringBuffer(num2).reverse();

        // 低位字符串补齐
        int lengthDiff = Math.abs(s1.length() - s2.length());
        if (lengthDiff != 0) {
            for (int i = 0; i < lengthDiff; i++) {
                if (s1.length() > s2.length()) {
                    s2.append("0");
                } else {
                    s1.append("0");
                }
            }
        }

        // 位数相加
        final int length = s1.length();
        StringBuffer result = new StringBuffer();
        boolean isOver = false;

        for (int i = 0 ; i < length ; i++) {
            int indexNum1 = Integer.parseInt(s1.charAt(i)+"");
            int indexNum2 = Integer.parseInt(s2.charAt(i)+"");

            int numResult = indexNum1 + indexNum2 + (isOver ? 1 : 0);
            isOver = numResult > 10 ? true : false;
            result.append(String.valueOf(numResult > 10 ? numResult-10 : numResult));
        }

        // 再次反转输入
        System.out.println(result.reverse().toString());
    }

    public static boolean checkIsNumber(String inputString) {
        return inputString != null && !"".equals(inputString) && inputString.matches("[0-9]+");
    }
}
