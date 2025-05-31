package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {

  public static void main(String[] args) {

    /* comment. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. */
    /* 객체 지향 프로그래밍에서는 객체의 상태(데이터)를 외부에서 직접 변경하지 못하도록 보호하고,
     * 객체 내부에서만 데이터에 대한 검증과 처리를 하도록 만드는 것을 권장한다.
     * 이를 '캡슐화(encapsulation)'라고 하며, 필드를 외부에서 직접 접근하지 못하게 막고
     * 메소드를 통해 접근하도록 하는 방식으로 구현한다.
     *
     * 이 예제는 필드를 public 으로 선언했을 때 발생할 수 있는 문제점을 보여준다.
     */

    // Monster 객체 생성 후 name과 hp 필드에 직접 접근하여 값 설정
    Monster monster1 = new Monster();
    monster1.name = "두치";
    monster1.hp = 200;  // 올바른 값

    // 정상적으로 출력됨
    System.out.println("monster1.name = " + monster1.name);
    System.out.println("monster1.hp = " + monster1.hp);

    Monster monster2 = new Monster();
    monster2.name = "드라큘라";
    monster2.hp = -200;  // 잘못된 hp 값도 제한 없이 대입 가능

    // hp가 음수지만 제한이 없기 때문에 그대로 저장되어 출력됨 → 논리적 오류 발생
    System.out.println("monster2.name = " + monster2.name);
    System.out.println("monster2.hp = " + monster2.hp);

    /* setter 메서드를 이용한 필드 값 설정 (단, 아직 hp 필드는 public이므로 직접 접근도 가능함) */
    Monster monster3 = new Monster();
    monster3.name = "뿌꾸";
    monster3.setHp(-200);  // setHp 메서드 내부에서 음수값에 대한 검증 로직이 존재

    // 이름은 직접 접근으로 설정
    System.out.println("monster3.name = " + monster3.name);

    // hp는 여전히 public 필드라 직접 접근이 가능하므로 검증 우회 가능
    // (진정한 캡슐화를 위해서는 hp 필드도 private 으로 선언해야 함)
    System.out.println("monster3.hp = " + monster3.hp);
  }
}