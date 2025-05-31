package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    // 인스턴스 변수 : 객체가 생성될 때마다 각각 따로 관리되는 변수
    private int nonStaticCount;

    // 클래스 변수(static 변수) : 클래스가 메모리에 로드될 때 단 한 번만 생성되어 모든 객체가 공유하는 변수
    private static int staticCount;

    // 기본 생성자
    public StaticFieldTest() {}

    // 인스턴스 변수 nonStaticCount 값을 반환하는 메소드
    public int getNonStaticCount() {
        return nonStaticCount;
    }

    /*
     * static 필드에 접근하는 메소드
     * static 변수는 클래스명.필드명 으로 접근하는 것이 권장됨.
     * 인스턴스 메소드 내에서도 클래스명.static필드명 으로 접근 가능
     */
    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }

    /*
     * 인스턴스 변수 nonStaticCount 값을 1씩 증가시키는 메소드
     * 이 메소드를 호출한 객체의 nonStaticCount 값만 증가함
     */
    public void increaseNonStaticCount() {
        nonStaticCount++;
    }

    /*
     * static 변수 staticCount 값을 1씩 증가시키는 메소드
     * 모든 객체가 공유하는 변수이므로 한 객체가 증가시키면
     * 다른 모든 객체에 영향을 미침
     */
    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }
}
