import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
public class Fanzhuanzifuchuan {
    public static void main(String[] args) {
        Fanzhuanzifuchuan fanzhuanzifuchuan = new Fanzhuanzifuchuan();
        String s = fanzhuanzifuchuan.resver("123456");
        System.out.println(s);
    }


public  String  resver(String str) {
    if (str == null || str.length() <= 1) {
        System.out.println(str);
        return str;
    }
    return resver(str.substring(1))+ str.charAt(0);//originStr.charAt(0)是将originStr这个字符串的
//    第一位拿出来；originStr.substring(1)表示把originStr这个字符串的索引为1及之后的字符
//    第一次 23456 +1 (3456 +2 调用自己 走else得) 第二次 345612  第三次 (第三次) 直到最后一次以str=6 str.sbutring(1)回调自己执行
//    if (str == null || str.length() <= 1) 再回到本次的执行 行中 + str.charAt(0);  每次回调都会拼接一下所以在最后就会返还是反的
//    一次调用包括多次回调自己 第一次走的是自己else 其中包括就有多次的调用自己。
//    所以整个调用栈就依次返回“6”+‘5’+‘4’+‘3’+‘2’+‘1’ = “654321”。
//    最后，控制台输出打印“654321”。
}

}


