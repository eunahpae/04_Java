package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

  /* 접근제한자(Access Modifier)
   * 클래스 또는 클래스의 멤버(필드, 메소드 등)에 대해 접근 범위를 제한하는 키워드이다.
   *
   * 1. public    : 모든 패키지(클래스)에서 접근 가능
   * 2. protected : 같은 패키지 또는 상속 관계인 다른 패키지에서 접근 가능
   * 3. default   : 같은 패키지에서만 접근 가능 (접근제한자를 명시하지 않으면 default)
   * 4. private   : 같은 클래스 내부에서만 접근 가능 (외부 클래스에서는 접근 불가)
   *
   * 클래스 선언에는 public 또는 default만 사용 가능하고,
   * 클래스의 멤버(필드, 메소드)에는 모든 접근제한자(위 4가지)를 사용할 수 있다.
   */

  // 필드 선언부 (외부에서 직접 접근 불가)
  private String kinds;
  private int hp;

  // 필드에 값을 설정하는 메서드 (setter)
  // 외부에서 간접적으로 값을 설정할 수 있게 허용
  public void setKinds(String kinds) {
    this.kinds = kinds;
  }

  // Hp는 음수 값이 들어오지 않도록 방어 로직 포함 (유효성 검사)
  public void setHp(int hp) {
    if (hp > 0) {
      this.hp = hp;
    } else {
      this.hp = 0;  // 잘못된 입력에 대한 방어 처리
    }
  }

  // kinds와 hp 값을 가공하여 문자열로 반환하는 메서드 (getter와 유사)
  // 객체의 상태를 안전하게 외부에 노출할 수 있도록 처리
  public String getInfo() {
    return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
  }
}
