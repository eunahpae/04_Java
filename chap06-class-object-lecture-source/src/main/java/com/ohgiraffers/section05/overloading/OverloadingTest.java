package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    /* comment. 오버로딩에 대해 이해할 수 있다. */
    /* ✅ 오버로딩(Overloading)이란?
     *
     *  같은 이름의 메소드(또는 생성자)를 매개변수의 타입, 개수, 순서 등을 다르게 하여
     *  여러 개 정의하는 것을 의미한다.
     *
     * 📌 오버로딩의 목적
     *  - 하나의 이름으로 다양한 동작을 수행할 수 있게 하여 코드의 직관성과 재사용성을 높인다.
     *  - 같은 기능을 수행하지만 입력 값이 다른 경우, 메소드 이름을 일일이 다르게 정의하지 않아도 되어 유지보수가 편리하다.
     *
     * ⚠️ 주의! 다음과 같은 요소는 오버로딩 성립 조건에 해당하지 않는다:
     *  - 메소드의 반환형(return type)
     *  - 매개변수의 이름
     *  - 접근 제한자(private, public 등)
     *
     * ✅ 오버로딩이 성립되는 조건 (메소드 시그니처가 달라야 한다)
     *  → 메소드 이름은 동일하고, 아래 중 하나 이상이 달라야 함
     *    1. 매개변수의 개수
     *    2. 매개변수의 타입
     *    3. 매개변수의 순서
     */

    // 기본 메소드
    public void test() {
    }

    // 아래는 오버로딩이 **성립하지 않는** 잘못된 예제들
//    public void test() {}                  // 동일한 시그니처: 컴파일 에러
//    private void test() {}                // 접근제한자는 시그니처에 포함되지 않음 → 중복
//    public int test() { return 0; }       // 반환형은 오버로딩 조건이 아님 → 중복으로 간주됨

    // ✔ 오버로딩 성립 예시들

    // [1] 매개변수 1개: 타입이 int
    public void test(int num) {
    }

    // 아래는 오버로딩이 **성립하지 않는** 예제 (변수명만 다름)
//    public void test(int num2) {}         // 매개변수 이름은 시그니처에 포함되지 않음 → 중복

    // [2] 매개변수 2개: int, int → 매개변수 '개수' 다름
    public void test(int num1, int num2) {
    }

    // [3] 매개변수 2개: int, String → 매개변수 '타입' 다름
    public void test(int num1, String name) {
    }

    // [4] 매개변수 2개: String, int → 매개변수 '순서' 다름
    public void test(String name, int num1) {
    }
}