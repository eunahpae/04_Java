package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {

  public static void main(String[] args) {

    /* comment. 객체의 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. (2) */
    /* Monster 클래스의 name 필드를 kinds로 변경한 상황을 가정해보자.
     * 현재 이 코드는 name 이라는 필드명을 사용하고 있는데,
     * 실제 Monster 클래스에서 해당 필드를 kinds로 바꾸면 이 코드는 더 이상 컴파일되지 않는다.
     * 즉, 내부 구현이 변경되면 외부 코드도 모두 수정해야 하므로,
     * 변경에 취약하고 유지보수가 어려워지는 문제가 발생한다.
     *
     * 이러한 문제를 방지하기 위해 필드는 private 으로 감추고,
     * 필드 접근은 getter/setter 메서드를 통해 간접적으로 처리하는 것이 좋다.
     * 이를 통해 내부 구현을 변경하더라도 외부 코드에 영향을 최소화할 수 있다.
     */

    // 필드에 직접 접근하는 방식
    Monster monster1 = new Monster();
    monster1.name = "드라큘라";  // name → kinds로 변경되었다면 컴파일 오류 발생
    monster1.hp = 200;

    Monster monster2 = new Monster();
    monster2.name = "프랑켄슈타인";
    monster2.hp = 300;

    Monster monster3 = new Monster();
    monster3.name = "미이라";
    monster3.hp = 400;

    // 출력
    System.out.println(monster1.name);
    System.out.println(monster1.hp);
    System.out.println(monster2.name);
    System.out.println(monster2.hp);
    System.out.println(monster3.name);
    System.out.println(monster3.hp);

    /* 결론:
     * 필드에 직접 접근하는 방식은 내부 구현에 대한 의존성이 높아져 유지보수가 어렵다.
     * 캡슐화를 적용하여 private 필드 + public getter/setter 메서드 구조를 사용하면,
     * 내부 필드명이 바뀌더라도 외부 코드에 영향을 주지 않고 유지보수가 쉬워진다.
     */
  }
}