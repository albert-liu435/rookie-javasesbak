package com.rookie.bigdata.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @Class LocalDateTimeMain
 * @Description
 * @Author rookie
 * @Date 2023/3/29 16:52
 * @Version 1.0
 */
public class LocalDateTimeMain {


    //一.新时间日期API常用、重要对象介绍
    //ZoneId: 时区ID，用来确定Instant和LocalDateTime互相转换的规则
    //Instant: 用来表示时间线上的一个点（瞬时）
    //LocalDate: 表示没有时区的日期, LocalDate是不可变并且线程安全的
    //LocalTime: 表示没有时区的时间, LocalTime是不可变并且线程安全的
    //LocalDateTime: 表示没有时区的日期时间, LocalDateTime是不可变并且线程安全的
    //Clock: 用于访问当前时刻、日期、时间，用到时区
    //Duration: 用秒和纳秒表示时间的数量（长短），用于计算两个日期的“时间”间隔
    //Period: 用于计算两个“日期”间隔
    //其中，LocalDate、LocalTime、LocalDateTime是新API里的基础对象，绝大多数操作都是围绕这几个对象来进行的，有必要搞清楚：
    //
    //LocalDate ： 只含年月日的日期对象
    //LocalTime ：只含时分秒的时间对象
    //LocalDateTime ： 同时含有年月日时分秒的日期对象
    //————————————————
    //版权声明：本文为CSDN博主「ChampionDragon」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
    //原文链接：https://blog.csdn.net/xxdw1992/article/details/112761525


    public static void main(String[] args) {

//        test01();
//        test02();

//        test03();

//        test04();

//        test05();

        test06();


    }

    /**
     * 常规使用
     */
    public static void test01() {

        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期：" + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("当前时间：" + localTime);


        //当前时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间 年月日时分秒：" + now);
        //当前年份
        int year = now.getYear();
        System.out.println("当前时间 年：" + year);
        //当前月份
        Month month = now.getMonth();
        System.out.println("当前时间 月 英文：" + month);
        //当前月份
        int monthValue = now.getMonthValue();
        System.out.println("当前时间 月 数字：" + monthValue);
        //当前的日
        int dayOfYear = now.getDayOfYear();
        System.out.println("当前年份中的第多少天：" + dayOfYear);
        //当前月中的日
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("当前月份中的第多少天：" + dayOfMonth);
        //当前周的日
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("当前周是周几 英文 ：" + dayOfWeek);
        //当前
        int dayOfWeekValue = dayOfWeek.getValue();
        System.out.println("当前周中的第多少天：" + dayOfWeekValue);
        int hour = now.getHour();
        System.out.println("当前小时：" + hour);
        int minute = now.getMinute();
        System.out.println("当前分：" + minute);
        int second = now.getSecond();
        System.out.println("当前秒：" + second);

        long seconds = Instant.now().getEpochSecond();
        System.out.println("当前时间的分钟值：" + seconds);
        long milliSeconds = Instant.now().toEpochMilli();
        System.out.println("当前时间的毫秒值：" + milliSeconds);
        LocalDateTime dateTimeFromSecond = LocalDateTime.ofInstant(Instant.ofEpochSecond(seconds), ZoneOffset.ofHours(8));  // 秒转datetime

        System.out.println("秒转datetime: " + dateTimeFromSecond);
        LocalDateTime dateTimeFromMilliSecond = LocalDateTime.ofInstant(Instant.ofEpochMilli(milliSeconds), ZoneOffset.ofHours(8)); // 毫秒转datetime

        System.out.println("秒转datetime:" + dateTimeFromMilliSecond);
    }


