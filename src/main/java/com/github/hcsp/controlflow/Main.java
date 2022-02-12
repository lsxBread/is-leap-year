package com.github.hcsp.controlflow;

public class Main {
    /**
     * 判断一个给定的年份数字是不是闰年。一个年份是闰年的条件是：
     * 普通年能被4整除且不能被100整除的为闰年。（如2004年就是闰年,1901年不是闰年）
     * 世纪年能被400整除的是闰年。(如2000年是闰年，1900年不是闰年)
     * <p>例如，1999年不是闰年；2000年是闰年；1900年不是闰年。
     *
     * @param year 给定的年份数字
     * @return 如果该年份是闰年，返回true，否则返回false
     */
    public static boolean isLeapYear(int year) {
        // 类型转换 转换成双精度
        // 判断是否有小数点
        System.out.println(year % 400);
        System.out.println(year % 4);
        if (year % 400 == 0){
            return true;
        }else return year % 4 == 0 && year % 100 != 0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1999));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2004));
    }
}
