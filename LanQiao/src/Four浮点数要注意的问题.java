/**
 * Created by jcl on 2016/12/1.
 */
public class Four浮点数要注意的问题 {




    public static void main(String[] args){
        /**
         啤酒和饮料:
         啤酒每罐2.3元，饮料每罐1.9元，小明买了若干啤酒和饮料，一共花了82.3元
         还知道他买的啤酒比饮料的数量少，请你计算他买了几罐啤酒
         答案是一个整数

         */
        // 浮点数：足够接近|a-b|<seta ，不能用==
        // 可以用Math.abs(0.2+0.1 - 0.3)<1E-10
        // 还可以扩大十倍
//        for(int a = 0;a < 100 ;a++){
//            for(int b = 0;b < 100;b++){
////                if(a*2.3 + b*1.9 == 82.3){
//                if(a*23 + b*19 == 823){
//                    System.out.println(a+","+b);
//
//                }
//            }
//        }


        /**
        有一群海盗（不多于20人），在船上比拼酒量。过程如下：
         打开一瓶酒，所有在场的人平分喝下，有几个人倒下了，再打开一瓶酒平分，又有倒下的，再次重复。。。
         直到开了第4瓶酒，坐着的已经所剩无几，海盗船长也在其中。当第4瓶酒平分喝下后，大家都倒下了。

         等船长醒来，发现海盗船搁浅了。他在航海日志中写到：“。。。昨天，我正好喝了一瓶，奉劝大家，开船不会喝酒，喝酒别开船”

         推断开始有多少人，每一轮喝下来还剩多少人

         20,5,4,2,0
         */

        for(int a = 20;a >= 1;a--) {
            for (int b = a - 1; b >= 1; b--) {
                for (int c = b - 1; c >= 1; c--) {
                    for (int d = c - 1; d >= 1; d--) {
                        if (b*c*d + a*c*d + a*b*d + a*b*c == a*b*c*d) {
                            System.out.println(a + "," + b + "," + c + "," + d);
                        }
                    }
                }
            }
        }



    }




}