    /**
     * 各种转换
     */
    public static void test02() {
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));  // datetime转字符串

        System.out.println("datetime转字符串:" + format);

        LocalDateTime dateTime = LocalDateTime.parse(format, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));  // 字符串转datetime

        System.out.println("字符串转datetime: " + dateTime);
        Date date = Date.from(dateTime.toInstant(ZoneOffset.ofHours(8)));                             // datetime转date
        System.out.println("datetime转date: " + date);
        LocalDateTime fromDate = date.toInstant().atOffset(ZoneOffset.ofHours(8)).toLocalDateTime();  // date转datetime
        System.out.println("date转datetime: " + fromDate);

    }

    /**
     * 日期加减
     */
    public static void test03() {

        //根据指定日期/时间创建对象
        LocalDate localDate = LocalDate.of(2008, 1, 13);
        System.out.println("指定日期：" + localDate);
        LocalTime localTime = LocalTime.of(16, 23, 20);
        System.out.println("指定时间：" + localTime);

        //指定日期和时间
        LocalDateTime dateTime = LocalDateTime.of(2020, 1, 29, 14, 35, 51); // 2020-01-29T14:35:51
        System.out.println("日期： " + dateTime);

        LocalDateTime localDateTime1 = dateTime.minusSeconds(1);            // 2020-01-29T14:35:50
        System.out.println("减去一秒钟：" + localDateTime1);
        LocalDateTime localDateTime2 = dateTime.minusMinutes(1);            // 2020-01-29T14:34:51
        System.out.println("减去一分钟：" + localDateTime2);
        LocalDateTime localDateTime3 = dateTime.minusHours(1);              // 2020-01-29T13:35:51
        System.out.println("减去一小时：" + localDateTime3);
        LocalDateTime localDateTime4 = dateTime.minusDays(1);               // 2020-01-28T14:35:51
        System.out.println("减去一天: " + localDateTime4);
        LocalDateTime localDateTime5 = dateTime.minusWeeks(1);              // 2020-01-22T14:35:51
        System.out.println("减去一周：" + localDateTime5);
        LocalDateTime localDateTime6 = dateTime.minusMonths(1);             // 2019-12-29T14:35:51
        System.out.println("减去一月：" + localDateTime6);
        LocalDateTime localDateTime7 = dateTime.minusYears(1);              // 2019-01-29T14:35:51
        System.out.println("减去一年：" + localDateTime7);

        //日期加法
        LocalDateTime localDateTime = dateTime.plusDays(20);


    }

    /**
     * 比较日期
     */
    public static void test04() {
        LocalDateTime now = LocalDateTime.now();     // 2020-01-29T14:35:51.207
        LocalDateTime yesterday = now.minusDays(1);  // 2020-01-28T14:35:51.207
        boolean after = now.isAfter(yesterday);      // true
        boolean before = now.isBefore(yesterday);    // false
        boolean equal = now.isEqual(yesterday);      // false

    }

    /**
     * 其他类
     */
    public static void test05() {
        //日期
        LocalDate dateNow = LocalDate.now();        // 2020-01-29
        System.out.println("当前日期：" + dateNow);
        LocalDate date = LocalDate.of(2020, 1, 29); // 2020-01-29
        System.out.println("日期：" + date);

        //时间
        LocalTime timeNow = LocalTime.now();       // 14:35:51.207
        System.out.println("当前时间：" + timeNow);
        LocalTime time = LocalTime.of(23, 59, 59); // 23:59:59
        System.out.println("时间：" + time);

        //日期时间
        LocalDateTime dateTimeNow = LocalDateTime.now();                    // 2020-01-29T14:35:51.207
        LocalDateTime dateTime = LocalDateTime.of(2020, 1, 29, 23, 59, 59); // 2020-01-29T23:59:59

        //Instant时刻
        long second = Instant.now().getEpochSecond();          // 1580279751
        long milliSecond = Instant.now().toEpochMilli();       // 1580279751000
        Instant instant1 = Instant.ofEpochSecond(second);     // 2020-01-29T14:35:51Z
        Instant instant2 = Instant.ofEpochMilli(milliSecond); // 2020-01-29T14:35:51.207Z

        //Duration时间差
        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(1));  // PT24H
        long seconds = duration.getSeconds();             // 86400
        long seconds2 = duration.get(ChronoUnit.SECONDS); // 86400

        Duration ofDays = Duration.ofDays(1);             // PT24H
        Duration ofHours = Duration.ofHours(1);           // PT1H
        Duration ofMinutes = Duration.ofMinutes(1);       // PT1M
        Duration ofSeconds = Duration.ofSeconds(1);       // PT1S

        //Period时间段
        Period between = Period.between(LocalDate.of(2020, 1, 22), LocalDate.of(2020, 2, 9)); // P18D
        int year = between.getYears();   // 0
        int month = between.getMonths(); // 0
        int day = between.getDays();     // 18

        Period period = Period.of(1, 2, 3); // P1Y2M3D
        long years = period.get(ChronoUnit.YEARS);            // 1
        long months = period.get(ChronoUnit.MONTHS);          // 2
        long days = period.get(ChronoUnit.DAYS);              // 3

        //Clock时钟
        Clock clock1 = Clock.system(ZoneOffset.ofHours(8));  // SystemClock[+08:00]
        Clock clock2 = Clock.systemUTC();                    // SystemClock[Z]

        long millis1 = clock1.millis();      // 1582285924008
        long millis2 = clock2.millis();      // 1582285924008
        Instant instant3 = clock1.instant(); // 2020-02-21T11:54:58.427Z
        Instant instant4 = clock2.instant(); // 2020-02-21T11:54:58.428Z


    }


    public static void test06() {
        //时间戳
        Instant instant = Instant.now();
        System.out.println("时间戳：" + instant);
        Date date = Date.from(instant);
        System.out.println("日期：" + date);
        Instant instant1 = date.toInstant();

        //计算日期和时间间隔
//计算两个日期的日期间隔-年月日
        LocalDate date1 = LocalDate.of(2018, 2, 13);
        LocalDate date2 = LocalDate.of(2017, 3, 12);
//内部是用date2-date1，所以得到的结果是负数
        Period period = Period.between(date1, date2);
        System.out.println("相差年数 ： " + period.getYears());
        System.out.println("相差月数 ： " + period.getMonths());
        System.out.println("相差日数 ： " + period.getDays());
//还可以这样获取相差的年月日
        System.out.println("-------------------------------");
        long years = period.get(ChronoUnit.YEARS);
        long months = period.get(ChronoUnit.MONTHS);
        long days = period.get(ChronoUnit.DAYS);
        System.out.println("相差的年月日分别为 ： " + years + "," + months + "," + days);
//注意，当获取两个日期的间隔时，并不是单纯的年月日对应的数字相加减，而是会先算出具体差多少天，在折算成相差几年几月几日的

//计算两个时间的间隔
        System.out.println("-------------------------------");
        LocalDateTime date3 = LocalDateTime.now();
        LocalDateTime date4 = LocalDateTime.of(2018, 1, 13, 22, 30, 10);
        Duration duration = Duration.between(date3, date4);
        System.out.println(date3 + " 与 " + date4 + " 间隔  " + "\n"
                + " 天 :" + duration.toDays() + "\n"
                + " 时 :" + duration.toHours() + "\n"
                + " 分 :" + duration.toMinutes() + "\n"
                + " 毫秒 :" + duration.toMillis() + "\n"
                + " 纳秒 :" + duration.toNanos() + "\n"
        );

        //使用自定义格式
        System.out.println("-----------------------自定义格式---------------------------------------");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(dateTimeFormatter1.format(LocalDate.now()));
        System.out.println(DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()));

        //将时间字符串形式转化为日期对象
        System.out.println("------------------将时间字符串形式转化为日期对象-------------------------------");
        String dateTimestr="2018-01-13 21:27:30";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(dateTimestr, dateTimeFormatter2);
        System.out.println(parse);

    }


}
