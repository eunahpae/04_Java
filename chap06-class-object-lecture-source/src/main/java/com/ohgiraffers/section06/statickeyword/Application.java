package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        /* comment. static 키워드에 대해 이해할 수 있다. */

        /* static 키워드란?
         * - 프로그램 시작 시 메소드 영역(static 영역)에 로딩되는 키워드로,
         *   인스턴스를 생성하지 않고도 접근 가능한 필드나 메소드에 붙인다.
         * - 객체가 여러 개 생성되더라도 static 멤버는 클래스당 하나만 존재하며,
         *   모든 인스턴스가 공유한다.
         * - 대표적인 사용 예: 상수, 공용 메소드(유틸 클래스), 싱글톤 패턴 등.
         * - 단, 남용하면 코드의 의도를 파악하기 어렵고 테스트나 유지보수에 어려움을 줄 수 있으므로
         *   명확한 목적이 있을 때만 사용해야 한다.
         */

        /* 1. static 키워드를 필드에서 사용 */
        StaticFieldTest sft1 = new StaticFieldTest();

        System.out.println(sft1.getNonStaticCount());     // 인스턴스 변수 값 출력 (각 인스턴스마다 별도 관리됨)
        System.out.println(sft1.getStaticCount());        // static 변수 값 출력 (모든 인스턴스가 공유)

        sft1.increaseNonStaticCount();                    // 인스턴스 변수 값 1 증가
        sft1.increaseStaticCount();                       // static 변수 값 1 증가

        System.out.println(sft1.getNonStaticCount());     // 1 출력
        System.out.println(sft1.getStaticCount());        // 1 출력

        StaticFieldTest sft2 = new StaticFieldTest();     // 두 번째 인스턴스 생성

        System.out.println(sft2.getNonStaticCount());     // 0 출력 (새 인스턴스의 초기값)
        System.out.println(sft2.getStaticCount());        // 1 출력 (static은 공유됨)

        /* 인스턴스 변수(non-static)는 객체마다 별도로 존재하므로 sft2는 초기값 0을 가진다.
         * static 변수는 클래스 로딩 시 생성되고 모든 인스턴스에서 공유되므로
         * 이전 인스턴스(sft1)에서 증가한 값이 그대로 유지된다.
         */

        /* 2. static 메소드 확인 */

        /* 2-1. non-static 메소드 호출
         * - 반드시 객체를 생성한 후 인스턴스를 통해 호출해야 한다.
         */
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();      // 일반 인스턴스 메소드 호출

        /* static 메소드는 클래스가 로딩될 때 함께 로딩되므로,
         * 인스턴스 생성 없이도 호출할 수 있다.
         * 인스턴스를 통해 호출하는 것도 가능하나, 클래스명을 통해 호출하는 것이 일반적이고 권장된다.
         */
        smt.staticMethod();                  // 가능하지만 권장되지 않음 (인스턴스를 통한 호출)

        /* 2-2. Static 메소드 호출 */
        StaticMethodTest.staticMethod();     // 권장되는 방식 (클래스명을 통한 호출)
    }
}
