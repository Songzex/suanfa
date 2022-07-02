public class Sushu {
    public static void main(String[] args) {
         /*判断101-200之间有多少个素数，并输出所有素数。
1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，
则表明此数不是素数，反之是素数。*/
        int sum=0;//定义一个统计所有和是变量
        for(int i =101;i<201;i++){
            for (int j=2; j<=i; j++)
            {
              if (i==j){
                  System.out.println(i);//说明是个素数 打印
              }else if (i%j==0) {//被其他数整除 说明他不是素数SU
                   sum++;
                   break;
              }
            }
        }
        System.out.println(100-sum);
    }
}


