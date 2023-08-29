package 날짜와시간;
// Date() : 운영체제로부터 날짜와 시간 정보를 가져와 원하는 포맷 형태로 출력, 객체를 생성해야 함
// 자바의 java.util 패키지에 포함되어 있어 import를 해야 함

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCal {
    public static void main(String[] args) {
        Date now = new Date();
//        System.out.println(now);
//        // 원하는 포맷으로 변경
//        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//        System.out.println(sdf.format(now));
        // yyyy : 년도를 4자리로 표시
        // yy : 년도를 2자리로 표시
        // MM : 월을 2자리로 표시 (대문자임에 유의)
        // mm : 분을 표시
        // HH : 24시간제
        // hh : 12시간제
//        SimpleDateFormat f1, f2, f3, f4, f5, f6;
//        f1 = new SimpleDateFormat("yyyy-MM-dd");
//        f2 = new SimpleDateFormat("yy/MM/dd");
//        f3 = new SimpleDateFormat("yyyy년MM월dd일");
//        f4 = new SimpleDateFormat("HH:mm:ss");
//        f5 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
//        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차입니다.");
//        System.out.println(f1.format(now));
//        System.out.println(f2.format(now));
//        System.out.println(f3.format(now));
//        System.out.println(f4.format(now));
//        System.out.println(f5.format(now));
//        System.out.println(f6.format(now));
        Calendar cal = Calendar.getInstance(); // 운영체제로부터 시간을 가져옴
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // 인덱스임을 유의
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 주에서 몇번째 날인지
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 월에서 몇번째 날
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int isPM = calendar.get(Calendar.AM_PM);
        if(isPM == 1) hour += 12;
        System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n", year, month, day, hour, minute, second);
        //%02d = 2자리인데 한자리 남으면 0으로 출력



    }
}
