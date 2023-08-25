package 에어컨만들기;
// 전원 ON / OFF // 두가지 선택 사항 있을 때 boolean 많이 씀
// 온도 설정 기능
// 현재 온도 표시 기능
// Cooler ON / OFF
// Heater ON / OFF
// 바람세기 : 1단 / 2단 / 3단

import 다형성기본.Parent;

import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    private boolean isPower; // ON / OFF
    private int setTemp; // 온도 설정 기능
    private int currTemp; // 현재 온도 표시 기능
    private boolean isCooler; // 냉방기
    private boolean isHeater; // 난방기
    private int windStep; // 1단 / 2단 / 3단

    AirCon() { // 에어컨 초기값
        // 에어컨의 현재 온도를 보여주기 위한 값
        final int[] MONTHTEMP = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 2};
        Calendar now = Calendar.getInstance(); // 객체를 안 만들고 클래스에서 인스턴스로 불러옴
        int month = now.get(Calendar.MONTH); // 배열의 인덱스와 같음. 0이면 1월
        currTemp = MONTHTEMP[month];
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }

    void airConInfo() { // 에어컨 정보
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isCooler) ? "ON" : "OFF";
        String coolerStr = (isHeater) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windStep]);
    }

    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + currTemp + " 입니다.");
        System.out.print("온도를 설정하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + " 입니다.");
        System.out.print("바람 세기를 설정하세요 (1단/2단/3단) : ");
        windStep = sc.nextInt();
        if (currTemp > setTemp) {
            System.out.println("Cooler가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if (currTemp < setTemp) {
            isCooler = false;
            isHeater = false;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }

    public void setPower(boolean power) { // 파워 설정
        isPower = power;
    }

    public int getWindStep() { // 바람 세기 얻기, private라서 메소드를 통해 얻음
        return windStep;
    }

    public boolean isHeater() { // 메소드와 변수 이름 같아도 상관없음
        return isHeater;
    }

    public boolean isCooler() {
        return isCooler;
    }

    public void setCurrTemp(int n) { // 현재 온도 변경함
        currTemp += n;
    }

    public int getCurrTemp() { // 현재 온도를 읽는 메소드
        return currTemp;
    }

    public int getSetTemp() {  // 설정 온도를 읽는 메소드
        return setTemp;
    }
}

