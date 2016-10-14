package com.example;

/**
 * Created by DeanGuo on 10/15/16.
 *
 * 1．先从数列中取出一个数作为基准数。
 *
 * 2．分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
 *
 * 3．再对左右区间重复第二步，直到各区间只有一个数。
 */

public class 快速排序 {
    public static void main(String[] args) {

        int data[] = {6, 8, 10, 5, 3, 9, 2, 7, 4 ,1};
        int left = 0;
        int right = data.length-1;
        quickSort(data, left, right);

        for (int d : data) {
            System.out.println(d);
        }
    }

    private static void quickSort(int[] data, int l, int r) {
        // 当需要比较的数组相遇或者不如何规则时表示已经比较完成
        if (l == r || l > r ) {
            return;
        }

        // 设基准元素为第一个
        int base = data[l];
        int left = l+1;
        int right = r;

        // 将左右游标向中间移动,找出比base大和小的数进行交换, 当相遇时退出循环
        while (left != right) {
            int curLeft = data[left];
            int curRight = data[right];

            // 当左边大于基数,右边小于基数时进行交换,两边同时移动游标继续比较
            if (curLeft > base && curRight < base) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;

                left ++;
                if (left != right) {
                    right --;
                }

            }
            // 当左边大于基数,右边大于基数,此时移动右侧游标继续比较
            else if (curLeft > base && curRight > base) {
                right --;
            }
            // 当左边小于于基数,右边小于基数,此时移动左侧游标继续比较
            else if (curLeft < base && curRight < base) {
                left ++;
            }
            // 当左边小于于基数,右边大于基数,此时不需要交换,两边同时移动游标继续比较
            else if (curLeft < base && curRight > base) {
                left ++;
                if (left != right) {
                    right --;
                }

            }
        }

        // 当两游标相遇时将基准数移动到left的位置,此时left左边都小于基准,右边都大于基准
        if (left == right) {
            // 如果相遇时的元素大于基准元素,则和前一个元素交换位置,否则直接交换位置
            if (data[left] > base) {
                left = left -1;
            }

            int temp = data[left];
            data[left] = data[l];
            data[l] = temp;
        }

        // 通过基数的位置将数据分为两组继续对比,直到left=right
        quickSort(data, l , left-1);
        quickSort(data, left+1 , r);
    }

}

