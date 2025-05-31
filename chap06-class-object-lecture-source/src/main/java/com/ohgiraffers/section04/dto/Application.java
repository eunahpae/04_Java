package com.ohgiraffers.section04.dto;

public class Application {

    public static void main(String[] args) {

        /* comment. 생성자 vs 설정자(setter)를 이용한 필드 초기화 방식의 당단점을 이해할 수 있다. */
        /*
         * ✅ 1. 생성자를 이용한 초기화
         *  - 장점:
         *     → 단 한 번의 호출로 객체 생성과 동시에 모든 필드를 초기화할 수 있음
         *     → 코드가 간결해짐
         *  - 단점:
         *     → 초기화할 필드의 수나 경우의 수에 따라 생성자 오버로딩을 많이 만들어야 함
         *     → 전달하는 값의 순서와 의미를 한눈에 파악하기 어려움
         *
         * ✅ 2. 설정자(setter)를 이용한 초기화
         *  - 장점:
         *     → 각 필드에 대해 어떤 값을 넣는지 명확하게 표현 가능
         *     → 가독성이 좋음
         *  - 단점:
         *     → 객체 생성 후 여러 번 메서드를 호출해야 하므로 코드가 장황해질 수 있음
         */

        /* -------------------------
         * 1. 생성자를 이용한 초기화 방식
         * → 모든 필드를 한 번에 초기화
         * ------------------------- */
        UserDTO user1 = new UserDTO(
            "ohgiraffers",    // id
            "ohgiraffers",    // pwd
            "ohgiraffers",    // name
            new java.util.Date()  // enrollDate
        );
        System.out.println(user1.getInformation());

        /* -------------------------
         * 2. 기본 생성자 + 설정자를 이용한 초기화 방식
         * → 필드별로 메서드를 통해 명시적으로 값 설정
         * ------------------------- */
        UserDTO user2 = new UserDTO();          // 기본 생성자 호출
        user2.setId("ohgiraffers");
        user2.setPwd("ohgiraffers");
        user2.setName("ohgiraffers");
        user2.setEnrollDate(new java.util.Date());

        // 특정 필드만 출력 (전체 정보 출력도 가능)
        System.out.println(user2.getEnrollDate());
    }
}
