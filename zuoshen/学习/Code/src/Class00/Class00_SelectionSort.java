package Class00;

import java.util.Arrays;

public class Class00_SelectionSort {
    public static void selectionSort(int[] arr){
        //去掉错误的数组
        if (arr==null||arr.length<2){
            return;
        }
        //i ~ N-1 选择最小值
        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;
            //i~N-1上找最小的值的位置
            for(int j=i+1;j<arr.length-1;j++){
                minIndex = arr[j]<arr[i]?j:minIndex;
            }
            swap(arr,i,minIndex);
        }
    }
    //数组的值交换
    public static void swap(int[] arr,int i,int j) {
        int tmp =arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static void main(String[] args){
        //测试用例
        int[] a={3,4,57,89,965,4,23765,798};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
