package Class00;

public class Class00_BubbleSort {
    public static void BubbleSort(int[] arr){
        //去除错误的数组
        if(arr==null||arr.length==2){
            return ;
        }
        //每次循环都会比出较大的数，所以每次循环次数少一些就行
        for(int N=arr.length-1;N>0;N--){
            //进行数据的比较
            for(int i=0;i<N;i++){
                //如果前一个数比后一个数大的话就进行交换
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }
    //数据的交换
    //空间复杂度为O(0)
    //交换值
    //值可以一样但是内存中不能是一个空间
    public static void swap(int[] arr,int i,int j){
        //假设 int a=甲； int b=乙
        //首先要先理解异或
        //a=甲^乙 b=乙
        arr[i]=arr[i]^arr[j];
        //a=甲^乙 b=乙^甲^乙=甲
        arr[j]=arr[i]^arr[j];
        //a=甲^甲^乙=乙 b=甲
        arr[i]=arr[i]^arr[j];


    }
}
