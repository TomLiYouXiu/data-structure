package Class00;
/*
* 类似力扣260题
* 给定一个数组
* 1）数组中有一个数出现了奇数次，other出现了偶数次
*
* 2）两个数出现奇数次，other出现了偶数次
* */
public class Class00_Leetcode260 {
    public static void Leetcode260_1(int[] arr){
        //异或操作
        int a=0;
        for(int eor:arr){
            a^=eor;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int[] a={1,1,2,3,3};
        Leetcode260_1(a);
    }
}
