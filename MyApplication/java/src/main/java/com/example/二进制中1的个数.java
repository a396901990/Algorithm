package com.example;

/**
 * Created by DeanGuo on 10/16/16.
 *
 * 输入一个数字,输入该数二进制中1的个数,例如9的二进制为1001,则1的个数为2
 *
 * 知识点:
 * &(与):任何数和0做与运算都得0  1&0=0,0&0=0
 * |(或):任何数和1做或运算都得1  0|1=1,1|1=1
 * ^(异或):相同得0,不同得1      0^0=0,0^1=1
 * <<(左位移):最右面补n个0         1010<<2=101000(x<<y,就是x乘以2的y次方)
 * >>(右位移):去调右面n个数,左面正数补0,负数补1  1010>>2=0010(x>>y:就是x除以2的y此方,取整数)
 *
 * 思路:
 * 找一个flag从1开始不停的做左移(1,10,100,1000....)
 * 这样通过flag和每一位比较,如果结果和flag相同,表示该位是1(1010&100=0000,1010&1000=1000)
 */

public class 二进制中1的个数 {

    public static void main(String[] args) {
        findNum1(23);
    }

    private static void findNum1(int n) {
        int flag = 1;
        int count = 0;
        // 当flag左移后大于输入的数字时终止
        while (flag < n) {
            // 判断当前为是否为1
            if ((n & flag) == flag) {
                count++;
            }
            flag = flag << 1;
        }

        System.out.println(count);
    }
}
