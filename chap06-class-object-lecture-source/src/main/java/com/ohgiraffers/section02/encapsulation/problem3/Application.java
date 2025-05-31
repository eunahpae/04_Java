package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {

  public static void main(String[] args) {

    /* comment. 필드에 직접 접근하는 경우 발생할 수 있는 문제점 해결하는 방법을 이해하고 적용할 수 있다. */
    /* 이 예제는 Monster 클래스 내부 필드에 대해 직접 접근하는 대신,
     * setter와 getter 메서드를 통해 간접적으로 접근하여 잘못된 값의 입력을 방지하는 구조이다.
     * 예를 들어, hp가 음수로 설정되지 않도록 setHp() 메서드 내부에서 유효성 검사를 할 수 있다.
     * 이를 통해 객체의 상태를 보호하고, 외부로부터의 잘못된 접근을 차단할 수 있다.
     */

    // setter를 통해 필드 값 설정 (유효성 검사 포함 가능)
    Monster monster1 = new Monster();
    monster1.setInfo("드라큘라");  // 이름 설정
    monster1.setHp(100);          // 유효한 HP 설정

    Monster monster2 = new Monster();
    monster2.setInfo("프랑켄슈타인");
    monster2.setHp(200);

    Monster monster3 = new Monster();
    monster3.setInfo("늑대인간");
    monster3.setHp(-300);  // 음수 HP → setHp()에서 0으로 보정 처리되도록 설계 가능

    // getter를 통해 필드 값 조회
    System.out.println(monster1.getInfo());  // 드라큘라 / HP: 100
    System.out.println(monster2.getInfo());  // 프랑켄슈타인 / HP: 200
    System.out.println(monster3.getInfo());  // 늑대인간 / HP: 0 (음수 방지 로직 적용 결과)

    /* 하지만 아직 캡슐화가 완전히 적용된 상태는 아님
     * → name과 hp 필드가 여전히 public 상태이기 때문에 외부에서 직접 접근이 가능함.
     * 아래 코드는 setter를 우회하고 직접 필드 값을 설정하여, 잘못된 상태를 유발할 수 있다.
     */

    Monster monster4 = new Monster();
    monster4.name = "두치";     // 직접 접근
    monster4.hp = -500;         // 유효성 검사 없이 잘못된 값 입력

    // getInfo 는 출력하겠지만, 내부 상태는 이미 잘못된 값으로 설정됨
    System.out.println(monster4.getInfo());  // 두치 / HP: -500 (잘못된 값)
  }
}