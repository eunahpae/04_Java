package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

  public static void main(String[] args) {

    /* comment. 접근제한자(private)를 이용하여 클래스의 필드에 직접 접근하지 못하도록 강제화할 수 있다.
     * 이를 통해 잘못된 접근을 방지하고 안전한 객체 사용을 유도할 수 있고,
     * 캡슐화(Encapsulation)의 핵심 개념인 '정보 은닉'을 실현할 수 있다.
     */

    /* 1. private 필드에 직접 접근 시 컴파일 에러 발생
     * Monster 클래스의 kinds, hp 필드는 private 접근제한자를 사용하므로
     * 외부 클래스인 Application 에서는 직접 접근할 수 없다.
     * */
//        Monster monster1 = new Monster();
//        monster1.kinds = "프랑켄슈타인";
//        monster1.hp = 200;

    /* 2. 올바른 방법: public 메서드(setter)를 통해 간접적으로 필드 값 설정
     *    → 외부에서는 메서드를 통해서만 필드에 접근 가능하므로,
     *      내부 로직을 통해 유효성 검사나 로직 제어를 적용할 수 있다. (캡슐화)
     */
    Monster monster1 = new Monster();
    monster1.setKinds("프랑켄슈타인");
    monster1.setHp(200);  // setHp() 내부에서 유효성 검사 가능

    /* 3. 필드에 저장된 값을 가져올 때도 public 메서드(getter)를 통해 간접 접근 */
    System.out.println(monster1.getInfo());  // 출력: 몬스터의 종류는 프랑켄슈타인이고, 체력은 200입니다.
  }
}
