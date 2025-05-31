package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

  // 몬스터의 이름을 저장하는 필드 (현재 public 상태로 외부에서 직접 접근 가능 → 캡슐화 미완성)
  String name;

  // 몬스터의 체력을 저장하는 필드 (직접 접근 시 유효성 검사를 우회하게 됨)
  int hp;

  // 몬스터의 이름을 설정하는 메서드 (간접 접근 방식)
  public void setInfo(String name) {
    this.name = name;
  }

  // 몬스터의 체력을 설정하는 메서드
  // 음수 값이 들어오는 것을 방지하여 객체의 상태를 보호함 (0으로 보정)
  public void setHp(int hp) {
    if (hp > 0) {
      this.hp = hp;
    } else {
      this.hp = 0;
    }
  }

  // 몬스터의 상태 정보를 문자열로 반환하는 메서드
  public String getInfo() {
    return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
  }
}
