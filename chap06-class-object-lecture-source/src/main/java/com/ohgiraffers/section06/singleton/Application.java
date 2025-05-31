package com.ohgiraffers.section06.singleton;

public class Application {

    public static void main(String[] args) {

        /* comment. 싱글톤 패턴에 대해 이해할 수 있다. */

        /*
         * Singleton Pattern(싱글톤 패턴)이란?
         * - 애플리케이션 실행 시 클래스의 인스턴스를 최초 단 한 번만 생성하고,
         *   그 인스턴스를 어디서든 공유해서 사용할 수 있도록 보장하는 디자인 패턴
         * - 매번 인스턴스를 새로 생성하지 않고 공유함으로써 메모리 낭비를 줄이고,
         *   일관된 객체 상태를 유지할 수 있음
         *
         * [장점]
         * 1. 두 번째부터는 인스턴스를 새로 생성하지 않고 재사용하므로 속도 향상 가능
         * 2. 인스턴스가 하나만 존재함을 보장하여 객체 상태의 일관성 유지 가능
         *
         * [단점]
         * 1. 싱글톤이 지나치게 많은 책임을 가지면 클래스 간 결합도가 높아질 수 있음
         * 2. 멀티스레드 환경에서 동기화 문제를 해결하기 위한 구현이 어려울 수 있음
         */

        /*
         * 싱글톤 구현 방법
         * 1. Eager Initialization(이른 초기화) : 클래스 로딩 시점에 인스턴스를 미리 생성
         * 2. Lazy Initialization(게으른 초기화) : 인스턴스가 필요할 때 생성
         */

        /* 1. 이른 초기화 방식 테스트 */

        // EagerSingleton eager = new EagerSingleton(); // private 생성자이므로 외부에서 직접 생성 불가

        // 클래스명.메소드명()을 통해 싱글톤 인스턴스를 획득
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        // 동일한 인스턴스인지 확인 (두 객체의 해시코드가 같으면 같은 인스턴스)
        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode());

        /* 2. 게으른 초기화 방식 테스트 */

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        // 동일한 인스턴스인지 확인
        System.out.println(lazy1.hashCode());
        System.out.println(lazy2.hashCode());
    }
}
