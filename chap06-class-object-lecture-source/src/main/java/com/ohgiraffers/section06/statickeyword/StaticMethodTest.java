package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    // 인스턴스 변수 : 객체가 생성될 때마다 개별적으로 존재하는 변수
    private int count;

    /*
     * 인스턴스 메소드
     * - 객체가 생성되어야만 호출할 수 있는 메소드
     * - 인스턴스 변수 및 인스턴스 메소드에 자유롭게 접근 가능
     * - this 키워드를 통해 현재 객체를 참조할 수 있음
     */
    public void nonStaticMethod() {
        this.count++;  // this는 현재 객체를 의미하며, 인스턴스 변수에 접근 가능

        System.out.println("nonStaticMethod 호출됨...");
    }

    /*
     * 클래스(static) 메소드
     * - 클래스가 메모리에 로드될 때 함께 생성되며, 객체 생성 없이 호출 가능
     * - 클래스 변수(static 필드)나 다른 static 메소드에는 접근 가능
     * - 인스턴스 변수나 인스턴스 메소드에는 접근할 수 없음
     * - this 키워드는 인스턴스를 참조하기 위한 것인데,
     *   static 메소드는 클래스 수준에서 동작하므로 this를 사용할 수 없음
     */
    public static void staticMethod() {
//        this.count++;  // 컴파일 에러 발생: static 메소드에서는 this 사용 불가

        System.out.println("staticMethod 호출됨...");
    }
}
