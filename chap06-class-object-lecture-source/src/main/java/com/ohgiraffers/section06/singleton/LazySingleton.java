package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    // 클래스가 로드될 때는 인스턴스를 생성하지 않고 null로 초기화
    // 필요할 때 최초 1회만 생성되도록 설계된 lazy 방식의 싱글톤
    private static LazySingleton lazy;

    // private 생성자: 외부에서 new 키워드로 인스턴스 생성하는 것을 방지
    private LazySingleton() {
    }

    /*
     * getInstance 메소드
     * - 외부에서 싱글톤 인스턴스에 접근할 수 있도록 제공되는 static 메소드
     * - 호출 시점에 인스턴스가 생성되어 있지 않다면 새로 생성하고,
     *   이미 생성되어 있다면 기존 인스턴스를 반환함
     * - 이를 통해 메모리 낭비를 줄이고, 항상 동일한 인스턴스를 사용하게 됨
     *
     * 주의: 이 구현은 멀티스레드 환경에서 동시 접근 시 인스턴스가 중복 생성될 수 있는 문제가 있음.
     *       스레드 안전성을 보장하려면 synchronized 키워드 또는 이중 검사(Double-Checked Locking) 등을 추가해야 함.
     */
    public static LazySingleton getInstance() {

        // 인스턴스가 없을 경우에만 생성
        if (lazy == null) {
            lazy = new LazySingleton();
        }

        // 항상 동일한 인스턴스를 반환
        return lazy;
    }
}
