package com.txx.study.sort;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/8 10:53
 * @Description:选择排序 遍历数组，从第一个开始，没次从后面的数组选择一个最小/最大的数，与开始遍历的数进行调换
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        selectSort(arr);
        String out = "";
        for (int digit : arr) {
            out += (digit + ",");
        }
        System.out.println(out);
    }

    public static void selectSort(int[] numbers) {
        int size = numbers.length;
        int temp = 0;
        int j = 0;

        for (int i = 0; i < size; i++) {
            int flag = i;
            temp = numbers[i];
            for (j = i + 1; j < size; j++) {
                if (numbers[j] < temp) {
                    flag = j;
                    temp = numbers[j];
                }
            }
            if (flag != i) {
                temp = numbers[flag];
                numbers[flag] = numbers[i];
                numbers[i] = temp;
            }

        }
    }

}
