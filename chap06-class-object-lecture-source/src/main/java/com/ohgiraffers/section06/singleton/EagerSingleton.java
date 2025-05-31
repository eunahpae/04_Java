package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    // 클래스가 로드될 때 인스턴스를 미리 생성하여 static 변수에 저장
    // 이른 초기화 방식 : 클래스 로딩 시 인스턴스를 생성하여 항상 사용할 준비를 함
    private static EagerSingleton eager = new EagerSingleton();

    // 생성자를 private 으로 선언하여 외부에서 직접 인스턴스를 생성하지 못하도록 제한
    private EagerSingleton() {}

    // 외부에서 인스턴스에 접근할 수 있도록 public static 메소드 제공
    // 항상 동일한 인스턴스를 반환
    public static EagerSingleton getInstance() {
        return eager;
    }
}
