package Class00;

public class Test00 {
    public static void process01(){
        int N=1000;
        int a=0;
        for (int i = 0; i< N; i++){
             a=2+5;
             a=4*7;
             a=7*8;
        }
    }
    public static void process02(){
        int N=1000;
        int a=0;
        for (int i = 0; i< N; i++){
          a=1|9;
          a=2^8;
          a=6&1;
        }
    }
    //以上时间复杂度都为O（n），为了估计优劣需要实际跑
    public static void main(String[] args){
        int a=234;
        int b=567;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
        a=a^a;
        System.out.println(a);
    }
}
