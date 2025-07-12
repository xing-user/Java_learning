import java.util.Random;
import java.util.Scanner;

public class Data_Type {

    public static void main(String[] args) {
/*      Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3位数");
        int number = sc.nextInt();
        System.out.println("个位数："+number%10);
        System.out.println("十位数："+number/10%10);
        System.out.println("百位数："+number/100%10);*/
        int a = 10;
        int b = ++a;
        System.out.println(b);
        //^相同为false ,不同为true
        System.out.println(false ^ true);
        //! 取反
        System.out.println(!true);
        //三元表达市
        System.out.println(a > b ? a : b);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 2个数");
//        int number1 = sc.nextInt();
//        Scanner sc1 = new Scanner(System.in);
//        int number2 = sc1.nextInt();
//        System.out.println((byte)number1+(byte)number2);
        //写一个switch语句
//        Scanner sc = new Scanner(System.in);
//        int week = sc.nextInt();
//        switch (week) {
//            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
//            case 6, 7 -> System.out.println("休息日");
//            default -> System.out.println("不合法");
//        }
//        int sum = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//        double i = 0.1;
//        int count = 0;
//        while (i <= 8844430.0) {
//            count++;
//            i *= 2;
//        }
//        System.out.println(count);
//        int x = 12321;
//        int temp = x;
//        int sum = 0;
//        while (x!=0) {
//            //取个位数
//            int ge = x % 10;
//            //向后推移位
//            x = x / 10;
//            //反推
//            sum = sum * 10 + ge;
//        }
//        System.out.println(sum);
//        System.out.println(sum == temp);
        //两个整数 被除数与除数
/*        int c = 101;
        int d = 10;
        int count = 0;
        while (c>=d){
            count++;
            c -= d;
        }
        System.out.println(count);*/

//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0 || i/10 == 7 || i%10 == 7) {
//                System.out.println("过");
//            }else {
//                System.out.println(i);
//            }
//        }
//        while (1==1){
//            System.out.println("xuexi");
//        }
/*        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 1;
        while (x>=2) {
            if(y*y>x){
                System.out.println("x的平方根："+(y-1));
                break;
            } else if (y*y==x) {
                System.out.println("x的平方根："+y);
                break;
            }
            else y++;
        }*/
//        int num = 1000;
//        boolean bool = true;
//        for (int i = 2; i <= num-1; i++) {
//            if (num % i == 0) {
//                bool = false;
//            }
//        }
//        if (bool) {
//            System.out.println("是质数");
//        }else {
//            System.out.println("不是质数");
//
//        }
//        随机数
        Random ra = new Random();
        int x = ra.nextInt(0,100);

    }
}