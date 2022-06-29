import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("输入你想查看那个月份兔子的总数");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Test1 test1 = new Test1();
        test1.Sum(a);
    }

    /*关于JAVA经典算法40题(超实用版)*/

    /*【程序1】题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不
    死，问每个月的兔子总数为多少？*/
    /*
    * 分析一下  假设现在你有一对兔子 从出生开始
    *  第一个月 1对  （0+1） 1
    *  第二个月 1对   （0+1）  1
    * 第三个月 2对 （0+1+1对)    2
    * 第四个月 3对  (1+1+1对）    3
    * 第五个月 5对   (1+1+1+1+1对） 5
    *        8对      （1+1+1+1+1+   1+1+1 对） 8
    *
    * 你n个月
    * */

    public void Sum(int a) {
        Function function = new Function();
        /*function.Fsum(a);*/
            int fsum = function.Fsum(a);
            System.out.println("现在一共有"+fsum+"对兔子");

    }

}
class  Function{
    public int Fsum(int i){
        int b=0;
        if(i==1 || i==2) return 1; else
        return Fsum(i-1)+Fsum(i-2);
    };

}