package com.txx.study.sort;

/**
 * @Auther: tanxiaoxiao
 * @Date: 2019/3/7 11:46
 * @Description:
 */
public class BubbleSort {
    public static void main(String [] args){
        int[] arr = {3,2,4,5,1,6,7,34,65,43,11,67,234,66,4};
        sort2(arr);
        for (int a:arr){
            System.out.print(a+",");
        }
        int[] arr1 = {3,2,4,5,1,6,7,34,65,43,11,67,234,66,4};
        sort2(arr1);
        for (int a:arr1){
            System.out.print(a+",");
        }
        int[] arr2 = {3,2,4,5,1,6,7,34,65,43,11,67,234,66,4};
        sort3(arr2);
        for (int a:arr2){
            System.out.print(a+",");
        }
    }
    public static void sort1(int[] a){
        int num = 0;
        int j;
        int k = a.length;
        boolean flag = true;
        while (flag){
            flag = false;
            for (j=1;j<k;j++){
                num ++;
                if (a[j-1]<a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(num);
    }

    public static void sort2(int[] a){
        int num = 0;
        int j;
        int k = a.length;
        boolean flag = true;
        while (flag){
            flag = false;
            for (j=1;j<k;j++){
                num ++;
                if (a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
            k--;
        }
        System.out.println(num);
    }

    public static void sort3(int [] a){
        int num = 0;
        int j , k;
        int flag = a.length;//flag来记录最后交换的位置，也就是排序的尾边界

        while (flag > 0){//排序未结束标志
            k = flag; //k 来记录遍历的尾边界
            flag = 0;

            for(j=1; j<k; j++){
                num++;
                if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                    //表示交换过数据;
                    flag = j;//记录最新的尾边界.

                }
            }
        }
        System.out.println(num);
    }



}
