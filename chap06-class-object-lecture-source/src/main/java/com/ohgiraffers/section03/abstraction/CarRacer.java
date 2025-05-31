package com.ohgiraffers.section03.abstraction;

public class CarRacer {

  /* 카레이서 클래스: 사용자 명령을 받아 자동차(Car)에게 전달하는 중간 역할
   * - 내부적으로 Car 객체를 포함(Has-A 관계)
   * - 실제 로직은 Car 클래스에서 수행하며, 이 클래스는 추상화된 인터페이스 역할을 한다.
   */

  private final Car car = new Car();  // Car 객체 생성 및 포함

  public void startUp() {
    car.startUp();      // 시동 걸기 요청
  }

  public void stepAccelator() {
    car.go();           // 가속 요청
  }

  public void stepBreak() {
    car.stop();         // 정지 요청
  }

  public void turnOff() {
    car.turnOff();      // 시동 끄기 요청
  }
}
