package com.txx.study.sort;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/8 10:43
 * @Description:
 */
public class InsertSort {

    public static void main(String[] args){
        int[] arr = new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        insertSort(arr);
        String out = "";
        for (int digit : arr) {
            out += (digit + ",");
        }
        System.out.println(out);
    }

    public static void insertSort(int[] numbers)
    {
        int size = numbers.length;
        int temp = 0 ;
        int j =  0;

        for(int i = 1 ; i < size ; i++)
        {
            temp = numbers[i];
            //假如temp比前面的值小，则将前面的值后移
            for(j = i-1 ; j >=0 ; j --)
            {
                if (numbers[j]>temp){
                    numbers[j+1] = numbers[j];
                }else{
                    break;
                }
            }
            numbers[j+1] = temp;
        }
    }
}
