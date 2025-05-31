package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /* comment. final 키워드에 대해 이해할 수 있다. */

    /*
     * final 키워드란?
     * - '종단(Final)'이라는 의미를 가지며, 한 번 정해지면 더 이상 변경이 불가능하다는 것을 의미함
     *
     * final 키워드가 사용될 수 있는 위치 및 의미:
     *  1. 지역변수 → 초기화 이후 값 변경 불가
     *  2. 매개변수 → 메소드 내에서 값 변경 불가
     *  3. 전역(인스턴스) 변수 → 객체 생성 후 초기화 이후 값 변경 불가
     *  4. 클래스(static) 변수 → 클래스 로딩 시 초기화 후 값 변경 불가
     *  5. non-static 메소드 → 오버라이딩 불가
     *  6. static 메소드 → 오버라이딩 불가
     *  7. 클래스 → 상속 불가
     */

    /* 1. non-static(인스턴스) field에 final 사용 */

    // 아래 코드는 에러 발생: 생성자 또는 선언 시에 반드시 초기화가 필요함
//    private final int nonStaticNum;

    /*
     * final 필드는 반드시 한 번만 초기화할 수 있음
     * 인스턴스 변수는 객체 생성 시 자동으로 기본값(예: 0)으로 초기화되는데,
     * 이후 값을 변경할 수 없기 때문에 선언과 동시에 초기화하거나 생성자에서 초기화해야 함
     */

    // 1-1. 선언과 동시에 초기화
    private final int NON_STATIC_NUM = 1;

    // 1-2. 생성자를 이용한 초기화
    private final String NON_STATIC_NAME;
    // 생성자에서 final 인스턴스 변수 초기화 (한 번만 가능)
    public FinalFieldTest(String nonStaticName) {
        this.NON_STATIC_NAME = nonStaticName;
    }

    /* 2. static(클래스) field에 final 사용 */

    /*
     * static final 변수는 클래스 로딩 시점에 초기화가 이루어짐
     * 따라서 선언과 동시에 초기화하거나 static 블럭에서 초기화해야 하며,
     * 생성자를 통한 초기화는 불가능함
     */

    // 선언과 동시에 초기화
//    private static final int STATIC_NUM;
    private static final int STATIC_NUM = 1;

    // 아래 코드는 컴파일 에러 발생: static final 변수는 생성자에서 초기화할 수 없음
//    private static final double STATIC_DOUBLE;
//    public FinalFieldTest(double staticDouble) {
//        FinalFieldTest.STATIC_DOUBLE = staticDouble; // 에러 발생
//    }

    // static final 변수는 static 블럭을 이용하여 초기화 가능
    private static final double STATIC_DOUBLE;

    // static 초기화 블럭: 클래스가 처음 로딩될 때 한 번 실행되며 static 필드 초기화에 사용됨
    static {
        STATIC_DOUBLE = 0.5;
    }
}
