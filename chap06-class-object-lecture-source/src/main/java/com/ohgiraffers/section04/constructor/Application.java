package com.ohgiraffers.section04.constructor;

public class Application {

    public static void main(String[] args) {

        /* comment. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */
        /* 생성자(Constructor) : 생성자란 클래스에서 객체(인스턴스)를 생성할 때 호출되는 특별한 메서드
         *
         * 객체 생성 구문: 클래스명 레퍼런스변수 = new 생성자();
         * 예) User user = new User();
         *
         * 여기서 new 뒤에 오는 'User()'는 생성자 호출을 의미함
         *
         * 생성자의 종류:
         * 1. 기본 생성자 (Default Constructor)
         *    - 매개변수가 없음
         *    - 작성하지 않더라도, 클래스에 생성자가 하나도 없으면 컴파일러가 자동으로 추가
         *    - 필드들은 자바의 기본값(숫자: 0, 객체: null 등)으로 초기화됨
         *
         * 2. 매개변수 있는 생성자 (Parameterized Constructor)
         *    - 전달된 인자값으로 필드를 직접 초기화
         *    - 생성자가 하나라도 명시되면 기본 생성자는 자동 추가되지 않음
         */

        // 1. 기본 생성자를 호출하여 User 인스턴스 생성
        User user1 = new User();  // 기본 생성자 호출
        System.out.println(user1.getInformation());  // 필드 값 출력 (기본값 또는 null)

        // 2. 매개변수(id, pwd, name)를 전달하는 생성자 호출
        //    → 전달된 값으로 해당 필드들이 초기화됨
        User user2 = new User("user01", "pass01", "홍길동");
        System.out.println(user2.getInformation());

        // 3. 모든 필드를 초기화하는 생성자 호출 (id, pwd, name, enrollDate)
        //    → Date 객체를 생성하여 enrollDate 필드에도 초기값 전달
        User user3 = new User("user02", "pass02", "이순신", new java.util.Date());
        System.out.println(user3.getInformation());
    }
}
